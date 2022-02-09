
package com.Kreftregisteret.KreftregisteretApp.models.KliniskProstataKirurgi;

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
 *         &lt;element name="Kirurgi"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="KirurgiPrimaer"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PreoperativInformasjon"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="AktivMonitorering"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value=""/&gt;
 *                                             &lt;enumeration value="1"/&gt;
 *                                             &lt;enumeration value="0"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="RevurderingSykdomsutrbredelse"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value=""/&gt;
 *                                             &lt;enumeration value="1"/&gt;
 *                                             &lt;enumeration value="0"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="PreoprPSAVerdi"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;pattern value="([1-9]\d{0,5}|\d,\d|[1-9]\d{1,5},\d)?"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="PreoprPSAVerdiUkjent"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value=""/&gt;
 *                                             &lt;enumeration value="99"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="NeoadjuvantEndokrinBehandling"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value=""/&gt;
 *                                             &lt;enumeration value="1"/&gt;
 *                                             &lt;enumeration value="0"/&gt;
 *                                             &lt;enumeration value="99"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="DatoOppstartNeoadjBeh"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}date"&gt;
 *                                             &lt;simpleType&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                 &lt;pattern value=""/&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/simpleType&gt;
 *                                           &lt;/union&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="DatoOppstartNeoadjBehUkjent"&gt;
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
 *                             &lt;element name="Sykdomsutbredelse"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Tumor"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="PalpatoriskTumorHoyre"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value=""/&gt;
 *                                                       &lt;enumeration value="1"/&gt;
 *                                                       &lt;enumeration value="2"/&gt;
 *                                                       &lt;enumeration value="3"/&gt;
 *                                                       &lt;enumeration value="4"/&gt;
 *                                                       &lt;enumeration value="5"/&gt;
 *                                                       &lt;enumeration value="6"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="PalpatoriskTumorVenstre"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value=""/&gt;
 *                                                       &lt;enumeration value="1"/&gt;
 *                                                       &lt;enumeration value="2"/&gt;
 *                                                       &lt;enumeration value="3"/&gt;
 *                                                       &lt;enumeration value="4"/&gt;
 *                                                       &lt;enumeration value="5"/&gt;
 *                                                       &lt;enumeration value="6"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="SamletPalpatoriskTumor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="MRDiagnostikk"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value=""/&gt;
 *                                                       &lt;enumeration value="1"/&gt;
 *                                                       &lt;enumeration value="0"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="DatoMRDiagnostikk"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}date"&gt;
 *                                                       &lt;simpleType&gt;
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                           &lt;pattern value=""/&gt;
 *                                                         &lt;/restriction&gt;
 *                                                       &lt;/simpleType&gt;
 *                                                     &lt;/union&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="DatoMRDiagnostikkUkjent"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value=""/&gt;
 *                                                       &lt;enumeration value="99"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="PIRADSHoyre"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value=""/&gt;
 *                                                       &lt;enumeration value="1"/&gt;
 *                                                       &lt;enumeration value="2"/&gt;
 *                                                       &lt;enumeration value="3"/&gt;
 *                                                       &lt;enumeration value="4"/&gt;
 *                                                       &lt;enumeration value="5"/&gt;
 *                                                       &lt;enumeration value="99"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="PIRADSVenstre"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value=""/&gt;
 *                                                       &lt;enumeration value="1"/&gt;
 *                                                       &lt;enumeration value="2"/&gt;
 *                                                       &lt;enumeration value="3"/&gt;
 *                                                       &lt;enumeration value="4"/&gt;
 *                                                       &lt;enumeration value="5"/&gt;
 *                                                       &lt;enumeration value="99"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="MRBasertKliniskTHoyre"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value=""/&gt;
 *                                                       &lt;enumeration value="1"/&gt;
 *                                                       &lt;enumeration value="2"/&gt;
 *                                                       &lt;enumeration value="3"/&gt;
 *                                                       &lt;enumeration value="4"/&gt;
 *                                                       &lt;enumeration value="5"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="MRBasertKliniskTVenstre"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value=""/&gt;
 *                                                       &lt;enumeration value="1"/&gt;
 *                                                       &lt;enumeration value="2"/&gt;
 *                                                       &lt;enumeration value="3"/&gt;
 *                                                       &lt;enumeration value="4"/&gt;
 *                                                       &lt;enumeration value="5"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="SamletMRBasertKliniskT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="TotalVurderingKliniskT"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value=""/&gt;
 *                                                       &lt;enumeration value="X"/&gt;
 *                                                       &lt;enumeration value="0"/&gt;
 *                                                       &lt;enumeration value="1"/&gt;
 *                                                       &lt;enumeration value="1a"/&gt;
 *                                                       &lt;enumeration value="1b"/&gt;
 *                                                       &lt;enumeration value="1c"/&gt;
 *                                                       &lt;enumeration value="2"/&gt;
 *                                                       &lt;enumeration value="2a"/&gt;
 *                                                       &lt;enumeration value="2b"/&gt;
 *                                                       &lt;enumeration value="2c"/&gt;
 *                                                       &lt;enumeration value="3"/&gt;
 *                                                       &lt;enumeration value="3a"/&gt;
 *                                                       &lt;enumeration value="3b"/&gt;
 *                                                       &lt;enumeration value="4"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="KliniskVurdertAv"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value=""/&gt;
 *                                                       &lt;enumeration value="1"/&gt;
 *                                                       &lt;enumeration value="2"/&gt;
 *                                                       &lt;enumeration value="3"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="RegionaleLK"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="RegionaleLKPaavist"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value=""/&gt;
 *                                                       &lt;enumeration value="1"/&gt;
 *                                                       &lt;enumeration value="0"/&gt;
 *                                                       &lt;enumeration value="2"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Fjernmetastaser"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="FjernmetPaavist"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value=""/&gt;
 *                                                       &lt;enumeration value="1"/&gt;
 *                                                       &lt;enumeration value="0"/&gt;
 *                                                       &lt;enumeration value="2"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="LokalisasjonFjernmet"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="FjerneLKmet"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                                                 &lt;pattern value="true|false"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="Skjelettmet"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                                                 &lt;pattern value="true|false"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="AnnetFjernmet"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                                                 &lt;pattern value="true|false"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="AnnetFjernmetSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="UtredningsmetodeMetastaser"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="UtredningsmetodeLK"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value=""/&gt;
 *                                                       &lt;enumeration value="1"/&gt;
 *                                                       &lt;enumeration value="2"/&gt;
 *                                                       &lt;enumeration value="3"/&gt;
 *                                                       &lt;enumeration value="4"/&gt;
 *                                                       &lt;enumeration value="5"/&gt;
 *                                                       &lt;enumeration value="99"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="AnnenDiagnostikkLKSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="UtredningsmetodeFjernmet"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="SkjelettscintigrafiMet"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                                                 &lt;pattern value="true|false"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="RtgThoraxMet"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                                                 &lt;pattern value="true|false"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="RtgBekkenMet"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                                                 &lt;pattern value="true|false"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="CTMet"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                                                 &lt;pattern value="true|false"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="MRMet"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                                                 &lt;pattern value="true|false"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="PETMet"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                                                 &lt;pattern value="true|false"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="CytologiMet"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                                                 &lt;pattern value="true|false"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="BiopsiMet"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                                                 &lt;pattern value="true|false"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="AnnenDiagnostikkMet"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                                                 &lt;pattern value="true|false"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="AnnenDiagnostikkMetSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="UtredningsmetodeFjernmetUkjent"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                                 &lt;enumeration value=""/&gt;
 *                                                                 &lt;enumeration value="99"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="OperasjonsdatoPrimaer"&gt;
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
 *                             &lt;element name="KirurgiskBehPrimaer"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="TypeKirurgi"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value=""/&gt;
 *                                             &lt;enumeration value="6"/&gt;
 *                                             &lt;enumeration value="7"/&gt;
 *                                             &lt;enumeration value="2"/&gt;
 *                                             &lt;enumeration value="4"/&gt;
 *                                             &lt;enumeration value="5"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="TypeKirurgiSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="NervesparendeIntensjon"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value=""/&gt;
 *                                             &lt;enumeration value="0"/&gt;
 *                                             &lt;enumeration value="1"/&gt;
 *                                             &lt;enumeration value="2"/&gt;
 *                                             &lt;enumeration value="3"/&gt;
 *                                             &lt;enumeration value="4"/&gt;
 *                                             &lt;enumeration value="99"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="SamtidigLymfadenektomi"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value=""/&gt;
 *                                             &lt;enumeration value="0"/&gt;
 *                                             &lt;enumeration value="1"/&gt;
 *                                             &lt;enumeration value="2"/&gt;
 *                                             &lt;enumeration value="3"/&gt;
 *                                             &lt;enumeration value="4"/&gt;
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
    "kirurgi"
})
@XmlRootElement(name = "Behandling", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0")
public class Behandling {

    @XmlElement(name = "Kirurgi", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true)
    protected Behandling.Kirurgi kirurgi;

    /**
     * Gets the value of the kirurgi property.
     * 
     * @return
     *     possible object is
     *     {@link Behandling.Kirurgi }
     *     
     */
    public Behandling.Kirurgi getKirurgi() {
        return kirurgi;
    }

    /**
     * Sets the value of the kirurgi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Behandling.Kirurgi }
     *     
     */
    public void setKirurgi(Behandling.Kirurgi value) {
        this.kirurgi = value;
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
     *         &lt;element name="KirurgiPrimaer"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PreoperativInformasjon"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="AktivMonitorering"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value=""/&gt;
     *                                   &lt;enumeration value="1"/&gt;
     *                                   &lt;enumeration value="0"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="RevurderingSykdomsutrbredelse"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value=""/&gt;
     *                                   &lt;enumeration value="1"/&gt;
     *                                   &lt;enumeration value="0"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="PreoprPSAVerdi"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;pattern value="([1-9]\d{0,5}|\d,\d|[1-9]\d{1,5},\d)?"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="PreoprPSAVerdiUkjent"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value=""/&gt;
     *                                   &lt;enumeration value="99"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="NeoadjuvantEndokrinBehandling"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value=""/&gt;
     *                                   &lt;enumeration value="1"/&gt;
     *                                   &lt;enumeration value="0"/&gt;
     *                                   &lt;enumeration value="99"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="DatoOppstartNeoadjBeh"&gt;
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
     *                             &lt;element name="DatoOppstartNeoadjBehUkjent"&gt;
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
     *                   &lt;element name="Sykdomsutbredelse"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Tumor"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="PalpatoriskTumorHoyre"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value=""/&gt;
     *                                             &lt;enumeration value="1"/&gt;
     *                                             &lt;enumeration value="2"/&gt;
     *                                             &lt;enumeration value="3"/&gt;
     *                                             &lt;enumeration value="4"/&gt;
     *                                             &lt;enumeration value="5"/&gt;
     *                                             &lt;enumeration value="6"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="PalpatoriskTumorVenstre"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value=""/&gt;
     *                                             &lt;enumeration value="1"/&gt;
     *                                             &lt;enumeration value="2"/&gt;
     *                                             &lt;enumeration value="3"/&gt;
     *                                             &lt;enumeration value="4"/&gt;
     *                                             &lt;enumeration value="5"/&gt;
     *                                             &lt;enumeration value="6"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="SamletPalpatoriskTumor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="MRDiagnostikk"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value=""/&gt;
     *                                             &lt;enumeration value="1"/&gt;
     *                                             &lt;enumeration value="0"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="DatoMRDiagnostikk"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}date"&gt;
     *                                             &lt;simpleType&gt;
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                 &lt;pattern value=""/&gt;
     *                                               &lt;/restriction&gt;
     *                                             &lt;/simpleType&gt;
     *                                           &lt;/union&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="DatoMRDiagnostikkUkjent"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value=""/&gt;
     *                                             &lt;enumeration value="99"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="PIRADSHoyre"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value=""/&gt;
     *                                             &lt;enumeration value="1"/&gt;
     *                                             &lt;enumeration value="2"/&gt;
     *                                             &lt;enumeration value="3"/&gt;
     *                                             &lt;enumeration value="4"/&gt;
     *                                             &lt;enumeration value="5"/&gt;
     *                                             &lt;enumeration value="99"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="PIRADSVenstre"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value=""/&gt;
     *                                             &lt;enumeration value="1"/&gt;
     *                                             &lt;enumeration value="2"/&gt;
     *                                             &lt;enumeration value="3"/&gt;
     *                                             &lt;enumeration value="4"/&gt;
     *                                             &lt;enumeration value="5"/&gt;
     *                                             &lt;enumeration value="99"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="MRBasertKliniskTHoyre"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value=""/&gt;
     *                                             &lt;enumeration value="1"/&gt;
     *                                             &lt;enumeration value="2"/&gt;
     *                                             &lt;enumeration value="3"/&gt;
     *                                             &lt;enumeration value="4"/&gt;
     *                                             &lt;enumeration value="5"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="MRBasertKliniskTVenstre"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value=""/&gt;
     *                                             &lt;enumeration value="1"/&gt;
     *                                             &lt;enumeration value="2"/&gt;
     *                                             &lt;enumeration value="3"/&gt;
     *                                             &lt;enumeration value="4"/&gt;
     *                                             &lt;enumeration value="5"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="SamletMRBasertKliniskT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="TotalVurderingKliniskT"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value=""/&gt;
     *                                             &lt;enumeration value="X"/&gt;
     *                                             &lt;enumeration value="0"/&gt;
     *                                             &lt;enumeration value="1"/&gt;
     *                                             &lt;enumeration value="1a"/&gt;
     *                                             &lt;enumeration value="1b"/&gt;
     *                                             &lt;enumeration value="1c"/&gt;
     *                                             &lt;enumeration value="2"/&gt;
     *                                             &lt;enumeration value="2a"/&gt;
     *                                             &lt;enumeration value="2b"/&gt;
     *                                             &lt;enumeration value="2c"/&gt;
     *                                             &lt;enumeration value="3"/&gt;
     *                                             &lt;enumeration value="3a"/&gt;
     *                                             &lt;enumeration value="3b"/&gt;
     *                                             &lt;enumeration value="4"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="KliniskVurdertAv"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value=""/&gt;
     *                                             &lt;enumeration value="1"/&gt;
     *                                             &lt;enumeration value="2"/&gt;
     *                                             &lt;enumeration value="3"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="RegionaleLK"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="RegionaleLKPaavist"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value=""/&gt;
     *                                             &lt;enumeration value="1"/&gt;
     *                                             &lt;enumeration value="0"/&gt;
     *                                             &lt;enumeration value="2"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Fjernmetastaser"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="FjernmetPaavist"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value=""/&gt;
     *                                             &lt;enumeration value="1"/&gt;
     *                                             &lt;enumeration value="0"/&gt;
     *                                             &lt;enumeration value="2"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="LokalisasjonFjernmet"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="FjerneLKmet"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                                       &lt;pattern value="true|false"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="Skjelettmet"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                                       &lt;pattern value="true|false"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="AnnetFjernmet"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                                       &lt;pattern value="true|false"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="AnnetFjernmetSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="UtredningsmetodeMetastaser"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="UtredningsmetodeLK"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value=""/&gt;
     *                                             &lt;enumeration value="1"/&gt;
     *                                             &lt;enumeration value="2"/&gt;
     *                                             &lt;enumeration value="3"/&gt;
     *                                             &lt;enumeration value="4"/&gt;
     *                                             &lt;enumeration value="5"/&gt;
     *                                             &lt;enumeration value="99"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="AnnenDiagnostikkLKSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="UtredningsmetodeFjernmet"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="SkjelettscintigrafiMet"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                                       &lt;pattern value="true|false"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="RtgThoraxMet"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                                       &lt;pattern value="true|false"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="RtgBekkenMet"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                                       &lt;pattern value="true|false"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="CTMet"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                                       &lt;pattern value="true|false"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="MRMet"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                                       &lt;pattern value="true|false"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="PETMet"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                                       &lt;pattern value="true|false"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="CytologiMet"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                                       &lt;pattern value="true|false"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="BiopsiMet"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                                       &lt;pattern value="true|false"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="AnnenDiagnostikkMet"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                                                       &lt;pattern value="true|false"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="AnnenDiagnostikkMetSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="UtredningsmetodeFjernmetUkjent"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                       &lt;enumeration value=""/&gt;
     *                                                       &lt;enumeration value="99"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
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
     *                   &lt;element name="OperasjonsdatoPrimaer"&gt;
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
     *                   &lt;element name="KirurgiskBehPrimaer"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TypeKirurgi"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value=""/&gt;
     *                                   &lt;enumeration value="6"/&gt;
     *                                   &lt;enumeration value="7"/&gt;
     *                                   &lt;enumeration value="2"/&gt;
     *                                   &lt;enumeration value="4"/&gt;
     *                                   &lt;enumeration value="5"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="TypeKirurgiSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="NervesparendeIntensjon"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value=""/&gt;
     *                                   &lt;enumeration value="0"/&gt;
     *                                   &lt;enumeration value="1"/&gt;
     *                                   &lt;enumeration value="2"/&gt;
     *                                   &lt;enumeration value="3"/&gt;
     *                                   &lt;enumeration value="4"/&gt;
     *                                   &lt;enumeration value="99"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="SamtidigLymfadenektomi"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value=""/&gt;
     *                                   &lt;enumeration value="0"/&gt;
     *                                   &lt;enumeration value="1"/&gt;
     *                                   &lt;enumeration value="2"/&gt;
     *                                   &lt;enumeration value="3"/&gt;
     *                                   &lt;enumeration value="4"/&gt;
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
        "kirurgiPrimaer"
    })
    public static class Kirurgi {

        @XmlElement(name = "KirurgiPrimaer", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true)
        protected Behandling.Kirurgi.KirurgiPrimaer kirurgiPrimaer;

        /**
         * Gets the value of the kirurgiPrimaer property.
         * 
         * @return
         *     possible object is
         *     {@link Behandling.Kirurgi.KirurgiPrimaer }
         *     
         */
        public Behandling.Kirurgi.KirurgiPrimaer getKirurgiPrimaer() {
            return kirurgiPrimaer;
        }

        /**
         * Sets the value of the kirurgiPrimaer property.
         * 
         * @param value
         *     allowed object is
         *     {@link Behandling.Kirurgi.KirurgiPrimaer }
         *     
         */
        public void setKirurgiPrimaer(Behandling.Kirurgi.KirurgiPrimaer value) {
            this.kirurgiPrimaer = value;
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
         *         &lt;element name="PreoperativInformasjon"&gt;
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
         *                   &lt;element name="PreoprPSAVerdi"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;pattern value="([1-9]\d{0,5}|\d,\d|[1-9]\d{1,5},\d)?"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="PreoprPSAVerdiUkjent"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value=""/&gt;
         *                         &lt;enumeration value="99"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="NeoadjuvantEndokrinBehandling"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value=""/&gt;
         *                         &lt;enumeration value="1"/&gt;
         *                         &lt;enumeration value="0"/&gt;
         *                         &lt;enumeration value="99"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="DatoOppstartNeoadjBeh"&gt;
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
         *                   &lt;element name="DatoOppstartNeoadjBehUkjent"&gt;
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
         *         &lt;element name="OperasjonsdatoPrimaer"&gt;
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
         *         &lt;element name="KirurgiskBehPrimaer"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TypeKirurgi"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value=""/&gt;
         *                         &lt;enumeration value="6"/&gt;
         *                         &lt;enumeration value="7"/&gt;
         *                         &lt;enumeration value="2"/&gt;
         *                         &lt;enumeration value="4"/&gt;
         *                         &lt;enumeration value="5"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="TypeKirurgiSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="NervesparendeIntensjon"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value=""/&gt;
         *                         &lt;enumeration value="0"/&gt;
         *                         &lt;enumeration value="1"/&gt;
         *                         &lt;enumeration value="2"/&gt;
         *                         &lt;enumeration value="3"/&gt;
         *                         &lt;enumeration value="4"/&gt;
         *                         &lt;enumeration value="99"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="SamtidigLymfadenektomi"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value=""/&gt;
         *                         &lt;enumeration value="0"/&gt;
         *                         &lt;enumeration value="1"/&gt;
         *                         &lt;enumeration value="2"/&gt;
         *                         &lt;enumeration value="3"/&gt;
         *                         &lt;enumeration value="4"/&gt;
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
            "preoperativInformasjon",
            "sykdomsutbredelse",
            "operasjonsdatoPrimaer",
            "kirurgiskBehPrimaer"
        })
        public static class KirurgiPrimaer {

            @XmlElement(name = "PreoperativInformasjon", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true)
            protected Behandling.Kirurgi.KirurgiPrimaer.PreoperativInformasjon preoperativInformasjon;
            @XmlElement(name = "Sykdomsutbredelse", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true)
            protected Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse sykdomsutbredelse;
            @XmlElement(name = "OperasjonsdatoPrimaer", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true)
            protected String operasjonsdatoPrimaer;
            @XmlElement(name = "KirurgiskBehPrimaer", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true)
            protected Behandling.Kirurgi.KirurgiPrimaer.KirurgiskBehPrimaer kirurgiskBehPrimaer;

            /**
             * Gets the value of the preoperativInformasjon property.
             * 
             * @return
             *     possible object is
             *     {@link Behandling.Kirurgi.KirurgiPrimaer.PreoperativInformasjon }
             *     
             */
            public Behandling.Kirurgi.KirurgiPrimaer.PreoperativInformasjon getPreoperativInformasjon() {
                return preoperativInformasjon;
            }

            /**
             * Sets the value of the preoperativInformasjon property.
             * 
             * @param value
             *     allowed object is
             *     {@link Behandling.Kirurgi.KirurgiPrimaer.PreoperativInformasjon }
             *     
             */
            public void setPreoperativInformasjon(Behandling.Kirurgi.KirurgiPrimaer.PreoperativInformasjon value) {
                this.preoperativInformasjon = value;
            }

            /**
             * Gets the value of the sykdomsutbredelse property.
             * 
             * @return
             *     possible object is
             *     {@link Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse }
             *     
             */
            public Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse getSykdomsutbredelse() {
                return sykdomsutbredelse;
            }

            /**
             * Sets the value of the sykdomsutbredelse property.
             * 
             * @param value
             *     allowed object is
             *     {@link Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse }
             *     
             */
            public void setSykdomsutbredelse(Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse value) {
                this.sykdomsutbredelse = value;
            }

            /**
             * Gets the value of the operasjonsdatoPrimaer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOperasjonsdatoPrimaer() {
                return operasjonsdatoPrimaer;
            }

            /**
             * Sets the value of the operasjonsdatoPrimaer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOperasjonsdatoPrimaer(String value) {
                this.operasjonsdatoPrimaer = value;
            }

            /**
             * Gets the value of the kirurgiskBehPrimaer property.
             * 
             * @return
             *     possible object is
             *     {@link Behandling.Kirurgi.KirurgiPrimaer.KirurgiskBehPrimaer }
             *     
             */
            public Behandling.Kirurgi.KirurgiPrimaer.KirurgiskBehPrimaer getKirurgiskBehPrimaer() {
                return kirurgiskBehPrimaer;
            }

            /**
             * Sets the value of the kirurgiskBehPrimaer property.
             * 
             * @param value
             *     allowed object is
             *     {@link Behandling.Kirurgi.KirurgiPrimaer.KirurgiskBehPrimaer }
             *     
             */
            public void setKirurgiskBehPrimaer(Behandling.Kirurgi.KirurgiPrimaer.KirurgiskBehPrimaer value) {
                this.kirurgiskBehPrimaer = value;
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
             *         &lt;element name="TypeKirurgi"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value=""/&gt;
             *               &lt;enumeration value="6"/&gt;
             *               &lt;enumeration value="7"/&gt;
             *               &lt;enumeration value="2"/&gt;
             *               &lt;enumeration value="4"/&gt;
             *               &lt;enumeration value="5"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="TypeKirurgiSpesifiser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="NervesparendeIntensjon"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value=""/&gt;
             *               &lt;enumeration value="0"/&gt;
             *               &lt;enumeration value="1"/&gt;
             *               &lt;enumeration value="2"/&gt;
             *               &lt;enumeration value="3"/&gt;
             *               &lt;enumeration value="4"/&gt;
             *               &lt;enumeration value="99"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="SamtidigLymfadenektomi"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value=""/&gt;
             *               &lt;enumeration value="0"/&gt;
             *               &lt;enumeration value="1"/&gt;
             *               &lt;enumeration value="2"/&gt;
             *               &lt;enumeration value="3"/&gt;
             *               &lt;enumeration value="4"/&gt;
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
                "typeKirurgi",
                "typeKirurgiSpesifiser",
                "nervesparendeIntensjon",
                "samtidigLymfadenektomi"
            })
            public static class KirurgiskBehPrimaer {

                @XmlElement(name = "TypeKirurgi", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                protected String typeKirurgi;
                @XmlElement(name = "TypeKirurgiSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                protected String typeKirurgiSpesifiser;
                @XmlElement(name = "NervesparendeIntensjon", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                protected String nervesparendeIntensjon;
                @XmlElement(name = "SamtidigLymfadenektomi", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                protected String samtidigLymfadenektomi;

                /**
                 * Gets the value of the typeKirurgi property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTypeKirurgi() {
                    return typeKirurgi;
                }

                /**
                 * Sets the value of the typeKirurgi property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTypeKirurgi(String value) {
                    this.typeKirurgi = value;
                }

                /**
                 * Gets the value of the typeKirurgiSpesifiser property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTypeKirurgiSpesifiser() {
                    return typeKirurgiSpesifiser;
                }

                /**
                 * Sets the value of the typeKirurgiSpesifiser property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTypeKirurgiSpesifiser(String value) {
                    this.typeKirurgiSpesifiser = value;
                }

                /**
                 * Gets the value of the nervesparendeIntensjon property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNervesparendeIntensjon() {
                    return nervesparendeIntensjon;
                }

                /**
                 * Sets the value of the nervesparendeIntensjon property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNervesparendeIntensjon(String value) {
                    this.nervesparendeIntensjon = value;
                }

                /**
                 * Gets the value of the samtidigLymfadenektomi property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSamtidigLymfadenektomi() {
                    return samtidigLymfadenektomi;
                }

                /**
                 * Sets the value of the samtidigLymfadenektomi property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSamtidigLymfadenektomi(String value) {
                    this.samtidigLymfadenektomi = value;
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
             *         &lt;element name="PreoprPSAVerdi"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;pattern value="([1-9]\d{0,5}|\d,\d|[1-9]\d{1,5},\d)?"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="PreoprPSAVerdiUkjent"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value=""/&gt;
             *               &lt;enumeration value="99"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="NeoadjuvantEndokrinBehandling"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value=""/&gt;
             *               &lt;enumeration value="1"/&gt;
             *               &lt;enumeration value="0"/&gt;
             *               &lt;enumeration value="99"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="DatoOppstartNeoadjBeh"&gt;
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
             *         &lt;element name="DatoOppstartNeoadjBehUkjent"&gt;
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
                "preoprPSAVerdi",
                "preoprPSAVerdiUkjent",
                "neoadjuvantEndokrinBehandling",
                "datoOppstartNeoadjBeh",
                "datoOppstartNeoadjBehUkjent"
            })
            public static class PreoperativInformasjon {

                @XmlElement(name = "AktivMonitorering", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                protected String aktivMonitorering;
                @XmlElement(name = "RevurderingSykdomsutrbredelse", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                protected String revurderingSykdomsutrbredelse;
                @XmlElement(name = "PreoprPSAVerdi", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                protected String preoprPSAVerdi;
                @XmlElement(name = "PreoprPSAVerdiUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                protected String preoprPSAVerdiUkjent;
                @XmlElement(name = "NeoadjuvantEndokrinBehandling", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                protected String neoadjuvantEndokrinBehandling;
                @XmlElement(name = "DatoOppstartNeoadjBeh", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true)
                protected String datoOppstartNeoadjBeh;
                @XmlElement(name = "DatoOppstartNeoadjBehUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                protected String datoOppstartNeoadjBehUkjent;

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
                 * Gets the value of the preoprPSAVerdi property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPreoprPSAVerdi() {
                    return preoprPSAVerdi;
                }

                /**
                 * Sets the value of the preoprPSAVerdi property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPreoprPSAVerdi(String value) {
                    this.preoprPSAVerdi = value;
                }

                /**
                 * Gets the value of the preoprPSAVerdiUkjent property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPreoprPSAVerdiUkjent() {
                    return preoprPSAVerdiUkjent;
                }

                /**
                 * Sets the value of the preoprPSAVerdiUkjent property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPreoprPSAVerdiUkjent(String value) {
                    this.preoprPSAVerdiUkjent = value;
                }

                /**
                 * Gets the value of the neoadjuvantEndokrinBehandling property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNeoadjuvantEndokrinBehandling() {
                    return neoadjuvantEndokrinBehandling;
                }

                /**
                 * Sets the value of the neoadjuvantEndokrinBehandling property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNeoadjuvantEndokrinBehandling(String value) {
                    this.neoadjuvantEndokrinBehandling = value;
                }

                /**
                 * Gets the value of the datoOppstartNeoadjBeh property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatoOppstartNeoadjBeh() {
                    return datoOppstartNeoadjBeh;
                }

                /**
                 * Sets the value of the datoOppstartNeoadjBeh property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatoOppstartNeoadjBeh(String value) {
                    this.datoOppstartNeoadjBeh = value;
                }

                /**
                 * Gets the value of the datoOppstartNeoadjBehUkjent property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatoOppstartNeoadjBehUkjent() {
                    return datoOppstartNeoadjBehUkjent;
                }

                /**
                 * Sets the value of the datoOppstartNeoadjBehUkjent property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatoOppstartNeoadjBehUkjent(String value) {
                    this.datoOppstartNeoadjBehUkjent = value;
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

                @XmlElement(name = "Tumor", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true)
                protected Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.Tumor tumor;
                @XmlElement(name = "RegionaleLK", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true)
                protected Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.RegionaleLK regionaleLK;
                @XmlElement(name = "Fjernmetastaser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true)
                protected Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.Fjernmetastaser fjernmetastaser;
                @XmlElement(name = "UtredningsmetodeMetastaser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true)
                protected Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.UtredningsmetodeMetastaser utredningsmetodeMetastaser;

                /**
                 * Gets the value of the tumor property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.Tumor }
                 *     
                 */
                public Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.Tumor getTumor() {
                    return tumor;
                }

                /**
                 * Sets the value of the tumor property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.Tumor }
                 *     
                 */
                public void setTumor(Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.Tumor value) {
                    this.tumor = value;
                }

                /**
                 * Gets the value of the regionaleLK property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.RegionaleLK }
                 *     
                 */
                public Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.RegionaleLK getRegionaleLK() {
                    return regionaleLK;
                }

                /**
                 * Sets the value of the regionaleLK property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.RegionaleLK }
                 *     
                 */
                public void setRegionaleLK(Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.RegionaleLK value) {
                    this.regionaleLK = value;
                }

                /**
                 * Gets the value of the fjernmetastaser property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.Fjernmetastaser }
                 *     
                 */
                public Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.Fjernmetastaser getFjernmetastaser() {
                    return fjernmetastaser;
                }

                /**
                 * Sets the value of the fjernmetastaser property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.Fjernmetastaser }
                 *     
                 */
                public void setFjernmetastaser(Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.Fjernmetastaser value) {
                    this.fjernmetastaser = value;
                }

                /**
                 * Gets the value of the utredningsmetodeMetastaser property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.UtredningsmetodeMetastaser }
                 *     
                 */
                public Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.UtredningsmetodeMetastaser getUtredningsmetodeMetastaser() {
                    return utredningsmetodeMetastaser;
                }

                /**
                 * Sets the value of the utredningsmetodeMetastaser property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.UtredningsmetodeMetastaser }
                 *     
                 */
                public void setUtredningsmetodeMetastaser(Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.UtredningsmetodeMetastaser value) {
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

                    @XmlElement(name = "FjernmetPaavist", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                    protected String fjernmetPaavist;
                    @XmlElement(name = "LokalisasjonFjernmet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true)
                    protected Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.Fjernmetastaser.LokalisasjonFjernmet lokalisasjonFjernmet;

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
                     *     {@link Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.Fjernmetastaser.LokalisasjonFjernmet }
                     *     
                     */
                    public Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.Fjernmetastaser.LokalisasjonFjernmet getLokalisasjonFjernmet() {
                        return lokalisasjonFjernmet;
                    }

                    /**
                     * Sets the value of the lokalisasjonFjernmet property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.Fjernmetastaser.LokalisasjonFjernmet }
                     *     
                     */
                    public void setLokalisasjonFjernmet(Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.Fjernmetastaser.LokalisasjonFjernmet value) {
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

                        @XmlElement(name = "FjerneLKmet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0")
                        protected boolean fjerneLKmet;
                        @XmlElement(name = "Skjelettmet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0")
                        protected boolean skjelettmet;
                        @XmlElement(name = "AnnetFjernmet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0")
                        protected boolean annetFjernmet;
                        @XmlElement(name = "AnnetFjernmetSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
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

                    @XmlElement(name = "RegionaleLKPaavist", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
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

                    @XmlElement(name = "PalpatoriskTumorHoyre", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                    protected String palpatoriskTumorHoyre;
                    @XmlElement(name = "PalpatoriskTumorVenstre", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                    protected String palpatoriskTumorVenstre;
                    @XmlElement(name = "SamletPalpatoriskTumor", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                    protected String samletPalpatoriskTumor;
                    @XmlElement(name = "MRDiagnostikk", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                    protected String mrDiagnostikk;
                    @XmlElement(name = "DatoMRDiagnostikk", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true)
                    protected String datoMRDiagnostikk;
                    @XmlElement(name = "DatoMRDiagnostikkUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                    protected String datoMRDiagnostikkUkjent;
                    @XmlElement(name = "PIRADSHoyre", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                    protected String piradsHoyre;
                    @XmlElement(name = "PIRADSVenstre", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                    protected String piradsVenstre;
                    @XmlElement(name = "MRBasertKliniskTHoyre", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                    protected String mrBasertKliniskTHoyre;
                    @XmlElement(name = "MRBasertKliniskTVenstre", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                    protected String mrBasertKliniskTVenstre;
                    @XmlElement(name = "SamletMRBasertKliniskT", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                    protected String samletMRBasertKliniskT;
                    @XmlElement(name = "TotalVurderingKliniskT", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                    protected String totalVurderingKliniskT;
                    @XmlElement(name = "KliniskVurdertAv", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
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

                    @XmlElement(name = "UtredningsmetodeLK", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                    protected String utredningsmetodeLK;
                    @XmlElement(name = "AnnenDiagnostikkLKSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                    protected String annenDiagnostikkLKSpesifiser;
                    @XmlElement(name = "UtredningsmetodeFjernmet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true)
                    protected Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.UtredningsmetodeMetastaser.UtredningsmetodeFjernmet utredningsmetodeFjernmet;

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
                     *     {@link Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.UtredningsmetodeMetastaser.UtredningsmetodeFjernmet }
                     *     
                     */
                    public Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.UtredningsmetodeMetastaser.UtredningsmetodeFjernmet getUtredningsmetodeFjernmet() {
                        return utredningsmetodeFjernmet;
                    }

                    /**
                     * Sets the value of the utredningsmetodeFjernmet property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.UtredningsmetodeMetastaser.UtredningsmetodeFjernmet }
                     *     
                     */
                    public void setUtredningsmetodeFjernmet(Behandling.Kirurgi.KirurgiPrimaer.Sykdomsutbredelse.UtredningsmetodeMetastaser.UtredningsmetodeFjernmet value) {
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

                        @XmlElement(name = "SkjelettscintigrafiMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0")
                        protected boolean skjelettscintigrafiMet;
                        @XmlElement(name = "RtgThoraxMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0")
                        protected boolean rtgThoraxMet;
                        @XmlElement(name = "RtgBekkenMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0")
                        protected boolean rtgBekkenMet;
                        @XmlElement(name = "CTMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0")
                        protected boolean ctMet;
                        @XmlElement(name = "MRMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0")
                        protected boolean mrMet;
                        @XmlElement(name = "PETMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0")
                        protected boolean petMet;
                        @XmlElement(name = "CytologiMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0")
                        protected boolean cytologiMet;
                        @XmlElement(name = "BiopsiMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0")
                        protected boolean biopsiMet;
                        @XmlElement(name = "AnnenDiagnostikkMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0")
                        protected boolean annenDiagnostikkMet;
                        @XmlElement(name = "AnnenDiagnostikkMetSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
                        protected String annenDiagnostikkMetSpesifiser;
                        @XmlElement(name = "UtredningsmetodeFjernmetUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataKirurgi/v4_0", required = true, defaultValue = "")
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

    }

}
