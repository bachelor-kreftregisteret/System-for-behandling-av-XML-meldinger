package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import com.Kreftregisteret.KreftregisteretApp.KreftregisteretAppApplication;
import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.Kreftregisteret.KreftregisteretApp.utils.JAXBContextManager;
import com.Kreftregisteret.KreftregisteretApp.utils.StreamUtil;
import jakarta.xml.bind.*;
import jakarta.xml.bind.util.JAXBSource;
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
    HashMap<Melding, Long> meldingMap = new HashMap<>();

    private static Long id = 1L;

    //sikter på thread-safety
    public static synchronized Long createNewID()
    {
        return id++;
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
    //https://docs.oracle.com/javase/7/docs/api/javax/xml/bind/Marshaller.html
    public void writeMeldingToPath(Melding melding) throws JAXBException, IOException, SAXException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Melding.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        Schema schema = MessageValidator.generateSchema(melding);
        JAXBSource jaxbSource = new JAXBSource(jaxbMarshaller, melding);

        // Validate against schema, throws SAXParseException if not valid
        XMLValidator.validate(schema, jaxbSource);
        System.out.println("Melding skjemanavn: " + melding.getSkjemaNavn());
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy_'kl'HHmmss");
        Date date = new Date();
        String formattedDate = formatter.format(date);

        // Set filnavn
        String newFilnavn =  formattedDate + melding.getSkjemaNavn() + ".xml";
        melding.setFilnavn(newFilnavn);
//        File file = new File(Utmappe.getPath() + newFilnavn);
//        jaxbMarshaller.marshal(melding, file); // Write to file'
        System.out.println("Melding: " + melding);
        System.out.println("Melding skjemanavn 2: " + melding.getSkjemaNavn());
        meldingMap.put(melding, createNewID());
        System.out.println("I write: " + meldingMap);
    }

    public File findXSDFromMelding(Melding melding) throws IOException {
        System.out.println(melding.toString());
        //todo Kanskje lag et hashmap med verdier for skjemanavn og .xSD, slik at man kan finne korrekt .xsd
        //
        String skjemanavn = melding.getSkjemaNavn(); //KliniskProstataUtredning

        String XSDfile = XMLValidator.XSD_MAP.get(skjemanavn);
//        Resource resource = new ClassPathResource("XSD/" + XSDfile);

        File file = StreamUtil.stream2file(KreftregisteretAppApplication.class.getClassLoader().getResourceAsStream("XSD/" + XSDfile));
        return file;
    }

    // Inspired by: https://docs.oracle.com/javase/tutorial/essential/io/dirs.html
    public List<File> getFiles(Path directory) throws IOException, DirectoryIteratorException {
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

    public void addMeldingerFromUtFolderToMsgList() {
        try {
            //List<File> fileList = getFiles(Path.of(Utmappe.getPath()));

//            Resource resource = new ClassPathResource("Ut/VALID_07032022_kl141937KliniskProstataUtredning.xml");
//            File file = resource.getFile();

            InputStream is = KreftregisteretAppApplication.class.getClassLoader().getResourceAsStream("Ut/VALID_07032022_kl141937KliniskProstataUtredning.xml");
            File file = StreamUtil.stream2file(is);

            Melding melding = convertFileToMelding(file);
            meldingMap.put(melding, createNewID());
        }catch(Exception e){
            System.out.println("er det her vi feiler???");
            e.printStackTrace();
        }
    }

    public Melding findMeldingById(Long idIn) {
        for (Map.Entry<Melding, Long> entry : meldingMap.entrySet()) {
            Melding melding = entry.getKey();
            Long value = entry.getValue();
            if(Objects.equals(value, idIn)){
                return melding;
            }
        }
        return null;
    }
}
