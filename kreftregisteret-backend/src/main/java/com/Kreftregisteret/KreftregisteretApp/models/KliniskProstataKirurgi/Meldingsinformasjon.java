
package com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataKirurgi;

import java.math.BigInteger;
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
 *         &lt;element name="Skjema"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="KliniskProstataKirurgi"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VersjonsNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VersjonsNrOriginal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KRG_GUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VersjonIP" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="VersjonBT" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TidspunktSubmit"&gt;
 *           &lt;simpleType&gt;
 *             &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}dateTime"&gt;
 *               &lt;simpleType&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                   &lt;pattern value=""/&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/simpleType&gt;
 *             &lt;/union&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Brukernavn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Filnavn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VersjonInternEkstern"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="0"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FeilSkjema" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="true|false"/&gt;
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
    "skjema",
    "versjonsNr",
    "versjonsNrOriginal",
    "krgguid",
    "versjonIP",
    "versjonBT",
    "tidspunktSubmit",
    "brukernavn",
    "filnavn",
    "versjonInternEkstern",
    "feilSkjema"
})
@XmlRootElement(name = "Meldingsinformasjon", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0")
public class Meldingsinformasjon {

    @XmlElement(name = "Skjema", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true)
    protected String skjema;
    @XmlElement(name = "VersjonsNr", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "4.0")
    protected String versjonsNr;
    @XmlElement(name = "VersjonsNrOriginal", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true)
    protected String versjonsNrOriginal;
    @XmlElement(name = "KRG_GUID", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
    protected String krgguid;
    @XmlElement(name = "VersjonIP", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "0")
    protected BigInteger versjonIP;
    @XmlElement(name = "VersjonBT", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "0")
    protected BigInteger versjonBT;
    @XmlElement(name = "TidspunktSubmit", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true)
    protected String tidspunktSubmit;
    @XmlElement(name = "Brukernavn", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
    protected String brukernavn;
    @XmlElement(name = "Filnavn", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
    protected String filnavn;
    @XmlElement(name = "VersjonInternEkstern", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "0")
    protected String versjonInternEkstern;
    @XmlElement(name = "FeilSkjema", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0")
    protected Boolean feilSkjema;

    /**
     * Gets the value of the skjema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkjema() {
        return skjema;
    }

    /**
     * Sets the value of the skjema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkjema(String value) {
        this.skjema = value;
    }

    /**
     * Gets the value of the versjonsNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersjonsNr() {
        return versjonsNr;
    }

    /**
     * Sets the value of the versjonsNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersjonsNr(String value) {
        this.versjonsNr = value;
    }

    /**
     * Gets the value of the versjonsNrOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersjonsNrOriginal() {
        return versjonsNrOriginal;
    }

    /**
     * Sets the value of the versjonsNrOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersjonsNrOriginal(String value) {
        this.versjonsNrOriginal = value;
    }

    /**
     * Gets the value of the krgguid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKRGGUID() {
        return krgguid;
    }

    /**
     * Sets the value of the krgguid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKRGGUID(String value) {
        this.krgguid = value;
    }

    /**
     * Gets the value of the versjonIP property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersjonIP() {
        return versjonIP;
    }

    /**
     * Sets the value of the versjonIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersjonIP(BigInteger value) {
        this.versjonIP = value;
    }

    /**
     * Gets the value of the versjonBT property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersjonBT() {
        return versjonBT;
    }

    /**
     * Sets the value of the versjonBT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersjonBT(BigInteger value) {
        this.versjonBT = value;
    }

    /**
     * Gets the value of the tidspunktSubmit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTidspunktSubmit() {
        return tidspunktSubmit;
    }

    /**
     * Sets the value of the tidspunktSubmit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTidspunktSubmit(String value) {
        this.tidspunktSubmit = value;
    }

    /**
     * Gets the value of the brukernavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrukernavn() {
        return brukernavn;
    }

    /**
     * Sets the value of the brukernavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrukernavn(String value) {
        this.brukernavn = value;
    }

    /**
     * Gets the value of the filnavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilnavn() {
        return filnavn;
    }

    /**
     * Sets the value of the filnavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilnavn(String value) {
        this.filnavn = value;
    }

    /**
     * Gets the value of the versjonInternEkstern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersjonInternEkstern() {
        return versjonInternEkstern;
    }

    /**
     * Sets the value of the versjonInternEkstern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersjonInternEkstern(String value) {
        this.versjonInternEkstern = value;
    }

    /**
     * Gets the value of the feilSkjema property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeilSkjema() {
        return feilSkjema;
    }

    /**
     * Sets the value of the feilSkjema property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeilSkjema(Boolean value) {
        this.feilSkjema = value;
    }

}
