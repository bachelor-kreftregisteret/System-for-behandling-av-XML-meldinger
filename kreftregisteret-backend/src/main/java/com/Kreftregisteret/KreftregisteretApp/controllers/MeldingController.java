package com.Kreftregisteret.KreftregisteretApp.controllers;


import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.Kreftregisteret.KreftregisteretApp.utils.xml.MeldingManager;
import com.fasterxml.jackson.core.JacksonException;
import jakarta.xml.bind.JAXBException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.HashMap;


@RestController
public class MeldingController {
    MeldingManager meldingManager;

    @Autowired
    public MeldingController(MeldingManager meldingManager) throws IOException {
        this.meldingManager = meldingManager;
        meldingManager.addMeldingerFromUtFolderToMeldingList();
    }

    //http://localhost:8080/api/v1/meldinger
    @CrossOrigin(origins = {"https://demokrg.herokuapp.com", "http://localhost:8080", "http://localhost:3000", "http://localhost:3001"})
    @GetMapping(path = "/api/v1/meldinger/{id}")
    public Melding getMelding(@PathVariable long id) throws IOException {
        return meldingManager.findMeldingById(id);
    }

    @CrossOrigin(origins = {"https://demokrg.herokuapp.com", "http://localhost:8080", "http://localhost:3000", "http://localhost:3001"})
    @GetMapping(path = "/api/v1/meldinger")
    public HashMap<Melding, Long> getAllMeldinger() throws IOException {
        return meldingManager.getMeldingMap();
    }

    @CrossOrigin(origins = {"https://demokrg.herokuapp.com", "http://localhost:8080", "http://localhost:3000", "http://localhost:3001"})
    @PostMapping(path = "/api/v1/meldinger", consumes = "application/json")
    public ResponseEntity<String> postMelding(@RequestBody Melding melding) throws JAXBException, ParserConfigurationException, IOException, ClassNotFoundException, TransformerException, SAXException {
        try {
            meldingManager.writeMeldingToPath(melding); // Validation happens here
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (SAXException | JAXBException e) {
            // XML validation failed. Write error logic here:
            String error = "" + e.getCause();
            System.out.println("Sax/jaxbError: " + error);
            // Error handler method that creates a json?
            return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
        } catch (JacksonException e) {
            String error = "" + e.getCause();
            System.out.println("JacksonError: " + error);
            return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (IOException e) {
            String error = "" + e.getCause();
            System.out.println("IoexceptionError: " + error);
            return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
/*
    @CrossOrigin(origins = {"https://demokrg.herokuapp.com", "http://localhost:8080", "http://localhost:3000", "http://localhost:3001"})
    @PostMapping(path = "/api/v1/meldinger", consumes = "application/json")
    public ResponseEntity<String> postMelding(@RequestBody String json) throws JAXBException, ParserConfigurationException, IOException, ClassNotFoundException, TransformerException, SAXException {
        System.out.println("json = " + json);

        return new ResponseEntity<>(json, HttpStatus.INTERNAL_SERVER_ERROR);

    }*/
}

