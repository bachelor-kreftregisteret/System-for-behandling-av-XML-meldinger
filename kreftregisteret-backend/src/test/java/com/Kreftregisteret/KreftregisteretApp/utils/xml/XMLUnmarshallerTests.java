package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataUtredning.KliniskProstataUtredning;
import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import java.io.File;

public class XMLUnmarshallerTests {
    File XMLKirurgi = new File("src/test/java/com/Kreftregisteret/KreftregisteretApp/utils/xml/testfiles/Prostata_4_0_KirurgiEksempelfil.xml");
    File XMLStraale = new File("src/test/java/com/Kreftregisteret/KreftregisteretApp/utils/xml/testfiles/Prostata_4_0_StraalebehandlingEksempelfil.xml");
    File XMLUtredning = new File("src/test/java/com/Kreftregisteret/KreftregisteretApp/utils/xml/testfiles/Prostata_4_0_UtredningEksempelfil.xml");

    File[] XML = {XMLUtredning};
    Class[] tClasses = {KliniskProstataUtredning.class};

    @Test
    @DisplayName("Test 1: Unmarshall files")
    void Test1() throws JAXBException {
        for (int i = 0; i < XML.length; i++) {
            XMLUnmarshaller.unmarshal(XML[i], tClasses[i]);
        }
    }

    @Test
    @DisplayName("Test 2: Correct values")
    void Test2() throws JAXBException {
        KliniskProstataUtredning test = XMLUnmarshaller.unmarshal(XMLUtredning, KliniskProstataUtredning.class);
        String value = test.getStdInfo().getPasientInstitusjon().getSykehusnavnRHF();

        System.out.println("Expected: 6 | Actual: "+ value);
        assertEquals("6", value);
    }
}
