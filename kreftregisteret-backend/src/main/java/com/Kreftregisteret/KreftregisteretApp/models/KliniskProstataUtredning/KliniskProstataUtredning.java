package com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataUtredning;

import com.Kreftregisteret.KreftregisteretApp.models.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import java.io.Serializable;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0}Meldingsinformasjon"/&gt;
 *         &lt;element ref="{http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0}Navigering"/&gt;
 *         &lt;element ref="{http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0}StdInfo"/&gt;
 *         &lt;element ref="{http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0}Laboratorium"/&gt;
 *         &lt;element ref="{http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0}InfiltrerendeKreft"/&gt;
 *         &lt;element ref="{http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0}Utredning"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "meldingsinformasjon",
        "navigering",
        "stdInfo",
        "laboratorium",
        "infiltrerendeKreft",
        "utredning"
})
@XmlRootElement(name = "KliniskProstataUtredning", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
public class KliniskProstataUtredning extends Melding implements Serializable {

    @XmlElement(name = "Meldingsinformasjon", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
    protected Meldingsinformasjon meldingsinformasjon;
    @XmlElement(name = "Navigering", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
    protected Navigering navigering;
    @XmlElement(name = "StdInfo", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
    protected StdInfo stdInfo;
    @XmlElement(name = "Laboratorium", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
    protected Laboratorium laboratorium;
    @XmlElement(name = "InfiltrerendeKreft", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
    protected InfiltrerendeKreft infiltrerendeKreft;
    @XmlElement(name = "Utredning", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
    protected Utredning utredning;

    /*no op constructor*/
    public KliniskProstataUtredning(){}


    /**
     * Gets the value of the meldingsinformasjon property.
     *
     * @return
     *     possible object is
     *     {@link Meldingsinformasjon }
     *
     */
    public Meldingsinformasjon getMeldingsinformasjon() {
        return meldingsinformasjon;
    }

    /**
     * Sets the value of the meldingsinformasjon property.
     *
     * @param value
     *     allowed object is
     *     {@link Meldingsinformasjon }
     *
     */
    public void setMeldingsinformasjon(Meldingsinformasjon value) {
        this.meldingsinformasjon = value;
    }

    /**
     * Gets the value of the navigering property.
     *
     * @return
     *     possible object is
     *     {@link Navigering }
     *
     */
    public Navigering getNavigering() {
        return navigering;
    }

    /**
     * Sets the value of the navigering property.
     *
     * @param value
     *     allowed object is
     *     {@link Navigering }
     *
     */
    public void setNavigering(Navigering value) {
        this.navigering = value;
    }

    /**
     * Gets the value of the stdInfo property.
     *
     * @return
     *     possible object is
     *     {@link StdInfo }
     *
     */
    public StdInfo getStdInfo() {
        return stdInfo;
    }

    /**
     * Sets the value of the stdInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link StdInfo }
     *
     */
    public void setStdInfo(StdInfo value) {
        this.stdInfo = value;
    }

    /**
     * Gets the value of the laboratorium property.
     *
     * @return
     *     possible object is
     *     {@link Laboratorium }
     *
     */
    public Laboratorium getLaboratorium() {
        return laboratorium;
    }

    /**
     * Sets the value of the laboratorium property.
     *
     * @param value
     *     allowed object is
     *     {@link Laboratorium }
     *
     */
    public void setLaboratorium(Laboratorium value) {
        this.laboratorium = value;
    }

    /**
     * Gets the value of the infiltrerendeKreft property.
     *
     * @return
     *     possible object is
     *     {@link InfiltrerendeKreft }
     *
     */
    public InfiltrerendeKreft getInfiltrerendeKreft() {
        return infiltrerendeKreft;
    }

    /**
     * Sets the value of the infiltrerendeKreft property.
     *
     * @param value
     *     allowed object is
     *     {@link InfiltrerendeKreft }
     *
     */
    public void setInfiltrerendeKreft(InfiltrerendeKreft value) {
        this.infiltrerendeKreft = value;
    }

    /**
     * Gets the value of the utredning property.
     *
     * @return
     *     possible object is
     *     {@link Utredning }
     *
     */
    public Utredning getUtredning() {
        return utredning;
    }

    /**
     * Sets the value of the utredning property.
     *
     * @param value
     *     allowed object is
     *     {@link Utredning }
     *
     */
    public void setUtredning(Utredning value) {
        this.utredning = value;
    }

    @Override
    public String getSkjemanavn() {
        return this.meldingsinformasjon.getSkjema();
    }

    @Override
    public String getMetaData() {
        return this.meldingsinformasjon.getTidspunktSubmit();
    }

    @Override
    public void setFilnavn(String fnavn) {
        this.meldingsinformasjon.setFilnavn(fnavn);
    }

    @Override
    public String getFilnavn() {
        return this.meldingsinformasjon.getFilnavn();
    }
}
