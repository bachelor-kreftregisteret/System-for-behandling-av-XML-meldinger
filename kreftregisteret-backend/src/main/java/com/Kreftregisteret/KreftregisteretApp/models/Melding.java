package com.Kreftregisteret.KreftregisteretApp.models;

import jakarta.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class Melding {

    public abstract String getSkjemaNavn();
}
