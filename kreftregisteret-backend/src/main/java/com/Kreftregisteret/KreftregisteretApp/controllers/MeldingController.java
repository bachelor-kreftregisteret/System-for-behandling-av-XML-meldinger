package com.Kreftregisteret.KreftregisteretApp.controllers;


import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.Kreftregisteret.KreftregisteretApp.utils.xml.MessageManager;
import com.github.fge.jsonpatch.JsonPatch;
import com.google.gson.Gson;
import jakarta.xml.bind.JAXBException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;


@RestController
public class MeldingController {
    HashMap<Melding, UUID> msgList = new HashMap<>();

    //http://localhost:8080/api/v1/meldinger
    @CrossOrigin(origins = "http://localhost:3000") //Denne merknaden tillater at frontend fetcher data - Hajin
    @RequestMapping(path = "api/v1/meldinger")
    public Melding getMelding() {
        Melding melding = MessageManager.getMeldingFromPath("kreftregisteret-backend/Prostatapakke/Prostata_4_0_UtredningEksempelfil.xml");
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
    public ResponseEntity<Melding> postMelding(@RequestBody Melding melding) throws JAXBException, ParserConfigurationException, IOException, ClassNotFoundException, TransformerException, SAXException {
        //vi får inn en "hel melding" her, så må vi se om vi klarer å direkte lagre en xml ut i fra dette
        //Melding melding = meldingService.
        //validering
        System.out.println(melding);
        System.out.println("treffer vu ger npå=?=?==?=");
        MessageManager.writeMeldingToPath(melding);
        return ResponseEntity.ok(null);
    }

}

