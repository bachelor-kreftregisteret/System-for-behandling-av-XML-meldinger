package com.Kreftregisteret.KreftregisteretApp.utils;

import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StreamUtil {

    static String getPrefix() {
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy_'kl'HHmmss");
        Date date = new Date();
        String formattedDate = formatter.format(date);
        return formattedDate + "Melding" + "_";
    }

    /**
     * THIS CLASS IS COPIED FROM https://stackoverflow.com/a/16028522
     **/

    public static String PREFIX = getPrefix();
    public static final String SUFFIX = ".xml";

    public static File stream2file (InputStream in) throws IOException {
        final File tempFile = File.createTempFile(PREFIX, SUFFIX);
        tempFile.deleteOnExit();
        try (FileOutputStream out = new FileOutputStream(tempFile)) {
            IOUtils.copy(in, out);
        }
        return tempFile;
    }

}
