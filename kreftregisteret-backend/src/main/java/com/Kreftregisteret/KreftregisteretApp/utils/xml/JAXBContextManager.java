package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

/*
    Inspired by the Singleton pattern to keep static methods as well as initializing only one JAXBContext, and ensuring thread-safety
    https://en.wikipedia.org/wiki/Singleton_pattern
    https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom
*/

public class JAXBContextManager {
    private static volatile JAXBContext instance = null;

    private JAXBContextManager() {}

    public static <T> JAXBContext getInstance() throws JAXBException {
        if (instance == null) {
            synchronized (JAXBContextManager.class) {
                if (instance == null) {
                    instance = JAXBContext.newInstance(Melding.class);
                }
            }
        }

        return instance;
    }
}
