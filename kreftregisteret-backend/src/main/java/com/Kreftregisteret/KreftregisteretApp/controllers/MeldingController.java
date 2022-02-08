package com.Kreftregisteret.KreftregisteretApp.controllers;


import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.Kreftregisteret.KreftregisteretApp.services.MeldingService;
import com.Kreftregisteret.KreftregisteretApp.utils.xml.MessageManager;
import com.github.fge.jsonpatch.JsonPatch;
import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.UUID;


@RestController
public class MeldingController {
    HashMap<Melding, UUID> msgList = new HashMap<>();
    MeldingService meldingService = new MeldingService();

    //http://localhost:8080/api/v1/meldinger
    @RequestMapping(path = "api/v1/meldinger")
    public Melding helloWorld() {
        Melding melding = MessageManager.getMeldingFromPath("/Users/tomhenrikmeltingbasmo/Dev/System-for-behandling-av-XML-meldinger/kreftregisteret-backend/Prostatapakke/Prostata_4_0_UtredningEksempelfil.xml");
        msgList.put(melding, UUID.randomUUID());

        return melding;
    }

    @PatchMapping(
            path = "/api/v1/meldinger",
            consumes = "application/json-patch+json")
    public ResponseEntity<Melding> updateMelding(@RequestBody JsonPatch patch){
        //todo legg til parsing av json patch her.
        Gson gson = new Gson();
        Melding object = gson.fromJson(String.valueOf(patch), Melding.class);
        System.out.println(object);
        return ResponseEntity.ok(object);
    }


    //i førstee omgang bør klienten sende hele json filen!! Så får vi se om vi klarer å lage patch senere...
    @PostMapping(
            path = "/api/v1/meldinger",
            consumes="application/json-patch+json")
    public ResponseEntity<Melding> postMelding(@RequestBody Melding melding){
        //vi får inn en "hel melding" her, så må vi se om vi klarer å direkte lagre en xml ut i fra dette
            //Melding melding = meldingService.
        return ResponseEntity.ok(melding);
    }
/*
    public Melding applyPatchToMelding(JsonPatch patch, Melding melding){
        JsonNode patched = patch.apply(objectMapper.convertValue(melding, JsonNode.class));
        return objectMapper.treeToValue(patched, Melding.class);

    }
    */

}

