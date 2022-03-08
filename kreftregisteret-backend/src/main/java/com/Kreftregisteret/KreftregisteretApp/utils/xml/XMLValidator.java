package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import jakarta.xml.bind.util.JAXBSource;
import org.xml.sax.SAXException;
import javax.xml.validation.Schema;
import javax.xml.validation.Validator;
import java.io.IOException;
import java.util.HashMap;

public class XMLValidator {

    public static final HashMap<String, String> XSD_MAP = new HashMap<>() {{
        put("KliniskProstataKirurgi", "KliniskProstataKirurgi_v4_0.xsd");
        put("KliniskProstataStraale", "KliniskProstataStraalebehandling_v4_0.xsd");
        put("KliniskProstataUtredning", "KliniskProstataUtredning_v4_0.xsd");
    }};

    private XMLValidator() {
    }

    public static void validate(Schema schema, JAXBSource jaxbSource) throws IOException, SAXException {
        Validator validator = schema.newValidator();
        // Throws SAXParseException if not validated
        validator.validate(jaxbSource);
    }
}
