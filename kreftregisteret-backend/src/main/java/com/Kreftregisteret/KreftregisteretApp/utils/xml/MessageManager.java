package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataUtredning;
import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

public class MessageManager {

    public static Melding getMeldingFromPath(String path){
        Melding melding = null;
        try {
            File file = new File(path);
            JAXBContext jaxbContext = JAXBContext.newInstance(KliniskProstataUtredning.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            melding = (KliniskProstataUtredning) jaxbUnmarshaller.unmarshal(file);
            return melding;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;

    }

    //for å kjøre denne kan vi bruke melding.getClass().getName()
    public static void writeMeldingToPath(Melding melding) throws JAXBException, ParserConfigurationException, IOException, TransformerException, SAXException, ClassNotFoundException {
        //Ved å bruke getclass kan vi kjøre
        Class<?> sClass = Class.forName(melding.getClass().getName());
        //kan man gjøre dette kallet generisk? dvs unngå å ha en switch for hver type melding?
        //kan gjøre sånn her, men det kan være litt tungvint:
        KliniskProstataUtredning kliniskProstataUtredning = new KliniskProstataUtredning();

        if(sClass.isInstance(kliniskProstataUtredning)) {

            JAXBContext jaxbContext = JAXBContext.newInstance(KliniskProstataUtredning.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            StringWriter writer = new StringWriter();
            jaxbMarshaller.marshal(melding, writer);
            String xmlContent = writer.toString();
            System.out.println( xmlContent );
            // write dom document to a file
            stringParseToFile(xmlContent);
        }






    }

    public static void stringParseToFile(String xmlSource)
            throws SAXException, ParserConfigurationException, IOException, TransformerException {
        // Parser strengen
        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = documentFactory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(new StringReader(xmlSource)));

        // Skriver dokumentet til XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        //trenger logikk for å gi den riktig navn.
        StreamResult result =  new StreamResult(new File("Out/my-file.xml"));
        transformer.transform(source, result);
    }


}
