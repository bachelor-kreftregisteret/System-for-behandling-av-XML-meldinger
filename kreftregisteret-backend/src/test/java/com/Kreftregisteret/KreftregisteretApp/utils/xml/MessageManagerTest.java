package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MessageManagerTest {

        @Test
        public void messageManagerTest() throws JAXBException, ParserConfigurationException, IOException, TransformerException, SAXException, ClassNotFoundException {
            Melding melding = MessageManager.getMeldingFromPath("/Users/tomhenrikmeltingbasmo/Dev/System-for-behandling-av-XML-meldinger/kreftregisteret-backend/Prostatapakke/Prostata_4_0_UtredningEksempelfil.xml");
            assert melding != null;
            MessageManager.writeMeldingToPath(melding);


        }

}