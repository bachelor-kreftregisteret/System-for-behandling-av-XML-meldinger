package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MessageManagerTest {

    MessageManager messageManager = new MessageManager();

        @Test
        public void messageManagerTest() throws JAXBException, ParserConfigurationException, IOException, TransformerException, SAXException, ClassNotFoundException {
            Melding melding = messageManager.getMeldingFromPath("Prostatapakke/Prostata_4_0_StraalebehandlingEksempelfil.xml");
            assert melding != null;
            //MessageManager.writeMeldingToPath(melding);
            System.out.println(melding.getSkjemaNavn() + " skjemanavn er null?=?");
            File file = MessageManager.findXSDFromMelding(melding);
            if(file != null) {
                System.out.println(file.toPath().toString());
            }
        }

    @Test
    @DisplayName("Test: getFiles()")
    void getFilesTest() throws IOException, DirectoryIteratorException {
        Path path = Path.of("./In");
        List<File> files = MessageManager.getFiles(path);

        for (File file : files) {
            System.out.println(file.getName());
        }
    }

}
