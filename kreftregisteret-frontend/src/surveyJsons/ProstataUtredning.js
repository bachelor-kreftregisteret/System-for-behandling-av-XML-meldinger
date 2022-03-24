import 'survey-react/survey.css';

const SurveyJsonUtredning = {
    locale: "no",
    title: "UTREDNING",
    logoPosition: "right",
    pages: [
        {
            name: "pasientInstitusjon",
            elements: [
                {
                    type: "text",
                    name: "fodselsnummerHF",
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
                    ],
                    inputType: "number"
                },
                {
                    type: "checkbox",
                    name: "fodselnummerUtland",
                    startWithNewLine: false,
                    title: {
                        no: "ㅤ"
                    },
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
                    minWidth: "350px",
                    maxWidth: "450px",
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
                    name: "sykehusnavnRHF",
                    title: {
                        no: "Sykehus"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "Helse Sør-Øst"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "Helse Vest"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "Helse Midt"
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "Helse Nord"
                            }
                        },
                        {
                            value: "5",
                            text: {
                                no: "Spesialistsentre og private"
                            }
                        },
                        {
                            value: "6",
                            text: {
                                no: "Annet"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    },
                    requiredErrorText: {
                        no: "Velg et sykehus"
                    }
                },
                {
                    type: "dropdown",
                    name: "sykehusnavnHFSorOst",
                    visible: false,
                    visibleIf: "{sykehusnavnRHF} = 1",
                    startWithNewLine: false,
                    title: {
                        no: "Spesifiser sykehus"
                    },
                    titleLocation: "top",
                    isRequired: true,
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
                            value: "1",
                            text: {
                                no: "Annet"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg…"
                    }
                },
                {
                    type: "dropdown",
                    name: "sykehusnavnHFVest",
                    visible: false,
                    visibleIf: "{sykehusnavnRHF} = 2",
                    startWithNewLine: false,
                    title: {
                        no: "Spesifiser sykehus"
                    },
                    titleLocation: "top",
                    isRequired: true,
                    choices: [
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
                            value: "1",
                            text: {
                                no: "Annet"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg…"
                    }
                },
                {
                    type: "dropdown",
                    name: "sykehusnavnHFMidt",
                    visible: false,
                    visibleIf: "{sykehusnavnRHF} = 3",
                    startWithNewLine: false,
                    title: {
                        no: "Spesifiser sykehus"
                    },
                    titleLocation: "top",
                    isRequired: true,
                    choices: [
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
                            value: "1",
                            text: {
                                no: "Annet"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg…"
                    }
                },
                {
                    type: "dropdown",
                    name: "sykehusnavnHFNord",
                    visible: false,
                    visibleIf: "{sykehusnavnRHF} = 4",
                    startWithNewLine: false,
                    title: {
                        no: "Spesifiser sykehus"
                    },
                    titleLocation: "top",
                    isRequired: true,
                    choices: [
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
                            value: "1",
                            text: {
                                no: "Annet"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg…"
                    }
                },
                {
                    type: "dropdown",
                    name: "sykehusnavnSpesSenter",
                    visible: false,
                    visibleIf: "{sykehusnavnRHF} = 5",
                    startWithNewLine: false,
                    title: {
                        no: "Spesifiser sykehus"
                    },
                    titleLocation: "top",
                    isRequired: true,
                    choices: [
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
                        "1316",
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
                            value: "1",
                            text: {
                                no: "Annet"
                            }
                        },
                        {
                            value: "6084",
                            text: {
                                no: "Aleris Colosseum-Nobel, Oslo"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    }
                },
                {
                    type: "text",
                    name: "sykehusnavnHFSpesifiser",
                    visible: false,
                    visibleIf: "{sykehusnavnRHF} = 6 or {sykehusnavnHFMidt} = 1 or {sykehusnavnHFNord} = 1 or {sykehusnavnHFSorOst} = 1 or {sykehusnavnHFVest} = 1 or {sykehusnavnSpesSenter} = 1",
                    startWithNewLine: false,
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
                    }
                },
                {
                    type: "text",
                    name: "avdelingsnavnHFSpesifiser",
                    visible: false,
                    visibleIf: "{avdelingsnavn} = '1'",
                    startWithNewLine: false,
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
                    minWidth: "350px",
                    maxWidth: "550px",
                    titleLocation: "hidden",
                    defaultValue: "1",
                    requiredErrorText: {
                        no: "Velg en"
                    },
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "Primærtumor (med eller uten metastase(r))"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "Kun metastase(r)"
                            }
                        }
                    ],
                    colCount: 2
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
                    minWidth: "200px",
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
                            regex: "^([1-9]\\d{0,5}|[1-9]\\d{0,5},\\d)$"
                        }
                    ],
                    // Har ikke inputType: "number" siden surveyjs tillater "," som input, men ikke som gyldig nummer
                    inputType: "text"
                },
                {
                    type: "checkbox",
                    name: "spsa",
                    minWidth: "150px",
                    maxWidth: "300px",
                    startWithNewLine: false,
                    title: {
                        no: "ㅤ"
                    },
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
                    maxWidth: "600px",
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
                    maxWidth: "600px",
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
                    ]
                },
                {
                    type: "text",
                    name: "prostatavolum",
                    minWidth: "220px",
                    maxWidth: "300px",
                    title: {
                        no: "Prostatavolum"
                    },
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
                    maxWidth: "300px",
                    startWithNewLine: false,
                    title: {
                        no: "ㅤ"
                    },
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
                    maxWidth: "350px",
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
                    visible: false,
                    visibleIf: "{mrdiagnostikk} = 1",
                    maxWidth: "450px",
                    startWithNewLine: false,
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
                    title: {
                        no: "ㅤ"
                    },
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
                    type: "text",
                    name: "annetBildediagnostikkSpesifiser2",
                    visible: false,
                    visibleIf: "{annetBildediagnostikk} = 1",
                    startWithNewLine: false,
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
                                no: " TUR-P"
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
                    type: "text",
                    name: "annetVevsproverSpesifiser2",
                    visible: false,
                    visibleIf: "{vevsproverUS} contains 'annetVevsprover'",
                    startWithNewLine: false,
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
                    choices: [
                        {
                            value: "21",
                            text: {
                                no: "AHUS, Akershus universitetssykehus"
                            }
                        },
                        {
                            value: "03",
                            text: {
                                no: "Fürst Patologi"
                            }
                        },
                        {
                            value: "07",
                            text: {
                                no: "Haukeland universitetssjukehus"
                            }
                        },
                        {
                            value: "34",
                            text: {
                                no: "Helse Fonna, Haugesund sjukehus"
                            }
                        },
                        {
                            value: "Helse Førde, Førde sjukehus26",
                            text: {
                                no: "Helse Førde, Førde sjukehus"
                            }
                        },
                        {
                            value: "10",
                            text: {
                                no: "Helse Møre og Romsdal, Molde sjukehus"
                            }
                        },
                        {
                            value: "17",
                            text: {
                                no: "Helse Sunnmøre, Ålesund sjukehus"
                            }
                        },
                        {
                            value: "18",
                            text: {
                                no: "Nordlandssykehuset, Bodø"
                            }
                        },
                        {
                            value: "06",
                            text: {
                                no: "Oslo universitetssykehus, Aker"
                            }
                        },
                        {
                            value: "01",
                            text: {
                                no: "Oslo universitetssykehus, Radiumhospitalet"
                            }
                        },
                        {
                            value: "02",
                            text: {
                                no: "Oslo universitetssykehus, Rikshospitalet"
                            }
                        },
                        {
                            value: "05",
                            text: {
                                no: "Oslo universitetssykehus, Ullevål"
                            }
                        },
                        {
                            value: "19",
                            text: {
                                no: "Stavanger universitetssjukehus"
                            }
                        },
                        {
                            value: "08",
                            text: {
                                no: "St. Olavs Hospital"
                            }
                        },
                        {
                            value: "15",
                            text: {
                                no: "Sykehuset Innlandet, Lillehammer"
                            }
                        },
                        {
                            value: "14",
                            text: {
                                no: "Sykehuset i Telemark, Skien"
                            }
                        },
                        {
                            value: "23",
                            text: {
                                no: "Sykehuset i Vestfold, Tønsberg"
                            }
                        },
                        {
                            value: "12",
                            text: {
                                no: "Sykehuset Østfold, Kalnes"
                            }
                        },
                        {
                            value: "20",
                            text: {
                                no: "Sørlandet sykehus, Kristiansand"
                            }
                        },
                        {
                            value: "11",
                            text: {
                                no: "Unilabs Laboratoriemedisin"
                            }
                        },
                        {
                            value: "13",
                            text: {
                                no: "UNN, Universitetssykehuset i Nord-Norge"
                            }
                        },
                        {
                            value: "16",
                            text: {
                                no: "Vestre Viken HF, Sykehuset Buskerud, Drammen"
                            }
                        },
                        {
                            value: "1",
                            text: {
                                no: "Annet laboratorium"
                            }
                        },
                        {
                            value: "99",
                            text: {
                                no: "Ukjent"
                            }
                        }
                    ]
                },
                {
                    type: "checkbox",
                    name: "labnavnHFIkkeRelevant",
                    startWithNewLine: false,
                    title: {
                        no: "ㅤ"
                    },
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
                    type: "text",
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
                    visibleIf: "{labnavnHF} notempty",
                    startWithNewLine: false,
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
            name: "sykdomsutbredelse",
            elements: [
                {
                    type: "dropdown",
                    name: "palpatoriskTumorHoyre",
                    visibleIf: "{funnUtredning} = 1",
                    minWidth: "450px",
                    title: {
                        no: "Palpatorisk T-stadium høyre side (laveste stadium velges ved tvil)"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "Ikke palpabel tumor (tilsvarende T0/T1)"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "Tumor uten ekstraprostatisk vekst (tilsvarende T2)"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "Ekstraprostatisk vekst (tilsvarende T3a)"
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "Innvekst i vesikler (tilsvarende T3b)"
                            }
                        },
                        {
                            value: "5",
                            text: {
                                no: "Innvekst i omliggende vev (tilsvarende T4)"
                            }
                        },
                        {
                            value: "6",
                            text: {
                                no: "Ikke vurdert / kan ikke vurderes (tilsvarende TX)"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    }
                },
                {
                    type: "dropdown",
                    name: "palpatoriskTumorVenstre",
                    visibleIf: "{funnUtredning} = 1",
                    minWidth: "450px",
                    startWithNewLine: false,
                    title: {
                        no: "Palpatorisk T-stadium venstre side (laveste stadium velges ved tvil)"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "Ikke palpabel tumor (tilsvarende T0/T1)"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "Tumor uten ekstraprostatisk vekst (tilsvarende T2)"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "Ekstraprostatisk vekst (tilsvarende T3a)"
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "Innvekst i vesikler (tilsvarende T3b)"
                            }
                        },
                        {
                            value: "5",
                            text: {
                                no: "Innvekst i omliggende vev (tilsvarende T4)"
                            }
                        },
                        {
                            value: "6",
                            text: {
                                no: "Ikke vurdert / kan ikke vurderes (tilsvarende TX)"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    }
                },
                {
                    type: "text",
                    name: "samletPalpatoriskTumor",
                    visibleIf: "{funnUtredning} = 1",
                    minWidth: "450px",
                    title: {
                        no: "Samlet palpatorisk T-stadium"
                    },
                    readOnly: true
                },
                {
                    type: "dropdown",
                    name: "piradshoyre",
                    visible: false,
                    visibleIf: "{mrdiagnostikk} = 1",
                    minWidth: "450px",
                    title: {
                        no: "PI-RADS høyre side (laveste stadium velges ved tvil)"
                    },
                    isRequired: true,
                    choices: [
                        "1",
                        "2",
                        "3",
                        "4",
                        "5",
                        {
                            value: "99",
                            text: {
                                no: "Ukjent"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    }
                },
                {
                    type: "dropdown",
                    name: "piradsvenstre",
                    visible: false,
                    visibleIf: "{mrdiagnostikk} = 1",
                    minWidth: "450px",
                    startWithNewLine: false,
                    title: {
                        no: "PI-RADS venstre side (laveste stadium velges ved tvil)"
                    },
                    isRequired: true,
                    choices: [
                        "1",
                        "2",
                        "3",
                        "4",
                        "5",
                        {
                            value: "99",
                            text: {
                                no: "Ukjent"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    }
                },
                {
                    type: "dropdown",
                    name: "mrbasertKliniskTHoyre",
                    visible: false,
                    visibleIf: "{piradshoyre} = 4 or {piradshoyre} = 5",
                    minWidth: "450px",
                    title: {
                        no: "MR-basert T-stadium høyre side (laveste stadium velges ved tvil)"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "Tumor uten ekstraprostatisk vekst (tilsvarende T2)"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "Ekstraprostatisk vekst (tilsvarende T3a)"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "Innvekst i vesikler (tilsvarende T3b)"
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "Innvekst i omliggende vev (tilsvarende T4)"
                            }
                        },
                        {
                            value: "5",
                            text: {
                                no: "Ikke vurdert / kan ikke vurderes (tilsvarende TX)"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    }
                },
                {
                    type: "dropdown",
                    name: "mrbasertKliniskTVenstre",
                    visible: false,
                    visibleIf: "{piradsvenstre} = 4 or {piradsvenstre} = 5",
                    minWidth: "450px",
                    startWithNewLine: false,
                    title: {
                        no: "MR-basert T-stadium venstre side (laveste stadium velges ved tvil)"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "1",
                            text: {
                                no: "Tumor uten ekstraprostatisk vekst (tilsvarende T2)"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "Ekstraprostatisk vekst (tilsvarende T3a)"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "Innvekst i vesikler (tilsvarende T3b)"
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "Innvekst i omliggende vev (tilsvarende T4)"
                            }
                        },
                        {
                            value: "5",
                            text: {
                                no: "Ikke vurdert / kan ikke vurderes (tilsvarende TX)"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    }
                },
                {
                    type: "text",
                    name: "samletMRBasertKliniskT",
                    visible: false,
                    visibleIf: "{piradshoyre} = 4 or {piradshoyre} = 5 or {piradsvenstre} = 4 or {piradsvenstre} = 5",
                    minWidth: "200px",
                    maxWidth: "250px",
                    title: {
                        no: "Samlet MR-basert T-stadium"
                    },
                    readOnly: true
                },
                {
                    type: "dropdown",
                    name: "totalVurderingKliniskT",
                    visibleIf: "{funnUtredning} = 1",
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
                    ]
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
                    ]
                },
                {
                    type: "radiogroup",
                    name: "regionaleLKPaavist",
                    title: {
                        no: "Er regionale lymfeknutemetastaser påvist (N-sykdom)?"
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
                    type: "text",
                    name: "annenDiagnostikkLKSpesifiser",
                    visible: false,
                    visibleIf: "{utredningsmetodeLK} = 5",
                    startWithNewLine: false,
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
                    type: "text",
                    name: "annetFjernmetSpesifiser",
                    visible: false,
                    visibleIf: "{lokalisasjonFjernmet} contains 'annetFjernmet'",
                    startWithNewLine: false,
                    title: {
                        no: "Spesifiser"
                    }
                },
                {
                    type: "checkbox",
                    name: "utredningsmetodeMetastaser",
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
                    type: "text",
                    name: "annenDiagnostikkMetSpesifiser",
                    visible: false,
                    visibleIf: "{utredningsmetodeMetastaser} contains 'annenDiagnostikkMet'",
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
                    startWithNewLine: false,
                    title: {
                        no: "cT"
                    },
                    expression: "{totalVurderingKliniskT}"
                },
                {
                    type: "expression",
                    name: "cn",
                    startWithNewLine: false,
                    title: {
                        no: "cN"
                    }
                },
                {
                    type: "expression",
                    name: "cm",
                    startWithNewLine: false,
                    title: {
                        no: "cM"
                    }
                },
                {
                    type: "radiogroup",
                    name: "infiltrerendeKreft",
                    visible: false,
                    visibleIf: "{funnUtredning} = 1  and ({totalvurderingKliniskT} = 0 or {totalvurderingKliniskT} = X) and ({regionaleLKPaavist} = 0 or {regionaleLKPaavist} = 2) and ({fjernmetPaavist} = 0 or {fjernmetPaavist} = 2) ",
                    title: {
                        no: "Klinisk sikker kreft"
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
            name: "oppfolging",
            elements: [
                {
                    type: "dropdown",
                    name: "videreTiltakUtredning",
                    titleLocation: "hidden",
                    isRequired: true,
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
                                no: "Aktiv overvåkning"
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
                    ]
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
                    }
                },
                {
                    type: "text",
                    name: "videreTiltakUtredningSpesifiser2",
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
                    type: "text",
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
                    defaultValue: "=today()",
                    isRequired: true,
                    inputType: "date"
                },
                {
                    type: "text",
                    name: "meldersNavn",
                    startWithNewLine: false,
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
            expression: "{utredningsmetodeMetastaser} contains 'utredningsmetodeFjernmetUkjent'",
            setToName: "utredningsmetodeMetastaser",
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
            expression: "{palpatoriskTumorHoyre} = 6 or {palpatoriskTumorVenstre} = 6",
            setToName: "samletPalpatoriskTumor",
            setValue: "TX"
        },
        {
            type: "setvalue",
            expression: "{palpatoriskTumorHoyre} = 1 or {palpatoriskTumorVenstre} = 1",
            setToName: "samletPalpatoriskTumor",
            setValue: "T0/T1"
        },
        {
            type: "setvalue",
            expression: "{palpatoriskTumorHoyre} = 2 or {palpatoriskTumorVenstre} = 2",
            setToName: "samletPalpatoriskTumor",
            setValue: "T2"
        },
        {
            type: "setvalue",
            expression: "{palpatoriskTumorHoyre} = 3 or {palpatoriskTumorVenstre} = 3",
            setToName: "samletPalpatoriskTumor",
            setValue: "T3a"
        },
        {
            type: "setvalue",
            expression: "{palpatoriskTumorHoyre} = 4 or {palpatoriskTumorVenstre} = 4",
            setToName: "samletPalpatoriskTumor",
            setValue: "T3b"
        },
        {
            type: "setvalue",
            expression: "{palpatoriskTumorHoyre} = 5 or {palpatoriskTumorVenstre} = 5",
            setToName: "samletPalpatoriskTumor",
            setValue: "T4"
        },
        {
            type: "setvalue",
            expression: "{PpalpatoriskTumorHoyre} empty and {palpatoriskTumorVenstre} empty",
            setToName: "samletPalpatoriskTumor"
        },
        {
            type: "setvalue",
            expression: "{mrbasertKliniskTHoyre} = 5 or {mrbasertKliniskTVenstre} = 5",
            setToName: "samletMRBasertKliniskT",
            setValue: "TX"
        },
        {
            type: "setvalue",
            expression: "{mrbasertKliniskTHoyre} = 1 or {mrbasertKliniskTVenstre} = 1",
            setToName: "samletMRBasertKliniskT",
            setValue: "T2"
        },
        {
            type: "setvalue",
            expression: "{mrbasertKliniskTHoyre} = 2 or {mrbasertKliniskTVenstre} = 2",
            setToName: "samletMRBasertKliniskT",
            setValue: "T3a"
        },
        {
            type: "setvalue",
            expression: "{mrbasertKliniskTHoyre} = 3 or {mrbasertKliniskTVenstre} = 3",
            setToName: "samletMRBasertKliniskT",
            setValue: "T3b"
        },
        {
            type: "setvalue",
            expression: "{mrbasertKliniskTHoyre} = 4 or {mrbasertKliniskTVenstre} = 4",
            setToName: "samletMRBasertKliniskT",
            setValue: "T4"
        },
        {
            type: "setvalue",
            expression: "{mrbasertKliniskTHoyre} empty and {mrbasertKliniskTVenstre} empty",
            setToName: "samletMRBasertKliniskT"
        },
        {
            type: "setvalue",
            expression: "{piradshoyre} <> 4 and {piradshoyre} <> 5",
            setToName: "mrbasertKliniskTHoyre"
        },
        {
            type: "setvalue",
            expression: "{piradsvenstre} <> 4 and {piradsvenstre} <> 5",
            setToName: "mrbasertKliniskTVenstre"
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
        },
        {
            type: "setvalue",
            expression: "{regionaleLKPaavist} = 2",
            setToName: "cn",
            setValue: "X"
        },
        {
            type: "setvalue",
            expression: "{regionaleLKPaavist} = 0",
            setToName: "cn",
            setValue: "0"
        },
        {
            type: "setvalue",
            expression: "{regionaleLKPaavist} = 1",
            setToName: "cn",
            setValue: "1"
        },
        {
            type: "setvalue",
            expression: "{fjernmetPaavist} = 2",
            setToName: "cm"
        },
        {
            type: "setvalue",
            expression: "{fjernmetPaavist} = 0",
            setToName: "cm",
            setValue: "0"
        },
        {
            type: "setvalue",
            expression: "{lokalisasjonFjernmet} = ['fjerneLKmet']",
            setToName: "cm",
            setValue: "1a"
        },
        {
            type: "setvalue",
            expression: "{lokalisasjonFjernmet} = ['skjelettmet'] or {lokalisasjonFjernmet} = ['fjerneLKmet', 'skjelettmet']",
            setToName: "cm",
            setValue: "1b"
        },
        {
            type: "setvalue",
            expression: "{lokalisasjonFjernmet} contains 'annetFjernmet'",
            setToName: "cm",
            setValue: "1c"
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

