package com.Kreftregisteret.KreftregisteretApp.controllers;


import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.Kreftregisteret.KreftregisteretApp.utils.xml.MessageManager;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    MessageManager messageManager;

    @Autowired
    public MeldingController(MessageManager messageManager) throws IOException {
        this.messageManager = messageManager;
        messageManager.addMeldingerFromUtFolderToMsgList();
    }

    //http://localhost:8080/api/v1/meldinger
    @CrossOrigin(origins = {"https://demokrg.herokuapp.com", "http://localhost:8080", "http://localhost:3000", "http://localhost:3001"})
    @GetMapping(path = "api/v1/meldinger/{id}")
    public Melding getMelding(@PathVariable long id) throws IOException {
        return messageManager.findMeldingById(id);
    }


    @CrossOrigin(origins = {"https://demokrg.herokuapp.com", "http://localhost:8080", "http://localhost:3000", "http://localhost:3001"})
    @GetMapping(path = "api/v1/meldinger")
    public HashMap<Melding, Long> getAllMeldinger() throws IOException {
        return messageManager.getMsgMap();
    }

    @CrossOrigin(origins = {"https://demokrg.herokuapp.com", "http://localhost:8080", "http://localhost:3000", "http://localhost:3001"})
    @PostMapping(path = "/api/v1/meldinger", consumes = "application/json")
    public ResponseEntity<String> postMelding(@RequestBody Melding melding) throws JAXBException, ParserConfigurationException, IOException, ClassNotFoundException, TransformerException, SAXException {
        try {
            ObjectMapper mapper = new ObjectMapper();

            //Object to JSON in String
            String jsonInString = mapper.writeValueAsString(melding);
            System.out.println(jsonInString);
            MessageManager.writeMeldingToPath(melding); // Validation happens here
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (SAXException | JAXBException e) {
            // XML validation failed. Write error logic here:
            String error = "" + e.getCause();
            System.out.println("Error: " + error);
            // Error handler method that creates a json?
            return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
        } catch (IOException e) {
            String error = "" + e.getCause();
            System.out.println("Error: " + error);
            return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

