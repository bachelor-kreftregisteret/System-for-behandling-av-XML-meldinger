package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class XMLValidatorTests {
    File XMLKirurgi = new File("src/test/java/com/Kreftregisteret/KreftregisteretApp/utils/xml/testfiles/Prostata_4_0_KirurgiEksempelfil.xml");
    File XSDKirurgi = new File("src/test/java/com/Kreftregisteret/KreftregisteretApp/utils/xml/testfiles/KliniskProstataKirurgi_v4_0.xsd");

    File XMLStraale = new File("src/test/java/com/Kreftregisteret/KreftregisteretApp/utils/xml/testfiles/Prostata_4_0_StraalebehandlingEksempelfil.xml");
    File XSDStraale = new File("src/test/java/com/Kreftregisteret/KreftregisteretApp/utils/xml/testfiles/KliniskProstataStraalebehandling_v4_0.xsd");

    File XMLUtredning = new File("src/test/java/com/Kreftregisteret/KreftregisteretApp/utils/xml/testfiles/Prostata_4_0_UtredningEksempelfil.xml");
    File XSDUtredning = new File("src/test/java/com/Kreftregisteret/KreftregisteretApp/utils/xml/testfiles/KliniskProstataUtredning_v4_0.xsd");

    File[] XML = {XMLKirurgi, XMLStraale, XMLUtredning};
    File[] XSD = {XSDKirurgi, XSDStraale, XSDUtredning};

    @Test
    void testValidate() throws IOException, SAXException {
        assertTrue(XMLValidator.validate(XMLKirurgi, XSDKirurgi), "Matching XML and XSD should validate");
        assertTrue(XMLValidator.validate(XMLStraale, XSDStraale), "Matching XML and XSD should validate");
        assertTrue(XMLValidator.validate(XMLUtredning, XSDUtredning), "Matching XML and XSD should validate");

        // Test through all possible combinations
        for (int i = 0; i < XML.length; i++) {
            for (int j = 0; j < XSD.length; j++) {
                if (i != j) {
                    assertFalse(XMLValidator.validate(XML[i], XSD[j]), "XML should not validate against a non-matching XSD");
                }
            }
        }
    }

    @Test
    void testXSD_MAP() {
        assertEquals(XMLValidator.XSD_MAP.get("KliniskProstataKirurgi"), "KliniskProstataKirurgi_v4_0.xsd");
        assertEquals(XMLValidator.XSD_MAP.get("KliniskProstataStraale"), "KliniskProstataStraalebehandling_v4_0.xsd");
        assertEquals(XMLValidator.XSD_MAP.get("KliniskProstataUtredning"), "KliniskProstataUtredning_v4_0.xsd");
    }
}
