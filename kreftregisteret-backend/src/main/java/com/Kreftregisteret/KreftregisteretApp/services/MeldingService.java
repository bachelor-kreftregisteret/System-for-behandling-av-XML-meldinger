package com.Kreftregisteret.KreftregisteretApp.services;

import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;
import org.springframework.stereotype.Service;

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

/*
    private Melding applyPatchToCustomer(
            JsonPatch patch, Melding targetMelding) throws JsonPatchException, JsonProcessingException {
        JsonNode patched = patch.apply(objectMapper.convertValue(targetMelding, JsonNode.class));
        return objectMapper.treeToValue(patched, Melding.class);
    }
*/

}
