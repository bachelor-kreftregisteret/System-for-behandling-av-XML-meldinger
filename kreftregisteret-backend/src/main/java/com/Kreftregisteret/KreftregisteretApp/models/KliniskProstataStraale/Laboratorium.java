
package com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataStraale;

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
 *         &lt;element name="LabnavnKRG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LabnavnHF"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value=""/&gt;
 *               &lt;enumeration value="01"/&gt;
 *               &lt;enumeration value="02"/&gt;
 *               &lt;enumeration value="03"/&gt;
 *               &lt;enumeration value="05"/&gt;
 *               &lt;enumeration value="06"/&gt;
 *               &lt;enumeration value="07"/&gt;
 *               &lt;enumeration value="08"/&gt;
 *               &lt;enumeration value="10"/&gt;
 *               &lt;enumeration value="11"/&gt;
 *               &lt;enumeration value="12"/&gt;
 *               &lt;enumeration value="13"/&gt;
 *               &lt;enumeration value="14"/&gt;
 *               &lt;enumeration value="15"/&gt;
 *               &lt;enumeration value="16"/&gt;
 *               &lt;enumeration value="17"/&gt;
 *               &lt;enumeration value="18"/&gt;
 *               &lt;enumeration value="19"/&gt;
 *               &lt;enumeration value="20"/&gt;
 *               &lt;enumeration value="21"/&gt;
 *               &lt;enumeration value="23"/&gt;
 *               &lt;enumeration value="26"/&gt;
 *               &lt;enumeration value="31"/&gt;
 *               &lt;enumeration value="34"/&gt;
 *               &lt;enumeration value="04"/&gt;
 *               &lt;enumeration value="09"/&gt;
 *               &lt;enumeration value="27"/&gt;
 *               &lt;enumeration value="28"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="99"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LabnavnHFIkkeRelevant"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="true|false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LabnavnHFSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Preparatnummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Labkode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "labnavnKRG",
    "labnavnHF",
    "labnavnHFIkkeRelevant",
    "labnavnHFSpesifiser",
    "preparatnummer",
    "labkode"
})
@XmlRootElement(name = "Laboratorium", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0")
public class Laboratorium {

    @XmlElement(name = "LabnavnKRG", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
    protected String labnavnKRG;
    @XmlElement(name = "LabnavnHF", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
    protected String labnavnHF;
    @XmlElement(name = "LabnavnHFIkkeRelevant", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0")
    protected boolean labnavnHFIkkeRelevant;
    @XmlElement(name = "LabnavnHFSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
    protected String labnavnHFSpesifiser;
    @XmlElement(name = "Preparatnummer", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
    protected String preparatnummer;
    @XmlElement(name = "Labkode", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
    protected String labkode;

    /**
     * Gets the value of the labnavnKRG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabnavnKRG() {
        return labnavnKRG;
    }

    /**
     * Sets the value of the labnavnKRG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabnavnKRG(String value) {
        this.labnavnKRG = value;
    }

    /**
     * Gets the value of the labnavnHF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabnavnHF() {
        return labnavnHF;
    }

    /**
     * Sets the value of the labnavnHF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabnavnHF(String value) {
        this.labnavnHF = value;
    }

    /**
     * Gets the value of the labnavnHFIkkeRelevant property.
     * 
     */
    public boolean isLabnavnHFIkkeRelevant() {
        return labnavnHFIkkeRelevant;
    }

    /**
     * Sets the value of the labnavnHFIkkeRelevant property.
     * 
     */
    public void setLabnavnHFIkkeRelevant(boolean value) {
        this.labnavnHFIkkeRelevant = value;
    }

    /**
     * Gets the value of the labnavnHFSpesifiser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabnavnHFSpesifiser() {
        return labnavnHFSpesifiser;
    }

    /**
     * Sets the value of the labnavnHFSpesifiser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabnavnHFSpesifiser(String value) {
        this.labnavnHFSpesifiser = value;
    }

    /**
     * Gets the value of the preparatnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreparatnummer() {
        return preparatnummer;
    }

    /**
     * Sets the value of the preparatnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreparatnummer(String value) {
        this.preparatnummer = value;
    }

    /**
     * Gets the value of the labkode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabkode() {
        return labkode;
    }

    /**
     * Sets the value of the labkode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabkode(String value) {
        this.labkode = value;
    }

}
