
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
 *         &lt;element name="PrimaerEllerPostop"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value=""/&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PreStraaleInformasjon"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AktivMonitorering"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RevurderingSykdomsutrbredelse"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PreStraalePSAVerdi"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="([1-9]\d{0,5}|\d,\d{1,2}|[1-9]\d{1,5},\d{1,2})?"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PreStraalePSAVerdiUkjent"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="99"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EndokrinBehandling"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                         &lt;enumeration value="99"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DatoOppstartEndokrinBeh"&gt;
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
 *                   &lt;element name="DatoOppstartEndokrinBehUkjent"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="99"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VarighetEndokrinBehandling"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="([1-9]\d{0,2})?"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VarighetEndokrinBehUkjent"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="99"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Sykdomsutbredelse"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Tumor"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PalpatoriskTumorHoyre"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value=""/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                   &lt;enumeration value="3"/&gt;
 *                                   &lt;enumeration value="4"/&gt;
 *                                   &lt;enumeration value="5"/&gt;
 *                                   &lt;enumeration value="6"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PalpatoriskTumorVenstre"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value=""/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                   &lt;enumeration value="3"/&gt;
 *                                   &lt;enumeration value="4"/&gt;
 *                                   &lt;enumeration value="5"/&gt;
 *                                   &lt;enumeration value="6"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SamletPalpatoriskTumor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="MRDiagnostikk"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value=""/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="DatoMRDiagnostikk"&gt;
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
 *                             &lt;element name="DatoMRDiagnostikkUkjent"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value=""/&gt;
 *                                   &lt;enumeration value="99"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PIRADSHoyre"&gt;
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
 *                             &lt;element name="PIRADSVenstre"&gt;
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
 *                             &lt;element name="MRBasertKliniskTHoyre"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value=""/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                   &lt;enumeration value="3"/&gt;
 *                                   &lt;enumeration value="4"/&gt;
 *                                   &lt;enumeration value="5"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="MRBasertKliniskTVenstre"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value=""/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                   &lt;enumeration value="3"/&gt;
 *                                   &lt;enumeration value="4"/&gt;
 *                                   &lt;enumeration value="5"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SamletMRBasertKliniskT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TotalVurderingKliniskT"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value=""/&gt;
 *                                   &lt;enumeration value="X"/&gt;
 *                                   &lt;enumeration value="0"/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="1a"/&gt;
 *                                   &lt;enumeration value="1b"/&gt;
 *                                   &lt;enumeration value="1c"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                   &lt;enumeration value="2a"/&gt;
 *                                   &lt;enumeration value="2b"/&gt;
 *                                   &lt;enumeration value="2c"/&gt;
 *                                   &lt;enumeration value="3"/&gt;
 *                                   &lt;enumeration value="3a"/&gt;
 *                                   &lt;enumeration value="3b"/&gt;
 *                                   &lt;enumeration value="4"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="KliniskVurdertAv"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value=""/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                   &lt;enumeration value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RegionaleLK"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="RegionaleLKPaavist"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value=""/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="0"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Fjernmetastaser"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FjernmetPaavist"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value=""/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="0"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="LokalisasjonFjernmet"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="FjerneLKmet"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                             &lt;pattern value="true|false"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Skjelettmet"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                             &lt;pattern value="true|false"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="AnnetFjernmet"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                             &lt;pattern value="true|false"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="AnnetFjernmetSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="UtredningsmetodeMetastaser"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="UtredningsmetodeLK"&gt;
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
 *                             &lt;element name="AnnenDiagnostikkLKSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="UtredningsmetodeFjernmet"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="SkjelettscintigrafiMet"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                             &lt;pattern value="true|false"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="RtgThoraxMet"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                             &lt;pattern value="true|false"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="RtgBekkenMet"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                             &lt;pattern value="true|false"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="CTMet"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                             &lt;pattern value="true|false"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="MRMet"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                             &lt;pattern value="true|false"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="PETMet"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                             &lt;pattern value="true|false"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="CytologiMet"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                             &lt;pattern value="true|false"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="BiopsiMet"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                             &lt;pattern value="true|false"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="AnnenDiagnostikkMet"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                             &lt;pattern value="true|false"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="AnnenDiagnostikkMetSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="UtredningsmetodeFjernmetUkjent"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value=""/&gt;
 *                                             &lt;enumeration value="99"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
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
 *         &lt;element name="Straalebehandling"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EksternStraalebehandling"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DatoOppstartStraale"&gt;
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
 *                   &lt;sequence&gt;
 *                     &lt;element name="Prostata"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="ProstataFRDoseGY"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                     &lt;pattern value="([1-9]\d{0,1}|\d{0,2},\d{1,2})?"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="ProstataFRDoseUkjent"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                     &lt;enumeration value=""/&gt;
 *                                     &lt;enumeration value="99"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="ProstataAntFR"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                     &lt;pattern value="([1-9]\d{0,1})?"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="ProstataAntFRUkjent"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                     &lt;enumeration value=""/&gt;
 *                                     &lt;enumeration value="99"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="LKbekken"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="LKBekkenStraalebehandling"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                     &lt;enumeration value=""/&gt;
 *                                     &lt;enumeration value="1"/&gt;
 *                                     &lt;enumeration value="0"/&gt;
 *                                     &lt;enumeration value="99"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="HoydoserateBrachyterapi"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="HDBrachyterapi"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                     &lt;enumeration value=""/&gt;
 *                                     &lt;enumeration value="1"/&gt;
 *                                     &lt;enumeration value="0"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="HDBrachyterapiFRDoseGY"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                     &lt;pattern value="([1-9]\d{0,1}|\d{0,2},\d{1,2})?"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="HDBrachyterapiFRDoseUkjent"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                     &lt;enumeration value=""/&gt;
 *                                     &lt;enumeration value="99"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="HDBrachyterapiAntFR"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                     &lt;pattern value="([1-9])?"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="HDBrachyterapiAntFRUkjent"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                     &lt;enumeration value=""/&gt;
 *                                     &lt;enumeration value="99"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="LavdoserateBrachyterapi"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="LDBrachyterapi"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                     &lt;enumeration value=""/&gt;
 *                                     &lt;enumeration value="1"/&gt;
 *                                     &lt;enumeration value="0"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="Behandlingssted" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                               &lt;element name="BehandlingsstedUkjent"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                     &lt;enumeration value=""/&gt;
 *                                     &lt;enumeration value="99"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="LDBrachyterapiFRDoseGY"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                     &lt;pattern value="([1-9]\d{0,2}|\d{0,3},\d{1,2})?"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="LDBrachyterapiFRDoseUkjent"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                     &lt;enumeration value=""/&gt;
 *                                     &lt;enumeration value="99"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
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
    "primaerEllerPostop",
    "preStraaleInformasjon",
    "sykdomsutbredelse",
    "straalebehandling"
})
@XmlRootElement(name = "Behandling", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0")
public class Behandling {

    @XmlElement(name = "PrimaerEllerPostop", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
    protected String primaerEllerPostop;
    @XmlElement(name = "PreStraaleInformasjon", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
    protected Behandling.PreStraaleInformasjon preStraaleInformasjon;
    @XmlElement(name = "Sykdomsutbredelse", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
    protected Behandling.Sykdomsutbredelse sykdomsutbredelse;
    @XmlElement(name = "Straalebehandling", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
    protected Behandling.Straalebehandling straalebehandling;

    /**
     * Gets the value of the primaerEllerPostop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaerEllerPostop() {
        return primaerEllerPostop;
    }

    /**
     * Sets the value of the primaerEllerPostop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaerEllerPostop(String value) {
        this.primaerEllerPostop = value;
    }

    /**
     * Gets the value of the preStraaleInformasjon property.
     * 
     * @return
     *     possible object is
     *     {@link Behandling.PreStraaleInformasjon }
     *     
     */
    public Behandling.PreStraaleInformasjon getPreStraaleInformasjon() {
        return preStraaleInformasjon;
    }

    /**
     * Sets the value of the preStraaleInformasjon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Behandling.PreStraaleInformasjon }
     *     
     */
    public void setPreStraaleInformasjon(Behandling.PreStraaleInformasjon value) {
        this.preStraaleInformasjon = value;
    }

    /**
     * Gets the value of the sykdomsutbredelse property.
     * 
     * @return
     *     possible object is
     *     {@link Behandling.Sykdomsutbredelse }
     *     
     */
    public Behandling.Sykdomsutbredelse getSykdomsutbredelse() {
        return sykdomsutbredelse;
    }

    /**
     * Sets the value of the sykdomsutbredelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Behandling.Sykdomsutbredelse }
     *     
     */
    public void setSykdomsutbredelse(Behandling.Sykdomsutbredelse value) {
        this.sykdomsutbredelse = value;
    }

    /**
     * Gets the value of the straalebehandling property.
     * 
     * @return
     *     possible object is
     *     {@link Behandling.Straalebehandling }
     *     
     */
    public Behandling.Straalebehandling getStraalebehandling() {
        return straalebehandling;
    }

    /**
     * Sets the value of the straalebehandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Behandling.Straalebehandling }
     *     
     */
    public void setStraalebehandling(Behandling.Straalebehandling value) {
        this.straalebehandling = value;
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
     *         &lt;element name="AktivMonitorering"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RevurderingSykdomsutrbredelse"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PreStraalePSAVerdi"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="([1-9]\d{0,5}|\d,\d{1,2}|[1-9]\d{1,5},\d{1,2})?"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PreStraalePSAVerdiUkjent"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="99"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="EndokrinBehandling"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="0"/&gt;
     *               &lt;enumeration value="99"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DatoOppstartEndokrinBeh"&gt;
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
     *         &lt;element name="DatoOppstartEndokrinBehUkjent"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="99"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="VarighetEndokrinBehandling"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="([1-9]\d{0,2})?"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="VarighetEndokrinBehUkjent"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="99"/&gt;
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
        "aktivMonitorering",
        "revurderingSykdomsutrbredelse",
        "preStraalePSAVerdi",
        "preStraalePSAVerdiUkjent",
        "endokrinBehandling",
        "datoOppstartEndokrinBeh",
        "datoOppstartEndokrinBehUkjent",
        "varighetEndokrinBehandling",
        "varighetEndokrinBehUkjent"
    })
    public static class PreStraaleInformasjon {

        @XmlElement(name = "AktivMonitorering", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String aktivMonitorering;
        @XmlElement(name = "RevurderingSykdomsutrbredelse", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String revurderingSykdomsutrbredelse;
        @XmlElement(name = "PreStraalePSAVerdi", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String preStraalePSAVerdi;
        @XmlElement(name = "PreStraalePSAVerdiUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String preStraalePSAVerdiUkjent;
        @XmlElement(name = "EndokrinBehandling", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String endokrinBehandling;
        @XmlElement(name = "DatoOppstartEndokrinBeh", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
        protected String datoOppstartEndokrinBeh;
        @XmlElement(name = "DatoOppstartEndokrinBehUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String datoOppstartEndokrinBehUkjent;
        @XmlElement(name = "VarighetEndokrinBehandling", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String varighetEndokrinBehandling;
        @XmlElement(name = "VarighetEndokrinBehUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String varighetEndokrinBehUkjent;

        /**
         * Gets the value of the aktivMonitorering property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAktivMonitorering() {
            return aktivMonitorering;
        }

        /**
         * Sets the value of the aktivMonitorering property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAktivMonitorering(String value) {
            this.aktivMonitorering = value;
        }

        /**
         * Gets the value of the revurderingSykdomsutrbredelse property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRevurderingSykdomsutrbredelse() {
            return revurderingSykdomsutrbredelse;
        }

        /**
         * Sets the value of the revurderingSykdomsutrbredelse property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRevurderingSykdomsutrbredelse(String value) {
            this.revurderingSykdomsutrbredelse = value;
        }

        /**
         * Gets the value of the preStraalePSAVerdi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreStraalePSAVerdi() {
            return preStraalePSAVerdi;
        }

        /**
         * Sets the value of the preStraalePSAVerdi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreStraalePSAVerdi(String value) {
            this.preStraalePSAVerdi = value;
        }

        /**
         * Gets the value of the preStraalePSAVerdiUkjent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreStraalePSAVerdiUkjent() {
            return preStraalePSAVerdiUkjent;
        }

        /**
         * Sets the value of the preStraalePSAVerdiUkjent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreStraalePSAVerdiUkjent(String value) {
            this.preStraalePSAVerdiUkjent = value;
        }

        /**
         * Gets the value of the endokrinBehandling property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndokrinBehandling() {
            return endokrinBehandling;
        }

        /**
         * Sets the value of the endokrinBehandling property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndokrinBehandling(String value) {
            this.endokrinBehandling = value;
        }

        /**
         * Gets the value of the datoOppstartEndokrinBeh property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatoOppstartEndokrinBeh() {
            return datoOppstartEndokrinBeh;
        }

        /**
         * Sets the value of the datoOppstartEndokrinBeh property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatoOppstartEndokrinBeh(String value) {
            this.datoOppstartEndokrinBeh = value;
        }

        /**
         * Gets the value of the datoOppstartEndokrinBehUkjent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatoOppstartEndokrinBehUkjent() {
            return datoOppstartEndokrinBehUkjent;
        }

        /**
         * Sets the value of the datoOppstartEndokrinBehUkjent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatoOppstartEndokrinBehUkjent(String value) {
            this.datoOppstartEndokrinBehUkjent = value;
        }

        /**
         * Gets the value of the varighetEndokrinBehandling property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVarighetEndokrinBehandling() {
            return varighetEndokrinBehandling;
        }

        /**
         * Sets the value of the varighetEndokrinBehandling property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVarighetEndokrinBehandling(String value) {
            this.varighetEndokrinBehandling = value;
        }

        /**
         * Gets the value of the varighetEndokrinBehUkjent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVarighetEndokrinBehUkjent() {
            return varighetEndokrinBehUkjent;
        }

        /**
         * Sets the value of the varighetEndokrinBehUkjent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVarighetEndokrinBehUkjent(String value) {
            this.varighetEndokrinBehUkjent = value;
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
     *         &lt;element name="EksternStraalebehandling"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DatoOppstartStraale"&gt;
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
     *         &lt;sequence&gt;
     *           &lt;element name="Prostata"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="ProstataFRDoseGY"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                           &lt;pattern value="([1-9]\d{0,1}|\d{0,2},\d{1,2})?"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="ProstataFRDoseUkjent"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                           &lt;enumeration value=""/&gt;
     *                           &lt;enumeration value="99"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="ProstataAntFR"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                           &lt;pattern value="([1-9]\d{0,1})?"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="ProstataAntFRUkjent"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                           &lt;enumeration value=""/&gt;
     *                           &lt;enumeration value="99"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="LKbekken"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="LKBekkenStraalebehandling"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                           &lt;enumeration value=""/&gt;
     *                           &lt;enumeration value="1"/&gt;
     *                           &lt;enumeration value="0"/&gt;
     *                           &lt;enumeration value="99"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="HoydoserateBrachyterapi"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="HDBrachyterapi"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                           &lt;enumeration value=""/&gt;
     *                           &lt;enumeration value="1"/&gt;
     *                           &lt;enumeration value="0"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="HDBrachyterapiFRDoseGY"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                           &lt;pattern value="([1-9]\d{0,1}|\d{0,2},\d{1,2})?"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="HDBrachyterapiFRDoseUkjent"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                           &lt;enumeration value=""/&gt;
     *                           &lt;enumeration value="99"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="HDBrachyterapiAntFR"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                           &lt;pattern value="([1-9])?"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="HDBrachyterapiAntFRUkjent"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                           &lt;enumeration value=""/&gt;
     *                           &lt;enumeration value="99"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="LavdoserateBrachyterapi"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="LDBrachyterapi"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                           &lt;enumeration value=""/&gt;
     *                           &lt;enumeration value="1"/&gt;
     *                           &lt;enumeration value="0"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="Behandlingssted" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                     &lt;element name="BehandlingsstedUkjent"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                           &lt;enumeration value=""/&gt;
     *                           &lt;enumeration value="99"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="LDBrachyterapiFRDoseGY"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                           &lt;pattern value="([1-9]\d{0,2}|\d{0,3},\d{1,2})?"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="LDBrachyterapiFRDoseUkjent"&gt;
     *                       &lt;simpleType&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                           &lt;enumeration value=""/&gt;
     *                           &lt;enumeration value="99"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/simpleType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
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
        "eksternStraalebehandling",
        "datoOppstartStraale",
        "prostata",
        "lKbekken",
        "hoydoserateBrachyterapi",
        "lavdoserateBrachyterapi"
    })
    public static class Straalebehandling {

        @XmlElement(name = "EksternStraalebehandling", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
        protected String eksternStraalebehandling;
        @XmlElement(name = "DatoOppstartStraale", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
        protected String datoOppstartStraale;
        @XmlElement(name = "Prostata", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
        protected Behandling.Straalebehandling.Prostata prostata;
        @XmlElement(name = "LKbekken", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
        protected Behandling.Straalebehandling.LKbekken lKbekken;
        @XmlElement(name = "HoydoserateBrachyterapi", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
        protected Behandling.Straalebehandling.HoydoserateBrachyterapi hoydoserateBrachyterapi;
        @XmlElement(name = "LavdoserateBrachyterapi", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
        protected Behandling.Straalebehandling.LavdoserateBrachyterapi lavdoserateBrachyterapi;

        /**
         * Gets the value of the eksternStraalebehandling property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEksternStraalebehandling() {
            return eksternStraalebehandling;
        }

        /**
         * Sets the value of the eksternStraalebehandling property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEksternStraalebehandling(String value) {
            this.eksternStraalebehandling = value;
        }

        /**
         * Gets the value of the datoOppstartStraale property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatoOppstartStraale() {
            return datoOppstartStraale;
        }

        /**
         * Sets the value of the datoOppstartStraale property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatoOppstartStraale(String value) {
            this.datoOppstartStraale = value;
        }

        /**
         * Gets the value of the prostata property.
         * 
         * @return
         *     possible object is
         *     {@link Behandling.Straalebehandling.Prostata }
         *     
         */
        public Behandling.Straalebehandling.Prostata getProstata() {
            return prostata;
        }

        /**
         * Sets the value of the prostata property.
         * 
         * @param value
         *     allowed object is
         *     {@link Behandling.Straalebehandling.Prostata }
         *     
         */
        public void setProstata(Behandling.Straalebehandling.Prostata value) {
            this.prostata = value;
        }

        /**
         * Gets the value of the lKbekken property.
         * 
         * @return
         *     possible object is
         *     {@link Behandling.Straalebehandling.LKbekken }
         *     
         */
        public Behandling.Straalebehandling.LKbekken getLKbekken() {
            return lKbekken;
        }

        /**
         * Sets the value of the lKbekken property.
         * 
         * @param value
         *     allowed object is
         *     {@link Behandling.Straalebehandling.LKbekken }
         *     
         */
        public void setLKbekken(Behandling.Straalebehandling.LKbekken value) {
            this.lKbekken = value;
        }

        /**
         * Gets the value of the hoydoserateBrachyterapi property.
         * 
         * @return
         *     possible object is
         *     {@link Behandling.Straalebehandling.HoydoserateBrachyterapi }
         *     
         */
        public Behandling.Straalebehandling.HoydoserateBrachyterapi getHoydoserateBrachyterapi() {
            return hoydoserateBrachyterapi;
        }

        /**
         * Sets the value of the hoydoserateBrachyterapi property.
         * 
         * @param value
         *     allowed object is
         *     {@link Behandling.Straalebehandling.HoydoserateBrachyterapi }
         *     
         */
        public void setHoydoserateBrachyterapi(Behandling.Straalebehandling.HoydoserateBrachyterapi value) {
            this.hoydoserateBrachyterapi = value;
        }

        /**
         * Gets the value of the lavdoserateBrachyterapi property.
         * 
         * @return
         *     possible object is
         *     {@link Behandling.Straalebehandling.LavdoserateBrachyterapi }
         *     
         */
        public Behandling.Straalebehandling.LavdoserateBrachyterapi getLavdoserateBrachyterapi() {
            return lavdoserateBrachyterapi;
        }

        /**
         * Sets the value of the lavdoserateBrachyterapi property.
         * 
         * @param value
         *     allowed object is
         *     {@link Behandling.Straalebehandling.LavdoserateBrachyterapi }
         *     
         */
        public void setLavdoserateBrachyterapi(Behandling.Straalebehandling.LavdoserateBrachyterapi value) {
            this.lavdoserateBrachyterapi = value;
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
         *         &lt;element name="HDBrachyterapi"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="HDBrachyterapiFRDoseGY"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;pattern value="([1-9]\d{0,1}|\d{0,2},\d{1,2})?"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="HDBrachyterapiFRDoseUkjent"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="99"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="HDBrachyterapiAntFR"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;pattern value="([1-9])?"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="HDBrachyterapiAntFRUkjent"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="99"/&gt;
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
            "hdBrachyterapi",
            "hdBrachyterapiFRDoseGY",
            "hdBrachyterapiFRDoseUkjent",
            "hdBrachyterapiAntFR",
            "hdBrachyterapiAntFRUkjent"
        })
        public static class HoydoserateBrachyterapi {

            @XmlElement(name = "HDBrachyterapi", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String hdBrachyterapi;
            @XmlElement(name = "HDBrachyterapiFRDoseGY", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String hdBrachyterapiFRDoseGY;
            @XmlElement(name = "HDBrachyterapiFRDoseUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String hdBrachyterapiFRDoseUkjent;
            @XmlElement(name = "HDBrachyterapiAntFR", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
            protected String hdBrachyterapiAntFR;
            @XmlElement(name = "HDBrachyterapiAntFRUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String hdBrachyterapiAntFRUkjent;

            /**
             * Gets the value of the hdBrachyterapi property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHDBrachyterapi() {
                return hdBrachyterapi;
            }

            /**
             * Sets the value of the hdBrachyterapi property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHDBrachyterapi(String value) {
                this.hdBrachyterapi = value;
            }

            /**
             * Gets the value of the hdBrachyterapiFRDoseGY property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHDBrachyterapiFRDoseGY() {
                return hdBrachyterapiFRDoseGY;
            }

            /**
             * Sets the value of the hdBrachyterapiFRDoseGY property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHDBrachyterapiFRDoseGY(String value) {
                this.hdBrachyterapiFRDoseGY = value;
            }

            /**
             * Gets the value of the hdBrachyterapiFRDoseUkjent property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHDBrachyterapiFRDoseUkjent() {
                return hdBrachyterapiFRDoseUkjent;
            }

            /**
             * Sets the value of the hdBrachyterapiFRDoseUkjent property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHDBrachyterapiFRDoseUkjent(String value) {
                this.hdBrachyterapiFRDoseUkjent = value;
            }

            /**
             * Gets the value of the hdBrachyterapiAntFR property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHDBrachyterapiAntFR() {
                return hdBrachyterapiAntFR;
            }

            /**
             * Sets the value of the hdBrachyterapiAntFR property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHDBrachyterapiAntFR(String value) {
                this.hdBrachyterapiAntFR = value;
            }

            /**
             * Gets the value of the hdBrachyterapiAntFRUkjent property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHDBrachyterapiAntFRUkjent() {
                return hdBrachyterapiAntFRUkjent;
            }

            /**
             * Sets the value of the hdBrachyterapiAntFRUkjent property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHDBrachyterapiAntFRUkjent(String value) {
                this.hdBrachyterapiAntFRUkjent = value;
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
         *         &lt;element name="LDBrachyterapi"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Behandlingssted" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="BehandlingsstedUkjent"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="99"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LDBrachyterapiFRDoseGY"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;pattern value="([1-9]\d{0,2}|\d{0,3},\d{1,2})?"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LDBrachyterapiFRDoseUkjent"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="99"/&gt;
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
            "ldBrachyterapi",
            "behandlingssted",
            "behandlingsstedUkjent",
            "ldBrachyterapiFRDoseGY",
            "ldBrachyterapiFRDoseUkjent"
        })
        public static class LavdoserateBrachyterapi {

            @XmlElement(name = "LDBrachyterapi", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String ldBrachyterapi;
            @XmlElement(name = "Behandlingssted", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String behandlingssted;
            @XmlElement(name = "BehandlingsstedUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String behandlingsstedUkjent;
            @XmlElement(name = "LDBrachyterapiFRDoseGY", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String ldBrachyterapiFRDoseGY;
            @XmlElement(name = "LDBrachyterapiFRDoseUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String ldBrachyterapiFRDoseUkjent;

            /**
             * Gets the value of the ldBrachyterapi property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLDBrachyterapi() {
                return ldBrachyterapi;
            }

            /**
             * Sets the value of the ldBrachyterapi property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLDBrachyterapi(String value) {
                this.ldBrachyterapi = value;
            }

            /**
             * Gets the value of the behandlingssted property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBehandlingssted() {
                return behandlingssted;
            }

            /**
             * Sets the value of the behandlingssted property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBehandlingssted(String value) {
                this.behandlingssted = value;
            }

            /**
             * Gets the value of the behandlingsstedUkjent property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBehandlingsstedUkjent() {
                return behandlingsstedUkjent;
            }

            /**
             * Sets the value of the behandlingsstedUkjent property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBehandlingsstedUkjent(String value) {
                this.behandlingsstedUkjent = value;
            }

            /**
             * Gets the value of the ldBrachyterapiFRDoseGY property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLDBrachyterapiFRDoseGY() {
                return ldBrachyterapiFRDoseGY;
            }

            /**
             * Sets the value of the ldBrachyterapiFRDoseGY property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLDBrachyterapiFRDoseGY(String value) {
                this.ldBrachyterapiFRDoseGY = value;
            }

            /**
             * Gets the value of the ldBrachyterapiFRDoseUkjent property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLDBrachyterapiFRDoseUkjent() {
                return ldBrachyterapiFRDoseUkjent;
            }

            /**
             * Sets the value of the ldBrachyterapiFRDoseUkjent property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLDBrachyterapiFRDoseUkjent(String value) {
                this.ldBrachyterapiFRDoseUkjent = value;
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
         *         &lt;element name="LKBekkenStraalebehandling"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="0"/&gt;
         *               &lt;enumeration value="99"/&gt;
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
            "lkBekkenStraalebehandling"
        })
        public static class LKbekken {

            @XmlElement(name = "LKBekkenStraalebehandling", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String lkBekkenStraalebehandling;

            /**
             * Gets the value of the lkBekkenStraalebehandling property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLKBekkenStraalebehandling() {
                return lkBekkenStraalebehandling;
            }

            /**
             * Sets the value of the lkBekkenStraalebehandling property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLKBekkenStraalebehandling(String value) {
                this.lkBekkenStraalebehandling = value;
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
         *         &lt;element name="ProstataFRDoseGY"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;pattern value="([1-9]\d{0,1}|\d{0,2},\d{1,2})?"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ProstataFRDoseUkjent"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="99"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ProstataAntFR"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;pattern value="([1-9]\d{0,1})?"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ProstataAntFRUkjent"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="99"/&gt;
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
            "prostataFRDoseGY",
            "prostataFRDoseUkjent",
            "prostataAntFR",
            "prostataAntFRUkjent"
        })
        public static class Prostata {

            @XmlElement(name = "ProstataFRDoseGY", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String prostataFRDoseGY;
            @XmlElement(name = "ProstataFRDoseUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String prostataFRDoseUkjent;
            @XmlElement(name = "ProstataAntFR", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String prostataAntFR;
            @XmlElement(name = "ProstataAntFRUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String prostataAntFRUkjent;

            /**
             * Gets the value of the prostataFRDoseGY property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProstataFRDoseGY() {
                return prostataFRDoseGY;
            }

            /**
             * Sets the value of the prostataFRDoseGY property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProstataFRDoseGY(String value) {
                this.prostataFRDoseGY = value;
            }

            /**
             * Gets the value of the prostataFRDoseUkjent property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProstataFRDoseUkjent() {
                return prostataFRDoseUkjent;
            }

            /**
             * Sets the value of the prostataFRDoseUkjent property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProstataFRDoseUkjent(String value) {
                this.prostataFRDoseUkjent = value;
            }

            /**
             * Gets the value of the prostataAntFR property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProstataAntFR() {
                return prostataAntFR;
            }

            /**
             * Sets the value of the prostataAntFR property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProstataAntFR(String value) {
                this.prostataAntFR = value;
            }

            /**
             * Gets the value of the prostataAntFRUkjent property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProstataAntFRUkjent() {
                return prostataAntFRUkjent;
            }

            /**
             * Sets the value of the prostataAntFRUkjent property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProstataAntFRUkjent(String value) {
                this.prostataAntFRUkjent = value;
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
     *         &lt;element name="Tumor"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PalpatoriskTumorHoyre"&gt;
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
     *                   &lt;element name="PalpatoriskTumorVenstre"&gt;
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
     *                   &lt;element name="SamletPalpatoriskTumor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="MRDiagnostikk"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value=""/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="DatoMRDiagnostikk"&gt;
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
     *                   &lt;element name="DatoMRDiagnostikkUkjent"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value=""/&gt;
     *                         &lt;enumeration value="99"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PIRADSHoyre"&gt;
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
     *                   &lt;element name="PIRADSVenstre"&gt;
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
     *                   &lt;element name="MRBasertKliniskTHoyre"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value=""/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="2"/&gt;
     *                         &lt;enumeration value="3"/&gt;
     *                         &lt;enumeration value="4"/&gt;
     *                         &lt;enumeration value="5"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="MRBasertKliniskTVenstre"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value=""/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="2"/&gt;
     *                         &lt;enumeration value="3"/&gt;
     *                         &lt;enumeration value="4"/&gt;
     *                         &lt;enumeration value="5"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SamletMRBasertKliniskT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TotalVurderingKliniskT"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value=""/&gt;
     *                         &lt;enumeration value="X"/&gt;
     *                         &lt;enumeration value="0"/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="1a"/&gt;
     *                         &lt;enumeration value="1b"/&gt;
     *                         &lt;enumeration value="1c"/&gt;
     *                         &lt;enumeration value="2"/&gt;
     *                         &lt;enumeration value="2a"/&gt;
     *                         &lt;enumeration value="2b"/&gt;
     *                         &lt;enumeration value="2c"/&gt;
     *                         &lt;enumeration value="3"/&gt;
     *                         &lt;enumeration value="3a"/&gt;
     *                         &lt;enumeration value="3b"/&gt;
     *                         &lt;enumeration value="4"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="KliniskVurdertAv"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value=""/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="2"/&gt;
     *                         &lt;enumeration value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RegionaleLK"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="RegionaleLKPaavist"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value=""/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="0"/&gt;
     *                         &lt;enumeration value="2"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Fjernmetastaser"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FjernmetPaavist"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value=""/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="0"/&gt;
     *                         &lt;enumeration value="2"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LokalisasjonFjernmet"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="FjerneLKmet"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                   &lt;pattern value="true|false"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Skjelettmet"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                   &lt;pattern value="true|false"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="AnnetFjernmet"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                   &lt;pattern value="true|false"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="AnnetFjernmetSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
     *         &lt;element name="UtredningsmetodeMetastaser"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="UtredningsmetodeLK"&gt;
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
     *                   &lt;element name="AnnenDiagnostikkLKSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="UtredningsmetodeFjernmet"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="SkjelettscintigrafiMet"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                   &lt;pattern value="true|false"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="RtgThoraxMet"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                   &lt;pattern value="true|false"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="RtgBekkenMet"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                   &lt;pattern value="true|false"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="CTMet"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                   &lt;pattern value="true|false"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="MRMet"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                   &lt;pattern value="true|false"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="PETMet"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                   &lt;pattern value="true|false"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="CytologiMet"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                   &lt;pattern value="true|false"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="BiopsiMet"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                   &lt;pattern value="true|false"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="AnnenDiagnostikkMet"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                   &lt;pattern value="true|false"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="AnnenDiagnostikkMetSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="UtredningsmetodeFjernmetUkjent"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value=""/&gt;
     *                                   &lt;enumeration value="99"/&gt;
     *                                 &lt;/restriction&gt;
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
        "tumor",
        "regionaleLK",
        "fjernmetastaser",
        "utredningsmetodeMetastaser"
    })
    public static class Sykdomsutbredelse {

        @XmlElement(name = "Tumor", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
        protected Behandling.Sykdomsutbredelse.Tumor tumor;
        @XmlElement(name = "RegionaleLK", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
        protected Behandling.Sykdomsutbredelse.RegionaleLK regionaleLK;
        @XmlElement(name = "Fjernmetastaser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
        protected Behandling.Sykdomsutbredelse.Fjernmetastaser fjernmetastaser;
        @XmlElement(name = "UtredningsmetodeMetastaser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
        protected Behandling.Sykdomsutbredelse.UtredningsmetodeMetastaser utredningsmetodeMetastaser;

        /**
         * Gets the value of the tumor property.
         * 
         * @return
         *     possible object is
         *     {@link Behandling.Sykdomsutbredelse.Tumor }
         *     
         */
        public Behandling.Sykdomsutbredelse.Tumor getTumor() {
            return tumor;
        }

        /**
         * Sets the value of the tumor property.
         * 
         * @param value
         *     allowed object is
         *     {@link Behandling.Sykdomsutbredelse.Tumor }
         *     
         */
        public void setTumor(Behandling.Sykdomsutbredelse.Tumor value) {
            this.tumor = value;
        }

        /**
         * Gets the value of the regionaleLK property.
         * 
         * @return
         *     possible object is
         *     {@link Behandling.Sykdomsutbredelse.RegionaleLK }
         *     
         */
        public Behandling.Sykdomsutbredelse.RegionaleLK getRegionaleLK() {
            return regionaleLK;
        }

        /**
         * Sets the value of the regionaleLK property.
         * 
         * @param value
         *     allowed object is
         *     {@link Behandling.Sykdomsutbredelse.RegionaleLK }
         *     
         */
        public void setRegionaleLK(Behandling.Sykdomsutbredelse.RegionaleLK value) {
            this.regionaleLK = value;
        }

        /**
         * Gets the value of the fjernmetastaser property.
         * 
         * @return
         *     possible object is
         *     {@link Behandling.Sykdomsutbredelse.Fjernmetastaser }
         *     
         */
        public Behandling.Sykdomsutbredelse.Fjernmetastaser getFjernmetastaser() {
            return fjernmetastaser;
        }

        /**
         * Sets the value of the fjernmetastaser property.
         * 
         * @param value
         *     allowed object is
         *     {@link Behandling.Sykdomsutbredelse.Fjernmetastaser }
         *     
         */
        public void setFjernmetastaser(Behandling.Sykdomsutbredelse.Fjernmetastaser value) {
            this.fjernmetastaser = value;
        }

        /**
         * Gets the value of the utredningsmetodeMetastaser property.
         * 
         * @return
         *     possible object is
         *     {@link Behandling.Sykdomsutbredelse.UtredningsmetodeMetastaser }
         *     
         */
        public Behandling.Sykdomsutbredelse.UtredningsmetodeMetastaser getUtredningsmetodeMetastaser() {
            return utredningsmetodeMetastaser;
        }

        /**
         * Sets the value of the utredningsmetodeMetastaser property.
         * 
         * @param value
         *     allowed object is
         *     {@link Behandling.Sykdomsutbredelse.UtredningsmetodeMetastaser }
         *     
         */
        public void setUtredningsmetodeMetastaser(Behandling.Sykdomsutbredelse.UtredningsmetodeMetastaser value) {
            this.utredningsmetodeMetastaser = value;
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
         *         &lt;element name="FjernmetPaavist"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="0"/&gt;
         *               &lt;enumeration value="2"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LokalisasjonFjernmet"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="FjerneLKmet"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
         *                         &lt;pattern value="true|false"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Skjelettmet"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
         *                         &lt;pattern value="true|false"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="AnnetFjernmet"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
         *                         &lt;pattern value="true|false"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="AnnetFjernmetSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "fjernmetPaavist",
            "lokalisasjonFjernmet"
        })
        public static class Fjernmetastaser {

            @XmlElement(name = "FjernmetPaavist", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String fjernmetPaavist;
            @XmlElement(name = "LokalisasjonFjernmet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
            protected Behandling.Sykdomsutbredelse.Fjernmetastaser.LokalisasjonFjernmet lokalisasjonFjernmet;

            /**
             * Gets the value of the fjernmetPaavist property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFjernmetPaavist() {
                return fjernmetPaavist;
            }

            /**
             * Sets the value of the fjernmetPaavist property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFjernmetPaavist(String value) {
                this.fjernmetPaavist = value;
            }

            /**
             * Gets the value of the lokalisasjonFjernmet property.
             * 
             * @return
             *     possible object is
             *     {@link Behandling.Sykdomsutbredelse.Fjernmetastaser.LokalisasjonFjernmet }
             *     
             */
            public Behandling.Sykdomsutbredelse.Fjernmetastaser.LokalisasjonFjernmet getLokalisasjonFjernmet() {
                return lokalisasjonFjernmet;
            }

            /**
             * Sets the value of the lokalisasjonFjernmet property.
             * 
             * @param value
             *     allowed object is
             *     {@link Behandling.Sykdomsutbredelse.Fjernmetastaser.LokalisasjonFjernmet }
             *     
             */
            public void setLokalisasjonFjernmet(Behandling.Sykdomsutbredelse.Fjernmetastaser.LokalisasjonFjernmet value) {
                this.lokalisasjonFjernmet = value;
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
             *         &lt;element name="FjerneLKmet"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
             *               &lt;pattern value="true|false"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Skjelettmet"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
             *               &lt;pattern value="true|false"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="AnnetFjernmet"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
             *               &lt;pattern value="true|false"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="AnnetFjernmetSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "fjerneLKmet",
                "skjelettmet",
                "annetFjernmet",
                "annetFjernmetSpesifiser"
            })
            public static class LokalisasjonFjernmet {

                @XmlElement(name = "FjerneLKmet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0")
                protected boolean fjerneLKmet;
                @XmlElement(name = "Skjelettmet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0")
                protected boolean skjelettmet;
                @XmlElement(name = "AnnetFjernmet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0")
                protected boolean annetFjernmet;
                @XmlElement(name = "AnnetFjernmetSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
                protected String annetFjernmetSpesifiser;

                /**
                 * Gets the value of the fjerneLKmet property.
                 * 
                 */
                public boolean isFjerneLKmet() {
                    return fjerneLKmet;
                }

                /**
                 * Sets the value of the fjerneLKmet property.
                 * 
                 */
                public void setFjerneLKmet(boolean value) {
                    this.fjerneLKmet = value;
                }

                /**
                 * Gets the value of the skjelettmet property.
                 * 
                 */
                public boolean isSkjelettmet() {
                    return skjelettmet;
                }

                /**
                 * Sets the value of the skjelettmet property.
                 * 
                 */
                public void setSkjelettmet(boolean value) {
                    this.skjelettmet = value;
                }

                /**
                 * Gets the value of the annetFjernmet property.
                 * 
                 */
                public boolean isAnnetFjernmet() {
                    return annetFjernmet;
                }

                /**
                 * Sets the value of the annetFjernmet property.
                 * 
                 */
                public void setAnnetFjernmet(boolean value) {
                    this.annetFjernmet = value;
                }

                /**
                 * Gets the value of the annetFjernmetSpesifiser property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAnnetFjernmetSpesifiser() {
                    return annetFjernmetSpesifiser;
                }

                /**
                 * Sets the value of the annetFjernmetSpesifiser property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAnnetFjernmetSpesifiser(String value) {
                    this.annetFjernmetSpesifiser = value;
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
         *         &lt;element name="RegionaleLKPaavist"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="0"/&gt;
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
            "regionaleLKPaavist"
        })
        public static class RegionaleLK {

            @XmlElement(name = "RegionaleLKPaavist", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String regionaleLKPaavist;

            /**
             * Gets the value of the regionaleLKPaavist property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegionaleLKPaavist() {
                return regionaleLKPaavist;
            }

            /**
             * Sets the value of the regionaleLKPaavist property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegionaleLKPaavist(String value) {
                this.regionaleLKPaavist = value;
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
         *         &lt;element name="PalpatoriskTumorHoyre"&gt;
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
         *         &lt;element name="PalpatoriskTumorVenstre"&gt;
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
         *         &lt;element name="SamletPalpatoriskTumor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="MRDiagnostikk"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="DatoMRDiagnostikk"&gt;
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
         *         &lt;element name="DatoMRDiagnostikkUkjent"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="99"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PIRADSHoyre"&gt;
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
         *         &lt;element name="PIRADSVenstre"&gt;
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
         *         &lt;element name="MRBasertKliniskTHoyre"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="2"/&gt;
         *               &lt;enumeration value="3"/&gt;
         *               &lt;enumeration value="4"/&gt;
         *               &lt;enumeration value="5"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="MRBasertKliniskTVenstre"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="2"/&gt;
         *               &lt;enumeration value="3"/&gt;
         *               &lt;enumeration value="4"/&gt;
         *               &lt;enumeration value="5"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SamletMRBasertKliniskT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TotalVurderingKliniskT"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="X"/&gt;
         *               &lt;enumeration value="0"/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="1a"/&gt;
         *               &lt;enumeration value="1b"/&gt;
         *               &lt;enumeration value="1c"/&gt;
         *               &lt;enumeration value="2"/&gt;
         *               &lt;enumeration value="2a"/&gt;
         *               &lt;enumeration value="2b"/&gt;
         *               &lt;enumeration value="2c"/&gt;
         *               &lt;enumeration value="3"/&gt;
         *               &lt;enumeration value="3a"/&gt;
         *               &lt;enumeration value="3b"/&gt;
         *               &lt;enumeration value="4"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="KliniskVurdertAv"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="2"/&gt;
         *               &lt;enumeration value="3"/&gt;
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
            "palpatoriskTumorHoyre",
            "palpatoriskTumorVenstre",
            "samletPalpatoriskTumor",
            "mrDiagnostikk",
            "datoMRDiagnostikk",
            "datoMRDiagnostikkUkjent",
            "piradsHoyre",
            "piradsVenstre",
            "mrBasertKliniskTHoyre",
            "mrBasertKliniskTVenstre",
            "samletMRBasertKliniskT",
            "totalVurderingKliniskT",
            "kliniskVurdertAv"
        })
        public static class Tumor {

            @XmlElement(name = "PalpatoriskTumorHoyre", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String palpatoriskTumorHoyre;
            @XmlElement(name = "PalpatoriskTumorVenstre", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String palpatoriskTumorVenstre;
            @XmlElement(name = "SamletPalpatoriskTumor", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String samletPalpatoriskTumor;
            @XmlElement(name = "MRDiagnostikk", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String mrDiagnostikk;
            @XmlElement(name = "DatoMRDiagnostikk", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
            protected String datoMRDiagnostikk;
            @XmlElement(name = "DatoMRDiagnostikkUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String datoMRDiagnostikkUkjent;
            @XmlElement(name = "PIRADSHoyre", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String piradsHoyre;
            @XmlElement(name = "PIRADSVenstre", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String piradsVenstre;
            @XmlElement(name = "MRBasertKliniskTHoyre", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String mrBasertKliniskTHoyre;
            @XmlElement(name = "MRBasertKliniskTVenstre", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String mrBasertKliniskTVenstre;
            @XmlElement(name = "SamletMRBasertKliniskT", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String samletMRBasertKliniskT;
            @XmlElement(name = "TotalVurderingKliniskT", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String totalVurderingKliniskT;
            @XmlElement(name = "KliniskVurdertAv", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String kliniskVurdertAv;

            /**
             * Gets the value of the palpatoriskTumorHoyre property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPalpatoriskTumorHoyre() {
                return palpatoriskTumorHoyre;
            }

            /**
             * Sets the value of the palpatoriskTumorHoyre property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPalpatoriskTumorHoyre(String value) {
                this.palpatoriskTumorHoyre = value;
            }

            /**
             * Gets the value of the palpatoriskTumorVenstre property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPalpatoriskTumorVenstre() {
                return palpatoriskTumorVenstre;
            }

            /**
             * Sets the value of the palpatoriskTumorVenstre property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPalpatoriskTumorVenstre(String value) {
                this.palpatoriskTumorVenstre = value;
            }

            /**
             * Gets the value of the samletPalpatoriskTumor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSamletPalpatoriskTumor() {
                return samletPalpatoriskTumor;
            }

            /**
             * Sets the value of the samletPalpatoriskTumor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSamletPalpatoriskTumor(String value) {
                this.samletPalpatoriskTumor = value;
            }

            /**
             * Gets the value of the mrDiagnostikk property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMRDiagnostikk() {
                return mrDiagnostikk;
            }

            /**
             * Sets the value of the mrDiagnostikk property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMRDiagnostikk(String value) {
                this.mrDiagnostikk = value;
            }

            /**
             * Gets the value of the datoMRDiagnostikk property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatoMRDiagnostikk() {
                return datoMRDiagnostikk;
            }

            /**
             * Sets the value of the datoMRDiagnostikk property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatoMRDiagnostikk(String value) {
                this.datoMRDiagnostikk = value;
            }

            /**
             * Gets the value of the datoMRDiagnostikkUkjent property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatoMRDiagnostikkUkjent() {
                return datoMRDiagnostikkUkjent;
            }

            /**
             * Sets the value of the datoMRDiagnostikkUkjent property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatoMRDiagnostikkUkjent(String value) {
                this.datoMRDiagnostikkUkjent = value;
            }

            /**
             * Gets the value of the piradsHoyre property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPIRADSHoyre() {
                return piradsHoyre;
            }

            /**
             * Sets the value of the piradsHoyre property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPIRADSHoyre(String value) {
                this.piradsHoyre = value;
            }

            /**
             * Gets the value of the piradsVenstre property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPIRADSVenstre() {
                return piradsVenstre;
            }

            /**
             * Sets the value of the piradsVenstre property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPIRADSVenstre(String value) {
                this.piradsVenstre = value;
            }

            /**
             * Gets the value of the mrBasertKliniskTHoyre property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMRBasertKliniskTHoyre() {
                return mrBasertKliniskTHoyre;
            }

            /**
             * Sets the value of the mrBasertKliniskTHoyre property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMRBasertKliniskTHoyre(String value) {
                this.mrBasertKliniskTHoyre = value;
            }

            /**
             * Gets the value of the mrBasertKliniskTVenstre property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMRBasertKliniskTVenstre() {
                return mrBasertKliniskTVenstre;
            }

            /**
             * Sets the value of the mrBasertKliniskTVenstre property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMRBasertKliniskTVenstre(String value) {
                this.mrBasertKliniskTVenstre = value;
            }

            /**
             * Gets the value of the samletMRBasertKliniskT property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSamletMRBasertKliniskT() {
                return samletMRBasertKliniskT;
            }

            /**
             * Sets the value of the samletMRBasertKliniskT property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSamletMRBasertKliniskT(String value) {
                this.samletMRBasertKliniskT = value;
            }

            /**
             * Gets the value of the totalVurderingKliniskT property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalVurderingKliniskT() {
                return totalVurderingKliniskT;
            }

            /**
             * Sets the value of the totalVurderingKliniskT property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalVurderingKliniskT(String value) {
                this.totalVurderingKliniskT = value;
            }

            /**
             * Gets the value of the kliniskVurdertAv property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKliniskVurdertAv() {
                return kliniskVurdertAv;
            }

            /**
             * Sets the value of the kliniskVurdertAv property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKliniskVurdertAv(String value) {
                this.kliniskVurdertAv = value;
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
         *         &lt;element name="UtredningsmetodeLK"&gt;
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
         *         &lt;element name="AnnenDiagnostikkLKSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="UtredningsmetodeFjernmet"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="SkjelettscintigrafiMet"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
         *                         &lt;pattern value="true|false"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="RtgThoraxMet"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
         *                         &lt;pattern value="true|false"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="RtgBekkenMet"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
         *                         &lt;pattern value="true|false"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="CTMet"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
         *                         &lt;pattern value="true|false"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="MRMet"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
         *                         &lt;pattern value="true|false"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="PETMet"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
         *                         &lt;pattern value="true|false"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="CytologiMet"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
         *                         &lt;pattern value="true|false"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="BiopsiMet"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
         *                         &lt;pattern value="true|false"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="AnnenDiagnostikkMet"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
         *                         &lt;pattern value="true|false"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="AnnenDiagnostikkMetSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="UtredningsmetodeFjernmetUkjent"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value=""/&gt;
         *                         &lt;enumeration value="99"/&gt;
         *                       &lt;/restriction&gt;
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
            "utredningsmetodeLK",
            "annenDiagnostikkLKSpesifiser",
            "utredningsmetodeFjernmet"
        })
        public static class UtredningsmetodeMetastaser {

            @XmlElement(name = "UtredningsmetodeLK", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String utredningsmetodeLK;
            @XmlElement(name = "AnnenDiagnostikkLKSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
            protected String annenDiagnostikkLKSpesifiser;
            @XmlElement(name = "UtredningsmetodeFjernmet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true)
            protected Behandling.Sykdomsutbredelse.UtredningsmetodeMetastaser.UtredningsmetodeFjernmet utredningsmetodeFjernmet;

            /**
             * Gets the value of the utredningsmetodeLK property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUtredningsmetodeLK() {
                return utredningsmetodeLK;
            }

            /**
             * Sets the value of the utredningsmetodeLK property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUtredningsmetodeLK(String value) {
                this.utredningsmetodeLK = value;
            }

            /**
             * Gets the value of the annenDiagnostikkLKSpesifiser property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnnenDiagnostikkLKSpesifiser() {
                return annenDiagnostikkLKSpesifiser;
            }

            /**
             * Sets the value of the annenDiagnostikkLKSpesifiser property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAnnenDiagnostikkLKSpesifiser(String value) {
                this.annenDiagnostikkLKSpesifiser = value;
            }

            /**
             * Gets the value of the utredningsmetodeFjernmet property.
             * 
             * @return
             *     possible object is
             *     {@link Behandling.Sykdomsutbredelse.UtredningsmetodeMetastaser.UtredningsmetodeFjernmet }
             *     
             */
            public Behandling.Sykdomsutbredelse.UtredningsmetodeMetastaser.UtredningsmetodeFjernmet getUtredningsmetodeFjernmet() {
                return utredningsmetodeFjernmet;
            }

            /**
             * Sets the value of the utredningsmetodeFjernmet property.
             * 
             * @param value
             *     allowed object is
             *     {@link Behandling.Sykdomsutbredelse.UtredningsmetodeMetastaser.UtredningsmetodeFjernmet }
             *     
             */
            public void setUtredningsmetodeFjernmet(Behandling.Sykdomsutbredelse.UtredningsmetodeMetastaser.UtredningsmetodeFjernmet value) {
                this.utredningsmetodeFjernmet = value;
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
             *         &lt;element name="SkjelettscintigrafiMet"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
             *               &lt;pattern value="true|false"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="RtgThoraxMet"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
             *               &lt;pattern value="true|false"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="RtgBekkenMet"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
             *               &lt;pattern value="true|false"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="CTMet"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
             *               &lt;pattern value="true|false"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="MRMet"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
             *               &lt;pattern value="true|false"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="PETMet"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
             *               &lt;pattern value="true|false"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="CytologiMet"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
             *               &lt;pattern value="true|false"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="BiopsiMet"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
             *               &lt;pattern value="true|false"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="AnnenDiagnostikkMet"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
             *               &lt;pattern value="true|false"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="AnnenDiagnostikkMetSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="UtredningsmetodeFjernmetUkjent"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value=""/&gt;
             *               &lt;enumeration value="99"/&gt;
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
                "skjelettscintigrafiMet",
                "rtgThoraxMet",
                "rtgBekkenMet",
                "ctMet",
                "mrMet",
                "petMet",
                "cytologiMet",
                "biopsiMet",
                "annenDiagnostikkMet",
                "annenDiagnostikkMetSpesifiser",
                "utredningsmetodeFjernmetUkjent"
            })
            public static class UtredningsmetodeFjernmet {

                @XmlElement(name = "SkjelettscintigrafiMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0")
                protected boolean skjelettscintigrafiMet;
                @XmlElement(name = "RtgThoraxMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0")
                protected boolean rtgThoraxMet;
                @XmlElement(name = "RtgBekkenMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0")
                protected boolean rtgBekkenMet;
                @XmlElement(name = "CTMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0")
                protected boolean ctMet;
                @XmlElement(name = "MRMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0")
                protected boolean mrMet;
                @XmlElement(name = "PETMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0")
                protected boolean petMet;
                @XmlElement(name = "CytologiMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0")
                protected boolean cytologiMet;
                @XmlElement(name = "BiopsiMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0")
                protected boolean biopsiMet;
                @XmlElement(name = "AnnenDiagnostikkMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0")
                protected boolean annenDiagnostikkMet;
                @XmlElement(name = "AnnenDiagnostikkMetSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
                protected String annenDiagnostikkMetSpesifiser;
                @XmlElement(name = "UtredningsmetodeFjernmetUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataStraale/v4_0", required = true, defaultValue = "")
                protected String utredningsmetodeFjernmetUkjent;

                /**
                 * Gets the value of the skjelettscintigrafiMet property.
                 * 
                 */
                public boolean isSkjelettscintigrafiMet() {
                    return skjelettscintigrafiMet;
                }

                /**
                 * Sets the value of the skjelettscintigrafiMet property.
                 * 
                 */
                public void setSkjelettscintigrafiMet(boolean value) {
                    this.skjelettscintigrafiMet = value;
                }

                /**
                 * Gets the value of the rtgThoraxMet property.
                 * 
                 */
                public boolean isRtgThoraxMet() {
                    return rtgThoraxMet;
                }

                /**
                 * Sets the value of the rtgThoraxMet property.
                 * 
                 */
                public void setRtgThoraxMet(boolean value) {
                    this.rtgThoraxMet = value;
                }

                /**
                 * Gets the value of the rtgBekkenMet property.
                 * 
                 */
                public boolean isRtgBekkenMet() {
                    return rtgBekkenMet;
                }

                /**
                 * Sets the value of the rtgBekkenMet property.
                 * 
                 */
                public void setRtgBekkenMet(boolean value) {
                    this.rtgBekkenMet = value;
                }

                /**
                 * Gets the value of the ctMet property.
                 * 
                 */
                public boolean isCTMet() {
                    return ctMet;
                }

                /**
                 * Sets the value of the ctMet property.
                 * 
                 */
                public void setCTMet(boolean value) {
                    this.ctMet = value;
                }

                /**
                 * Gets the value of the mrMet property.
                 * 
                 */
                public boolean isMRMet() {
                    return mrMet;
                }

                /**
                 * Sets the value of the mrMet property.
                 * 
                 */
                public void setMRMet(boolean value) {
                    this.mrMet = value;
                }

                /**
                 * Gets the value of the petMet property.
                 * 
                 */
                public boolean isPETMet() {
                    return petMet;
                }

                /**
                 * Sets the value of the petMet property.
                 * 
                 */
                public void setPETMet(boolean value) {
                    this.petMet = value;
                }

                /**
                 * Gets the value of the cytologiMet property.
                 * 
                 */
                public boolean isCytologiMet() {
                    return cytologiMet;
                }

                /**
                 * Sets the value of the cytologiMet property.
                 * 
                 */
                public void setCytologiMet(boolean value) {
                    this.cytologiMet = value;
                }

                /**
                 * Gets the value of the biopsiMet property.
                 * 
                 */
                public boolean isBiopsiMet() {
                    return biopsiMet;
                }

                /**
                 * Sets the value of the biopsiMet property.
                 * 
                 */
                public void setBiopsiMet(boolean value) {
                    this.biopsiMet = value;
                }

                /**
                 * Gets the value of the annenDiagnostikkMet property.
                 * 
                 */
                public boolean isAnnenDiagnostikkMet() {
                    return annenDiagnostikkMet;
                }

                /**
                 * Sets the value of the annenDiagnostikkMet property.
                 * 
                 */
                public void setAnnenDiagnostikkMet(boolean value) {
                    this.annenDiagnostikkMet = value;
                }

                /**
                 * Gets the value of the annenDiagnostikkMetSpesifiser property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAnnenDiagnostikkMetSpesifiser() {
                    return annenDiagnostikkMetSpesifiser;
                }

                /**
                 * Sets the value of the annenDiagnostikkMetSpesifiser property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAnnenDiagnostikkMetSpesifiser(String value) {
                    this.annenDiagnostikkMetSpesifiser = value;
                }

                /**
                 * Gets the value of the utredningsmetodeFjernmetUkjent property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUtredningsmetodeFjernmetUkjent() {
                    return utredningsmetodeFjernmetUkjent;
                }

                /**
                 * Sets the value of the utredningsmetodeFjernmetUkjent property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUtredningsmetodeFjernmetUkjent(String value) {
                    this.utredningsmetodeFjernmetUkjent = value;
                }

            }

        }

    }

}
