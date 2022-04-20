package com.Kreftregisteret.KreftregisteretApp.utils;

import java.io.File;
import java.net.MalformedURLException;
import java.util.Arrays;

public class FileManager {

    /**
     * Get path of utmappe. Ugly fix for Windows and WSL2, not tried on other environments.
     ** */
    static String pathToFolder;

    //det er bad practice
    public static void setPathToFolder(String pathToFolderIn) {
        pathToFolder = pathToFolderIn;
    }

    public static String getPath() throws MalformedURLException {
        // Directory name of utmappe
        String utmappe = "utmappe/";
        // Users path
        String path = FileManager.class.getResource("").getPath();
        // Remove dir "target" and every dir after to get the project root path
        path = path.replaceAll("target.*", "");
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
        File dir = new File(FileManager.getPath());
        File[] files = dir.listFiles();
        System.out.println("All files in utmappe: " + Arrays.toString(files));
        return files;
    }
}