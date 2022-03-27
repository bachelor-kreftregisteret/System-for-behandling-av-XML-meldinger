package com.Kreftregisteret.KreftregisteretApp.models;

import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataKirurgi.KliniskProstataKirurgi;
import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataStraale.KliniskProstataStraale;
import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataUtredning.KliniskProstataUtredning;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlTransient;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = KliniskProstataStraale.class),
        @JsonSubTypes.Type(value = KliniskProstataUtredning.class),
        @JsonSubTypes.Type(value = KliniskProstataKirurgi.class)
})
@XmlSeeAlso({KliniskProstataUtredning.class, KliniskProstataKirurgi.class, KliniskProstataStraale.class})
@XmlTransient
public abstract class Melding {
    //Denne tostringen vises i listen over meldinger som klienten har på landingpage
    @Override
    public String toString() {
        return "{\"id\" : " + getId() + ", \"Filnavn\" :" + "\"" + getFilnavn() + "\"" + ",  \"Skjemanavn\": " + "\"" + getSkjemaNavn() + "\"" + ", \"Endrettidspunkt\": " + "\"" + lastChangedTime + "\"" + "}";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastChangedTime() {
        return lastChangedTime;
    }

    public void setLastChangedTime(String lastChangedTime) {
        this.lastChangedTime = lastChangedTime;
    }

    @XmlTransient
    private Long id;

    @XmlTransient
    public String lastChangedTime;

    public abstract String getSkjemaNavn();

    public abstract String getMetaData();

    public abstract void setFilnavn(String fnavn);

    public abstract String getFilnavn();

}
