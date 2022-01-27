package com.Kreftregisteret.KreftregisteretApp.controllers;


import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataUtredning;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class ControllerTest {

    //http://localhost:8080/api/v1/hallo
    @RequestMapping(path = "api/v1/hallo")
    public KliniskProstataUtredning helloWorld() {
        KliniskProstataUtredning melding = null;
        try {
            File file = new File("/Users/tomhenrikmeltingbasmo/Dev/System-for-behandling-av-XML-meldinger/kreftregisteret-backend/Prostatapakke/Prostata_4_0_UtredningEksempelfil.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(KliniskProstataUtredning.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            melding = (KliniskProstataUtredning) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return melding;

    }
}
