package com.Kreftregisteret.KreftregisteretApp.models;

import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataKirurgi.KliniskProstataKirurgi;
import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataStraale.KliniskProstataStraale;
import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataUtredning.KliniskProstataUtredning;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlTransient;

@JsonSubTypes({
        @JsonSubTypes.Type(value = KliniskProstataStraale.class),
        @JsonSubTypes.Type(value = KliniskProstataUtredning.class),
        @JsonSubTypes.Type(value = KliniskProstataKirurgi.class)
})
@XmlSeeAlso({KliniskProstataUtredning.class, KliniskProstataKirurgi.class, KliniskProstataStraale.class})
@XmlTransient
public abstract class Melding {
    //todo kanskje all meldingsinformasjon kan trekkes opp hit? hvordan vil det fungere? blir det mye jobb i fremtiden?
    @Override
    public String toString() {
        return getFilnavn();
    }

    public abstract String getSkjemaNavn();

    public abstract String getMetaData();

    public abstract void setFilnavn(String fnavn);

    public abstract String getFilnavn();

    //todo LAG EN MELDINGSINFORMASJONSINTERFACE?????? for å kunne hente ut data om hver melding..
}
