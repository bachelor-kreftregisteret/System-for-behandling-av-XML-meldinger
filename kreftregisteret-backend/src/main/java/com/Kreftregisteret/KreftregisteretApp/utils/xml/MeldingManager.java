package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.Kreftregisteret.KreftregisteretApp.utils.FileManager;
import jakarta.xml.bind.*;
import jakarta.xml.bind.util.JAXBSource;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import javax.xml.validation.Schema;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


//er det bedre å ha EN jaxbcontext instance her? dvs ha en felles for alle metodene også injecte message manager istedenfor public static?
@Service
public class MeldingManager {
    private final HashMap<Melding, Long> meldingMap = new HashMap<>();
    private static Long id = 1L;

    public MeldingManager(){
        FileManager.setPathToFolder("utmappe/");
    }

    //sikter på thread-safety
    public static synchronized Long createNewID() {
        return id++;
    }

    private void updateMsgMap(Melding melding) {
        Melding oldmelding = this.findMeldingById(melding.getId());
        meldingMap.remove(oldmelding);
        //oppdater tidspunktendret
        // "2001-12-17T09:30:47Z"
        //er formatet
        String formattedDate = getDate();
        melding.setLastChangedTime(formattedDate);
        meldingMap.put(melding, createNewID());
    }

    public HashMap<Melding, Long> getMeldingMap() {
        return meldingMap;
    }

    //kanskje legg til Optional<Melding> her istedenfor å kanskje returnere null (?)
    private Melding convertFileToMelding(File file) {
        Melding melding = null;
        try {
            JAXBContext jaxbContext = JAXBContextManager.getInstance();
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            melding = (Melding) jaxbUnmarshaller.unmarshal(file);
            if (melding != null) {
                melding.setId(id);
                melding.setLastChangedTime(melding.getMetaData());
                melding.setFilnavn(file.getName());
            }
            return melding;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    //for å kjøre denne kan vi bruke melding.getClass().getName()
    //inni i denne metoden bør vi også erstatte den gamle meldingen med den nye
    //https://docs.oracle.com/javase/7/docs/api/javax/xml/bind/Marshaller.html
    public void writeMeldingToPath(Melding melding) throws JAXBException, IOException, SAXException {
        JAXBContext jaxbContext = JAXBContextManager.getInstance();
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        Schema schema = MeldingValidator.generateSchema(melding);
        JAXBSource jaxbSource = new JAXBSource(jaxbMarshaller, melding);
        XMLValidator.validate(schema, jaxbSource);
        String formattedDate = getFileDate();
        File file = new File(FileManager.getPath() + formattedDate + melding.getSkjemaNavn() + ".xml");
        jaxbMarshaller.setSchema(schema);
        System.out.println(getMeldingMap().size());
        updateMsgMap(melding);
        System.out.println(getMeldingMap());
        jaxbMarshaller.marshal(melding, file); // Write to file
    }

    private String getDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");//formatet KR bruker i XMLfilene.
        Date date = new Date();
        return formatter.format(date);
    }

    private String getFileDate() {
        // Husk! : er ikke gyldig i filnavn i Windows
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH-mm-ss'Z'");
        Date date = new Date();
        return formatter.format(date);
    }


    //kanskje for å teste dette bør man kunne sette Utmappe.listFiles til noe
    //dette er veldig stateful, kanskje vi kan
    //hvis denne funksjonen testes er det i grunn convertFileToMelding som testes..
    //convert filetomelding blir vel ikke testet.
    public void addMeldingerFromUtFolderToMeldingList(List<File> list) throws IOException {
        //ClassPathResource pathResource = new ClassPathResource("Ut");
        try {
            //List<File> fileList = getFiles(Path.of(Utmappe.getPath()));
            list.forEach(file -> {
                if (file != null) {
                    Melding melding = convertFileToMelding(file);
                    System.out.println(melding);
                    if (melding != null) {
                        meldingMap.put(melding, createNewID());
                    }
                }
            });
        } catch (Exception e) {
            System.out.println("er det her vi feiler???");
            e.printStackTrace();
        }
    }

    public Melding findMeldingById(Long idIn) {
        for (Map.Entry<Melding, Long> entry : meldingMap.entrySet()) {
            Melding melding = entry.getKey();
            Long value = entry.getValue();
            if (Objects.equals(value, idIn)) {
                return melding;
            }
        }

        return null;
    }
}
