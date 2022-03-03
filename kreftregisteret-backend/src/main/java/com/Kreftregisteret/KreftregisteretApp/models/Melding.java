package com.Kreftregisteret.KreftregisteretApp.models;

import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataKirurgi.KliniskProstataKirurgi;
import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataStraale.KliniskProstataStraale;
import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataUtredning.KliniskProstataUtredning;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlTransient;
/*
@JsonSubTypes({
        @JsonSubTypes.Type(value = KliniskProstataStraale.class, name = "KliniskProstataStraale"),
        @JsonSubTypes.Type(value = KliniskProstataUtredning.class, name = "KliniskProstataUtredning")
})
*/
@JsonTypeInfo( use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = KliniskProstataStraale.class, name = "KliniskProstataStraale"),
        @JsonSubTypes.Type(value = KliniskProstataUtredning.class, name = "KliniskProstataUtredning"),
        @JsonSubTypes.Type(value = KliniskProstataKirurgi.class, name = "KliniskProstataKirurgi")
})
@XmlSeeAlso({KliniskProstataUtredning.class, KliniskProstataKirurgi.class, KliniskProstataStraale.class})
@XmlTransient
public abstract class Melding {

    public abstract String getSkjemaNavn();
}
