
package com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataUtredning;

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
 *         &lt;element name="Meldingstittel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MeldingsNr"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="(100|199)?"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
    "meldingstittel",
    "meldingsNr"
})
@XmlRootElement(name = "Navigering", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
public class Navigering {

    @XmlElement(name = "Meldingstittel", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
    protected String meldingstittel;
    @XmlElement(name = "MeldingsNr", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
    protected String meldingsNr;

    /**
     * Gets the value of the meldingstittel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeldingstittel() {
        return meldingstittel;
    }

    /**
     * Sets the value of the meldingstittel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeldingstittel(String value) {
        this.meldingstittel = value;
    }

    /**
     * Gets the value of the meldingsNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeldingsNr() {
        return meldingsNr;
    }

    /**
     * Sets the value of the meldingsNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeldingsNr(String value) {
        this.meldingsNr = value;
    }

}
