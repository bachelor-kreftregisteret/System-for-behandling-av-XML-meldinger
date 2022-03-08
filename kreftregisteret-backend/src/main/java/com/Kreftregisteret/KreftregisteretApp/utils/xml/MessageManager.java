package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.Kreftregisteret.KreftregisteretApp.utils.Utmappe;
import jakarta.xml.bind.*;
import jakarta.xml.bind.util.JAXBSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import javax.xml.validation.Schema;
import java.io.*;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.*;


//er det bedre å ha EN jaxbcontext instance her? dvs ha en felles for alle metodene også injecte message manager istedenfor public static?
@Service
public class MessageManager {
    HashMap<Melding, Long> msgMap = new HashMap<>();


    private static Long id = 1L;

    //sikter på thread-safety
    public static synchronized Long createNewID()
    {
        return id++;
    }

    public HashMap<Melding, Long> getMsgMap() {
        return msgMap;
    }
    //kanskje legg til Optional<Melding> her istedenfor å kanskje returnere null (?)
    private Melding convertFileToMelding(File file) {
        Melding melding = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Melding.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            melding = (Melding) jaxbUnmarshaller.unmarshal(file);
            melding.setFilnavn(file.getName());
            return melding;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    // ClassPathResource pathResource = new ClassPathResource("Prostatapakke/Prostata_4_0_UtredningEksempelfil.xml");
//pathResource.getURL().getPath()
    public Melding getMeldingFromPath(String path) {
        Melding melding = null;
        File file = new File(path);
        melding = convertFileToMelding(file);
        msgMap.put(melding, createNewID());
        return melding;
    }

    //for å kjøre denne kan vi bruke melding.getClass().getName()
    //https://docs.oracle.com/javase/7/docs/api/javax/xml/bind/Marshaller.html
    public static void writeMeldingToPath(Melding melding) throws JAXBException, IOException, SAXException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Melding.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        Schema schema = MessageValidator.generateSchema(melding);
        JAXBSource jaxbSource = new JAXBSource(jaxbMarshaller, melding);

        // Validate against schema, throws SAXParseException if not valid
        XMLValidator.validate(schema, jaxbSource);

        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy_'kl'HHmmss");
        Date date = new Date();
        String formattedDate = formatter.format(date);

        File file = new File(Utmappe.getPath() + formattedDate + melding.getSkjemaNavn() + ".xml");
        jaxbMarshaller.setSchema(schema);
        jaxbMarshaller.marshal(melding, file); // Write to file
    }

    public static File findXSDFromMelding(Melding melding) throws IOException {
        System.out.println(melding.toString());
        //todo Kanskje lag et hashmap med verdier for skjemanavn og .xSD, slik at man kan finne korrekt .xsd
        //
        String skjemanavn = melding.getSkjemaNavn(); //KliniskProstataUtredning

        String XSDfile = XMLValidator.XSD_MAP.get(skjemanavn);
        String path = new ClassPathResource("XSD/" + XSDfile).getURL().getPath();
        System.out.println("PATH: " + path);
        return new File(path);
    }

    // Inspired by: https://docs.oracle.com/javase/tutorial/essential/io/dirs.html
    public static List<File> getFiles(Path directory) throws IOException, DirectoryIteratorException {
        if (!Files.isDirectory(directory)) {
            throw new IOException("Directory does not exist");
        }

        ArrayList<File> files = new ArrayList<>();
        DirectoryStream<Path> stream = Files.newDirectoryStream(directory);
        for (Path file : stream) {
            files.add(new File(file.toUri()));
        }
        return files;
    }

    public void addMeldingerFromUtFolderToMsgList() throws IOException {

        //ClassPathResource pathResource = new ClassPathResource("Ut");
        try {
            //List<File> fileList = getFiles(Path.of(Utmappe.getPath()));
            List<File> fileList = List.of(Utmappe.listFiles());
            fileList.forEach(file -> {
                if(file != null) {
                    Melding melding = convertFileToMelding(file);
                    if(melding != null) {
                        msgMap.put(melding, createNewID());
                    }
                }
            });
        }catch(Exception e){
            System.out.println("er det her vi feiler???");
            e.printStackTrace();
        }
    }

    public static Melding getNewMelding() {
        //kanskje implementer kø-logikk her.
        return null;
    }

    public Melding findMeldingById(Long idIn) {
        for (Map.Entry<Melding, Long> entry : msgMap.entrySet()) {
            Melding melding = entry.getKey();
            Long value = entry.getValue();
            if(Objects.equals(value, idIn)){
                return melding;
            }
        }
        /*msgList.forEach((melding, uid) ->{
            if(idIn == uid){
                return melding;
            }
        });*/
        return null;
    }
}
