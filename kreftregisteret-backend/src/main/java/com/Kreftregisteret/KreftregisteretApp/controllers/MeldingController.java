package com.Kreftregisteret.KreftregisteretApp.controllers;


import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.Kreftregisteret.KreftregisteretApp.utils.error.ErrorUtils;
import com.Kreftregisteret.KreftregisteretApp.utils.xml.MeldingManager;
import com.fasterxml.jackson.core.JacksonException;
import jakarta.xml.bind.JAXBException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;
import javax.servlet.http.HttpServletRequest;
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
    public ResponseEntity<String> postMelding(@RequestBody Melding melding) throws JAXBException, IOException, SAXException {
        meldingManager.writeMeldingToPath(melding); // Validation happens here
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
    public ResponseEntity<String> handleException (HttpServletRequest req, Exception ex){
        String errorMessage = ErrorUtils.exceptionToJSON(ex);
        return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

