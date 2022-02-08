package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class XMLUnmarshaller {
    /*
        Inspired by
        https://docs.oracle.com/javase/7/docs/api/javax/xml/bind/Unmarshaller.html

        Generic XML unmarshaller using JAXB library.
        Parses XML File to given class, and returns instance of class.
     */

    public static <T> T unmarshal(File XML, Class<T> tClass) throws JAXBException{
        JAXBContext context = JAXBContext.newInstance(tClass);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (T) unmarshaller.unmarshal(XML);
    }
}
