package com.Kreftregisteret.KreftregisteretApp.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.net.MalformedURLException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UtmappeTests {
    @Test
    @DisplayName("Test: listFiles()")
    void listFiles() throws MalformedURLException {
        File[] files = Utmappe.listFiles();
        assertNotNull(files);
        // Contains a file that ends with KliniskProstataUtredning.xml
        assertTrue(Arrays.toString(files).contains("KliniskProstataUtredning.xml"));
    }

    @Test
    @DisplayName("Test: getPath()")
    void getPath() throws MalformedURLException {
        String path = Utmappe.getPath();
        assertTrue(path.contains("utmappe"));
    }
}
