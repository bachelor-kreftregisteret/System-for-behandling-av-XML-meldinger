package com.Kreftregisteret.KreftregisteretApp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class HerokuTests {
    @Test
    @DisplayName("Test: Find file from Ut resources")
    void utTest() throws IOException {
        Resource resource = new ClassPathResource("Ut/VALID_07032022_kl141937KliniskProstataUtredning.xml");
        File file = resource.getFile();
        String fileName = file.getName();
        assertEquals("VALID_07032022_kl141937KliniskProstataUtredning.xml", fileName);
    }


}
