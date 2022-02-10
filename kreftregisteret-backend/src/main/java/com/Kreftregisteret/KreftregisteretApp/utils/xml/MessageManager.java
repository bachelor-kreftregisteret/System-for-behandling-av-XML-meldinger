package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataStraale.KliniskProstataStraale;
import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataUtredning.KliniskProstataUtredning;
import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class MessageManager {
    public static Melding getMeldingFromPath(String path) {
        Melding melding = null;
        try {
            File file = new File(path);
            JAXBContext jaxbContext = JAXBContext.newInstance( KliniskProstataStraale.class, KliniskProstataUtredning.class);
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
        JAXBContext jaxbContext = JAXBContext.newInstance("com.Kreftregisteret.KreftregisteretApp.models");
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy_'kl'HHmmss");
        Date date = new Date();
        String formattedDate = formatter.format(date);

        File file = new File( "utmappe/" + formattedDate + melding.getSkjemaNavn() + ".xml");
        jaxbMarshaller.marshal( melding, file );
    }



    HashMap<String, String> xsdDictionary = new HashMap();
    public static File findXSDFromMelding(Melding melding){
        //todo Kanskje lag et hashmap med verdier for skjemanavn og .xSD, slik at man kan finne korrekt .xsd
        //
        String skjemanavn = melding.getSkjemaNavn(); //KliniskProstataUtredning

        File dir = new File("XSD");

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


    public static ArrayList<Melding> getAllMeldinger(){
        ArrayList<Melding> liste = new ArrayList<>();



        return liste;
    }

    public static Melding getNewMelding(){
        //kanskje implementer kø-logikk her.
        return null;
    }

}
