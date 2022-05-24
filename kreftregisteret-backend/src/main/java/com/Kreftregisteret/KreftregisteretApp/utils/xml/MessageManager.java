package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import com.Kreftregisteret.KreftregisteretApp.KreftregisteretAppApplication;
import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.Kreftregisteret.KreftregisteretApp.models.MeldingDTO;
import com.Kreftregisteret.KreftregisteretApp.utils.JAXBContextManager;
import com.Kreftregisteret.KreftregisteretApp.utils.StreamUtil;
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
public class MessageManager {
    private final ArrayList<Melding> meldingList = new ArrayList<>();

    private static Long id = 1L;

    //sikter på thread-safety
    public static synchronized Long createNewID()
    {
        System.out.println("Current id: " + id);
        return id++;
    }

    private void updateMsgList(Melding melding) {
        //oppdater tidspunktendret
        // "2001-12-17T09:30:47Z"
        //er formatet
        String formattedDate = getDate();
        melding.setEndrettidspunkt(formattedDate);
        melding.setId(createNewID());
        meldingList.add(melding);
    }

    public ArrayList<MeldingDTO> getMeldingListDTO() {
        ArrayList<MeldingDTO> meldingDTOList = new ArrayList<>();
        for(Melding melding: meldingList){
            MeldingDTO dto = new MeldingDTO(melding.getId(), melding.getEndrettidspunkt(), melding.getSkjemanavn(), melding.getFilnavn());
            meldingDTOList.add(dto);
        }
        return new ArrayList<MeldingDTO>(meldingDTOList);
    }

    public ArrayList<Melding> getMeldingList() {
        return meldingList;
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
                melding.setEndrettidspunkt(melding.getMetaData());
                melding.setFilnavn(file.getName());
            }
            return melding;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    //for å kjøre denne kan vi bruke melding.getClass().getName()
    //https://docs.oracle.com/javase/7/docs/api/javax/xml/bind/Marshaller.html
    public void writeMeldingToPath(Melding melding) throws JAXBException, IOException, SAXException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Melding.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        Schema schema = MessageValidator.generateSchema(melding);
        JAXBSource jaxbSource = new JAXBSource(jaxbMarshaller, melding);

        // Validate against schema, throws SAXParseException if not valid
        XMLValidator.validate(schema, jaxbSource);
        System.out.println("Melding skjemanavn: " + melding.getSkjemanavn());

        // Set filnavn
        String newFilnavn = getFileDate() + melding.getSkjemanavn() + ".xml";
        melding.setFilnavn(newFilnavn);
        System.out.println("Melding: " + melding);
        System.out.println("Melding skjemanavn 2: " + melding.getSkjemanavn());
        melding.setEndrettidspunkt(getDate());
        // Pga frontend ikke bruker id, men item.id
        melding.setId(id);
        updateMsgList(melding);
        System.out.println("I write: " + meldingList);
    }

    public void addMeldingerFromUtFolderToMsgList() {
        try {
            String[] files = {"KliniskProstataKirurgi.xml", "KliniskProstataStraale.xml", "KliniskProstataUtredning.xml"};

            for (String name : files) {
                InputStream is = KreftregisteretAppApplication.class.getClassLoader().getResourceAsStream("Ut/" + name);
                File file = StreamUtil.stream2file(is);
                System.out.println(file.getName());
                Melding melding = convertFileToMelding(file);
                // Pga frontend ikke bruker id, men item.id
                if (melding != null) {
                    melding.setId(id);
                    updateMsgList(melding);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public Melding findMeldingById(Long idIn) {
        for(Melding melding: meldingList){
            if(Objects.equals(melding.getId(), idIn)){
                return melding;
            }
        }
        return null;
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
}
