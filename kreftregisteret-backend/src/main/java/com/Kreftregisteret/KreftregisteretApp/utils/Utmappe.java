package com.Kreftregisteret.KreftregisteretApp.utils;

import java.io.File;
import java.net.MalformedURLException;
import java.util.Arrays;

public class Utmappe {

    /**
     * Get path of utmappe. Ugly fix for windows, not tried on other environments.
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

    public static void listFiles() throws MalformedURLException {
        File dir = new File(Utmappe.getPath());
        System.out.println(Arrays.toString(dir.listFiles()));
    }

    public static void main(String[] args) throws MalformedURLException {
        Utmappe.listFiles();
    }
}
