
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
 *         &lt;element name="PasientInstitusjon"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FodselsnummerKRG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                   &lt;element name="SykehusnavnRHF"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="2"/&gt;
 *                         &lt;enumeration value="3"/&gt;
 *                         &lt;enumeration value="4"/&gt;
 *                         &lt;enumeration value="5"/&gt;
 *                         &lt;enumeration value="6"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SykehusnavnHFSorOst"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="0101"/&gt;
 *                         &lt;enumeration value="0103"/&gt;
 *                         &lt;enumeration value="0104"/&gt;
 *                         &lt;enumeration value="0105"/&gt;
 *                         &lt;enumeration value="0202"/&gt;
 *                         &lt;enumeration value="0208"/&gt;
 *                         &lt;enumeration value="0301"/&gt;
 *                         &lt;enumeration value="0304"/&gt;
 *                         &lt;enumeration value="0305"/&gt;
 *                         &lt;enumeration value="0306"/&gt;
 *                         &lt;enumeration value="0316"/&gt;
 *                         &lt;enumeration value="0320"/&gt;
 *                         &lt;enumeration value="0402"/&gt;
 *                         &lt;enumeration value="0403"/&gt;
 *                         &lt;enumeration value="0404"/&gt;
 *                         &lt;enumeration value="0405"/&gt;
 *                         &lt;enumeration value="0501"/&gt;
 *                         &lt;enumeration value="0502"/&gt;
 *                         &lt;enumeration value="0601"/&gt;
 *                         &lt;enumeration value="0602"/&gt;
 *                         &lt;enumeration value="0605"/&gt;
 *                         &lt;enumeration value="0703"/&gt;
 *                         &lt;enumeration value="0705"/&gt;
 *                         &lt;enumeration value="0707"/&gt;
 *                         &lt;enumeration value="0804"/&gt;
 *                         &lt;enumeration value="0805"/&gt;
 *                         &lt;enumeration value="0806"/&gt;
 *                         &lt;enumeration value="0807"/&gt;
 *                         &lt;enumeration value="0808"/&gt;
 *                         &lt;enumeration value="0904"/&gt;
 *                         &lt;enumeration value="1003"/&gt;
 *                         &lt;enumeration value="1005"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SykehusnavnHFVest"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="1101"/&gt;
 *                         &lt;enumeration value="1107"/&gt;
 *                         &lt;enumeration value="1201"/&gt;
 *                         &lt;enumeration value="1202"/&gt;
 *                         &lt;enumeration value="1302"/&gt;
 *                         &lt;enumeration value="1203"/&gt;
 *                         &lt;enumeration value="1305"/&gt;
 *                         &lt;enumeration value="1401"/&gt;
 *                         &lt;enumeration value="1403"/&gt;
 *                         &lt;enumeration value="1405"/&gt;
 *                         &lt;enumeration value="1406"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SykehusnavnHFMidt"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="1501"/&gt;
 *                         &lt;enumeration value="1502"/&gt;
 *                         &lt;enumeration value="1503"/&gt;
 *                         &lt;enumeration value="1504"/&gt;
 *                         &lt;enumeration value="1602"/&gt;
 *                         &lt;enumeration value="1608"/&gt;
 *                         &lt;enumeration value="1701"/&gt;
 *                         &lt;enumeration value="1702"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SykehusnavnHFNord"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="1801"/&gt;
 *                         &lt;enumeration value="1804"/&gt;
 *                         &lt;enumeration value="1805"/&gt;
 *                         &lt;enumeration value="1806"/&gt;
 *                         &lt;enumeration value="1807"/&gt;
 *                         &lt;enumeration value="1809"/&gt;
 *                         &lt;enumeration value="1811"/&gt;
 *                         &lt;enumeration value="1902"/&gt;
 *                         &lt;enumeration value="1903"/&gt;
 *                         &lt;enumeration value="2001"/&gt;
 *                         &lt;enumeration value="2002"/&gt;
 *                         &lt;enumeration value="2101"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SykehusnavnSpesSenter"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="0317"/&gt;
 *                         &lt;enumeration value="6013"/&gt;
 *                         &lt;enumeration value="6024"/&gt;
 *                         &lt;enumeration value="6072"/&gt;
 *                         &lt;enumeration value="6023"/&gt;
 *                         &lt;enumeration value="6043"/&gt;
 *                         &lt;enumeration value="0801"/&gt;
 *                         &lt;enumeration value="6068"/&gt;
 *                         &lt;enumeration value="6038"/&gt;
 *                         &lt;enumeration value="6046"/&gt;
 *                         &lt;enumeration value="6021"/&gt;
 *                         &lt;enumeration value="0608"/&gt;
 *                         &lt;enumeration value="6026"/&gt;
 *                         &lt;enumeration value="0214"/&gt;
 *                         &lt;enumeration value="6053"/&gt;
 *                         &lt;enumeration value="1102"/&gt;
 *                         &lt;enumeration value="6044"/&gt;
 *                         &lt;enumeration value="6002"/&gt;
 *                         &lt;enumeration value="6030"/&gt;
 *                         &lt;enumeration value="1197"/&gt;
 *                         &lt;enumeration value="1301"/&gt;
 *                         &lt;enumeration value="6003"/&gt;
 *                         &lt;enumeration value="6004"/&gt;
 *                         &lt;enumeration value="6069"/&gt;
 *                         &lt;enumeration value="6042"/&gt;
 *                         &lt;enumeration value="6028"/&gt;
 *                         &lt;enumeration value="6031"/&gt;
 *                         &lt;enumeration value="6066"/&gt;
 *                         &lt;enumeration value="6049"/&gt;
 *                         &lt;enumeration value="6007"/&gt;
 *                         &lt;enumeration value="6008"/&gt;
 *                         &lt;enumeration value="6054"/&gt;
 *                         &lt;enumeration value="4710"/&gt;
 *                         &lt;enumeration value="0708"/&gt;
 *                         &lt;enumeration value="0329"/&gt;
 *                         &lt;enumeration value="4709"/&gt;
 *                         &lt;enumeration value="6025"/&gt;
 *                         &lt;enumeration value="6071"/&gt;
 *                         &lt;enumeration value="6056"/&gt;
 *                         &lt;enumeration value="6022"/&gt;
 *                         &lt;enumeration value="6011"/&gt;
 *                         &lt;enumeration value="1198"/&gt;
 *                         &lt;enumeration value="6067"/&gt;
 *                         &lt;enumeration value="6036"/&gt;
 *                         &lt;enumeration value="6010"/&gt;
 *                         &lt;enumeration value="6009"/&gt;
 *                         &lt;enumeration value="6041"/&gt;
 *                         &lt;enumeration value="6032"/&gt;
 *                         &lt;enumeration value="6052"/&gt;
 *                         &lt;enumeration value="6055"/&gt;
 *                         &lt;enumeration value="6015"/&gt;
 *                         &lt;enumeration value="6051"/&gt;
 *                         &lt;enumeration value="6001"/&gt;
 *                         &lt;enumeration value="6014"/&gt;
 *                         &lt;enumeration value="0111"/&gt;
 *                         &lt;enumeration value="0412"/&gt;
 *                         &lt;enumeration value="0327"/&gt;
 *                         &lt;enumeration value="1311"/&gt;
 *                         &lt;enumeration value="6029"/&gt;
 *                         &lt;enumeration value="6073"/&gt;
 *                         &lt;enumeration value="6074"/&gt;
 *                         &lt;enumeration value="6075"/&gt;
 *                         &lt;enumeration value="6076"/&gt;
 *                         &lt;enumeration value="6077"/&gt;
 *                         &lt;enumeration value="6078"/&gt;
 *                         &lt;enumeration value="6079"/&gt;
 *                         &lt;enumeration value="6080"/&gt;
 *                         &lt;enumeration value="6081"/&gt;
 *                         &lt;enumeration value="6082"/&gt;
 *                         &lt;enumeration value="6083"/&gt;
 *                         &lt;enumeration value="6084"/&gt;
 *                         &lt;enumeration value="6085"/&gt;
 *                         &lt;enumeration value="6086"/&gt;
 *                         &lt;enumeration value="6087"/&gt;
 *                         &lt;enumeration value="6088"/&gt;
 *                         &lt;enumeration value="6089"/&gt;
 *                         &lt;enumeration value="6090"/&gt;
 *                         &lt;enumeration value="6091"/&gt;
 *                         &lt;enumeration value="6092"/&gt;
 *                         &lt;enumeration value="6093"/&gt;
 *                         &lt;enumeration value="6094"/&gt;
 *                         &lt;enumeration value="6095"/&gt;
 *                         &lt;enumeration value="6096"/&gt;
 *                         &lt;enumeration value="6097"/&gt;
 *                         &lt;enumeration value="6098"/&gt;
 *                         &lt;enumeration value="6099"/&gt;
 *                         &lt;enumeration value="6100"/&gt;
 *                         &lt;enumeration value="6101"/&gt;
 *                         &lt;enumeration value="6102"/&gt;
 *                         &lt;enumeration value="6103"/&gt;
 *                         &lt;enumeration value="6104"/&gt;
 *                         &lt;enumeration value="6105"/&gt;
 *                         &lt;enumeration value="6106"/&gt;
 *                         &lt;enumeration value="6107"/&gt;
 *                         &lt;enumeration value="6108"/&gt;
 *                         &lt;enumeration value="6109"/&gt;
 *                         &lt;enumeration value="6110"/&gt;
 *                         &lt;enumeration value="6111"/&gt;
 *                         &lt;enumeration value="6112"/&gt;
 *                         &lt;enumeration value="6113"/&gt;
 *                         &lt;enumeration value="6114"/&gt;
 *                         &lt;enumeration value="6115"/&gt;
 *                         &lt;enumeration value="6116"/&gt;
 *                         &lt;enumeration value="6117"/&gt;
 *                         &lt;enumeration value="6118"/&gt;
 *                         &lt;enumeration value="6119"/&gt;
 *                         &lt;enumeration value="6120"/&gt;
 *                         &lt;enumeration value="6033"/&gt;
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
 *         &lt;element name="Oppfolging"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OppfolgingBehandling"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="VidereTiltakUtredning"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value=""/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                   &lt;enumeration value="3"/&gt;
 *                                   &lt;enumeration value="4"/&gt;
 *                                   &lt;enumeration value="5"/&gt;
 *                                   &lt;enumeration value="6"/&gt;
 *                                   &lt;enumeration value="7"/&gt;
 *                                   &lt;enumeration value="8"/&gt;
 *                                   &lt;enumeration value="9"/&gt;
 *                                   &lt;enumeration value="99"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="VidereTiltakUtredningSpesifiser"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value=""/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                   &lt;enumeration value="3"/&gt;
 *                                   &lt;enumeration value="4"/&gt;
 *                                   &lt;enumeration value="5"/&gt;
 *                                   &lt;enumeration value="99"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="VidereTiltakUtredningSpesifiser2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="VidereTiltakUtredningDato"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}date"&gt;
 *                                   &lt;simpleType&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                       &lt;pattern value=""/&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/simpleType&gt;
 *                                 &lt;/union&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
    "oppfolging",
    "kommentarfelt",
    "filmBilde",
    "melder"
})
@XmlRootElement(name = "StdInfo", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
public class StdInfo {

    @XmlElement(name = "PasientInstitusjon", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
    protected StdInfo.PasientInstitusjon pasientInstitusjon;
    @XmlElement(name = "Oppfolging", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
    protected StdInfo.Oppfolging oppfolging;
    @XmlElement(name = "Kommentarfelt", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
    protected StdInfo.Kommentarfelt kommentarfelt;
    @XmlElement(name = "FilmBilde", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
    protected StdInfo.FilmBilde filmBilde;
    @XmlElement(name = "Melder", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
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
     * Gets the value of the oppfolging property.
     * 
     * @return
     *     possible object is
     *     {@link StdInfo.Oppfolging }
     *     
     */
    public StdInfo.Oppfolging getOppfolging() {
        return oppfolging;
    }

    /**
     * Sets the value of the oppfolging property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdInfo.Oppfolging }
     *     
     */
    public void setOppfolging(StdInfo.Oppfolging value) {
        this.oppfolging = value;
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

        @XmlElement(name = "FilmNr", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String filmNr;
        @XmlElement(name = "BildeNr", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
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

        @XmlElement(name = "Kommentar", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
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

        @XmlElement(name = "MeldersNavn", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String meldersNavn;
        @XmlElement(name = "MeldeDato", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
        protected String meldeDato;
        @XmlElement(name = "MelderID", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
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
     *         &lt;element name="OppfolgingBehandling"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="VidereTiltakUtredning"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value=""/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="2"/&gt;
     *                         &lt;enumeration value="3"/&gt;
     *                         &lt;enumeration value="4"/&gt;
     *                         &lt;enumeration value="5"/&gt;
     *                         &lt;enumeration value="6"/&gt;
     *                         &lt;enumeration value="7"/&gt;
     *                         &lt;enumeration value="8"/&gt;
     *                         &lt;enumeration value="9"/&gt;
     *                         &lt;enumeration value="99"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="VidereTiltakUtredningSpesifiser"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value=""/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="2"/&gt;
     *                         &lt;enumeration value="3"/&gt;
     *                         &lt;enumeration value="4"/&gt;
     *                         &lt;enumeration value="5"/&gt;
     *                         &lt;enumeration value="99"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="VidereTiltakUtredningSpesifiser2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="VidereTiltakUtredningDato"&gt;
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
        "oppfolgingBehandling"
    })
    public static class Oppfolging {

        @XmlElement(name = "OppfolgingBehandling", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
        protected StdInfo.Oppfolging.OppfolgingBehandling oppfolgingBehandling;

        /**
         * Gets the value of the oppfolgingBehandling property.
         * 
         * @return
         *     possible object is
         *     {@link StdInfo.Oppfolging.OppfolgingBehandling }
         *     
         */
        public StdInfo.Oppfolging.OppfolgingBehandling getOppfolgingBehandling() {
            return oppfolgingBehandling;
        }

        /**
         * Sets the value of the oppfolgingBehandling property.
         * 
         * @param value
         *     allowed object is
         *     {@link StdInfo.Oppfolging.OppfolgingBehandling }
         *     
         */
        public void setOppfolgingBehandling(StdInfo.Oppfolging.OppfolgingBehandling value) {
            this.oppfolgingBehandling = value;
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
         *         &lt;element name="VidereTiltakUtredning"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="2"/&gt;
         *               &lt;enumeration value="3"/&gt;
         *               &lt;enumeration value="4"/&gt;
         *               &lt;enumeration value="5"/&gt;
         *               &lt;enumeration value="6"/&gt;
         *               &lt;enumeration value="7"/&gt;
         *               &lt;enumeration value="8"/&gt;
         *               &lt;enumeration value="9"/&gt;
         *               &lt;enumeration value="99"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="VidereTiltakUtredningSpesifiser"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="2"/&gt;
         *               &lt;enumeration value="3"/&gt;
         *               &lt;enumeration value="4"/&gt;
         *               &lt;enumeration value="5"/&gt;
         *               &lt;enumeration value="99"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="VidereTiltakUtredningSpesifiser2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="VidereTiltakUtredningDato"&gt;
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
            "videreTiltakUtredning",
            "videreTiltakUtredningSpesifiser",
            "videreTiltakUtredningSpesifiser2",
            "videreTiltakUtredningDato"
        })
        public static class OppfolgingBehandling {

            @XmlElement(name = "VidereTiltakUtredning", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
            protected String videreTiltakUtredning;
            @XmlElement(name = "VidereTiltakUtredningSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
            protected String videreTiltakUtredningSpesifiser;
            @XmlElement(name = "VidereTiltakUtredningSpesifiser2", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
            protected String videreTiltakUtredningSpesifiser2;
            @XmlElement(name = "VidereTiltakUtredningDato", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
            protected String videreTiltakUtredningDato;

            /**
             * Gets the value of the videreTiltakUtredning property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVidereTiltakUtredning() {
                return videreTiltakUtredning;
            }

            /**
             * Sets the value of the videreTiltakUtredning property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVidereTiltakUtredning(String value) {
                this.videreTiltakUtredning = value;
            }

            /**
             * Gets the value of the videreTiltakUtredningSpesifiser property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVidereTiltakUtredningSpesifiser() {
                return videreTiltakUtredningSpesifiser;
            }

            /**
             * Sets the value of the videreTiltakUtredningSpesifiser property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVidereTiltakUtredningSpesifiser(String value) {
                this.videreTiltakUtredningSpesifiser = value;
            }

            /**
             * Gets the value of the videreTiltakUtredningSpesifiser2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVidereTiltakUtredningSpesifiser2() {
                return videreTiltakUtredningSpesifiser2;
            }

            /**
             * Sets the value of the videreTiltakUtredningSpesifiser2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVidereTiltakUtredningSpesifiser2(String value) {
                this.videreTiltakUtredningSpesifiser2 = value;
            }

            /**
             * Gets the value of the videreTiltakUtredningDato property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVidereTiltakUtredningDato() {
                return videreTiltakUtredningDato;
            }

            /**
             * Sets the value of the videreTiltakUtredningDato property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVidereTiltakUtredningDato(String value) {
                this.videreTiltakUtredningDato = value;
            }

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
     *         &lt;element name="FodselsnummerKRG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
     *         &lt;element name="SykehusnavnRHF"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="2"/&gt;
     *               &lt;enumeration value="3"/&gt;
     *               &lt;enumeration value="4"/&gt;
     *               &lt;enumeration value="5"/&gt;
     *               &lt;enumeration value="6"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SykehusnavnHFSorOst"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="0101"/&gt;
     *               &lt;enumeration value="0103"/&gt;
     *               &lt;enumeration value="0104"/&gt;
     *               &lt;enumeration value="0105"/&gt;
     *               &lt;enumeration value="0202"/&gt;
     *               &lt;enumeration value="0208"/&gt;
     *               &lt;enumeration value="0301"/&gt;
     *               &lt;enumeration value="0304"/&gt;
     *               &lt;enumeration value="0305"/&gt;
     *               &lt;enumeration value="0306"/&gt;
     *               &lt;enumeration value="0316"/&gt;
     *               &lt;enumeration value="0320"/&gt;
     *               &lt;enumeration value="0402"/&gt;
     *               &lt;enumeration value="0403"/&gt;
     *               &lt;enumeration value="0404"/&gt;
     *               &lt;enumeration value="0405"/&gt;
     *               &lt;enumeration value="0501"/&gt;
     *               &lt;enumeration value="0502"/&gt;
     *               &lt;enumeration value="0601"/&gt;
     *               &lt;enumeration value="0602"/&gt;
     *               &lt;enumeration value="0605"/&gt;
     *               &lt;enumeration value="0703"/&gt;
     *               &lt;enumeration value="0705"/&gt;
     *               &lt;enumeration value="0707"/&gt;
     *               &lt;enumeration value="0804"/&gt;
     *               &lt;enumeration value="0805"/&gt;
     *               &lt;enumeration value="0806"/&gt;
     *               &lt;enumeration value="0807"/&gt;
     *               &lt;enumeration value="0808"/&gt;
     *               &lt;enumeration value="0904"/&gt;
     *               &lt;enumeration value="1003"/&gt;
     *               &lt;enumeration value="1005"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SykehusnavnHFVest"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="1101"/&gt;
     *               &lt;enumeration value="1107"/&gt;
     *               &lt;enumeration value="1201"/&gt;
     *               &lt;enumeration value="1202"/&gt;
     *               &lt;enumeration value="1302"/&gt;
     *               &lt;enumeration value="1203"/&gt;
     *               &lt;enumeration value="1305"/&gt;
     *               &lt;enumeration value="1401"/&gt;
     *               &lt;enumeration value="1403"/&gt;
     *               &lt;enumeration value="1405"/&gt;
     *               &lt;enumeration value="1406"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SykehusnavnHFMidt"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="1501"/&gt;
     *               &lt;enumeration value="1502"/&gt;
     *               &lt;enumeration value="1503"/&gt;
     *               &lt;enumeration value="1504"/&gt;
     *               &lt;enumeration value="1602"/&gt;
     *               &lt;enumeration value="1608"/&gt;
     *               &lt;enumeration value="1701"/&gt;
     *               &lt;enumeration value="1702"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SykehusnavnHFNord"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="1801"/&gt;
     *               &lt;enumeration value="1804"/&gt;
     *               &lt;enumeration value="1805"/&gt;
     *               &lt;enumeration value="1806"/&gt;
     *               &lt;enumeration value="1807"/&gt;
     *               &lt;enumeration value="1809"/&gt;
     *               &lt;enumeration value="1811"/&gt;
     *               &lt;enumeration value="1902"/&gt;
     *               &lt;enumeration value="1903"/&gt;
     *               &lt;enumeration value="2001"/&gt;
     *               &lt;enumeration value="2002"/&gt;
     *               &lt;enumeration value="2101"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SykehusnavnSpesSenter"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="0317"/&gt;
     *               &lt;enumeration value="6013"/&gt;
     *               &lt;enumeration value="6024"/&gt;
     *               &lt;enumeration value="6072"/&gt;
     *               &lt;enumeration value="6023"/&gt;
     *               &lt;enumeration value="6043"/&gt;
     *               &lt;enumeration value="0801"/&gt;
     *               &lt;enumeration value="6068"/&gt;
     *               &lt;enumeration value="6038"/&gt;
     *               &lt;enumeration value="6046"/&gt;
     *               &lt;enumeration value="6021"/&gt;
     *               &lt;enumeration value="0608"/&gt;
     *               &lt;enumeration value="6026"/&gt;
     *               &lt;enumeration value="0214"/&gt;
     *               &lt;enumeration value="6053"/&gt;
     *               &lt;enumeration value="1102"/&gt;
     *               &lt;enumeration value="6044"/&gt;
     *               &lt;enumeration value="6002"/&gt;
     *               &lt;enumeration value="6030"/&gt;
     *               &lt;enumeration value="1197"/&gt;
     *               &lt;enumeration value="1301"/&gt;
     *               &lt;enumeration value="6003"/&gt;
     *               &lt;enumeration value="6004"/&gt;
     *               &lt;enumeration value="6069"/&gt;
     *               &lt;enumeration value="6042"/&gt;
     *               &lt;enumeration value="6028"/&gt;
     *               &lt;enumeration value="6031"/&gt;
     *               &lt;enumeration value="6066"/&gt;
     *               &lt;enumeration value="6049"/&gt;
     *               &lt;enumeration value="6007"/&gt;
     *               &lt;enumeration value="6008"/&gt;
     *               &lt;enumeration value="6054"/&gt;
     *               &lt;enumeration value="4710"/&gt;
     *               &lt;enumeration value="0708"/&gt;
     *               &lt;enumeration value="0329"/&gt;
     *               &lt;enumeration value="4709"/&gt;
     *               &lt;enumeration value="6025"/&gt;
     *               &lt;enumeration value="6071"/&gt;
     *               &lt;enumeration value="6056"/&gt;
     *               &lt;enumeration value="6022"/&gt;
     *               &lt;enumeration value="6011"/&gt;
     *               &lt;enumeration value="1198"/&gt;
     *               &lt;enumeration value="6067"/&gt;
     *               &lt;enumeration value="6036"/&gt;
     *               &lt;enumeration value="6010"/&gt;
     *               &lt;enumeration value="6009"/&gt;
     *               &lt;enumeration value="6041"/&gt;
     *               &lt;enumeration value="6032"/&gt;
     *               &lt;enumeration value="6052"/&gt;
     *               &lt;enumeration value="6055"/&gt;
     *               &lt;enumeration value="6015"/&gt;
     *               &lt;enumeration value="6051"/&gt;
     *               &lt;enumeration value="6001"/&gt;
     *               &lt;enumeration value="6014"/&gt;
     *               &lt;enumeration value="0111"/&gt;
     *               &lt;enumeration value="0412"/&gt;
     *               &lt;enumeration value="0327"/&gt;
     *               &lt;enumeration value="1311"/&gt;
     *               &lt;enumeration value="6029"/&gt;
     *               &lt;enumeration value="6073"/&gt;
     *               &lt;enumeration value="6074"/&gt;
     *               &lt;enumeration value="6075"/&gt;
     *               &lt;enumeration value="6076"/&gt;
     *               &lt;enumeration value="6077"/&gt;
     *               &lt;enumeration value="6078"/&gt;
     *               &lt;enumeration value="6079"/&gt;
     *               &lt;enumeration value="6080"/&gt;
     *               &lt;enumeration value="6081"/&gt;
     *               &lt;enumeration value="6082"/&gt;
     *               &lt;enumeration value="6083"/&gt;
     *               &lt;enumeration value="6084"/&gt;
     *               &lt;enumeration value="6085"/&gt;
     *               &lt;enumeration value="6086"/&gt;
     *               &lt;enumeration value="6087"/&gt;
     *               &lt;enumeration value="6088"/&gt;
     *               &lt;enumeration value="6089"/&gt;
     *               &lt;enumeration value="6090"/&gt;
     *               &lt;enumeration value="6091"/&gt;
     *               &lt;enumeration value="6092"/&gt;
     *               &lt;enumeration value="6093"/&gt;
     *               &lt;enumeration value="6094"/&gt;
     *               &lt;enumeration value="6095"/&gt;
     *               &lt;enumeration value="6096"/&gt;
     *               &lt;enumeration value="6097"/&gt;
     *               &lt;enumeration value="6098"/&gt;
     *               &lt;enumeration value="6099"/&gt;
     *               &lt;enumeration value="6100"/&gt;
     *               &lt;enumeration value="6101"/&gt;
     *               &lt;enumeration value="6102"/&gt;
     *               &lt;enumeration value="6103"/&gt;
     *               &lt;enumeration value="6104"/&gt;
     *               &lt;enumeration value="6105"/&gt;
     *               &lt;enumeration value="6106"/&gt;
     *               &lt;enumeration value="6107"/&gt;
     *               &lt;enumeration value="6108"/&gt;
     *               &lt;enumeration value="6109"/&gt;
     *               &lt;enumeration value="6110"/&gt;
     *               &lt;enumeration value="6111"/&gt;
     *               &lt;enumeration value="6112"/&gt;
     *               &lt;enumeration value="6113"/&gt;
     *               &lt;enumeration value="6114"/&gt;
     *               &lt;enumeration value="6115"/&gt;
     *               &lt;enumeration value="6116"/&gt;
     *               &lt;enumeration value="6117"/&gt;
     *               &lt;enumeration value="6118"/&gt;
     *               &lt;enumeration value="6119"/&gt;
     *               &lt;enumeration value="6120"/&gt;
     *               &lt;enumeration value="6033"/&gt;
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
        "sykehusnavnRHF",
        "sykehusnavnHFSorOst",
        "sykehusnavnHFVest",
        "sykehusnavnHFMidt",
        "sykehusnavnHFNord",
        "sykehusnavnSpesSenter",
        "sykehusnavnHFSpesifiser",
        "sykehusnavnKRGSpesifiser",
        "avdelingskode",
        "avdelingsnavn",
        "avdelingsnavnHFSpesifiser",
        "avdelingsnavnKRGSpesifiser"
    })
    public static class PasientInstitusjon {

        @XmlElement(name = "FodselsnummerKRG", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String fodselsnummerKRG;
        @XmlElement(name = "FodselsnummerHF", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String fodselsnummerHF;
        @XmlElement(name = "FodselnummerUtland", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
        protected boolean fodselnummerUtland;
        @XmlElement(name = "FodselsnummerUtlandSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
        protected String fodselsnummerUtlandSpesifiser;
        @XmlElement(name = "NavnPasient", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String navnPasient;
        @XmlElement(name = "Sykehuskode", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String sykehuskode;
        @XmlElement(name = "SykehusnavnRHF", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String sykehusnavnRHF;
        @XmlElement(name = "SykehusnavnHFSorOst", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String sykehusnavnHFSorOst;
        @XmlElement(name = "SykehusnavnHFVest", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String sykehusnavnHFVest;
        @XmlElement(name = "SykehusnavnHFMidt", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String sykehusnavnHFMidt;
        @XmlElement(name = "SykehusnavnHFNord", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String sykehusnavnHFNord;
        @XmlElement(name = "SykehusnavnSpesSenter", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String sykehusnavnSpesSenter;
        @XmlElement(name = "SykehusnavnHFSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String sykehusnavnHFSpesifiser;
        @XmlElement(name = "SykehusnavnKRGSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String sykehusnavnKRGSpesifiser;
        @XmlElement(name = "Avdelingskode", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String avdelingskode;
        @XmlElement(name = "Avdelingsnavn", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String avdelingsnavn;
        @XmlElement(name = "AvdelingsnavnHFSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String avdelingsnavnHFSpesifiser;
        @XmlElement(name = "AvdelingsnavnKRGSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
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
         * Gets the value of the sykehusnavnRHF property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSykehusnavnRHF() {
            return sykehusnavnRHF;
        }

        /**
         * Sets the value of the sykehusnavnRHF property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSykehusnavnRHF(String value) {
            this.sykehusnavnRHF = value;
        }

        /**
         * Gets the value of the sykehusnavnHFSorOst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSykehusnavnHFSorOst() {
            return sykehusnavnHFSorOst;
        }

        /**
         * Sets the value of the sykehusnavnHFSorOst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSykehusnavnHFSorOst(String value) {
            this.sykehusnavnHFSorOst = value;
        }

        /**
         * Gets the value of the sykehusnavnHFVest property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSykehusnavnHFVest() {
            return sykehusnavnHFVest;
        }

        /**
         * Sets the value of the sykehusnavnHFVest property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSykehusnavnHFVest(String value) {
            this.sykehusnavnHFVest = value;
        }

        /**
         * Gets the value of the sykehusnavnHFMidt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSykehusnavnHFMidt() {
            return sykehusnavnHFMidt;
        }

        /**
         * Sets the value of the sykehusnavnHFMidt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSykehusnavnHFMidt(String value) {
            this.sykehusnavnHFMidt = value;
        }

        /**
         * Gets the value of the sykehusnavnHFNord property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSykehusnavnHFNord() {
            return sykehusnavnHFNord;
        }

        /**
         * Sets the value of the sykehusnavnHFNord property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSykehusnavnHFNord(String value) {
            this.sykehusnavnHFNord = value;
        }

        /**
         * Gets the value of the sykehusnavnSpesSenter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSykehusnavnSpesSenter() {
            return sykehusnavnSpesSenter;
        }

        /**
         * Sets the value of the sykehusnavnSpesSenter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSykehusnavnSpesSenter(String value) {
            this.sykehusnavnSpesSenter = value;
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
