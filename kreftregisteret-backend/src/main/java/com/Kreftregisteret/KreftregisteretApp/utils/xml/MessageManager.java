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

    public static Melding getMeldingFromPath(String path) {
        Melding melding = null;
        try {
            File file = new File(path);
            JAXBContext jaxbContext = JAXBContext.newInstance("com.Kreftregisteret.KreftregisteretApp.models");
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            melding = (KliniskProstataUtredning) jaxbUnmarshaller.unmarshal(file);
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
        StringWriter writer = new StringWriter();
        jaxbMarshaller.marshal(melding, writer);
        String xmlContent = writer.toString();
        //validering!!!!
        System.out.println(xmlContent);
        stringParseToFile(xmlContent);


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
        StreamResult result = new StreamResult(new File("Out/my-file.xml"));
        transformer.transform(source, result);
    }


}
