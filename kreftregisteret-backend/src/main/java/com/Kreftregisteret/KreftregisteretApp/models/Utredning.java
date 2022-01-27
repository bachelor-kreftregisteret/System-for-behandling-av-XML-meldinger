
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
 *         &lt;element name="FunnUtredning"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value=""/&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *               &lt;enumeration value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Diagnosedato"&gt;
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
 *         &lt;element name="Sykehistorie"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Vannlatingsproblem"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                         &lt;enumeration value="99"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Kreftsymptomer"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                         &lt;enumeration value="99"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WHOStatus"&gt;
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
 *                   &lt;element name="Prostatavolum"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="([1-9]|[1-9]\d{1,2})?"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ProstatavolumUkjent"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="99"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SPSA"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PSAVerdi"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;pattern value="([1-9]\d{0,5}|\d,\d|[1-9]\d{1,5},\d)?"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PSAVerdiIkkeTatt"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                   &lt;pattern value="true|false"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PSAVerdiUkjent"&gt;
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
 *         &lt;element name="DiagnostiskeUS"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BildediagnostikkUS"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
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
 *                             &lt;element name="MRDiagnostikk"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value=""/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="0"/&gt;
 *                                 &lt;/restriction&gt;
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
 *                             &lt;element name="AnnetBildediagnostikk"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value=""/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AnnetBildediagnostikkSpesifiser2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Vevsprover"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value=""/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="VevsproverUS"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BiopsiVevsprover"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                   &lt;pattern value="true|false"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="TURPVevsprover"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                   &lt;pattern value="true|false"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AnnetVevsprover"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *                                   &lt;pattern value="true|false"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AnnetVevsproverSpesifiser2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="DatoMetastaser"&gt;
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
 *         &lt;element name="KliniskTNM"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="cT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="cN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="cM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "funnUtredning",
    "diagnosedato",
    "sykehistorie",
    "diagnostiskeUS",
    "datoMetastaser",
    "sykdomsutbredelse",
    "kliniskTNM"
})
@XmlRootElement(name = "Utredning", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
public class Utredning {

    @XmlElement(name = "FunnUtredning", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
    protected String funnUtredning;
    @XmlElement(name = "Diagnosedato", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
    protected String diagnosedato;
    @XmlElement(name = "Sykehistorie", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
    protected Utredning.Sykehistorie sykehistorie;
    @XmlElement(name = "DiagnostiskeUS", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
    protected Utredning.DiagnostiskeUS diagnostiskeUS;
    @XmlElement(name = "DatoMetastaser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
    protected String datoMetastaser;
    @XmlElement(name = "Sykdomsutbredelse", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
    protected Utredning.Sykdomsutbredelse sykdomsutbredelse;
    @XmlElement(name = "KliniskTNM", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
    protected Utredning.KliniskTNM kliniskTNM;

    /**
     * Gets the value of the funnUtredning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunnUtredning() {
        return funnUtredning;
    }

    /**
     * Sets the value of the funnUtredning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunnUtredning(String value) {
        this.funnUtredning = value;
    }

    /**
     * Gets the value of the diagnosedato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosedato() {
        return diagnosedato;
    }

    /**
     * Sets the value of the diagnosedato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosedato(String value) {
        this.diagnosedato = value;
    }

    /**
     * Gets the value of the sykehistorie property.
     * 
     * @return
     *     possible object is
     *     {@link Utredning.Sykehistorie }
     *     
     */
    public Utredning.Sykehistorie getSykehistorie() {
        return sykehistorie;
    }

    /**
     * Sets the value of the sykehistorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Utredning.Sykehistorie }
     *     
     */
    public void setSykehistorie(Utredning.Sykehistorie value) {
        this.sykehistorie = value;
    }

    /**
     * Gets the value of the diagnostiskeUS property.
     * 
     * @return
     *     possible object is
     *     {@link Utredning.DiagnostiskeUS }
     *     
     */
    public Utredning.DiagnostiskeUS getDiagnostiskeUS() {
        return diagnostiskeUS;
    }

    /**
     * Sets the value of the diagnostiskeUS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Utredning.DiagnostiskeUS }
     *     
     */
    public void setDiagnostiskeUS(Utredning.DiagnostiskeUS value) {
        this.diagnostiskeUS = value;
    }

    /**
     * Gets the value of the datoMetastaser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoMetastaser() {
        return datoMetastaser;
    }

    /**
     * Sets the value of the datoMetastaser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoMetastaser(String value) {
        this.datoMetastaser = value;
    }

    /**
     * Gets the value of the sykdomsutbredelse property.
     * 
     * @return
     *     possible object is
     *     {@link Utredning.Sykdomsutbredelse }
     *     
     */
    public Utredning.Sykdomsutbredelse getSykdomsutbredelse() {
        return sykdomsutbredelse;
    }

    /**
     * Sets the value of the sykdomsutbredelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Utredning.Sykdomsutbredelse }
     *     
     */
    public void setSykdomsutbredelse(Utredning.Sykdomsutbredelse value) {
        this.sykdomsutbredelse = value;
    }

    /**
     * Gets the value of the kliniskTNM property.
     * 
     * @return
     *     possible object is
     *     {@link Utredning.KliniskTNM }
     *     
     */
    public Utredning.KliniskTNM getKliniskTNM() {
        return kliniskTNM;
    }

    /**
     * Sets the value of the kliniskTNM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Utredning.KliniskTNM }
     *     
     */
    public void setKliniskTNM(Utredning.KliniskTNM value) {
        this.kliniskTNM = value;
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
     *         &lt;element name="BildediagnostikkUS"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
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
     *                   &lt;element name="MRDiagnostikk"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value=""/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="0"/&gt;
     *                       &lt;/restriction&gt;
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
     *                   &lt;element name="AnnetBildediagnostikk"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value=""/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AnnetBildediagnostikkSpesifiser2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Vevsprover"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="VevsproverUS"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BiopsiVevsprover"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                         &lt;pattern value="true|false"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="TURPVevsprover"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                         &lt;pattern value="true|false"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AnnetVevsprover"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                         &lt;pattern value="true|false"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AnnetVevsproverSpesifiser2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "bildediagnostikkUS",
        "vevsprover",
        "vevsproverUS"
    })
    public static class DiagnostiskeUS {

        @XmlElement(name = "BildediagnostikkUS", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
        protected Utredning.DiagnostiskeUS.BildediagnostikkUS bildediagnostikkUS;
        @XmlElement(name = "Vevsprover", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String vevsprover;
        @XmlElement(name = "VevsproverUS", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
        protected Utredning.DiagnostiskeUS.VevsproverUS vevsproverUS;

        /**
         * Gets the value of the bildediagnostikkUS property.
         * 
         * @return
         *     possible object is
         *     {@link Utredning.DiagnostiskeUS.BildediagnostikkUS }
         *     
         */
        public Utredning.DiagnostiskeUS.BildediagnostikkUS getBildediagnostikkUS() {
            return bildediagnostikkUS;
        }

        /**
         * Sets the value of the bildediagnostikkUS property.
         * 
         * @param value
         *     allowed object is
         *     {@link Utredning.DiagnostiskeUS.BildediagnostikkUS }
         *     
         */
        public void setBildediagnostikkUS(Utredning.DiagnostiskeUS.BildediagnostikkUS value) {
            this.bildediagnostikkUS = value;
        }

        /**
         * Gets the value of the vevsprover property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVevsprover() {
            return vevsprover;
        }

        /**
         * Sets the value of the vevsprover property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVevsprover(String value) {
            this.vevsprover = value;
        }

        /**
         * Gets the value of the vevsproverUS property.
         * 
         * @return
         *     possible object is
         *     {@link Utredning.DiagnostiskeUS.VevsproverUS }
         *     
         */
        public Utredning.DiagnostiskeUS.VevsproverUS getVevsproverUS() {
            return vevsproverUS;
        }

        /**
         * Sets the value of the vevsproverUS property.
         * 
         * @param value
         *     allowed object is
         *     {@link Utredning.DiagnostiskeUS.VevsproverUS }
         *     
         */
        public void setVevsproverUS(Utredning.DiagnostiskeUS.VevsproverUS value) {
            this.vevsproverUS = value;
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
         *         &lt;element name="MRDiagnostikk"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="0"/&gt;
         *             &lt;/restriction&gt;
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
         *         &lt;element name="AnnetBildediagnostikk"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value=""/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AnnetBildediagnostikkSpesifiser2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "datoMRDiagnostikk",
            "mrDiagnostikk",
            "datoMRDiagnostikkUkjent",
            "annetBildediagnostikk",
            "annetBildediagnostikkSpesifiser2"
        })
        public static class BildediagnostikkUS {

            @XmlElement(name = "DatoMRDiagnostikk", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
            protected String datoMRDiagnostikk;
            @XmlElement(name = "MRDiagnostikk", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String mrDiagnostikk;
            @XmlElement(name = "DatoMRDiagnostikkUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String datoMRDiagnostikkUkjent;
            @XmlElement(name = "AnnetBildediagnostikk", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String annetBildediagnostikk;
            @XmlElement(name = "AnnetBildediagnostikkSpesifiser2", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String annetBildediagnostikkSpesifiser2;

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
             * Gets the value of the annetBildediagnostikk property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnnetBildediagnostikk() {
                return annetBildediagnostikk;
            }

            /**
             * Sets the value of the annetBildediagnostikk property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAnnetBildediagnostikk(String value) {
                this.annetBildediagnostikk = value;
            }

            /**
             * Gets the value of the annetBildediagnostikkSpesifiser2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnnetBildediagnostikkSpesifiser2() {
                return annetBildediagnostikkSpesifiser2;
            }

            /**
             * Sets the value of the annetBildediagnostikkSpesifiser2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAnnetBildediagnostikkSpesifiser2(String value) {
                this.annetBildediagnostikkSpesifiser2 = value;
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
         *         &lt;element name="BiopsiVevsprover"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
         *               &lt;pattern value="true|false"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TURPVevsprover"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
         *               &lt;pattern value="true|false"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AnnetVevsprover"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
         *               &lt;pattern value="true|false"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AnnetVevsproverSpesifiser2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "biopsiVevsprover",
            "turpVevsprover",
            "annetVevsprover",
            "annetVevsproverSpesifiser2"
        })
        public static class VevsproverUS {

            @XmlElement(name = "BiopsiVevsprover", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
            protected boolean biopsiVevsprover;
            @XmlElement(name = "TURPVevsprover", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
            protected boolean turpVevsprover;
            @XmlElement(name = "AnnetVevsprover", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
            protected boolean annetVevsprover;
            @XmlElement(name = "AnnetVevsproverSpesifiser2", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String annetVevsproverSpesifiser2;

            /**
             * Gets the value of the biopsiVevsprover property.
             * 
             */
            public boolean isBiopsiVevsprover() {
                return biopsiVevsprover;
            }

            /**
             * Sets the value of the biopsiVevsprover property.
             * 
             */
            public void setBiopsiVevsprover(boolean value) {
                this.biopsiVevsprover = value;
            }

            /**
             * Gets the value of the turpVevsprover property.
             * 
             */
            public boolean isTURPVevsprover() {
                return turpVevsprover;
            }

            /**
             * Sets the value of the turpVevsprover property.
             * 
             */
            public void setTURPVevsprover(boolean value) {
                this.turpVevsprover = value;
            }

            /**
             * Gets the value of the annetVevsprover property.
             * 
             */
            public boolean isAnnetVevsprover() {
                return annetVevsprover;
            }

            /**
             * Sets the value of the annetVevsprover property.
             * 
             */
            public void setAnnetVevsprover(boolean value) {
                this.annetVevsprover = value;
            }

            /**
             * Gets the value of the annetVevsproverSpesifiser2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnnetVevsproverSpesifiser2() {
                return annetVevsproverSpesifiser2;
            }

            /**
             * Sets the value of the annetVevsproverSpesifiser2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAnnetVevsproverSpesifiser2(String value) {
                this.annetVevsproverSpesifiser2 = value;
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
     *         &lt;element name="cT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="cN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="cM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "ct",
        "cn",
        "cm"
    })
    public static class KliniskTNM {

        @XmlElement(name = "cT", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String ct;
        @XmlElement(name = "cN", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String cn;
        @XmlElement(name = "cM", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String cm;

        /**
         * Gets the value of the ct property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCT() {
            return ct;
        }

        /**
         * Sets the value of the ct property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCT(String value) {
            this.ct = value;
        }

        /**
         * Gets the value of the cn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCN() {
            return cn;
        }

        /**
         * Sets the value of the cn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCN(String value) {
            this.cn = value;
        }

        /**
         * Gets the value of the cm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCM() {
            return cm;
        }

        /**
         * Sets the value of the cm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCM(String value) {
            this.cm = value;
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

        @XmlElement(name = "Tumor", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
        protected Utredning.Sykdomsutbredelse.Tumor tumor;
        @XmlElement(name = "RegionaleLK", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
        protected Utredning.Sykdomsutbredelse.RegionaleLK regionaleLK;
        @XmlElement(name = "Fjernmetastaser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
        protected Utredning.Sykdomsutbredelse.Fjernmetastaser fjernmetastaser;
        @XmlElement(name = "UtredningsmetodeMetastaser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
        protected Utredning.Sykdomsutbredelse.UtredningsmetodeMetastaser utredningsmetodeMetastaser;

        /**
         * Gets the value of the tumor property.
         * 
         * @return
         *     possible object is
         *     {@link Utredning.Sykdomsutbredelse.Tumor }
         *     
         */
        public Utredning.Sykdomsutbredelse.Tumor getTumor() {
            return tumor;
        }

        /**
         * Sets the value of the tumor property.
         * 
         * @param value
         *     allowed object is
         *     {@link Utredning.Sykdomsutbredelse.Tumor }
         *     
         */
        public void setTumor(Utredning.Sykdomsutbredelse.Tumor value) {
            this.tumor = value;
        }

        /**
         * Gets the value of the regionaleLK property.
         * 
         * @return
         *     possible object is
         *     {@link Utredning.Sykdomsutbredelse.RegionaleLK }
         *     
         */
        public Utredning.Sykdomsutbredelse.RegionaleLK getRegionaleLK() {
            return regionaleLK;
        }

        /**
         * Sets the value of the regionaleLK property.
         * 
         * @param value
         *     allowed object is
         *     {@link Utredning.Sykdomsutbredelse.RegionaleLK }
         *     
         */
        public void setRegionaleLK(Utredning.Sykdomsutbredelse.RegionaleLK value) {
            this.regionaleLK = value;
        }

        /**
         * Gets the value of the fjernmetastaser property.
         * 
         * @return
         *     possible object is
         *     {@link Utredning.Sykdomsutbredelse.Fjernmetastaser }
         *     
         */
        public Utredning.Sykdomsutbredelse.Fjernmetastaser getFjernmetastaser() {
            return fjernmetastaser;
        }

        /**
         * Sets the value of the fjernmetastaser property.
         * 
         * @param value
         *     allowed object is
         *     {@link Utredning.Sykdomsutbredelse.Fjernmetastaser }
         *     
         */
        public void setFjernmetastaser(Utredning.Sykdomsutbredelse.Fjernmetastaser value) {
            this.fjernmetastaser = value;
        }

        /**
         * Gets the value of the utredningsmetodeMetastaser property.
         * 
         * @return
         *     possible object is
         *     {@link Utredning.Sykdomsutbredelse.UtredningsmetodeMetastaser }
         *     
         */
        public Utredning.Sykdomsutbredelse.UtredningsmetodeMetastaser getUtredningsmetodeMetastaser() {
            return utredningsmetodeMetastaser;
        }

        /**
         * Sets the value of the utredningsmetodeMetastaser property.
         * 
         * @param value
         *     allowed object is
         *     {@link Utredning.Sykdomsutbredelse.UtredningsmetodeMetastaser }
         *     
         */
        public void setUtredningsmetodeMetastaser(Utredning.Sykdomsutbredelse.UtredningsmetodeMetastaser value) {
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

            @XmlElement(name = "FjernmetPaavist", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String fjernmetPaavist;
            @XmlElement(name = "LokalisasjonFjernmet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
            protected Utredning.Sykdomsutbredelse.Fjernmetastaser.LokalisasjonFjernmet lokalisasjonFjernmet;

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
             *     {@link Utredning.Sykdomsutbredelse.Fjernmetastaser.LokalisasjonFjernmet }
             *     
             */
            public Utredning.Sykdomsutbredelse.Fjernmetastaser.LokalisasjonFjernmet getLokalisasjonFjernmet() {
                return lokalisasjonFjernmet;
            }

            /**
             * Sets the value of the lokalisasjonFjernmet property.
             * 
             * @param value
             *     allowed object is
             *     {@link Utredning.Sykdomsutbredelse.Fjernmetastaser.LokalisasjonFjernmet }
             *     
             */
            public void setLokalisasjonFjernmet(Utredning.Sykdomsutbredelse.Fjernmetastaser.LokalisasjonFjernmet value) {
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

                @XmlElement(name = "FjerneLKmet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
                protected boolean fjerneLKmet;
                @XmlElement(name = "Skjelettmet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
                protected boolean skjelettmet;
                @XmlElement(name = "AnnetFjernmet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
                protected boolean annetFjernmet;
                @XmlElement(name = "AnnetFjernmetSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
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

            @XmlElement(name = "RegionaleLKPaavist", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
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
            "piradsHoyre",
            "piradsVenstre",
            "mrBasertKliniskTHoyre",
            "mrBasertKliniskTVenstre",
            "samletMRBasertKliniskT",
            "totalVurderingKliniskT",
            "kliniskVurdertAv"
        })
        public static class Tumor {

            @XmlElement(name = "PalpatoriskTumorHoyre", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String palpatoriskTumorHoyre;
            @XmlElement(name = "PalpatoriskTumorVenstre", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String palpatoriskTumorVenstre;
            @XmlElement(name = "SamletPalpatoriskTumor", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String samletPalpatoriskTumor;
            @XmlElement(name = "PIRADSHoyre", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String piradsHoyre;
            @XmlElement(name = "PIRADSVenstre", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String piradsVenstre;
            @XmlElement(name = "MRBasertKliniskTHoyre", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String mrBasertKliniskTHoyre;
            @XmlElement(name = "MRBasertKliniskTVenstre", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String mrBasertKliniskTVenstre;
            @XmlElement(name = "SamletMRBasertKliniskT", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String samletMRBasertKliniskT;
            @XmlElement(name = "TotalVurderingKliniskT", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String totalVurderingKliniskT;
            @XmlElement(name = "KliniskVurdertAv", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
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

            @XmlElement(name = "UtredningsmetodeLK", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String utredningsmetodeLK;
            @XmlElement(name = "AnnenDiagnostikkLKSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String annenDiagnostikkLKSpesifiser;
            @XmlElement(name = "UtredningsmetodeFjernmet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
            protected Utredning.Sykdomsutbredelse.UtredningsmetodeMetastaser.UtredningsmetodeFjernmet utredningsmetodeFjernmet;

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
             *     {@link Utredning.Sykdomsutbredelse.UtredningsmetodeMetastaser.UtredningsmetodeFjernmet }
             *     
             */
            public Utredning.Sykdomsutbredelse.UtredningsmetodeMetastaser.UtredningsmetodeFjernmet getUtredningsmetodeFjernmet() {
                return utredningsmetodeFjernmet;
            }

            /**
             * Sets the value of the utredningsmetodeFjernmet property.
             * 
             * @param value
             *     allowed object is
             *     {@link Utredning.Sykdomsutbredelse.UtredningsmetodeMetastaser.UtredningsmetodeFjernmet }
             *     
             */
            public void setUtredningsmetodeFjernmet(Utredning.Sykdomsutbredelse.UtredningsmetodeMetastaser.UtredningsmetodeFjernmet value) {
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

                @XmlElement(name = "SkjelettscintigrafiMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
                protected boolean skjelettscintigrafiMet;
                @XmlElement(name = "RtgThoraxMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
                protected boolean rtgThoraxMet;
                @XmlElement(name = "RtgBekkenMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
                protected boolean rtgBekkenMet;
                @XmlElement(name = "CTMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
                protected boolean ctMet;
                @XmlElement(name = "MRMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
                protected boolean mrMet;
                @XmlElement(name = "PETMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
                protected boolean petMet;
                @XmlElement(name = "CytologiMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
                protected boolean cytologiMet;
                @XmlElement(name = "BiopsiMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
                protected boolean biopsiMet;
                @XmlElement(name = "AnnenDiagnostikkMet", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
                protected boolean annenDiagnostikkMet;
                @XmlElement(name = "AnnenDiagnostikkMetSpesifiser", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
                protected String annenDiagnostikkMetSpesifiser;
                @XmlElement(name = "UtredningsmetodeFjernmetUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
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
     *         &lt;element name="Vannlatingsproblem"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="0"/&gt;
     *               &lt;enumeration value="99"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Kreftsymptomer"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="0"/&gt;
     *               &lt;enumeration value="99"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="WHOStatus"&gt;
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
     *         &lt;element name="Prostatavolum"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="([1-9]|[1-9]\d{1,2})?"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ProstatavolumUkjent"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value=""/&gt;
     *               &lt;enumeration value="99"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SPSA"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PSAVerdi"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;pattern value="([1-9]\d{0,5}|\d,\d|[1-9]\d{1,5},\d)?"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PSAVerdiIkkeTatt"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
     *                         &lt;pattern value="true|false"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="PSAVerdiUkjent"&gt;
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
        "vannlatingsproblem",
        "kreftsymptomer",
        "whoStatus",
        "prostatavolum",
        "prostatavolumUkjent",
        "spsa"
    })
    public static class Sykehistorie {

        @XmlElement(name = "Vannlatingsproblem", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String vannlatingsproblem;
        @XmlElement(name = "Kreftsymptomer", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String kreftsymptomer;
        @XmlElement(name = "WHOStatus", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String whoStatus;
        @XmlElement(name = "Prostatavolum", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String prostatavolum;
        @XmlElement(name = "ProstatavolumUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
        protected String prostatavolumUkjent;
        @XmlElement(name = "SPSA", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true)
        protected Utredning.Sykehistorie.SPSA spsa;

        /**
         * Gets the value of the vannlatingsproblem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVannlatingsproblem() {
            return vannlatingsproblem;
        }

        /**
         * Sets the value of the vannlatingsproblem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVannlatingsproblem(String value) {
            this.vannlatingsproblem = value;
        }

        /**
         * Gets the value of the kreftsymptomer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKreftsymptomer() {
            return kreftsymptomer;
        }

        /**
         * Sets the value of the kreftsymptomer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKreftsymptomer(String value) {
            this.kreftsymptomer = value;
        }

        /**
         * Gets the value of the whoStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWHOStatus() {
            return whoStatus;
        }

        /**
         * Sets the value of the whoStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWHOStatus(String value) {
            this.whoStatus = value;
        }

        /**
         * Gets the value of the prostatavolum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProstatavolum() {
            return prostatavolum;
        }

        /**
         * Sets the value of the prostatavolum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProstatavolum(String value) {
            this.prostatavolum = value;
        }

        /**
         * Gets the value of the prostatavolumUkjent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProstatavolumUkjent() {
            return prostatavolumUkjent;
        }

        /**
         * Sets the value of the prostatavolumUkjent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProstatavolumUkjent(String value) {
            this.prostatavolumUkjent = value;
        }

        /**
         * Gets the value of the spsa property.
         * 
         * @return
         *     possible object is
         *     {@link Utredning.Sykehistorie.SPSA }
         *     
         */
        public Utredning.Sykehistorie.SPSA getSPSA() {
            return spsa;
        }

        /**
         * Sets the value of the spsa property.
         * 
         * @param value
         *     allowed object is
         *     {@link Utredning.Sykehistorie.SPSA }
         *     
         */
        public void setSPSA(Utredning.Sykehistorie.SPSA value) {
            this.spsa = value;
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
         *         &lt;element name="PSAVerdi"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;pattern value="([1-9]\d{0,5}|\d,\d|[1-9]\d{1,5},\d)?"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PSAVerdiIkkeTatt"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
         *               &lt;pattern value="true|false"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="PSAVerdiUkjent"&gt;
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
            "psaVerdi",
            "psaVerdiIkkeTatt",
            "psaVerdiUkjent"
        })
        public static class SPSA {

            @XmlElement(name = "PSAVerdi", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String psaVerdi;
            @XmlElement(name = "PSAVerdiIkkeTatt", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0")
            protected boolean psaVerdiIkkeTatt;
            @XmlElement(name = "PSAVerdiUkjent", namespace = "http://www.kreftregisteret.no/kremt/KliniskProstataUtredning/v4_0", required = true, defaultValue = "")
            protected String psaVerdiUkjent;

            /**
             * Gets the value of the psaVerdi property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPSAVerdi() {
                return psaVerdi;
            }

            /**
             * Sets the value of the psaVerdi property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPSAVerdi(String value) {
                this.psaVerdi = value;
            }

            /**
             * Gets the value of the psaVerdiIkkeTatt property.
             * 
             */
            public boolean isPSAVerdiIkkeTatt() {
                return psaVerdiIkkeTatt;
            }

            /**
             * Sets the value of the psaVerdiIkkeTatt property.
             * 
             */
            public void setPSAVerdiIkkeTatt(boolean value) {
                this.psaVerdiIkkeTatt = value;
            }

            /**
             * Gets the value of the psaVerdiUkjent property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPSAVerdiUkjent() {
                return psaVerdiUkjent;
            }

            /**
             * Sets the value of the psaVerdiUkjent property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPSAVerdiUkjent(String value) {
                this.psaVerdiUkjent = value;
            }

        }

    }

}
