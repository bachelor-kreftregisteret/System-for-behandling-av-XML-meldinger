package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class XMLValidatorTests {

    public XMLValidatorTests() throws IOException {
    }

    File XMLKirurgi = new File(getProstatapakkePath() + "Prostata_4_0_KirurgiEksempelfil.xml");
    File XSDKirurgi = new File(getProstatapakkePath() + "KliniskProstataKirurgi_v4_0.xsd");

    File XMLStraale = new File(getProstatapakkePath() + "Prostata_4_0_StraalebehandlingEksempelfil.xml");
    File XSDStraale = new File(getProstatapakkePath() + "KliniskProstataStraalebehandling_v4_0.xsd");

    File XMLUtredning = new File(getProstatapakkePath() + "Prostata_4_0_UtredningEksempelfil.xml");
    File XSDUtredning = new File(getProstatapakkePath() + "KliniskProstataUtredning_v4_0.xsd");

    File[] XML = {XMLKirurgi, XMLStraale, XMLUtredning};
    File[] XSD = {XSDKirurgi, XSDStraale, XSDUtredning};

    @Test
    void testValidate() throws IOException, SAXException {
    }

    @Test
    void testXSD_MAP() {
        assertEquals(XMLValidator.XSD_MAP.get("KliniskProstataKirurgi"), "KliniskProstataKirurgi_v4_0.xsd");
        assertEquals(XMLValidator.XSD_MAP.get("KliniskProstataStraale"), "KliniskProstataStraalebehandling_v4_0.xsd");
        assertEquals(XMLValidator.XSD_MAP.get("KliniskProstataUtredning"), "KliniskProstataUtredning_v4_0.xsd");
    }

    public String getProstatapakkePath() throws IOException {
        final String XSD_FOLDER = new ClassPathResource("Prostatapakke").getURL().getPath();
        return XSD_FOLDER + "/";
    }
}
