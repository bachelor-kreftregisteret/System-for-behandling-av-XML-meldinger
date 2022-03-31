package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import org.springframework.core.io.ClassPathResource;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.IOException;

public class MeldingValidator {
    private MeldingValidator() {}

    public static Schema generateSchema(Melding melding) throws SAXException, IOException {
        final String PROSTATAPAKKE = new ClassPathResource("Prostatapakke").getURL().getPath() + "/";

        File XSD = new File(PROSTATAPAKKE + XMLValidator.XSD_MAP.get(melding.getSkjemaNavn()));
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = factory.newSchema(XSD);
        return schema;
    }
}
