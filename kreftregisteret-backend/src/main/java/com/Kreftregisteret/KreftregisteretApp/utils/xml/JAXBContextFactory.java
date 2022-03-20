package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

/*
    Inspired by the Singleton pattern to keep static methods as well as initializing only one JAXBContext, and ensuring thread-safety
    https://en.wikipedia.org/wiki/Singleton_pattern
    https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom
*/

public class JAXBContextFactory {
    private static volatile JAXBContext instance = null;

    private JAXBContextFactory() {}

    private static <T> JAXBContext getInstance(Class<T> tClass) throws JAXBException {
        if (instance == null) {
            synchronized (JAXBContextFactory.class) {
                if (instance == null) {
                    instance = JAXBContext.newInstance(tClass);
                }
            }
        }

        return instance;
    }

    // Kanskje også lage en egen unmarshaller og marshaller context her?
}
