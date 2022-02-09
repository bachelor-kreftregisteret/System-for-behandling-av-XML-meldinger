
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
 *         &lt;element name="PasientInstitusjon"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FodselsnummerKRG"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FodselsnummerHF"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="((0[1-9]|[1-2]\d|3[0-1])(0[1-9]|1[0-2])\d{7})?"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FodselnummerUtland"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                         &lt;pattern value="true|false"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FodselsnummerUtlandSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NavnPasient" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Sykehuskode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SykehusnavnHF"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="1305"/&gt;
 *                         &lt;enumeration value="1801"/&gt;
 *                         &lt;enumeration value="0305"/&gt;
 *                         &lt;enumeration value="0320"/&gt;
 *                         &lt;enumeration value="1107"/&gt;
 *                         &lt;enumeration value="1608"/&gt;
 *                         &lt;enumeration value="0501"/&gt;
 *                         &lt;enumeration value="1005"/&gt;
 *                         &lt;enumeration value="1903"/&gt;
 *                         &lt;enumeration value="1504"/&gt;
 *                         &lt;enumeration value="0808"/&gt;
 *                         &lt;enumeration value="0601"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SykehusnavnHFSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SykehusnavnKRGSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Avdelingskode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Avdelingsnavn"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="14"/&gt;
 *                         &lt;enumeration value="01"/&gt;
 *                         &lt;enumeration value="47"/&gt;
 *                         &lt;enumeration value="20"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AvdelingsnavnHFSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="AvdelingsnavnKRGSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Kommentarfelt"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Kommentar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FilmBilde" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FilmNr"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="(\d{4})?"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BildeNr"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="(\d{4})?"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Melder"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MeldersNavn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="MeldeDato"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}date"&gt;
 *                         &lt;simpleType&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                             &lt;pattern value=""/&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/simpleType&gt;
 *                       &lt;/union&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MelderID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
    "pasientInstitusjon",
    "kommentarfelt",
    "filmBilde",
    "melder"
})
@XmlRootElement(name = "StdInfo", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0")
public class StdInfo {

    @XmlElement(name = "PasientInstitusjon", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
    protected StdInfo.PasientInstitusjon pasientInstitusjon;
    @XmlElement(name = "Kommentarfelt", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
    protected StdInfo.Kommentarfelt kommentarfelt;
    @XmlElement(name = "FilmBilde", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0")
    protected StdInfo.FilmBilde filmBilde;
    @XmlElement(name = "Melder", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
    protected StdInfo.Melder melder;

    /**
     * Gets the value of the pasientInstitusjon property.
     * 
     * @return
     *     possible object is
     *     {@link StdInfo.PasientInstitusjon }
     *     
     */
    public StdInfo.PasientInstitusjon getPasientInstitusjon() {
        return pasientInstitusjon;
    }

    /**
     * Sets the value of the pasientInstitusjon property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdInfo.PasientInstitusjon }
     *     
     */
    public void setPasientInstitusjon(StdInfo.PasientInstitusjon value) {
        this.pasientInstitusjon = value;
    }

    /**
     * Gets the value of the kommentarfelt property.
     * 
     * @return
     *     possible object is
     *     {@link StdInfo.Kommentarfelt }
     *     
     */
    public StdInfo.Kommentarfelt getKommentarfelt() {
        return kommentarfelt;
    }

    /**
     * Sets the value of the kommentarfelt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdInfo.Kommentarfelt }
     *     
     */
    public void setKommentarfelt(StdInfo.Kommentarfelt value) {
        this.kommentarfelt = value;
    }

    /**
     * Gets the value of the filmBilde property.
     * 
     * @return
     *     possible object is
     *     {@link StdInfo.FilmBilde }
     *     
     */
    public StdInfo.FilmBilde getFilmBilde() {
        return filmBilde;
    }

    /**
     * Sets the value of the filmBilde property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdInfo.FilmBilde }
     *     
     */
    public void setFilmBilde(StdInfo.FilmBilde value) {
        this.filmBilde = value;
    }

    /**
     * Gets the value of the melder property.
     * 
     * @return
     *     possible object is
     *     {@link StdInfo.Melder }
     *     
     */
    public StdInfo.Melder getMelder() {
        return melder;
    }

    /**
     * Sets the value of the melder property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdInfo.Melder }
     *     
     */
    public void setMelder(StdInfo.Melder value) {
        this.melder = value;
    }


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
     *         &lt;element name="FilmNr"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="(\d{4})?"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BildeNr"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="(\d{4})?"/&gt;
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
        "filmNr",
        "bildeNr"
    })
    public static class FilmBilde {

        @XmlElement(name = "FilmNr", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String filmNr;
        @XmlElement(name = "BildeNr", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String bildeNr;

        /**
         * Gets the value of the filmNr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFilmNr() {
            return filmNr;
        }

        /**
         * Sets the value of the filmNr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFilmNr(String value) {
            this.filmNr = value;
        }

        /**
         * Gets the value of the bildeNr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBildeNr() {
            return bildeNr;
        }

        /**
         * Sets the value of the bildeNr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBildeNr(String value) {
            this.bildeNr = value;
        }

    }


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
     *         &lt;element name="Kommentar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "kommentar"
    })
    public static class Kommentarfelt {

        @XmlElement(name = "Kommentar", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String kommentar;

        /**
         * Gets the value of the kommentar property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKommentar() {
            return kommentar;
        }

        /**
         * Sets the value of the kommentar property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKommentar(String value) {
            this.kommentar = value;
        }

    }


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
     *         &lt;element name="MeldersNavn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="MeldeDato"&gt;
     *           &lt;simpleType&gt;
     *             &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}date"&gt;
     *               &lt;simpleType&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                   &lt;pattern value=""/&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/simpleType&gt;
     *             &lt;/union&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MelderID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "meldersNavn",
        "meldeDato",
        "melderID"
    })
    public static class Melder {

        @XmlElement(name = "MeldersNavn", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String meldersNavn;
        @XmlElement(name = "MeldeDato", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
        protected String meldeDato;
        @XmlElement(name = "MelderID", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String melderID;

        /**
         * Gets the value of the meldersNavn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeldersNavn() {
            return meldersNavn;
        }

        /**
         * Sets the value of the meldersNavn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeldersNavn(String value) {
            this.meldersNavn = value;
        }

        /**
         * Gets the value of the meldeDato property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeldeDato() {
            return meldeDato;
        }

        /**
         * Sets the value of the meldeDato property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeldeDato(String value) {
            this.meldeDato = value;
        }

        /**
         * Gets the value of the melderID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMelderID() {
            return melderID;
        }

        /**
         * Sets the value of the melderID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMelderID(String value) {
            this.melderID = value;
        }

    }


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
     *         &lt;element name="FodselsnummerKRG"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FodselsnummerHF"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="((0[1-9]|[1-2]\d|3[0-1])(0[1-9]|1[0-2])\d{7})?"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FodselnummerUtland"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *               &lt;pattern value="true|false"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FodselsnummerUtlandSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NavnPasient" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Sykehuskode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SykehusnavnHF"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="1305"/&gt;
     *               &lt;enumeration value="1801"/&gt;
     *               &lt;enumeration value="0305"/&gt;
     *               &lt;enumeration value="0320"/&gt;
     *               &lt;enumeration value="1107"/&gt;
     *               &lt;enumeration value="1608"/&gt;
     *               &lt;enumeration value="0501"/&gt;
     *               &lt;enumeration value="1005"/&gt;
     *               &lt;enumeration value="1903"/&gt;
     *               &lt;enumeration value="1504"/&gt;
     *               &lt;enumeration value="0808"/&gt;
     *               &lt;enumeration value="0601"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SykehusnavnHFSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SykehusnavnKRGSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Avdelingskode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Avdelingsnavn"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="14"/&gt;
     *               &lt;enumeration value="01"/&gt;
     *               &lt;enumeration value="47"/&gt;
     *               &lt;enumeration value="20"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="2"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AvdelingsnavnHFSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="AvdelingsnavnKRGSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "fodselsnummerKRG",
        "fodselsnummerHF",
        "fodselnummerUtland",
        "fodselsnummerUtlandSpesifiser",
        "navnPasient",
        "sykehuskode",
        "sykehusnavnHF",
        "sykehusnavnHFSpesifiser",
        "sykehusnavnKRGSpesifiser",
        "avdelingskode",
        "avdelingsnavn",
        "avdelingsnavnHFSpesifiser",
        "avdelingsnavnKRGSpesifiser"
    })
    public static class PasientInstitusjon {

        @XmlElement(name = "FodselsnummerKRG", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
        protected String fodselsnummerKRG;
        @XmlElement(name = "FodselsnummerHF", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
        protected String fodselsnummerHF;
        @XmlElement(name = "FodselnummerUtland", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0")
        protected boolean fodselnummerUtland;
        @XmlElement(name = "FodselsnummerUtlandSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
        protected String fodselsnummerUtlandSpesifiser;
        @XmlElement(name = "NavnPasient", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
        protected String navnPasient;
        @XmlElement(name = "Sykehuskode", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String sykehuskode;
        @XmlElement(name = "SykehusnavnHF", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String sykehusnavnHF;
        @XmlElement(name = "SykehusnavnHFSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String sykehusnavnHFSpesifiser;
        @XmlElement(name = "SykehusnavnKRGSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String sykehusnavnKRGSpesifiser;
        @XmlElement(name = "Avdelingskode", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String avdelingskode;
        @XmlElement(name = "Avdelingsnavn", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String avdelingsnavn;
        @XmlElement(name = "AvdelingsnavnHFSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String avdelingsnavnHFSpesifiser;
        @XmlElement(name = "AvdelingsnavnKRGSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String avdelingsnavnKRGSpesifiser;

        /**
         * Gets the value of the fodselsnummerKRG property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFodselsnummerKRG() {
            return fodselsnummerKRG;
        }

        /**
         * Sets the value of the fodselsnummerKRG property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFodselsnummerKRG(String value) {
            this.fodselsnummerKRG = value;
        }

        /**
         * Gets the value of the fodselsnummerHF property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFodselsnummerHF() {
            return fodselsnummerHF;
        }

        /**
         * Sets the value of the fodselsnummerHF property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFodselsnummerHF(String value) {
            this.fodselsnummerHF = value;
        }

        /**
         * Gets the value of the fodselnummerUtland property.
         * 
         */
        public boolean isFodselnummerUtland() {
            return fodselnummerUtland;
        }

        /**
         * Sets the value of the fodselnummerUtland property.
         * 
         */
        public void setFodselnummerUtland(boolean value) {
            this.fodselnummerUtland = value;
        }

        /**
         * Gets the value of the fodselsnummerUtlandSpesifiser property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFodselsnummerUtlandSpesifiser() {
            return fodselsnummerUtlandSpesifiser;
        }

        /**
         * Sets the value of the fodselsnummerUtlandSpesifiser property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFodselsnummerUtlandSpesifiser(String value) {
            this.fodselsnummerUtlandSpesifiser = value;
        }

        /**
         * Gets the value of the navnPasient property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNavnPasient() {
            return navnPasient;
        }

        /**
         * Sets the value of the navnPasient property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNavnPasient(String value) {
            this.navnPasient = value;
        }

        /**
         * Gets the value of the sykehuskode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSykehuskode() {
            return sykehuskode;
        }

        /**
         * Sets the value of the sykehuskode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSykehuskode(String value) {
            this.sykehuskode = value;
        }

        /**
         * Gets the value of the sykehusnavnHF property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSykehusnavnHF() {
            return sykehusnavnHF;
        }

        /**
         * Sets the value of the sykehusnavnHF property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSykehusnavnHF(String value) {
            this.sykehusnavnHF = value;
        }

        /**
         * Gets the value of the sykehusnavnHFSpesifiser property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSykehusnavnHFSpesifiser() {
            return sykehusnavnHFSpesifiser;
        }

        /**
         * Sets the value of the sykehusnavnHFSpesifiser property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSykehusnavnHFSpesifiser(String value) {
            this.sykehusnavnHFSpesifiser = value;
        }

        /**
         * Gets the value of the sykehusnavnKRGSpesifiser property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSykehusnavnKRGSpesifiser() {
            return sykehusnavnKRGSpesifiser;
        }

        /**
         * Sets the value of the sykehusnavnKRGSpesifiser property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSykehusnavnKRGSpesifiser(String value) {
            this.sykehusnavnKRGSpesifiser = value;
        }

        /**
         * Gets the value of the avdelingskode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvdelingskode() {
            return avdelingskode;
        }

        /**
         * Sets the value of the avdelingskode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvdelingskode(String value) {
            this.avdelingskode = value;
        }

        /**
         * Gets the value of the avdelingsnavn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvdelingsnavn() {
            return avdelingsnavn;
        }

        /**
         * Sets the value of the avdelingsnavn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvdelingsnavn(String value) {
            this.avdelingsnavn = value;
        }

        /**
         * Gets the value of the avdelingsnavnHFSpesifiser property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvdelingsnavnHFSpesifiser() {
            return avdelingsnavnHFSpesifiser;
        }

        /**
         * Sets the value of the avdelingsnavnHFSpesifiser property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvdelingsnavnHFSpesifiser(String value) {
            this.avdelingsnavnHFSpesifiser = value;
        }

        /**
         * Gets the value of the avdelingsnavnKRGSpesifiser property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvdelingsnavnKRGSpesifiser() {
            return avdelingsnavnKRGSpesifiser;
        }

        /**
         * Sets the value of the avdelingsnavnKRGSpesifiser property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvdelingsnavnKRGSpesifiser(String value) {
            this.avdelingsnavnKRGSpesifiser = value;
        }

    }

}
