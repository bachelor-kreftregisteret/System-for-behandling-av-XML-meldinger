package com.Kreftregisteret.KreftregisteretApp.controllers;


import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.Kreftregisteret.KreftregisteretApp.utils.xml.MessageManager;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.JsonPatch;
import com.google.gson.Gson;
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

    //nå skal vi legge til en metode som gjør det mulig å hente alle meldinger ELLER bare metadata om de..
    //dvs at best practice er faktisk å lage en

    //http://localhost:8080/api/v1/meldinger
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:3000", "http://localhost:3001"})
    @GetMapping(path = "api/v1/meldinger")
    public HashMap<Melding, Long> getAllMeldinger() throws IOException {
        //Kanskje vi bør vi ved lokasjonen til hver ID istedenfor ID? eller begge?

        return messageManager.getMsgMap();
    }

    @PatchMapping(
            path = "/api/v1/meldinger",
            consumes = "application/json-patch+json")
    public ResponseEntity<Melding> updateMelding(@RequestBody JsonPatch patch) {
        //todo legg til parsing av json patch her.
        Gson gson = new Gson();
        Melding object = gson.fromJson(String.valueOf(patch), Melding.class);
        System.out.println(object);
        return ResponseEntity.ok(object);
    }


    //i førstee omgang bør klienten sende hele json filen!! Så får vi se om vi klarer å lage patch senere...
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:3000", "http://localhost:3001"})
    @PostMapping(
            path = "/api/v1/meldinger",
            consumes = "application/json")
    public ResponseEntity<Melding> postMelding(@RequestBody Melding melding) throws JAXBException, ParserConfigurationException, IOException, ClassNotFoundException, TransformerException, SAXException {
        //vi får inn en "hel melding" her, så må vi se om vi klarer å direkte lagre en xml ut i fra dette
        //Melding melding = meldingService.
        //validering
        ObjectMapper mapper = new ObjectMapper();

        //Object to JSON in String
        String jsonInString = mapper.writeValueAsString(melding);
        System.out.println(jsonInString);

        System.out.println(melding);

        try {
            MessageManager.writeMeldingToPath(melding);
            return ResponseEntity.ok(null);
        } catch (SAXException | JAXBException e) {
            // XML validation failed. Write error logic here:
            e.printStackTrace();
            return ResponseEntity.ok(null);
        }
    }

}

