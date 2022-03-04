package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.net.URL;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


//er det bedre å ha EN jaxbcontext instance her? dvs ha en felles for alle metodene også injecte message manager istedenfor public static?
@Service
public class MessageManager {
    public Melding getMeldingFromPath(String path) {
        Melding melding = null;
        try {
            File file = new File(path);
            //usikker på hvilken måte som er enklest å maintaine..
            //JAXBContext jaxbContext = JAXBContext.newInstance(KliniskProstataKirurgi.class, KliniskProstataStraale.class, KliniskProstataUtredning.class);
            //JAXBContext jaxbContext = JAXBContext.newInstance("com.Kreftregisteret.KreftregisteretApp.models");
            //JAXBContext jaxbContext = JAXBContextFactory.createContext(new Class[]{Melding.class, ObjectFactory.class}, properties);
            JAXBContext jaxbContext = JAXBContext.newInstance(Melding.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            melding = (Melding) jaxbUnmarshaller.unmarshal(file);
            return melding;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    //for å kjøre denne kan vi bruke melding.getClass().getName()
    //https://docs.oracle.com/javase/7/docs/api/javax/xml/bind/Marshaller.html
    public static void writeMeldingToPath(Melding melding) throws JAXBException, ParserConfigurationException, IOException, TransformerException, SAXException, ClassNotFoundException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Melding.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        System.out.println("vi klarer i allefall å lage en JAXBCONTEXT???");
        System.out.println(melding.getSkjemaNavn() + " dette skjemaet kom akkuratt inn i writeMeldingToPath");
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy_'kl'HHmmss");
        Date date = new Date();
        String formattedDate = formatter.format(date);

        // Validate against XSD, throws JAXBException if not valid
        //Schema schema = MessageValidator.generateSchema(melding);
        //jaxbMarshaller.setSchema(schema);
        // TODO: Legge utmappe i resources? Eller finne en ny path
        File file = new File( "utmappe/" + formattedDate + melding.getSkjemaNavn() + ".xml");
        jaxbMarshaller.marshal( melding, file );
    }

    HashMap<String, String> xsdDictionary = new HashMap();
    public static File findXSDFromMelding(Melding melding) throws IOException {
        System.out.println(melding.toString());
        //todo Kanskje lag et hashmap med verdier for skjemanavn og .xSD, slik at man kan finne korrekt .xsd
        //
        String skjemanavn = melding.getSkjemaNavn(); //KliniskProstataUtredning

        String path =  new ClassPathResource("XSD").getURL().getPath();
        File dir = new File(path);

        File[] files = dir.listFiles();

        for (File file : files) {
            //System.out.println(file.getAbsoluteFile());
            if(file.isFile() && file.toPath().toString().contains(skjemanavn)){
                System.out.println("YES FOUND");
                return file;
            }
        }
        return null;
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

    public static ArrayList<Melding> getAllMeldinger(){
        ArrayList<Melding> liste = new ArrayList<>();
        return liste;
    }

    public static Melding getNewMelding(){
        //kanskje implementer kø-logikk her.
        return null;
    }

}
