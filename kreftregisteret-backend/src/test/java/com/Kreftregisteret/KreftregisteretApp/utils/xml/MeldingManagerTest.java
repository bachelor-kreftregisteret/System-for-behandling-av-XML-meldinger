package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.Kreftregisteret.KreftregisteretApp.utils.xml.MeldingManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MeldingManagerTest {
    MeldingManager meldingManager = new MeldingManager();

    @BeforeAll
    public void setup() throws IOException {
        meldingManager.addMeldingerFromUtFolderToMeldingList();
    }

    @Test
    void addMeldingerFromUtFolderToMeldingList() {
    }

    @Test
    void findMeldingById() throws IOException {
        System.out.println("========== Test 1: Valid query ==========");
        Melding m1 = meldingManager.findMeldingById(1L);
        System.out.println(m1);
        assertTrue(m1 instanceof Melding);

        System.out.println("\n========== Test 1: False query ==========");
        Melding m2 = meldingManager.findMeldingById(Long.MAX_VALUE);
        System.out.println(m2);
        assertEquals(m2, null);
    }
}