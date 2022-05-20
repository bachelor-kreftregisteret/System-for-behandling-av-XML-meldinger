package com.Kreftregisteret.KreftregisteretApp.models;

import jakarta.xml.bind.annotation.XmlTransient;

public class MeldingDTO {
    private Long id;


    public String endrettidspunkt;

    public String skjemanavn;

    public String filnavn;

    public MeldingDTO(Long id, String endrettidspunkt, String skjemanavn, String filnavn) {
        this.id = id;
        this.endrettidspunkt = endrettidspunkt;
        this.skjemanavn = skjemanavn;
        this.filnavn = filnavn;

    }

    //Denne tostringen vises i listen over meldinger som klienten har på landingpage
    @Override
    public String toString() {
        return "{\"id\" : " + getId() + ", \"Filnavn\" :" + "\"" + getFilnavn() + "\"" + ",  \"Skjemanavn\": " + "\"" + getSkjemanavn() + "\"" + ", \"Endrettidspunkt\": " + "\"" + endrettidspunkt + "\"" + "}";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndrettidspunkt() {
        return endrettidspunkt;
    }

    public void setEndrettidspunkt(String endrettidspunkt) {
        this.endrettidspunkt = endrettidspunkt;
    }


    public String getSkjemanavn() {
        return skjemanavn;
    }

    public void setSkjemanavn(String skjemanavn) {
        this. skjemanavn = skjemanavn;
    }

    public String getFilnavn() {
        return filnavn;
    }

    public void setFilnavn(String filnavn) {
        this.filnavn = filnavn;
    }
}
