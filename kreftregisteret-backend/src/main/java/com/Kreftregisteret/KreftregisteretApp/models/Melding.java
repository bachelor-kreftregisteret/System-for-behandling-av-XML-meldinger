package com.Kreftregisteret.KreftregisteretApp.models;

import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataKirurgi.KliniskProstataKirurgi;
import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataStraale.KliniskProstataStraale;
import com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataUtredning.KliniskProstataUtredning;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlSeeAlso({KliniskProstataUtredning.class, KliniskProstataKirurgi.class, KliniskProstataStraale.class})
@XmlTransient
public abstract class Melding {

    public abstract String getSkjemaNavn();
}
