package com.Kreftregisteret.KreftregisteretApp.services;

import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataUtredning;
import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

@Service
public class MeldingService {

    public Melding findMeldingFromID(Integer ID, HashMap<Melding, Integer> map){
        for (HashMap.Entry<Melding, Integer> entry : map.entrySet()) {
            Melding key = entry.getKey();
            Integer value = entry.getValue();
            if(value == ID){
                return key;
            }
            // ...
        }
        return null;
    }

    public static Melding getXMLFromPath(String path){
        Melding melding = null;
        try {
            File file = new File(path);
            // er det mulig å sende en Type/Klasse inn i en funksjon?
            JAXBContext jaxbContext = JAXBContext.newInstance(KliniskProstataUtredning.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            melding = (KliniskProstataUtredning) jaxbUnmarshaller.unmarshal(file);
            return melding;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;

    }


    public static void saveXML(Melding melding){
        File file = new File("Out");
        return;
    }


}
