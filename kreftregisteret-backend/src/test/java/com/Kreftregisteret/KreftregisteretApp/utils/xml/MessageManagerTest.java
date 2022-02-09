package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MessageManagerTest {

        @Test
        public void messageManagerTest() throws JAXBException, ParserConfigurationException, IOException, TransformerException, SAXException, ClassNotFoundException {
            Melding melding = MessageManager.getMeldingFromPath("Prostatapakke/Prostata_4_0_StraalebehandlingEksempelfil.xml");
            assert melding != null;
            //MessageManager.writeMeldingToPath(melding);
            System.out.println(melding.getSkjemaNavn() + " skjemanavn er null?=?");
            File file = MessageManager.findXSDFromMelding(melding);
            if(file != null) {
                System.out.println(file.toPath().toString());
            }


        }

}
