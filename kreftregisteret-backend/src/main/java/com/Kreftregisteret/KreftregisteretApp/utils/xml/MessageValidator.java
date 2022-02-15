package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import com.Kreftregisteret.KreftregisteretApp.utils.xml.XMLValidator;

public class MessageValidator {
    private static final String XSD_FOLDER = "XSD/";
    private MessageValidator() {}

    public static Schema generateSchema(Melding melding) throws SAXException {
        File XSD = new File(XSD_FOLDER + XMLValidator.XSD_MAP.get(melding.getSkjemaNavn()));
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = factory.newSchema(XSD);
        return schema;
    }
}
