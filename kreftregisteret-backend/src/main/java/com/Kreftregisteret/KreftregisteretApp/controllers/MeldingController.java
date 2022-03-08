package com.Kreftregisteret.KreftregisteretApp.controllers;

import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.Kreftregisteret.KreftregisteretApp.utils.xml.MessageManager;
import jakarta.xml.bind.JAXBException;
import org.springframework.beans.factory.annotation.Autowired;
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
        /*messageManager.getMsgMap().forEach((melding, id) ->{
            URI location = ServletUriComponentsBuilder.path("/{id}")
                    .buildAndExpand(id).toUri();
        });*/
    }

    //http://localhost:8080/api/v1/meldinger
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:3000", "http://localhost:3001"})
    @GetMapping(path = "api/v1/meldinger/{id}")
    public Melding getMelding(@PathVariable long id) throws IOException {
        return messageManager.findMeldingById(id);
    }


    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:3000", "http://localhost:3001"})
    @GetMapping(path = "api/v1/meldinger")
    public HashMap<Melding, Long> getAllMeldinger() throws IOException {
        //Kanskje vi bør vi ved lokasjonen til hver ID istedenfor ID? eller begge?
        return messageManager.getMsgMap();
    }


    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:3000", "http://localhost:3001"})
    @PostMapping(path = "/api/v1/meldinger", consumes = "application/json")
    public ResponseEntity<Melding> postMelding(@RequestBody Melding melding) throws JAXBException, ParserConfigurationException, IOException, ClassNotFoundException, TransformerException, SAXException {
        try {
            MessageManager.writeMeldingToPath(melding); // Validation happens here
            return ResponseEntity.ok(null);
        } catch (SAXException | JAXBException e) {
            // XML validation failed. Write error logic here:
            e.printStackTrace();
            return ResponseEntity.ok(null);
        }
    }
}

