
package com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataStraale;

import com.Kreftregisteret.KreftregisteretApp.models.Melding;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0}Meldingsinformasjon"/&gt;
 *         &lt;element ref="{http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0}Navigering"/&gt;
 *         &lt;element ref="{http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0}StdInfo"/&gt;
 *         &lt;element ref="{http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0}Behandling"/&gt;
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
    "behandling"
})
@XmlRootElement(name = "KliniskProstataStraale", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0")
public class KliniskProstataStraale extends Melding {

    @XmlElement(name = "Meldingsinformasjon", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
    protected Meldingsinformasjon meldingsinformasjon;
    @XmlElement(name = "Navigering", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
    protected Navigering navigering;
    @XmlElement(name = "StdInfo", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
    protected StdInfo stdInfo;
    @XmlElement(name = "Behandling", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
    protected Behandling behandling;

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
     * Gets the value of the behandling property.
     * 
     * @return
     *     possible object is
     *     {@link Behandling }
     *     
     */
    public Behandling getBehandling() {
        return behandling;
    }

    /**
     * Sets the value of the behandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Behandling }
     *     
     */
    public void setBehandling(Behandling value) {
        this.behandling = value;
    }

    @Override
    public String getSkjemaNavn() {
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
