package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.Kreftregisteret.KreftregisteretApp.utils.FileManager;
import com.Kreftregisteret.KreftregisteretApp.utils.xml.MeldingManager;
import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MeldingManagerTest {
    MeldingManager meldingManager = new MeldingManager();

    @BeforeAll
    public void setup() throws IOException {
        meldingManager.addMeldingerFromUtFolderToMeldingList(List.of(FileManager.listFiles()));
    }

    @Test
    void findMeldingById() {
        System.out.println("========== Test 1: Valid query ==========");
        Melding m1 = meldingManager.findMeldingById(1L);
        System.out.println(m1);
        assertNotNull(m1);

        System.out.println("\n========== Test 1: False query ==========");
        Melding m2 = meldingManager.findMeldingById(Long.MAX_VALUE);
        System.out.println(m2);
        assertNull(m2);
    }

    @Test
    void convertFileToMelding() {
        File f = new File("src\\test\\resources\\Meldinger\\08042022_kl211251KliniskProstataUtredning.xml");
        assertNotNull(meldingManager.convertFileToMelding(f));
    }
}