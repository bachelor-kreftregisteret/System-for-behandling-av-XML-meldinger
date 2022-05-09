const SurveyJsonUtredning = {
    name: "KliniskProstataUtredning",
    locale: "no",
    title: "Melding etter avsluttet utredning",
    pages: [
        {
            name: "pasientInstitusjon",
            elements: [
                {
                    type: "text",
                    name: "fodselsnummerHF",
                    maxWidth: "400px",
                    title: {
                        no: "Fødselsnummer"
                    },
                    enableIf: "{fodselnummerUtland} empty",
                    isRequired: true,
                    requiredIf: "{fodselnummerUtland} empty",
                    requiredErrorText: {
                        no: "Skriv inn gyldig fødselsnummer "
                    },
                    validators: [
                        {
                            type: "regex",
                            text: "Skriv inn gyldig fødselsnummer ",
                            regex: "^((0[1-9]|[1-2]\\d|3[0-1])(0[1-9]|1[0-2])\\d{7})$"
                        }
                    ]
                },
                {
                    type: "checkbox",
                    name: "fodselnummerUtland",
                    maxWidth: "200px",
                    minWidth: "200px",
                    startWithNewLine: false,
                    titleLocation: "hidden",
                    choices: [
                        {
                            value: "true",
                            text: {
                                no: "Ikke norsk personnummer"
                            }
                        }
                    ]
                },
                {
                    type: "text",
                    name: "navnPasient",
                    maxWidth: "471px",
                    title: {
                        no: "Navn"
                    },
                    isRequired: true,
                    requiredErrorText: {
                        no: "Skriv inn gyldig navn"
                    }
                },
                {
                    type: "dropdown",
                    name: "sykehuskode",
                    title: {
                        no: "Sykehus"
                    },
                    isRequired: true,
                    choicesOrder: "asc",
                    choices: [
                        {
                            value: "0402",
                            text: {
                                no: "Akershus Universitetssykehus HF, Kongsvinger"
                            }
                        },
                        {
                            value: "0208",
                            text: {
                                no: "Akershus Universitetssykehus HF, Lørenskog"
                            }
                        },
                        {
                            value: "0304",
                            text: {
                                no: "Diakonhjemmets Sykehus"
                            }
                        },
                        {
                            value: "0306",
                            text: {
                                no: "Lovisenberg Diakonale Sykehus"
                            }
                        },
                        {
                            value: "0301",
                            text: {
                                no: "Oslo universitetssykehus HF, Aker sykehus"
                            }
                        },
                        {
                            value: "0305",
                            text: {
                                no: "Oslo universitetssykehus HF, Radiumhospitalet"
                            }
                        },
                        {
                            value: "0316",
                            text: {
                                no: "Oslo universitetssykehus HF, Rikshospitalet"
                            }
                        },
                        {
                            value: "0320",
                            text: {
                                no: "Oslo universitetssykehus HF, Ullevål sykehus"
                            }
                        },
                        {
                            value: "0404",
                            text: {
                                no: "Sykehuset Innlandet HF, Elverum"
                            }
                        },
                        {
                            value: "0501",
                            text: {
                                no: "Sykehuset Innlandet HF, Gjøvik"
                            }
                        },
                        {
                            value: "0403",
                            text: {
                                no: "Sykehuset Innlandet HF, Hamar"
                            }
                        },
                        {
                            value: "0502",
                            text: {
                                no: "Sykehuset Innlandet HF, Lillehammer"
                            }
                        },
                        {
                            value: "0405",
                            text: {
                                no: "Sykehuset Innlandet HF, Tynset"
                            }
                        },
                        {
                            value: "0703",
                            text: {
                                no: "Sykehuset i Vestfold HF, Larvik"
                            }
                        },
                        {
                            value: "0705",
                            text: {
                                no: "Sykehuset i Vestfold HF, Sandefjord"
                            }
                        },
                        {
                            value: "0707",
                            text: {
                                no: "Sykehuset i Vestfold HF, Tønsberg"
                            }
                        },
                        {
                            value: "0804",
                            text: {
                                no: "Sykehuset Telemark HF, Kragerø"
                            }
                        },
                        {
                            value: "0805",
                            text: {
                                no: "Sykehuset Telemark HF, Notodden"
                            }
                        },
                        {
                            value: "0806",
                            text: {
                                no: "Sykehuset Telemark HF, Porsgrunn"
                            }
                        },
                        {
                            value: "0807",
                            text: {
                                no: "Sykehuset Telemark HF, Rjukan"
                            }
                        },
                        {
                            value: "0808",
                            text: {
                                no: "Sykehuset Telemark HF, Skien"
                            }
                        },
                        {
                            value: "0101",
                            text: {
                                no: "Sykehuset Østfold HF, Askim"
                            }
                        },
                        {
                            value: "0105",
                            text: {
                                no: "Sykehuset Østfold HF, Kalnes"
                            }
                        },
                        {
                            value: "0103",
                            text: {
                                no: "Sykehuset Østfold HF, Moss"
                            }
                        },
                        {
                            value: "0104",
                            text: {
                                no: "Sykehuset Østfold HF, Spesialistsenteret"
                            }
                        },
                        {
                            value: "0904",
                            text: {
                                no: "Sørlandet Sykehus HF, Arendal"
                            }
                        },
                        {
                            value: "1003",
                            text: {
                                no: "Sørlandet Sykehus HF, Flekkefjord"
                            }
                        },
                        {
                            value: "1005",
                            text: {
                                no: "Sørlandet Sykehus HF, Kristiansand"
                            }
                        },
                        {
                            value: "0202",
                            text: {
                                no: "Vestre Viken HF, Bærum sykehus"
                            }
                        },
                        {
                            value: "0601",
                            text: {
                                no: "Vestre Viken HF, Drammen sykehus"
                            }
                        },
                        {
                            value: "0602",
                            text: {
                                no: "Vestre Viken HF, Kongsberg sykehus"
                            }
                        },
                        {
                            value: "0605",
                            text: {
                                no: "Vestre Viken HF, Ringerike sykehus"
                            }
                        },
                        {
                            value: "1302",
                            text: {
                                no: "Haraldsplass Diakonale Sykehus"
                            }
                        },
                        {
                            value: "1305",
                            text: {
                                no: "Helse Bergen HF, Haukeland universitetssjukehus"
                            }
                        },
                        {
                            value: "1203",
                            text: {
                                no: "Helse Bergen HF, Voss sjukehus"
                            }
                        },
                        {
                            value: "1101",
                            text: {
                                no: "Helse Fonna HF, Haugesund sjukehus"
                            }
                        },
                        {
                            value: "1201",
                            text: {
                                no: "Helse Fonna HF, Odda sjukehus"
                            }
                        },
                        {
                            value: "1202",
                            text: {
                                no: "Helse Fonna HF, Stord sjukehus"
                            }
                        },
                        {
                            value: "1401",
                            text: {
                                no: "Helse Førde HF, Florø sjukehus"
                            }
                        },
                        {
                            value: "1406",
                            text: {
                                no: "Helse Førde HF, Førde sjukehus"
                            }
                        },
                        {
                            value: "1403",
                            text: {
                                no: "Helse Førde HF, Lærdal sjukehus"
                            }
                        },
                        {
                            value: "1405",
                            text: {
                                no: "Helse Førde HF, Nordfjordeid sjukehus"
                            }
                        },
                        {
                            value: "1107",
                            text: {
                                no: "Helse Stavanger HF, Stavanger universitetssjukehus, inkl. Sandnes og Egersund"
                            }
                        },
                        {
                            value: "1501",
                            text: {
                                no: "Helse Møre og Romsdal HF, Kristiansund sjukehus"
                            }
                        },
                        {
                            value: "1502",
                            text: {
                                no: "Helse Møre og Romsdal HF, Molde sjukehus"
                            }
                        },
                        {
                            value: "1503",
                            text: {
                                no: "Helse Møre og Romsdal HF, Volda sjukehus"
                            }
                        },
                        {
                            value: "1504",
                            text: {
                                no: "Helse Møre og Romsdal HF, Ålesund sjukehus"
                            }
                        },
                        {
                            value: "1701",
                            text: {
                                no: "Helse Nord-Trøndelag HF, Sykehuset Levanger"
                            }
                        },
                        {
                            value: "1702",
                            text: {
                                no: "Helse Nord-Trøndelag HF, Sykehuset Namsos"
                            }
                        },
                        {
                            value: "1602",
                            text: {
                                no: "St. Olavs Hospital HF, Orkdal sjukehus"
                            }
                        },
                        {
                            value: "1608",
                            text: {
                                no: "St. Olavs Hospital HF, St. Olavs Hospital"
                            }
                        },
                        {
                            value: "2001",
                            text: {
                                no: "Finnmarkssykehuset HF, Hammerfest sykehus"
                            }
                        },
                        {
                            value: "2002",
                            text: {
                                no: "Finnmarkssykehuset HF, Kirkenes sykehus"
                            }
                        },
                        {
                            value: "1807",
                            text: {
                                no: "Helgelandsykehuset HF, Mo i Rana"
                            }
                        },
                        {
                            value: "1805",
                            text: {
                                no: "Helgelandsykehuset HF, Mosjøen"
                            }
                        },
                        {
                            value: "1809",
                            text: {
                                no: "Helgelandsykehuset HF, Sandnessjøen"
                            }
                        },
                        {
                            value: "1801",
                            text: {
                                no: "Nordlandssykehuset HF, Bodø"
                            }
                        },
                        {
                            value: "1804",
                            text: {
                                no: "Nordlandssykehuset HF, Lofoten"
                            }
                        },
                        {
                            value: "1811",
                            text: {
                                no: "Nordlandssykehuset HF, Vesterålen"
                            }
                        },
                        {
                            value: "1902",
                            text: {
                                no: "Universitetssykehuset i Nord-Norge HF, Harstad"
                            }
                        },
                        {
                            value: "2101",
                            text: {
                                no: "Universitetssykehuset i Nord-Norge HF, Longyearbyen"
                            }
                        },
                        {
                            value: "1806",
                            text: {
                                no: "Universitetssykehuset i Nord-Norge HF, Narvik"
                            }
                        },
                        {
                            value: "1903",
                            text: {
                                no: "Universitetssykehuset i Nord-Norge HF, Tromsø"
                            }
                        },
                        {
                            value: "6110",
                            text: {
                                no: "Adrian Halland AS"
                            }
                        },
                        {
                            value: "6089",
                            text: {
                                no: "Aleris Bodø"
                            }
                        },
                        {
                            value: "6087",
                            text: {
                                no: "Aleris Colosseum, Stavanger"
                            }
                        },
                        {
                            value: "0608",
                            text: {
                                no: "Aleris Drammen"
                            }
                        },
                        {
                            value: "0317",
                            text: {
                                no: "Aleris Frogner, Oslo"
                            }
                        },
                        {
                            value: "6072",
                            text: {
                                no: "Aleris Hinna Park, Stavanger"
                            }
                        },
                        {
                            value: "6032",
                            text: {
                                no: "Aleris Kristiansand"
                            }
                        },
                        {
                            value: "6024",
                            text: {
                                no: "Aleris Marken, Bergen"
                            }
                        },
                        {
                            value: "6013",
                            text: {
                                no: "Aleris medisinske senter, Strømmen"
                            }
                        },
                        {
                            value: "6085",
                            text: {
                                no: "Aleris Nesttun, Bergen"
                            }
                        },
                        {
                            value: "6086",
                            text: {
                                no: "Aleris Resonborg, Trondheim"
                            }
                        },
                        {
                            value: "6102",
                            text: {
                                no: "Aleris Røntgen, Bergen"
                            }
                        },
                        {
                            value: "6094",
                            text: {
                                no: "Aleris Røntgen, Oslo"
                            }
                        },
                        {
                            value: "6095",
                            text: {
                                no: "Aleris Røntgen, Trondheim"
                            }
                        },
                        {
                            value: "6023",
                            text: {
                                no: "Aleris Solsiden, Trondheim"
                            }
                        },
                        {
                            value: "6088",
                            text: {
                                no: "Aleris sykehus og røntgen, Agder"
                            }
                        },
                        {
                            value: "6100",
                            text: {
                                no: "Aleris sykehus og røntgen, Ålesund"
                            }
                        },
                        {
                            value: "6033",
                            text: {
                                no: "Aleris sykehus, Tromsø"
                            }
                        },
                        {
                            value: "6043",
                            text: {
                                no: "Bergen hudlegeklinikk"
                            }
                        },
                        {
                            value: "6096",
                            text: {
                                no: "Best Helse AS"
                            }
                        },
                        {
                            value: "0801",
                            text: {
                                no: "Betanien Hospital"
                            }
                        },
                        {
                            value: "6068",
                            text: {
                                no: "Bodø gynekologiske klinikk AS"
                            }
                        },
                        {
                            value: "6098",
                            text: {
                                no: "Borg Kirurgiske"
                            }
                        },
                        {
                            value: "6074",
                            text: {
                                no: "C-Medical, Majorstuen"
                            }
                        },
                        {
                            value: "6008",
                            text: {
                                no: "C-Medical, Moelv spesialistsenter"
                            }
                        },
                        {
                            value: "6099",
                            text: {
                                no: "C-Medical, Sarpsborg"
                            }
                        },
                        {
                            value: "6101",
                            text: {
                                no: "C-Medical, Ski Urologiske Spesialistsenter"
                            }
                        },
                        {
                            value: "6038",
                            text: {
                                no: "Distriktsmedisinsk senter, Finnsnes"
                            }
                        },
                        {
                            value: "6046",
                            text: {
                                no: "Dr. Funks Hudklinikk"
                            }
                        },
                        {
                            value: "6021",
                            text: {
                                no: "Dr. Klems klinikk"
                            }
                        },
                        {
                            value: "6106",
                            text: {
                                no: "Dr. Willumsens Kvinneklinikk AS"
                            }
                        },
                        {
                            value: "6026",
                            text: {
                                no: "Dyrendal medisinske senter"
                            }
                        },
                        {
                            value: "0214",
                            text: {
                                no: "Feiringklinikken"
                            }
                        },
                        {
                            value: "6053",
                            text: {
                                no: "Haugesund Medisinske Senter"
                            }
                        },
                        {
                            value: "1102",
                            text: {
                                no: "Haugesund Sanitetsforenings Revmatismesykehus"
                            }
                        },
                        {
                            value: "6044",
                            text: {
                                no: "Havblikk Spesialistsenter"
                            }
                        },
                        {
                            value: "6111",
                            text: {
                                no: "Hedmark Urologiske Spesialistsenter AS"
                            }
                        },
                        {
                            value: "6002",
                            text: {
                                no: "Heistad Legekontor"
                            }
                        },
                        {
                            value: "6030",
                            text: {
                                no: "Helgeroa Legesenter"
                            }
                        },
                        {
                            value: "1197",
                            text: {
                                no: "Hinnaklinikken"
                            }
                        },
                        {
                            value: "1301",
                            text: {
                                no: "Hospitalet Betanien"
                            }
                        },
                        {
                            value: "6003",
                            text: {
                                no: "Høeg Urologi"
                            }
                        },
                        {
                            value: "6104",
                            text: {
                                no: "IbsenSykehuset Arendal AS"
                            }
                        },
                        {
                            value: "6105",
                            text: {
                                no: "IbsenSykehuset Gjøvik AS"
                            }
                        },
                        {
                            value: "6103",
                            text: {
                                no: "IbsenSykehuset Porsgrunn AS"
                            }
                        },
                        {
                            value: "6078",
                            text: {
                                no: "Kalbakkenklinikken"
                            }
                        },
                        {
                            value: "6075",
                            text: {
                                no: "Kanalspesialistene A/S"
                            }
                        },
                        {
                            value: "6004",
                            text: {
                                no: "Kirkeparken Spesialistpraksis"
                            }
                        },
                        {
                            value: "6069",
                            text: {
                                no: "Kirurgisk klinikk"
                            }
                        },
                        {
                            value: "6042",
                            text: {
                                no: "Klinikk Kramer"
                            }
                        },
                        {
                            value: "6073",
                            text: {
                                no: "Klinikk Røa"
                            }
                        },
                        {
                            value: "6031",
                            text: {
                                no: "Kolibri Medical"
                            }
                        },
                        {
                            value: "6066",
                            text: {
                                no: "Legepraksis Dragomir Zubac AS"
                            }
                        },
                        {
                            value: "6090",
                            text: {
                                no: "LHL-sykehuset Vestfold"
                            }
                        },
                        {
                            value: "6049",
                            text: {
                                no: "Lysaker Hudlegekontor"
                            }
                        },
                        {
                            value: "6007",
                            text: {
                                no: "Medi 3 AS"
                            }
                        },
                        {
                            value: "6107",
                            text: {
                                no: "Nimo klinikken"
                            }
                        },
                        {
                            value: "6054",
                            text: {
                                no: "Nord-Gudbrandsdal Lokalmedisinske Senter"
                            }
                        },
                        {
                            value: "6092",
                            text: {
                                no: "Nordland Urologiske Klinikk AS"
                            }
                        },
                        {
                            value: "6108",
                            text: {
                                no: "Nordnorsk Urolog AS"
                            }
                        },
                        {
                            value: "4710",
                            text: {
                                no: "Nøtterøy Legesenter"
                            }
                        },
                        {
                            value: "0708",
                            text: {
                                no: "Oseberg Medisinske Klinikk"
                            }
                        },
                        {
                            value: "0329",
                            text: {
                                no: "Oslo Akutten"
                            }
                        },
                        {
                            value: "4709",
                            text: {
                                no: "Oslofjordklinikken"
                            }
                        },
                        {
                            value: "6079",
                            text: {
                                no: "Oslogynekologene"
                            }
                        },
                        {
                            value: "6025",
                            text: {
                                no: "Overnklinikken"
                            }
                        },
                        {
                            value: "6071",
                            text: {
                                no: "Parsennklinikken"
                            }
                        },
                        {
                            value: "6056",
                            text: {
                                no: "Privathospitalet Fana Medisinske Senter"
                            }
                        },
                        {
                            value: "6022",
                            text: {
                                no: "Privatsykehuset Haugesund AS"
                            }
                        },
                        {
                            value: "6011",
                            text: {
                                no: "Ringvollklinikken, Hobøl"
                            }
                        },
                        {
                            value: "6109",
                            text: {
                                no: "Romerike Urologiske Senter AS"
                            }
                        },
                        {
                            value: "1198",
                            text: {
                                no: "Rune Mork Braut"
                            }
                        },
                        {
                            value: "6067",
                            text: {
                                no: "RøaLegene"
                            }
                        },
                        {
                            value: "6036",
                            text: {
                                no: "Sarpsborg Spesialistsenter AS"
                            }
                        },
                        {
                            value: "6010",
                            text: {
                                no: "Ski Urologiske Senter"
                            }
                        },
                        {
                            value: "6091",
                            text: {
                                no: "Smestadgynekologene"
                            }
                        },
                        {
                            value: "6009",
                            text: {
                                no: "Spesialistsenteret AS"
                            }
                        },
                        {
                            value: "6041",
                            text: {
                                no: "Stavanger Urologiske Senter"
                            }
                        },
                        {
                            value: "6052",
                            text: {
                                no: "Tromsø Urologiske Spesialistsenter"
                            }
                        },
                        {
                            value: "6035",
                            text: {
                                no: "Uroklinikken, Oslo"
                            }
                        },
                        {
                            value: "6093",
                            text: {
                                no: "Uroklinikken, Oslo"
                            }
                        },
                        {
                            value: "6055",
                            text: {
                                no: "Urologisk Klinikk"
                            }
                        },
                        {
                            value: "6076",
                            text: {
                                no: "Urologiklinikken AS"
                            }
                        },
                        {
                            value: "6051",
                            text: {
                                no: "Urologiklinikken i Trondheim"
                            }
                        },
                        {
                            value: "6001",
                            text: {
                                no: "Urologisk kirurgisk poliklinikk"
                            }
                        },
                        {
                            value: "6014",
                            text: {
                                no: "Uro-Sør AS"
                            }
                        },
                        {
                            value: "1311",
                            text: {
                                no: "Volvat Bergen, Laguneparken"
                            }
                        },
                        {
                            value: "6081",
                            text: {
                                no: "Volvat Bergen, Ulriksdal"
                            }
                        },
                        {
                            value: "0111",
                            text: {
                                no: "Volvat Fredrikstad"
                            }
                        },
                        {
                            value: "0412",
                            text: {
                                no: "Volvat Hamar"
                            }
                        },
                        {
                            value: "6083",
                            text: {
                                no: "Volvat Moss"
                            }
                        },
                        {
                            value: "1316",
                            text: {
                                no: "Volvat Lillehammer"
                            }
                        },
                        {
                            value: "0327",
                            text: {
                                no: "Volvat Oslo, Majorstuen"
                            }
                        },
                        {
                            value: "6080",
                            text: {
                                no: "Volvat Oslo, Nationaltheateret"
                            }
                        },
                        {
                            value: "6028",
                            text: {
                                no: "Volvat Stokkan"
                            }
                        },
                        {
                            value: "6077",
                            text: {
                                no: "Østfold indremedesin AS"
                            }
                        },
                        {
                            value: "6029",
                            text: {
                                no: "Østsiden Kirurgiske Praksis"
                            }
                        },
                        {
                            value: "6084",
                            text: {
                                no: "Aleris Colosseum-Nobel, Oslo"
                            }
                        },
                        {
                            value: "9998",
                            text: {
                                no: "Annet"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    },
                    renderAs: "dropdown-react"
                },
                {
                    type: "comment",
                    name: "sykehusnavnHFSpesifiser",
                    visible: false,
                    visibleIf: "{sykehuskode} = 9998",
                    startWithNewLine: true,
                    title: {
                        no: "Spesifiser"
                    },
                    isRequired: true
                },
                {
                    type: "dropdown",
                    name: "avdelingsnavn",
                    title: {
                        no: "Avdeling"
                    },
                    description: {
                        no: "Dette er en standard avdelingsliste for Kreftregisteret. Dersom din spesifikke avdeling ikke finnes i listen, velg den avdelingen som passer best ut fra alternativene"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "14",
                            text: {
                                no: "Urologisk avdeling"
                            }
                        },
                        {
                            value: "01",
                            text: {
                                no: "Kiurgisk avdeling"
                            }
                        },
                        {
                            value: "47",
                            text: {
                                no: "Onkologisk avdeling"
                            }
                        },
                        {
                            value: "20",
                            text: {
                                no: "Medisinsk avdeling"
                            }
                        },
                        {
                            value: "1",
                            text: {
                                no: "Annen avdeling"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "Ikke relevant"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    },
                    renderAs: "dropdown-react"
                },
                {
                    type: "comment",
                    name: "avdelingsnavnHFSpesifiser",
                    visible: false,
                    visibleIf: "{avdelingsnavn} = '1'",
                    startWithNewLine: true,
                    title: {
                        no: "Spesifiser"
                    }
                }
            ],
            title: {
                no: "Pasient/behandlingsinstitusjon"
            }
        },
        {
            name: "utredning",
            elements: [
                {
                    type: "radiogroup",
                    name: "funnUtredning",
                    titleLocation: "hidden",
                    defaultValue: "1",
                    isRequired: true,
                    requiredErrorText: {
                        no: "Velg en"
                    },
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "Primærtumor (med eller uten metastase(r)) - Utredning av primærtumor og samtidig utredning av regionale lymfeknutemetastaser/fjernmetastaser før igangsetting av primærbehandling"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "Kun metastase(r) - Utredning av regionale lymfeknutemetastaser og/eller fjernmetastaser uten samtidig utredning av primærtumor"
                            }
                        }
                    ]
                }
            ],
            title: {
                no: "Funn i utredningen"
            }
        },
        {
            name: "sykehistorie",
            elements: [
                {
                    type: "text",
                    name: "psaverdi",
                    maxWidth: "30%",
                    startWithNewLine: false,
                    title: {
                        no: "PSA-verdi ved diagnosetidspunkt"
                    },
                    enableIf: "{spsa} empty",
                    isRequired: true,
                    requiredIf: "{spsa} empty",
                    validators: [
                        {
                            type: "regex",
                            text: "Må være mellom 0 og 1000000 med maks ett desimal",
                            regex: "^([1-9]\\d{0,5}|\\d{1,6},\\d)$"
                        }
                    ],
                    // Har ikke inputType: "number" siden surveyjs tillater "," som input, men ikke som gyldig nummer
                    inputType: "text"
                },
                {
                    type: "checkbox",
                    name: "spsa",
                    maxWidth: "140px",
                    minWidth: "unset",
                    startWithNewLine: false,
                    titleLocation: "hidden",
                    choices: [
                        {
                            value: "psaverdiIkkeTatt",
                            text: {
                                no: "Ikke tatt"
                            }
                        },
                        {
                            value: "psaverdiUkjent",
                            text: {
                                no: "Ukjent"
                            }
                        }
                    ],
                    colCount: 2
                },
                {
                    type: "radiogroup",
                    name: "vannlatingsproblem",
                    title: {
                        no: "Var vannlatingsproblemer en del av årsak til utredningen?"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "Ja"
                            }
                        },
                        {
                            value: "0",
                            text: {
                                no: "Nei"
                            }
                        },
                        {
                            value: "99",
                            text: {
                                no: "Ukjent"
                            }
                        }
                    ],
                    otherText: {
                        no: "Ukjent"
                    },
                    colCount: 3
                },
                {
                    type: "radiogroup",
                    name: "kreftsymptomer",
                    title: {
                        no: "Var kreftsymptomer (smerter, anemi eller annet) en del av årsak til utredningen?"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "Ja"
                            }
                        },
                        {
                            value: "0",
                            text: {
                                no: "Nei"
                            }
                        },
                        {
                            value: "99",
                            text: {
                                no: "Ukjent"
                            }
                        }
                    ],
                    colCount: 3
                },
                {
                    type: "dropdown",
                    name: "whostatus",
                    title: {
                        no: "Funksjonstilstand/WHO-status ved diagnose"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "0: Normal aktivitet, uten begrensninger"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "1: Lett redusert arbeidskapasitet"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "2: > 50% av dagen oppegående"
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "3: > 50% av dagen i seng / stillesittende"
                            }
                        },
                        {
                            value: "5",
                            text: {
                                no: "4: Totalt stillesittende eller i seng hele dagen"
                            }
                        },
                        {
                            value: "99",
                            text: {
                                no: "Ukjent / har ikke informasjon"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    },
                    renderAs: "dropdown-react"
                },
                {
                    type: "text",
                    name: "prostatavolum",
                    title: {
                        no: "Prostatavolum (mL)"
                    },
                    maxWidth: "140px",
                    minWidth: "unset",
                    enableIf: "{prostatavolumUkjent} empty",
                    isRequired: true,
                    requiredIf: "{prostatavolumUkjent} empty",
                    validators: [
                        {
                            type: "regex",
                            text: "Må være et tall mellom 0 og 1000",
                            regex: "^[1-9]\\d{0,2}$"
                        }
                    ],
                    inputType: "number"
                },
                {
                    type: "checkbox",
                    name: "prostatavolumUkjent",
                    startWithNewLine: false,
                    titleLocation: "hidden",
                    choices: [
                        {
                            value: "99",
                            text: {
                                no: "Ukjent"
                            }
                        }
                    ]
                }
            ],
            visible: false,
            visibleIf: "{funnUtredning} = 1",
            title: {
                no: "Sykehistorie"
            }
        },
        {
            name: "diagnotiskeUS",
            elements: [
                {
                    type: "radiogroup",
                    name: "mrdiagnostikk",
                    title: {
                        no: "MR prostata"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "Ja"
                            }
                        },
                        {
                            value: "0",
                            text: {
                                no: "Nei"
                            }
                        }
                    ],
                    colCount: 2
                },
                {
                    type: "text",
                    name: "datoMRDiagnostikk",
                    maxWidth: "140px",
                    minWidth: "unset",
                    visible: false,
                    visibleIf: "{mrdiagnostikk} = 1",
                    startWithNewLine: true,
                    title: {
                        no: "Utført dato"
                    },
                    enableIf: "{datoMRDiagnostikkUkjent} empty",
                    isRequired: true,
                    requiredIf: "{datoMRDiagnostikkUkjent} empty",
                    validators: [
                        {
                            type: "expression",
                            text: "Utført dato kan ikke være dagens eller senere dato",
                            expression: "getDate({datoMRDiagnostikk}) < today()"
                        }
                    ],
                    inputType: "date"
                },
                {
                    type: "checkbox",
                    name: "datoMRDiagnostikkUkjent",
                    visible: false,
                    visibleIf: "{mrdiagnostikk} = 1",
                    startWithNewLine: false,
                    titleLocation: "hidden",
                    choices: [
                        {
                            value: "99",
                            text: {
                                no: "Ukjent"
                            }
                        }
                    ]
                },
                {
                    type: "radiogroup",
                    name: "annetBildediagnostikk",
                    title: {
                        no: "Er det gjort annen bildediagnostikk av primærtumor?"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "Ja"
                            }
                        },
                        {
                            value: "0",
                            text: {
                                no: "Nei"
                            }
                        }
                    ],
                    colCount: 2
                },
                {
                    type: "comment",
                    name: "annetBildediagnostikkSpesifiser2",
                    visible: false,
                    visibleIf: "{annetBildediagnostikk} = 1",
                    startWithNewLine: true,
                    title: {
                        no: "Spesifiser"
                    }
                },
                {
                    type: "radiogroup",
                    name: "vevsprover",
                    title: {
                        no: "Celle-/vevsprøver"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "Ja"
                            }
                        },
                        {
                            value: "0",
                            text: {
                                no: "Nei"
                            }
                        }
                    ],
                    colCount: 2
                },
                {
                    type: "checkbox",
                    name: "vevsproverUS",
                    visible: false,
                    visibleIf: "{vevsprover} = 1",
                    startWithNewLine: false,
                    title: {
                        no: "Undersøkelser"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "biopsiVevsprover",
                            text: {
                                no: "Biopsi"
                            }
                        },
                        {
                            value: "turpvevsprover",
                            text: {
                                no: "TUR-P"
                            }
                        },
                        {
                            value: "annetVevsprover",
                            text: {
                                no: "Annet"
                            }
                        }
                    ],
                    colCount: 3
                },
                {
                    type: "comment",
                    name: "annetVevsproverSpesifiser2",
                    visible: false,
                    visibleIf: "{vevsproverUS} contains 'annetVevsprover'",
                    startWithNewLine: true,
                    title: {
                        no: "Spesifiser"
                    }
                },
                {
                    type: "text",
                    name: "diagnosedato",
                    title: {
                        no: "Dato sykdommen ble bekreftet/diagnosedato"
                    },
                    description: {
                        no: "Dato sykdommen ble bekreftet er prøvetakingsdato for første positive histologi/cytologi. Dersom det ikke er tatt vevsprøve, benyttes den dato man ved hjelp av andre undersøkelser (bildediagnostikk, blodprøve etc.) bestemmer seg for at pasienten har kreft"
                    },
                    isRequired: true,
                    validators: [
                        {
                            type: "expression",
                            text: "Dato sykdommen ble bekreftet/diagnosedato kan ikke være dagens eller senere dato",
                            expression: "getDate({diagnosedato}) < today()"
                        }
                    ],
                    inputType: "date"
                }
            ],
            visible: false,
            visibleIf: "{funnUtredning} = 1",
            title: {
                no: "Diagnostikk av primærtumor"
            }
        },
        {
            name: "sykdomsutbredelse",
            elements: [
                {
                    type: "dropdown",
                    name: "palpatoriskTumorHoyre",
                    visibleIf: "{funnUtredning} = 1",
                    title: {
                        no: "Palpatorisk T-stadium høyre side (laveste stadium velges ved tvil)"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "T0/T1 - Ikke palpabel tumor"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "T2 - Tumor uten ekstraprostatisk vekst"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "T3a - Ekstraprostatisk vekst"
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "T3b - Innvekst i vesikler"
                            }
                        },
                        {
                            value: "5",
                            text: {
                                no: "T4 - Innvekst i omliggende vev"
                            }
                        },
                        {
                            value: "6",
                            text: {
                                no: "TX - Ikke vurdert / kan ikke vurderes"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    },
                    renderAs: "dropdown-react"
                },
                {
                    type: "dropdown",
                    name: "palpatoriskTumorVenstre",
                    visibleIf: "{funnUtredning} = 1",
                    startWithNewLine: false,
                    title: {
                        no: "Palpatorisk T-stadium venstre side (laveste stadium velges ved tvil)"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "T0/T1 - Ikke palpabel tumor"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "T2 - Tumor uten ekstraprostatisk vekst"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "T3a - Ekstraprostatisk vekst"
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "T3b - Innvekst i vesikler"
                            }
                        },
                        {
                            value: "5",
                            text: {
                                no: "T4 - Innvekst i omliggende vev"
                            }
                        },
                        {
                            value: "6",
                            text: {
                                no: "TX - Ikke vurdert / kan ikke vurderes"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    },
                    renderAs: "dropdown-react"
                },
                {
                    type: "expression",
                    name: "samletPalpatoriskTumor",
                    visibleIf: "{funnUtredning} = 1",
                    title: {
                        no: "Samlet palpatorisk T-stadium"
                    },
                    expression: "" +
                        "iif({palpatoriskTumorHoyre} = 5 or {palpatoriskTumorVenstre} = 5, 'T4', " +
                        "iif({palpatoriskTumorHoyre} = 4 or {palpatoriskTumorVenstre} = 4, 'T3b', " +
                        "iif({palpatoriskTumorHoyre} = 3 or {palpatoriskTumorVenstre} = 3, 'T2b', " +
                        "iif({palpatoriskTumorHoyre} = 2 or {palpatoriskTumorVenstre} = 2, 'T2', " +
                        "iif({palpatoriskTumorHoyre} = 1 or {palpatoriskTumorVenstre} = 1, 'T0/T1', " +
                        "iif({palpatoriskTumorHoyre} = 6 or {palpatoriskTumorVenstre} = 6, 'TX', ''))))))"
                },
                {
                    type: "dropdown",
                    name: "piradshoyre",
                    visible: false,
                    visibleIf: "{mrdiagnostikk} = 1",
                    title: {
                        no: "PI-RADS høyre side (laveste stadium velges ved tvil)"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "1 - Svært lav sannsynlighet for klinisk signifikant malign tumor, normale funn"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "2 - Lav sannsynlighet for klinisk signifikant malign tumor, benigne funn"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "3 - Intermediær sannsynlighet for klinisk signifikant malign tumor, usikker lesjon, 50/50%"
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "4 -  Høy sannsynlighet for klinisk signifikant malign tumor som er mindre enn 15 mm og uten suspekt ekstraprostatisk vekst"
                            }
                        },
                        {
                            value: "5",
                            text: {
                                no: "5 - Høy sannsynlighet for klinisk signifikant malign tumor som er 15 mm eller større, eller som har ekstraprostatisk vekst"
                            }
                        },
                        {
                            value: "99",
                            text: {
                                no: "Ukjent"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    },
                    renderAs: "dropdown-react"
                },
                {
                    type: "dropdown",
                    name: "piradsvenstre",
                    visible: false,
                    visibleIf: "{mrdiagnostikk} = 1",
                    startWithNewLine: false,
                    title: {
                        no: "PI-RADS venstre side (laveste stadium velges ved tvil)"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "1 - Svært lav sannsynlighet for klinisk signifikant malign tumor, normale funn"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "2 - Lav sannsynlighet for klinisk signifikant malign tumor, benigne funn"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "3 - Intermediær sannsynlighet for klinisk signifikant malign tumor, usikker lesjon, 50/50%"
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "4 -  Høy sannsynlighet for klinisk signifikant malign tumor som er mindre enn 15 mm og uten suspekt ekstraprostatisk vekst"
                            }
                        },
                        {
                            value: "5",
                            text: {
                                no: "5 - Høy sannsynlighet for klinisk signifikant malign tumor som er 15 mm eller større, eller som har ekstraprostatisk vekst"
                            }
                        },
                        {
                            value: "99",
                            text: {
                                no: "Ukjent"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    },
                    renderAs: "dropdown-react"
                },
                {
                    type: "dropdown",
                    name: "mrbasertKliniskTHoyre",
                    visible: false,
                    visibleIf: "{piradshoyre} = 4 or {piradshoyre} = 5",
                    title: {
                        no: "MR-basert T-stadium høyre side (laveste stadium velges ved tvil)"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "T2 - Tumor uten ekstraprostatisk vekst"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "T3a - Ekstraprostatisk vekst"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "T3b - Innvekst i vesikler"
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "T4 - Innvekst i omliggende vev"
                            }
                        },
                        {
                            value: "5",
                            text: {
                                no: "TX - Ikke vurdert / kan ikke vurderes"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    },
                    renderAs: "dropdown-react"
                },
                {
                    type: "dropdown",
                    name: "mrbasertKliniskTVenstre",
                    visible: false,
                    visibleIf: "{piradsvenstre} = 4 or {piradsvenstre} = 5",
                    startWithNewLine: false,
                    title: {
                        no: "MR-basert T-stadium venstre side (laveste stadium velges ved tvil)"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "T2 - Tumor uten ekstraprostatisk vekst"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "T3a - Ekstraprostatisk vekst"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "T3b - Innvekst i vesikler"
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "T4 - Innvekst i omliggende vev"
                            }
                        },
                        {
                            value: "5",
                            text: {
                                no: "TX - Ikke vurdert / kan ikke vurderes"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    },
                    renderAs: "dropdown-react"
                },
                {
                    type: "expression",
                    name: "samletMRBasertKliniskT",
                    visible: false,
                    visibleIf: "{piradshoyre} = 4 or {piradshoyre} = 5 or {piradsvenstre} = 4 or {piradsvenstre} = 5",
                    title: {
                        no: "Samlet MR-basert T-stadium"
                    },
                    expression: "" +
                        "iif({mrbasertKliniskTHoyre} = 4 or {mrbasertKliniskTVenstre} = 4, 'T4', " +
                        "iif({mrbasertKliniskTHoyre} = 3 or {mrbasertKliniskTVenstre} = 3, 'T3b', " +
                        "iif({mrbasertKliniskTHoyre} = 2 or {mrbasertKliniskTVenstre} = 2, 'T3a', " +
                        "iif({mrbasertKliniskTHoyre} = 1 or {mrbasertKliniskTVenstre} = 1, 'T2', " +
                        "iif({mrbasertKliniskTHoyre} = 5 or {mrbasertKliniskTVenstre} = 5, 'TX', '')))))"
                },
                {
                    type: "dropdown",
                    name: "totalVurderingKliniskT",
                    visibleIf: "{funnUtredning} = 1",
                    title: {
                        no: "Totalvurdering av klinisk T (laveste stadium velges ved tvil)"
                    },
                    description: {
                        no: "TNM på diagnosetidspunktet baseres på all relevant utredning som er gjort før primærbehandling inkludert klinisk undersøkelse, bildediagnostikk, endoskopi, biopsi og kirurgisk eksplorasjon.\n"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "X",
                            text: {
                                no: "TX - Primærtumor kan ikke vurderes"
                            }
                        },
                        {
                            value: "0",
                            text: {
                                no: "T0 - Primærtumor ikke påvist"
                            }
                        },
                        {
                            value: "1",
                            text: {
                                no: "T1 - Ingen tumor påvisbar med palpasjon, ultralyd eller annen radiologisk metode, men cancer er påvist ved prostatabiopsier"
                            }
                        },
                        {
                            value: "1a",
                            text: {
                                no: "T1a - Ikke palpabel tumor, påvist ved TUR-P, < 5% av resektatet"
                            }
                        },
                        {
                            value: "1b",
                            text: {
                                no: "T1b - Ikke palpabel tumor, påvist ved TUR-P, ≥5% av resektatet"
                            }
                        },
                        {
                            value: "1c",
                            text: {
                                no: "T1c - Ikke palpabel tumor, påvist ved nålebiopsi (for eksempel på grunn av forhøyet PSA)"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "T2 - Palpabel eller synlig tumor begrenset til prostatakjertelen (innenfor kapselbegrensning)"
                            }
                        },
                        {
                            value: "2a",
                            text: {
                                no: "T2a - Tumor omfatter en halv lapp eller mindre"
                            }
                        },
                        {
                            value: "2b",
                            text: {
                                no: "T2b - Tumor omfatter mer enn halvparten av en lapp, men ikke begge lapper."
                            }
                        },
                        {
                            value: "2c",
                            text: {
                                no: "T2c - Tumor omfatter begge lapper"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "T3 - Ekstrakapsulær tumorvekst. NB: Innvekst i apex prostata eller inn i (men ikke gjennom) prostatakapselen klassifiseres som T2"
                            }
                        },
                        {
                            value: "3a",
                            text: {
                                no: "T3a - Ekstrakapsulær vekst (unilateral eller bilateral)"
                            }
                        },
                        {
                            value: "3b",
                            text: {
                                no: "T3b - Tumor vokser inn i sædblære(r) "
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "T4 - Tumor er fiksert eller vokser inn i nabostruktur(er) annet enn sædblære(r) "
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    },
                    renderAs: "dropdown-react"
                },
                {
                    type: "dropdown",
                    name: "kliniskVurdertAv",
                    visible: false,
                    visibleIf: "{funnUtredning} = 1",
                    title: {
                        no: "Hvem har gjort totalvurderingen av klinisk T?"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "MDT (tverrfaglig møte)"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "Utredende lege"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "Melder (ikke utredende lege)"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    },
                    renderAs: "dropdown-react"
                },
                {
                    type: "radiogroup",
                    name: "regionaleLKPaavist",
                    title: {
                        no: "Er regionale lymfeknutemetastaser påvist (N-sykdom)?"
                    },
                    description: {
                        no: "Grensen mellom regionale lymfeknutemetastaser og fjernmetastaser går ved delingsstedet til arteria iliaca communis. Ved tvil om korrekt N-kategori skal den laveste (minst avanserte) kategorien velges"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "2",
                            text: {
                                no: "NX = Ikke undersøkt"
                            }
                        },
                        {
                            value: "0",
                            text: {
                                no: "N0 = Ingen regionale lymfeknutemetastaser"
                            }
                        },
                        {
                            value: "1",
                            text: {
                                no: "N1 = Regionale lymfeknutemetastaser"
                            }
                        }
                    ],
                    colCount: 3
                },
                {
                    type: "radiogroup",
                    name: "utredningsmetodeLK",
                    visible: false,
                    visibleIf: "{regionaleLKPaavist} = 0 or {regionaleLKPaavist} = 1",
                    title: {
                        no: "Utredningsmetode (velg viktigste undersøkelse som basis for cN)"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "CT"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "MR"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "PET"
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "Lymfadenektomi (diagnostisk i forkant av behandling)"
                            }
                        },
                        {
                            value: "5",
                            text: {
                                no: "Annet"
                            }
                        },
                        {
                            value: "99",
                            text: {
                                no: "Ukjent"
                            }
                        }
                    ],
                    colCount: 3
                },
                {
                    type: "comment",
                    name: "annenDiagnostikkLKSpesifiser",
                    visible: false,
                    visibleIf: "{utredningsmetodeLK} = 5",
                    startWithNewLine: true,
                    title: {
                        no: "Spesifiser"
                    }
                },
                {
                    type: "radiogroup",
                    name: "fjernmetPaavist",
                    title: {
                        no: "Er fjernmetastaser, inkludert fjerne lymfeknutemetastaser, påvist (M-sykdom)?"
                    },
                    description: {
                        no: "Grensen mellom regionale lymfeknutemetastaser og fjernmetastaser går ved delingsstedet til arteria iliaca communis. Ved tvil om korrekt M-kategori skal den laveste (minst avanserte) kategorien velges"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "2",
                            text: {
                                no: "Ikke undersøkt"
                            }
                        },
                        {
                            value: "0",
                            text: {
                                no: "M0 = Ingen fjernmetastaser"
                            }
                        },
                        {
                            value: "1",
                            text: {
                                no: "M1 = Fjernmetastaser"
                            }
                        }
                    ],
                    colCount: 3
                },
                {
                    type: "checkbox",
                    name: "lokalisasjonFjernmet",
                    visible: false,
                    visibleIf: "{fjernmetPaavist} = 1",
                    title: {
                        no: "Lokalisasjon"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "fjerneLKmet",
                            text: {
                                no: "Ikke-regionale lymfeknuter (M1a)"
                            }
                        },
                        {
                            value: "skjelettmet",
                            text: {
                                no: "Skjelett (M1b)"
                            }
                        },
                        {
                            value: "annetFjernmet",
                            text: {
                                no: "Annet (M1c)"
                            }
                        }
                    ],
                    colCount: 3
                },
                {
                    type: "comment",
                    name: "annetFjernmetSpesifiser",
                    visible: false,
                    visibleIf: "{lokalisasjonFjernmet} contains 'annetFjernmet'",
                    startWithNewLine: true,
                    title: {
                        no: "Spesifiser"
                    }
                },
                {
                    type: "checkbox",
                    name: "utredningsmetodeFjernmet",
                    visibleIf: "{fjernmetPaavist} = 1",
                    title: {
                        no: "Utredningsmetode"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "ctmet",
                            text: {
                                no: "CT"
                            }
                        },
                        {
                            value: "mrmet",
                            text: {
                                no: "MR"
                            }
                        },
                        {
                            value: "petmet",
                            text: {
                                no: "PET"
                            }
                        },
                        {
                            value: "skjelettscintigrafiMet",
                            text: {
                                no: "Skjelettscintigrafi"
                            }
                        },
                        {
                            value: "rtgThoraxMet",
                            text: {
                                no: "Røntgen thorax"
                            }
                        },
                        {
                            value: "rtgBekkenMet",
                            text: {
                                no: "Røntgen korsrygg/bekken"
                            }
                        },
                        {
                            value: "cytologiMet",
                            text: {
                                no: "Cytologi"
                            }
                        },
                        {
                            value: "biopsiMet",
                            text: {
                                no: "Biopsi"
                            }
                        },
                        {
                            value: "annenDiagnostikkMet",
                            text: {
                                no: "Annet"
                            }
                        },
                        {
                            value: "utredningsmetodeFjernmetUkjent",
                            text: {
                                no: "Ukjent"
                            }
                        }
                    ],
                    colCount: 4
                },
                {
                    type: "comment",
                    name: "annenDiagnostikkMetSpesifiser",
                    visible: false,
                    visibleIf: "{utredningsmetodeFjernmet} contains 'annenDiagnostikkMet'",
                    title: {
                        no: "Spesifiser"
                    }
                },
                {
                    type: "text",
                    name: "datoMetastaser",
                    visible: false,
                    visibleIf: "{funnUtredning} = 3",
                    title: {
                        no: "Dato for utredning av metastaser"
                    },
                    description: {
                        no: "Dato for første undersøkelse som bekrefter metastasen. Dersom meldingen gjelder flere metastaser benyttes den tidligste datoen"
                    },
                    isRequired: true,
                    validators: [
                        {
                            type: "expression",
                            text: "Dato for utredning kan ikke være dagens eller senere dato",
                            expression: "getDate({datoMetastaser}) < today()"
                        }
                    ],
                    inputType: "date"
                }
            ],
            title: "{sykdomsutbredelseTitle}"
        },
        {
            name: "kliniskTNM",
            elements: [
                {
                    type: "expression",
                    name: "ct",
                    minWidth: "50px",
                    startWithNewLine: false,
                    title: {
                        no: "cT"
                    },
                    expression: "iif({totalVurderingKliniskT} notempty, {totalVurderingKliniskT}, '')"
                },
                {
                    type: "expression",
                    name: "cn",
                    minWidth: "50px",
                    startWithNewLine: false,
                    title: {
                        no: "cN"
                    },
                    expression: "" +
                        "iif({funnUtredning} != 1, '', " +
                        "iif({regionaleLKPaavist} = 2, 'X', " +
                        "iif({regionaleLKPaavist} = 0, '0', " +
                        "iif({regionaleLKPaavist} = 1, '1'))))"
                },
                {
                    type: "expression",
                    name: "cm",
                    minWidth: "50px",
                    startWithNewLine: false,
                    title: {
                        no: "cM"
                    },
                    expression: "" +
                        "iif({funnUtredning} != 1, '', " +
                        "iif({lokalisasjonFjernmet} = 0, '0 ', " +
                        "iif({lokalisasjonFjernmet} = ['fjerneLKmet'], '1a', " +
                        "iif({lokalisasjonFjernmet} = ['skjelettmet'] or {lokalisasjonFjernmet} = ['fjerneLKmet', 'skjelettmet'], '1b', " +
                        "iif({lokalisasjonFjernmet} contains 'annetFjernmet', '1c', '')))))"
                },
                {
                    type: "radiogroup",
                    name: "infiltrerendeKreft",
                    visible: false,
                    visibleIf: "{funnUtredning} = 1  and ({totalvurderingKliniskT} = 0 or {totalvurderingKliniskT} = X) and ({regionaleLKPaavist} = 0 or {regionaleLKPaavist} = 2) and ({fjernmetPaavist} = 0 or {fjernmetPaavist} = 2) ",
                    title: {
                        no: "Klinisk sikker kreft"
                    },
                    description: {
                        no: "Uavhengig av cytologisk/histologisk prøvesvar, kan tilstanden basert på kliniske undersøkelser (inkludert bildediagnostikk og blodprøver) alene klassifiseres som sikker kreft. Sikre pre maligne tilfeller skal ikke meldes Kreftregisteret"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "Ja"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "Usikker"
                            }
                        }
                    ],
                    colCount: 2
                }
            ],
            visible: false,
            visibleIf: "{funnUtredning} = 1",
            title: {
                no: "Klinisk TNM"
            }
        },
        {
            name: "laboratorium",
            elements: [
                {
                    type: "dropdown",
                    name: "labnavnHF",
                    title: {
                        no: "Laboratorium"
                    },
                    enableIf: "{labnavnHFIkkeRelevant} empty",
                    isRequired: true,
                    requiredIf: "{labnavnHFIkkeRelevant} empty",
                    choicesOrder: "asc",
                    choicesByUrl: {
                        url: "https://metadata.kreftregisteret.no/rest/v1/metadata/values/m_labAngittAvKliniker",
                        valueName: "value",
                        titleName: "description"
                    },
                    optionsCaption: {
                        no: "Velg..."
                    },
                    renderAs: "dropdown-react"
                },
                {
                    type: "checkbox",
                    name: "labnavnHFIkkeRelevant",
                    startWithNewLine: false,
                    titleLocation: "hidden",
                    choices: [
                        {
                            value: "true",
                            text: {
                                no: "Ikke relevant"
                            }
                        }
                    ]
                },
                {
                    type: "comment",
                    name: "labnavnHFSpesifiser",
                    visible: false,
                    visibleIf: "{labnavnHF} = '1'",
                    title: {
                        no: "Spesifiser"
                    }
                },
                {
                    type: "text",
                    name: "preparatnummer",
                    visible: false,
                    maxWidth: "30%",
                    visibleIf: "{labnavnHF} notempty",
                    startWithNewLine: true,
                    title: {
                        no: "Preparatnummer"
                    }
                }
            ],
            title: {
                no: "Patologilaboratorium"
            }
        },
        {
            name: "oppfolging",
            elements: [
                {
                    type: "dropdown",
                    name: "videreTiltakUtredning",
                    titleLocation: "hidden",
                    isRequired: true,
                    choicesOrder: "asc",
                    choices: [
                        {
                            value: "6",
                            text: {
                                no: "Kurativt rettet lokalbehandling"
                            }
                        },
                        {
                            value: "5",
                            text: {
                                no: "Aktiv overvåkning (Fortsatt kandidat for kirurgisk behandling)"
                            }
                        },
                        {
                            value: "7",
                            text: {
                                no: "Antihormonell behandling alene"
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "Observasjon / ikke kandidat for radikal behandling"
                            }
                        },
                        {
                            value: "8",
                            text: {
                                no: "Behandlingsbesluttning ikke tatt"
                            }
                        },
                        {
                            value: "9",
                            text: {
                                no: "Kjemoterapi"
                            }
                        },
                        {
                            value: "1",
                            text: {
                                no: "Henvist videre til"
                            }
                        },
                        {
                            value: "99",
                            text: {
                                no: "Ukjent"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    },
                    renderAs: "dropdown-react"
                },
                {
                    type: "dropdown",
                    name: "videreTiltakUtredningSpesifiser",
                    visible: false,
                    visibleIf: "{videreTiltakUtredning} = 4 or {videreTiltakUtredning} = 5 or {videreTiltakUtredning} = 6 or {videreTiltakUtredning} = 7 or {videreTiltakUtredning} = 9 or {videreTiltakUtredning} = 1",
                    title: {
                        no: "Behandlingssted"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "Egen institusjon"
                            },
                            visibleIf: "{videreTiltakUtredning} != 1"
                        },
                        {
                            value: "2",
                            text: {
                                no: "Annen norsk institusjon / spesialist"
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "Allmennpraktiker"
                            },
                            visibleIf: "{videreTiltakUtredning} = 4 or {videreTiltakUtredning} = 5 or {videreTiltakUtredning} = 7"
                        },
                        {
                            value: "5",
                            text: {
                                no: "Samarbeid egen institusjon og allmennpraktiker"
                            },
                            visibleIf: "{videreTiltakUtredning} = 4 or {videreTiltakUtredning} = 5 or {videreTiltakUtredning} = 7"
                        },
                        {
                            value: "3",
                            text: {
                                no: "Utlandet (spesifiser)"
                            }
                        },
                        {
                            value: "99",
                            text: {
                                no: "Ukjent"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    },
                    renderAs: "dropdown-react"
                },
                {
                    type: "comment",
                    name: "videreTiltakUtredningSpesifiser2",
                    maxHeight: "50px",
                    visible: false,
                    visibleIf: "{videreTiltakUtredningSpesifiser} = 3",
                    title: {
                        no: "Spesifiser"
                    }
                },
                {
                    type: "text",
                    name: "videreTiltakUtredningDato",
                    visible: false,
                    visibleIf: "{videreTiltakUtredning} = 7",
                    title: {
                        no: "Behandlingsdato"
                    },
                    inputType: "date"
                }
            ],
            title: {
                no: "Oppfølging/tiltak"
            }
        },
        {
            name: "kommentarfelt",
            elements: [
                {
                    type: "comment",
                    name: "kommentar",
                    title: {
                        no: "Kommentarer til utfylling av meldingen"
                    }
                }
            ],
            title: {
                no: "Kommentar"
            }
        },
        {
            name: "melder",
            elements: [
                {
                    type: "text",
                    name: "meldeDato",
                    title: {
                        no: "Meldedato"
                    },
                    defaultValueExpression: "today()",
                    isRequired: true,
                    inputType: "date"
                },
                {
                    type: "text",
                    name: "meldersNavn",
                    startWithNewLine: true,
                    title: {
                        no: "Melders navn"
                    },
                    isRequired: true
                },
                {
                    type: "text",
                    name: "melderID",
                    startWithNewLine: false,
                    title: {
                        no: "Melder ID"
                    }
                }
            ],
            title: {
                no: "Melder"
            }
        }
    ],
    triggers: [
        {
            type: "setvalue",
            expression: "{fodselnummerUtland} notempty",
            setToName: "fodselsnummerHF"
        },
        {
            type: "setvalue",
            expression: "{datoMRDiagnostikkUkjent} notempty",
            setToName: "datoMRDiagnostikk"
        },
        {
            type: "setvalue",
            expression: "{labnavnHFIkkeRelevant} notempty",
            setToName: "labnavnHF"
        },
        {
            type: "setvalue",
            expression: "{utredningsmetodeFjernmet} contains 'utredningsmetodeFjernmetUkjent'",
            setToName: "utredningsmetodeFjernmet",
            setValue: [
                "utredningsmetodeFjernmetUkjent"
            ]
        },
        {
            type: "setvalue",
            expression: "{prostatavolumUkjent}  notempty",
            setToName: "prostatavolum"
        },
        {
            type: "setvalue",
            expression: "{spsa} notempty",
            setToName: "psaverdi"
        },
        {
            type: "setvalue",
            expression: "{spsa} contains 'psaverdiIkkeTatt'",
            setToName: "spsa",
            setValue: [
                "psaverdiIkkeTatt"
            ]
        },
        {
            type: "setvalue",
            expression: "{spsa} contains 'psaverdiUkjent'",
            setToName: "spsa",
            setValue: [
                "psaverdiUkjent"
            ]
        }
    ],
    calculatedValues: [
        {
            name: "sykdomsutbredelseTitle",
            expression: "iif({funnUtredning} = 1, 'Sykdomsutbredelse etter ferdig primærutredning og før primærbehandling', 'Sykdomsutbredelse ved utredning av metastase(r)')"
        }
    ],
    showQuestionNumbers: "off",
    clearInvisibleValues: "onHidden",
    checkErrorsMode: "onValueChanged",
    questionsOnPageMode: "singlePage"
};

export default SurveyJsonUtredning;

