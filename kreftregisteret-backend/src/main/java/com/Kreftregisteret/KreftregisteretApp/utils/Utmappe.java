package com.Kreftregisteret.KreftregisteretApp.utils;

import java.io.File;
import java.net.MalformedURLException;
import java.util.Arrays;

public class Utmappe {

    /**
     * Get path of utmappe. Ugly fix for Windows and WSL2, not tried on other environments.
     ** */

    public static String getPath() throws MalformedURLException {
        // Directory name of utmappe
        String utmappe = "utmappe/";
        // Users path
        String path = Utmappe.class.getResource("").getPath();
        // Remove target to get project root path
        path = path.replaceAll("target/classes/com/Kreftregisteret/KreftregisteretApp/utils/", "");
        path = path.replaceAll("target/test-classes/com/Kreftregisteret/KreftregisteretApp/utils/", "");
        // Append utmappe
        path = path + utmappe;
//      System.out.println("AS URL: " + new File(path).toURI().toURL());
        return path;
    }

    /**
     * List all files in utmappe
     * Made for KRG demo for loading files from utmappe
     * @throws MalformedURLException
     */

    public static File[] listFiles() throws MalformedURLException {
        File dir = new File(Utmappe.getPath());
        File[] files = dir.listFiles();
        System.out.println("All files in utmappe: " + Arrays.toString(files));
        return files;
    }

    public static void main(String[] args) throws MalformedURLException {
        Utmappe.listFiles();
    }
}
