package com.Kreftregisteret.KreftregisteretApp.utils.xml;

import com.Kreftregisteret.KreftregisteretApp.KreftregisteretAppApplication;
import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import com.Kreftregisteret.KreftregisteretApp.utils.StreamUtil;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.IOException;

public class MessageValidator {
    private MessageValidator() {}

    public static Schema generateSchema(Melding melding) throws SAXException, IOException {
        File XSD = StreamUtil.stream2file(KreftregisteretAppApplication.class.getClassLoader().getResourceAsStream("XSD/" + XMLValidator.XSD_MAP.get(melding.getSkjemanavn())));
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = factory.newSchema(XSD);
        return schema;
    }
}
