const SurveyJSONStraale = {
    name: "KliniskProstataStraale",
    locale: "no",
    title: "Strålebehandling",
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
            name: "behandling",
            elements: [
                {
                    type: "radiogroup",
                    name: "primaerEllerPostop",
                    titleLocation: "hidden",
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "Primær strålebehandling"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "Postoperativ strålebehandling"
                            }
                        }
                    ],
                    colCount: 2
                }
            ],
            title: {
                no: "Årsak til melding"
            }
        },
        {
            name: "preStraaleInformasjon",
            elements: [
                {
                    type: "radiogroup",
                    name: "aktivMonitorering",
                    title: {
                        no: "Har pasienten vært aktivt monitorert?"
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
                    type: "radiogroup",
                    name: "revurderingSykdomsutrbredelse",
                    title: {
                        no: "Er det gjort ny vurdering av sykdomsutbredelse (restaging) etter primær diagnose?"
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
                }
            ],
            visible: false,
            visibleIf: "{primaerEllerPostop} = 1",

            title: {
                no: "Informasjon før strålebehandling"
            }
        },
        {
            name: "sykdomsutbredelse",
            elements: [
                {
                    type: "dropdown",
                    name: "palpatoriskTumorHoyre",
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
                    title: {
                        no: "Samlet palpatorisk T-stadium"
                    },
                    expression: "" +
                        "iif({palpatoriskTumorHoyre} = 5 or {palpatoriskTumorVenstre} = 5, 'T4', " +
                        "iif({palpatoriskTumorHoyre} = 4 or {palpatoriskTumorVenstre} = 4, 'T3b', " +
                        "iif({palpatoriskTumorHoyre} = 3 or {palpatoriskTumorVenstre} = 3, 'T3a', " +
                        "iif({palpatoriskTumorHoyre} = 2 or {palpatoriskTumorVenstre} = 2, 'T2', " +
                        "iif({palpatoriskTumorHoyre} = 1 or {palpatoriskTumorVenstre} = 1, 'T0/T1', " +
                        "iif({palpatoriskTumorHoyre} = 6 or {palpatoriskTumorVenstre} = 6, 'TX', ''))))))"
                },
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
                    maxWidth: "100px",
                    minWidth: "100px",
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
                    description: {
                        no: "TNM på diagnosetidspunktet baseres på all relevant utredning som er gjort før primærbehandling inkludert klinisk undersøkelse, bildediagnostikk, endoskopi, biopsi og kirurgisk eksplorasjon."
                    }
                    ,
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
                    title: {
                        no: "Totalvurdering av klinisk T (laveste stadium velges ved tvil)"
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
                    rowCount: 3
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
                    rowCount: 3
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
                    rowCount: 3
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
                            value: "utredningsmetodeFjernmetUkjent",
                            text: {
                                no: "Ukjent"
                            }
                        },
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

                    ],
                    colCount: 1
                },
                {
                    type: "comment",
                    name: "annenDiagnostikkMetSpesifiser",
                    visible: false,
                    visibleIf: "{utredningsmetodeFjernmet} contains 'annenDiagnostikkMet'",
                    title: {
                        no: "Spesifiser"
                    }
                }
            ],
            visible: false,
            visibleIf: "{revurderingSykdomsutrbredelse} = 1",
            title: {
                no: "Sykdomsutbredelse før strålebehandling"
            }
        },
        {
            name: "preStraaleInformasjonBehandling",
            elements: [
                {
                    type: "text",
                    name: "preStraalePSAVerdi",
                    maxWidth: "30%",
                    title: {
                        no: "PSA før strålebehandling og eventuell neoadjuvant endokrin behandling"
                    },
                    enableIf: "{preStraalePSAVerdiUkjent} empty",
                    isRequired: true,
                    requiredIf: "{preStraalePSAVerdiUkjent} empty",
                    validators: [
                        {
                            type: "regex",
                            text: "Må være mellom 0 og 1000000 med maks to desimaler",
                            regex: "^([1-9]\\d{0,5}|\\d{1,6},\\d{1,2})$"
                        }
                    ]
                },
                {
                    type: "checkbox",
                    name: "preStraalePSAVerdiUkjent",
                    maxWidth: "100px",
                    minWidth: "100px",
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
                    name: "endokrinBehandling",
                    title: {
                        no: "Skal det gis endokrin behandling i tillegg til strålebehandling?"
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
                    type: "text",
                    name: "datoOppstartEndokrinBeh",
                    maxWidth: "140px",
                    minWidth: "unset",
                    visible: false,
                    visibleIf: "{endokrinBehandling} = 1",
                    title: {
                        no: "Dato for oppstart av endokrin behandling"
                    },
                    enableIf: "{datoOppstartEndokrinBehUkjent} empty",
                    isRequired: true,
                    requiredIf: "{datoOppstartEndokrinBehUkjent} empty",
                    validators: [
                        {
                            type: "expression",
                            text: "Startdato ikke være dagens eller senere dato",
                            expression: "getDate({datoOppstartEndokrinBeh}) < today()"
                        }
                    ],
                    inputType: "date"
                },
                {
                    type: "checkbox",
                    name: "datoOppstartEndokrinBehUkjent",
                    maxWidth: "100px",
                    minWidth: "100px",
                    visible: false,
                    visibleIf: "{endokrinBehandling} = 1",
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
                    type: "text",
                    name: "varighetEndokrinBehandling",
                    maxWidth: "140px",
                    minWidth: "unset",
                    visible: false,
                    visibleIf: "{endokrinBehandling} = 1",
                    title: {
                        no: "Planlagt varighet av endokrin behandling gitt i antall måneder"
                    },
                    enableIf: "{varighetEndokrinBehUkjent} empty",
                    isRequired: true,
                    requiredIf: "{varighetEndokrinBehUkjent} empty",
                    requiredErrorText: {
                        no: "Må være heltall mellom 0 og 1000"
                    },
                    inputType: "number",
                    min: 1,
                    max: 999,
                    minErrorText: {
                        no: "Kan ikke være mindre enn {0}"
                    },
                    maxErrorText: {
                        no: "Kan ikke være større enn {0}"
                    }
                },
                {
                    type: "checkbox",
                    name: "varighetEndokrinBehUkjent",
                    maxWidth: "100px",
                    minWidth: "100px",
                    visible: false,
                    visibleIf: "{endokrinBehandling} = 1",
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
            title: {
                no: "Behandling"
            }
        },
        {
            name: "straalebehandling",
            elements: [
                {
                    type: "text",
                    name: "datoOppstartStraale",
                    maxWidth: "140px",
                    minWidth: "unset",
                    title: {
                        no: "Dato for oppstart av strålebehandling"
                    },
                    isRequired: true,
                    inputType: "date"
                },
                {
                    type: "radiogroup",
                    name: "eksternStraalebehandling",
                    title: {
                        no: "Ekstern strålebehandling"
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
                    name: "prostataFRDoseGY",
                    maxWidth: "200px",
                    visible: false,

                    visibleIf: "{eksternStraalebehandling} = 1",
                    title: {
                        no: "Dose per fraksjon, prostata"
                    },
                    enableIf: "{prostataFRDoseUkjent} empty",
                    isRequired: true,
                    requiredIf: "{prostataFRDoseUkjent} empty",
                    validators: [
                        {
                            type: "regex",
                            text: "Må være mellom 0 og 100 med maks to desimaler",
                            regex: "^([1-9]\\d{0,1}|\\d{1,2},\\d{1,2})$"
                        }
                    ]
                },
                {
                    type: "checkbox",
                    name: "prostataFRDoseUkjent",
                    maxWidth: "100px",
                    minWidth: "100px",
                    visible: false,
                    visibleIf: "{eksternStraalebehandling} = 1",
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
                    type: "text",
                    name: "prostataAntFR",
                    maxWidth: "140px",
                    minWidth: "unset",
                    visible: false,
                    visibleIf: "{eksternStraalebehandling} = 1",
                    startWithNewLine: true,
                    title: {
                        no: "Antall fraksjoner"
                    },
                    enableIf: "{prostataAntFRUkjent} empty",
                    isRequired: true,
                    requiredIf: "{prostataAntFRUkjent} empty",
                    requiredErrorText: {
                        no: "Må være heltall mellom 0 og 100"
                    },
                    inputType: "number",
                    min: 1,
                    max: 99,
                    minErrorText: {
                        no: "Kan ikke være mindre enn {0}"
                    },
                    maxErrorText: {
                        no: "Kan ikke være større enn {0}"
                    }
                },
                {
                    type: "checkbox",
                    name: "prostataAntFRUkjent",
                    maxWidth: "100px",
                    minWidth: "100px",
                    visible: false,
                    visibleIf: "{eksternStraalebehandling} = 1",
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
                    name: "lkbekkenStraalebehandling",
                    visible: false,
                    visibleIf: "{eksternStraalebehandling} = 1",
                    title: {
                        no: "Er det utført stråling mot lymfeknuter i bekkenet?"
                    },
                    description: {
                        no: "Lymfeknutestasjoner opptil promontorium, 2 Gy doseekvivalent > 45 Gy"
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
                    type: "radiogroup",
                    name: "hdbrachyterapi",
                    title: {
                        no: "Høydoserate brachyterapi"
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
                    name: "hdbrachyterapiFRDoseGY",
                    maxWidth: "200px",
                    visible: false,
                    visibleIf: "{hdbrachyterapi} = 1",
                    title: {
                        no: "Dose per fraksjon (foreskreven dose, prostata)"
                    },
                    enableIf: "{hdbrachyterapiFRDoseUkjent} empty",
                    isRequired: true,
                    requiredIf: "{hdbrachyterapiFRDoseUkjent} empty",
                    validators: [
                        {
                            type: "regex",
                            text: "Må være mellom 0 og 100 med maks to desimaler",
                            regex: "^([1-9]\\d{0,1}|\\d{1,2},\\d{1,2})$"
                        }
                    ]
                },
                {
                    type: "checkbox",
                    name: "hdbrachyterapiFRDoseUkjent",
                    maxWidth: "100px",
                    minWidth: "100px",
                    visible: false,
                    visibleIf: "{hdbrachyterapi} = 1",
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
                    type: "text",
                    name: "hdbrachyterapiAntFR",
                    maxWidth: "140px",
                    minWidth: "unset",
                    visible: false,
                    visibleIf: "{hdbrachyterapi} = 1",
                    startWithNewLine: true,
                    title: {
                        no: "Antall fraksjoner"
                    },
                    enableIf: "{hdbrachyterapiAntFRUkjent} empty",
                    isRequired: true,
                    requiredIf: "{hdbrachyterapiAntFRUkjent} empty",
                    requiredErrorText: {
                        no: "Må være heltall mellom 0 og 10"
                    },
                    inputType: "number",
                    min: 1,
                    max: 9,
                    minErrorText: {
                        no: "Kan ikke være mindre enn {0}"
                    },
                    maxErrorText: {
                        no: "Kan ikke være større enn {0}"
                    }
                },
                {
                    type: "checkbox",
                    name: "hdbrachyterapiAntFRUkjent",
                    maxWidth: "100px",
                    minWidth: "100px",
                    visible: false,
                    visibleIf: "{hdbrachyterapi} = 1",
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
                    name: "ldbrachyterapi",
                    title: {
                        no: "Lavdoserate brachyterapi"
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
                    name: "behandlingssted",
                    maxWidth: "200px",
                    visible: false,
                    visibleIf: "{ldbrachyterapi} = 1",
                    title: {
                        no: "Behandlingssted"
                    },
                    enableIf: "{behandlingsstedUkjent} empty",
                    isRequired: true,
                    requiredIf: "{behandlingsstedUkjent} empty"
                },
                {
                    type: "checkbox",
                    maxWidth: "100px",
                    minWidth: "100px",
                    name: "behandlingsstedUkjent",
                    visible: false,
                    visibleIf: "{ldbrachyterapi} = 1",
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
                    type: "text",
                    name: "ldbrachyterapiFRDoseGY",
                    maxWidth: "200px",
                    visible: false,
                    visibleIf: "{ldbrachyterapi} = 1",
                    startWithNewLine: true,
                    title: {
                        no: "Dose (foreskreven dose, prostata)"
                    },
                    enableIf: "{ldbrachyterapiFRDoseUkjent} empty",
                    isRequired: true,
                    requiredIf: "{ldbrachyterapiFRDoseUkjent} empty",
                    validators: [
                        {
                            type: "regex",
                            text: "Må være mellom 0 og 1000 med maks to desimaler",
                            regex: "^([1-9]\\d{0,2}|\\d{1,3},\\d{1,2})$"
                        }
                    ]
                },
                {
                    type: "checkbox",
                    name: "ldbrachyterapiFRDoseUkjent",
                    maxWidth: "100px",
                    minWidth: "100px",
                    visibleIf: "{ldbrachyterapi} = 1",
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
            title: {
                no: "Strålebehandling (kurativ strålebehandling)"
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
            expression: "{utredningsmetodeFjernmet} contains 'utredningsmetodeFjernmetUkjent'",
            setToName: "utredningsmetodeFjernmet",
            setValue: [
                "utredningsmetodeFjernmetUkjent"
            ]
        },
        {
            type: "setvalue",
            expression: "{preStraalePSAVerdiUkjent} notempty",
            setToName: "preStraalePSAVerdi"
        },
        {
            type: "setvalue",
            expression: "{datoOppstartEndokrinBehUkjent} notempty",
            setToName: "datoOppstartEndokrinBeh"
        },
        {
            type: "setvalue",
            expression: "{varighetEndokrinBehUkjent} notempty",
            setToName: "varighetEndokrinBehandling"
        },
        {
            type: "setvalue",
            expression: "{prostataFRDoseUkjent} notempty",
            setToName: "prostataFRDoseGY"
        },
        {
            type: "setvalue",
            expression: "{prostataAntFRUkjent} notempty",
            setToName: "prostataAntFR"
        },
        {
            type: "setvalue",
            expression: "{hdbrachyterapiFRDoseUkjent} notempty",
            setToName: "hdbrachyterapiFRDoseGY"
        },
        {
            type: "setvalue",
            expression: "{hdbrachyterapiAntFRUkjent} notempty",
            setToName: "hdbrachyterapiAntFR"
        },
        {
            type: "setvalue",
            expression: "{behandlingsstedUkjent} notempty",
            setToName: "behandlingssted"
        },
        {
            type: "setvalue",
            expression: "{ldbrachyterapiFRDoseUkjent} notempty",
            setToName: "ldbrachyterapiFRDoseGY"
        }
    ],
    showQuestionNumbers: "off",
    clearInvisibleValues: "onHidden",
    checkErrorsMode: "onValueChanged",
    questionsOnPageMode: "singlePage"
};

export default SurveyJSONStraale;