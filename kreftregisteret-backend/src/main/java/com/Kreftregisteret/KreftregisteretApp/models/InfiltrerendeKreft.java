
package com.Kreftregisteret.KreftregisteretApp.models;

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
 *         &lt;element name="Kreft"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value=""/&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
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
    "kreft"
})
@XmlRootElement(name = "InfiltrerendeKreft", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
public class InfiltrerendeKreft {

    @XmlElement(name = "Kreft", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
    protected String kreft;

    /**
     * Gets the value of the kreft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKreft() {
        return kreft;
    }

    /**
     * Sets the value of the kreft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKreft(String value) {
        this.kreft = value;
    }

}
