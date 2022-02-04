package com.Kreftregisteret.KreftregisteretApp.controllers;


import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.Kreftregisteret.KreftregisteretApp.services.MeldingService;
import com.Kreftregisteret.KreftregisteretApp.utils.xml.MessageManager;
import com.github.fge.jsonpatch.JsonPatch;
import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.UUID;


@RestController
public class MeldingController {

    public MeldingController(){

    }

    HashMap<Melding, UUID> wiplist = new HashMap<>();

    MeldingService meldingService = new MeldingService();

    //http://localhost:8080/api/v1/meldinger
    @RequestMapping(path = "api/v1/meldinger")
    public Melding helloWorld() {
        Melding melding = MessageManager.getXMLFromPath("/Users/tomhenrikmeltingbasmo/Dev/System-for-behandling-av-XML-meldinger/kreftregisteret-backend/Prostatapakke/Prostata_4_0_UtredningEksempelfil.xml");
        wiplist.put(melding, UUID.randomUUID());
        return melding;
    }

    @PatchMapping(path = "/api/v1/meldinger", consumes = "application/json-patch+json")
    public ResponseEntity<Melding> updateMelding(@RequestBody JsonPatch patch){
        //todo legg til parsing av json patch her.
        Gson gson = new Gson();
        Melding object = gson.fromJson(String.valueOf(patch), Melding.class);
        return ResponseEntity.ok(object);
    }
}

