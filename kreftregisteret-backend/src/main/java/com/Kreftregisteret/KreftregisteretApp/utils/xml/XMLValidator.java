package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
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

    /*
      Inspired by
      https://docs.oracle.com/en/java/javase/17/docs/api/java.xml/javax/xml/validation/package-summary.html
      The method is not parsing the "File XML" to a "Document" because it will fail with
      "cvc-elt.1.a: Cannot find the declaration of element" of the root element.
      Therefor we will use StreamSource with the XML file as an argument in "validator.validate".
    */

    public static boolean validate(File XML, File XSD) throws IOException, SAXException {
        // Make SchemaFactory capable of understanding WXS schemas
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

        // Load WXS schema, represented by a Schema instance
        Source schemaFile = new StreamSource(XSD);
        Schema schema = factory.newSchema(schemaFile);

        // create Validator instance
        Validator validator = schema.newValidator();

        try {
            validator.validate(new StreamSource(XML));
            System.out.printf("SUCCESS: %s succesfully validated against %s \n", XML.getName(), XSD.getName());

            // XML file is validated against XSD successfully
            return true;
        } catch (SAXException saxException) {
            System.out.println(saxException.getMessage());
            System.out.printf("FAIL: %s failed to validate against %s \n", XML.getName(), XSD.getName());

            // XML file failed to validate against XSD file
            return false;
        }
    }
}
