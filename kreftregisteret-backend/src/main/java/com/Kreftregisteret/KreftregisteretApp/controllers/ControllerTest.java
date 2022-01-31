package com.Kreftregisteret.KreftregisteretApp.controllers;


import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataUtredning;
import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.Kreftregisteret.KreftregisteretApp.services.MeldingService;
import com.github.fge.jsonpatch.JsonPatch;
import com.google.gson.Gson;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.HashMap;


@RestController
public class ControllerTest {

    //tror vi trengre en generert UNIK id som sendes frem og tilbake til klienten. for å kunne være sikre på at vi endrer den korrekte meldingen.
    //denne listen wiplist er på en måte en cached list med uendrede meldinger, dvs meldinger som er sendt ut til klient, men ikke sendt tilbake til serveren i ferdig format

    //Denne hashmappen fukan fungere som en klø - vi lager en unik ID for hver melding, slik at serveren kan gjenkjenne hvilken melding klienten skal endre på
    //slik at den kan lagre meldingen og en ID som er unik, slik at vi kan finne den meldingen vi skal endre på når klienten sender en ENDRET melding tilbake?
    HashMap<Melding, Integer> wiplist = new HashMap<>();

    MeldingService meldingService = new MeldingService();

    //http://localhost:8080/api/v1/meldinger
    @RequestMapping(path = "api/v1/meldinger")
    public KliniskProstataUtredning helloWorld() {
        //lager en melding
        KliniskProstataUtredning melding = null;
        try {
            File file = new File("/Users/tomhenrikmeltingbasmo/Dev/System-for-behandling-av-XML-meldinger/kreftregisteret-backend/Prostatapakke/Prostata_4_0_UtredningEksempelfil.xml");
            //jaxb context lager en "Kontext" for kliniskprostata ( for å gjøre dette trenger modell-klassen spesifikke annotasjoner )
            JAXBContext jaxbContext = JAXBContext.newInstance(KliniskProstataUtredning.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            melding = (KliniskProstataUtredning) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        wiplist.put(melding, 1235);
        return melding;
    }

    //denne metoden returnerer alle klassene i
    @RequestMapping(path = "api/v1/wipmeldinger")
    public String helloWorldDTO() {
        Gson gson = new Gson();
        return gson.toJson(wiplist);
    }


    @PatchMapping(path = "/api/v1/meldinger", consumes = "application/json-patch+json")
    public ResponseEntity<Melding> updateMelding(@RequestBody JsonPatch patch){
        Gson gson = new Gson();
        Melding object = gson.fromJson(String.valueOf(patch), Melding.class);
         return ResponseEntity.ok(object);

       /* try {
            Melding melding = meldingService.findMeldingFromID(patch.).//.orElseThrow(MeldingNotFoundException::new);
            Customer  = applyPatchToCustomer(patch, melding);
            customerService.updateCustomer(melding);
            return ResponseEntity.ok(melding);
        } catch (JsonPatchException | JsonProcessingException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }*/
    }




    //public post postMelding(Melding helMelding){
    // spesifikk meldingtype = detectMeldingType(helMelding);

    // }
}
