package com.Kreftregisteret.KreftregisteretApp.utils.error;

public class ErrorUtils {
    public static String exceptionToJSON(Throwable ex) {
        String cause = ex.getCause()
                .toString()
                .replace("\n", "");

        return "{\"error\": " + "\"" + cause + "\"" + "}";
    }
}
