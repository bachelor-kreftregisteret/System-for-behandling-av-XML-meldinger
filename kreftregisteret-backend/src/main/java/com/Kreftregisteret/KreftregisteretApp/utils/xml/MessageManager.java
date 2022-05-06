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

        // Set filnavn
        String newFilnavn = getFileDate() + melding.getSkjemaNavn() + ".xml";
        melding.setFilnavn(newFilnavn);
        System.out.println("Melding: " + melding);
        System.out.println("Melding skjemanavn 2: " + melding.getSkjemaNavn());
        melding.setLastChangedTime(getDate());
        meldingMap.put(melding, createNewID());
        System.out.println("I write: " + meldingMap);
    }

    public void addMeldingerFromUtFolderToMsgList() {
        try {
            InputStream is = KreftregisteretAppApplication.class.getClassLoader().getResourceAsStream("Ut/VALID_07032022_kl141937KliniskProstataUtredning.xml");
            File file = StreamUtil.stream2file(is);

            Melding melding = convertFileToMelding(file);
            meldingMap.put(melding, createNewID());

        }catch(Exception e){
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
