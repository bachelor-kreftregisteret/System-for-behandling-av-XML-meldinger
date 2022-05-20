package com.Kreftregisteret.KreftregisteretApp.controllers;


import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataKirurgi.KliniskProstataKirurgi;
import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.Kreftregisteret.KreftregisteretApp.models.MeldingDTO;
import com.Kreftregisteret.KreftregisteretApp.utils.error.ErrorUtils;
import com.Kreftregisteret.KreftregisteretApp.utils.xml.MessageManager;
import com.fasterxml.jackson.core.JacksonException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.xml.bind.JAXBException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


@RestController
@Tag(name = "Melding", description = "Endepunkt for behandling av meldinger")

public class MeldingController {
    MessageManager messageManager;

    @Autowired
    public MeldingController(MessageManager messageManager) throws IOException {
        this.messageManager = messageManager;
        messageManager.addMeldingerFromUtFolderToMsgList();
    }

    //http://localhost:8080/api/v1/meldinger
    @CrossOrigin(origins = {"https://demokrg.herokuapp.com", "http://localhost:8080", "http://localhost:3000", "http://localhost:3001"})
    @GetMapping(path = "/api/v1/meldinger/{id}")
    @Operation(
            summary = "Returnerer en person",
            description = "Returnerer en person med gitt Id.",
            tags = {"Melding"},
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "200",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = KliniskProstataKirurgi.class))
                    ),
                    @ApiResponse(description = "Not found", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Internal error", responseCode = "500", content = @Content)
            }
    )
    public Melding getMelding(@PathVariable long id) throws IOException {
        return messageManager.findMeldingById(id);
    }

    @CrossOrigin(origins = {"https://demokrg.herokuapp.com", "http://localhost:8080", "http://localhost:3000", "http://localhost:3001"})
    @GetMapping(path = "/api/v1/meldinger")
    @Operation(
            summary = "Returnerer alle meldinger",
            description = "Returnerer alle gyldige eller tilgjengelige meldinger",
            tags = {"Melding"},
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "200",
                            content = @Content(mediaType = "application/json")
                    ),
                    @ApiResponse(description = "Internal error", responseCode = "500", content = @Content)
            }
    )
    public ArrayList<MeldingDTO> getAllMeldinger() throws IOException {
        return messageManager.getMeldingListDTO();
    }

    @CrossOrigin(origins = {"https://demokrg.herokuapp.com", "http://localhost:8080", "http://localhost:3000", "http://localhost:3001"})
    @PostMapping(path = "/api/v1/meldinger", consumes = "application/json")
    @Operation(
            summary = "Legger til en melding",
            description = "Legger til en melding i databasen",
            tags = {"Melding"},
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "200",
                            content = @Content(mediaType = "application/json")
                    ),
                    @ApiResponse(description = "Internal error", responseCode = "500", content = @Content)
            }
    )
    public ResponseEntity<String> postMelding(@RequestBody Melding melding) throws JAXBException, IOException, SAXException {
        messageManager.writeMeldingToPath(melding); // Validation happens here
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    /*
     * ExceptionHandlers
     * TODO: Kanskje handle exceptions i ny klasse?
     *
     * TODO: Samle Jackson og IOException?
     */

    @ExceptionHandler(value = {SAXException.class, JAXBException.class})
    public ResponseEntity<String> handleSAX_JAXBException(HttpServletRequest req, Exception ex) {
        String errorMessage = ErrorUtils.exceptionToJSON(ex);
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(JacksonException.class)
    public ResponseEntity<String> handleJacksonException(HttpServletRequest req, Exception ex) {
        String errorMessage = ErrorUtils.exceptionToJSON(ex);
        return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(IOException.class)
    public ResponseEntity<String> handleIOException(HttpServletRequest req, Exception ex) {
        String errorMessage = ErrorUtils.exceptionToJSON(ex);
        return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(HttpServletRequest req, Exception ex) {
        String errorMessage = ErrorUtils.exceptionToJSON(ex);
        return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
