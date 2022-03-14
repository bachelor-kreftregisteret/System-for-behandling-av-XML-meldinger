package com.Kreftregisteret.KreftregisteretApp.utils;

import java.io.File;
import java.net.MalformedURLException;
import java.util.Arrays;

public class Inmappe {

    public static String getPath() {
        // Directory name of utmappe
        String utmappe = "In/";
        // Users path
        String path = Utmappe.class.getResource("").getPath();
        // Remove dir "target" and every dir after to get the project root path
        path = path.replaceAll("target.*", "");
        // Append utmappe
        path = path + utmappe;
        return path;
    }

    public static File[] listFiles() throws MalformedURLException {
        File dir = new File(Inmappe.getPath());
        File[] files = dir.listFiles();
        System.out.println("All files in In: " + Arrays.toString(files));
        return files;
    }
}
