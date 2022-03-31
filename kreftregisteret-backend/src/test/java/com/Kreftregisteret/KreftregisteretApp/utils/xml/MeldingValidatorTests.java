package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;

import static org.junit.Assert.assertEquals;

public class MeldingValidatorTests {
    @Test
    public void generateSchemaTest() throws SAXException {
        // Create correct schema
        File XSD = new File("src/test/java/com/Kreftregisteret/KreftregisteretApp/utils/xml/testfiles/KliniskProstataUtredning_v4_0.xsd");
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = factory.newSchema(XSD);

        // Make mock melding from KliniskProstataUtredningMelding10022022.json
        // Melding melding = KliniskProstataUtredningMelding10022022.json etc
        // and check if it's equal to the schema made from XSD
//        assertEquals(MessageValidator.generateSchema(melding), schema);
    }
}
