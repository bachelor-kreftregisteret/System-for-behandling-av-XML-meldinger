import 'survey-react/survey.css';

const surveyJSON ={
    locale: "no",
    title: "UTREDNING ",
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
                    enableIf: "{fodselnummerUtland} <> ['item1']",
                    isRequired: true,
                    requiredIf: "{fodselnummerUtland} <> ['item1']",
                    requiredErrorText: {
                        no: "Skriv inn gyldig fødselsnummer "
                    },
                    validators: [
                        {
                            type: "regex",
                            regex: "((0[1-9]|[1-2]\\d|3[0-1])(0[1-9]|1[0-2])\\d{7})?"
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
                            value: "item1",
                            text: {
                                no: "Ikke norsk personnummer"
                            }
                        }
                    ]
                },
                {
                    type: "text",
                    name: "navnPasient",
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
                    ]
                },
                {
                    type: "dropdown",
                    name: "sykehusnavnHFSorOst",
                    visible: false,
                    visibleIf: "{sykehusnavnRHF} = 1",
                    titleLocation: "hidden",
                    isRequired: true,
                    choices: [
                        "item1",
                        "item2",
                        "item3",
                        {
                            value: "1",
                            text: {
                                no: "Annet"
                            }
                        }
                    ]
                },
                {
                    type: "dropdown",
                    name: "sykehusnavnHFVest",
                    visible: false,
                    visibleIf: "{sykehusnavnRHF} = 2",
                    titleLocation: "hidden",
                    isRequired: true,
                    choices: [
                        "item1",
                        "item2",
                        "item3",
                        {
                            value: "1",
                            text: {
                                no: "Annet"
                            }
                        }
                    ]
                },
                {
                    type: "dropdown",
                    name: "sykehusnavnHFMidt",
                    visible: false,
                    visibleIf: "{sykehusnavnRHF} = 3",
                    titleLocation: "hidden",
                    isRequired: true,
                    choices: [
                        "item1",
                        "item2",
                        "item3",
                        {
                            value: "1",
                            text: {
                                no: "Annet"
                            }
                        }
                    ]
                },
                {
                    type: "dropdown",
                    name: "sykehusnavnHFNord",
                    visible: false,
                    visibleIf: "{sykehusnavnRHF} = 4",
                    titleLocation: "hidden",
                    isRequired: true,
                    choices: [
                        "item1",
                        "item2",
                        "item3",
                        {
                            value: "1",
                            text: {
                                no: "Annet"
                            }
                        }
                    ]
                },
                {
                    type: "dropdown",
                    name: "sykehusnavnSpesSenter",
                    visible: false,
                    visibleIf: "{sykehusnavnRHF} = 5",
                    titleLocation: "hidden",
                    isRequired: true,
                    choices: [
                        "item1",
                        "item2",
                        "item3",
                        {
                            value: "1",
                            text: {
                                no: "Annet"
                            }
                        }
                    ]
                },
                {
                    type: "text",
                    name: "sykehusnavnHFSpesifiser",
                    visible: false,
                    visibleIf: "{sykehusnavnRHF} = 6 or {sykehusnavnHFMidt} = 1 or {sykehusnavnHFNord} = 1 or {sykehusnavnHFSorOst} = 1 or {sykehusnavnHFVest} = 1 or {sykehusnavnSpesSenter} = 1",
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
                                no: "Urologisk"
                            }
                        },
                        {
                            value: "#01",
                            text: {
                                no: "Kiurgisk"
                            }
                        },
                        {
                            value: "47",
                            text: {
                                no: "Onkologisk"
                            }
                        },
                        {
                            value: "20",
                            text: {
                                no: "Medisinsk"
                            }
                        },
                        {
                            value: "1",
                            text: {
                                no: "Annen"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "Ikke relevant"
                            }
                        }
                    ]
                },
                {
                    type: "text",
                    name: "avdelingsnavnHFSpesifiser",
                    visible: false,
                    visibleIf: "{avdelingsnavn} = 1",
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
                    startWithNewLine: false,
                    title: {
                        no: "PSA-verdi ved diagnosetidspunkt"
                    },
                    enableIf: "{psaverdiValg} empty",
                    isRequired: true,
                    requiredIf: "{psaverdiValg} empty",
                    validators: [
                        {
                            type: "regex",
                            regex: "([1-9]\\d{0,5}|\\d,\\d|[1-9]\\d{1,5},\\d)?"
                        },
                        {
                            type: "numeric"
                        },
                        {
                            type: "regex",
                            regex: "([1-9]\\d{0,5}|\\d,\\d|[1-9]\\d{1,5},\\d)?"
                        }
                    ],
                    inputType: "number"
                },
                {
                    type: "checkbox",
                    name: "psaverdiValg",
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
                    ]
                },
                {
                    type: "text",
                    name: "prostatavolum",
                    title: {
                        no: "Prostatavolum"
                    },
                    isRequired: true,
                    inputType: "number",
                    min: "1",
                    max: "999"
                },
                {
                    type: "checkbox",
                    name: "prostatavolumUkjent",
                    startWithNewLine: false,
                    title: {
                        no: "ㅤ"
                    },
                    choices: [
                        {
                            value: "item1",
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
                    visible: false,
                    visibleIf: "{mrdiagnostikk} = 1",
                    startWithNewLine: false,
                    title: {
                        no: "Utført dato"
                    },
                    enableIf: "{datoMRDiagnostikkUkjent} empty",
                    isRequired: true,
                    requiredIf: "{datoMRDiagnostikkUkjent} empty",
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
                    visibleIf: "{vevsproverUS} contains 'item3'",
                    startWithNewLine: false,
                    title: {
                        no: "Spesifiser"
                    }
                },
                {
                    type: "text",
                    name: "diagnosedato",
                    title: {
                        no: "Dato sykdommen ble bekreftet/diagnosedato (dd.mm.åååå)"
                    },
                    isRequired: true,
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
                        no: "Laboratorium input"
                    },
                    enableIf: "{labnavnHFIkkeRelevant} <> ['item1']",
                    isRequired: true,
                    requiredIf: "{labnavnHFIkkeRelevant} <> ['item1']",
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
                            value: "1",
                            text: {
                                no: "Annet laboratorium"
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
                            value: "item1",
                            text: {
                                no: "Ikke relevent"
                            }
                        }
                    ]
                },
                {
                    type: "text",
                    name: "labnavnHFSpesifiser",
                    visible: false,
                    visibleIf: "{labnavnHF} = 1",
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
                    type: "html",
                    name: "sykdomutbredelseTittel1",
                    visible: false,
                    visibleIf: "{funnUtredning} = 1",
                    html: {
                        no: "Sykdomsutbredelse etter ferdig primærutredning og før primærbehandling"
                    }
                },
                {
                    type: "html",
                    name: "sykdomutbredelseTittel2",
                    visible: false,
                    visibleIf: "{funnUtredning} = 3",
                    html: {
                        no: "Sykdomsutbredelse ved utredning av metastase(r)"
                    }
                },
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
                    visibleIf: "{lokalisasjonFjernmet} contains 'Annet (M1c)'",
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
                    visibleIf: "{utredningsmetodeMetastaser} contains 'Annet'",
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
                        no: "Dato for utredning av metastaser (dd.mm.åååå)"
                    },
                    isRequired: true,
                    inputType: "date"
                }
            ]
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
            expression: "{fodselnummerUtland} = ['item1']",
            setToName: "fodselsnummerHF"
        },
        {
            type: "setvalue",
            expression: "{datoMRDiagnostikkUkjent} notempty",
            setToName: "datoMRDiagnostikk"
        },
        {
            type: "setvalue",
            expression: "{labnavnHFIkkeRelevant} = ['item1']",
            setToName: "labnavnHF"
        },
        {
            type: "setvalue",
            expression: "{utredningsmetodeMetastaser} contains 'Ukjent'",
            setToName: "utredningsmetodeMetastaser"
        },
        {
            type: "setvalue",
            expression: "{prostatavolumUkjent} = ['item1']",
            setToName: "prostatavolum"
        },
        {
            type: "setvalue",
            expression: "{datoMRDiagnostikkUkjent} = ['item1']",
            setToName: "datoMRDiagnostikk"
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
            expression: "{psaverdiValg} notempty",
            setToName: "psaverdi"
        },
        {
            type: "setvalue",
            expression: "{psaverdiValg} contains 'psaverdiIkkeTatt'",
            setToName: "psaverdiValg",
            setValue: [
                "psaverdiIkkeTatt"
            ]
        },
        {
            type: "setvalue",
            expression: "{psaverdiValg} contains 'psaverdiUkjent'",
            setToName: "psaverdiValg",
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
    showQuestionNumbers: "off",
    clearInvisibleValues: "onHidden",
    checkErrorsMode: "onValueChanged",
    questionsOnPageMode: "singlePage"
};

export default surveyJSON;