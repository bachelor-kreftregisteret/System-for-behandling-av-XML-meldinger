const SurveyJsonUtredning = {
    locale: "no",
    title: "Melding etter avsluttet utredning",
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
                    choicesByUrl: {
                        url: 'https://metadata.kreftregisteret.no/rest/v1/metadata/values/m_sykehus',
                        valueName: "value",
                        titleName: "description"
                    },
                    optionsCaption: {
                        no: "Velg..."
                    },
                    renderAs: "dropdown-react"
                },
                {
                    type: "text",
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
                    type: "text",
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
            description: {
                no: "Utredning av primærtumor og samtidig utredning av regionale lymfeknutemetastaser/fjernmetastaser før igangsetting av primærbehandling \n" +
                    "Utredning av regionale lymfeknutemetastaser og/eller fjernmetastaser uten samtidig utredning av primærtumor"
            },
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
                    type: "text",
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
                    type: "text",
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
                    description: {
                        no: "* PI-RADS 5 = Høy sannsynlighet for klinisk signifikant malign tumor som er 15 mm eller større, eller som har ekstraprostatisk vekst.\n" +
                            "* PI-RADS 4 = Høy sannsynlighet for klinisk signifikant malign tumor som er mindre enn 15 mm og uten suspekt ekstraprostatisk vekst.\n" +
                            "* PI-RADS 3 = Intermediær sannsynlighet for klinisk signifikant malign tumor, usikker lesjon, 50/50%.\n" +
                            "* PI-RADS 2 = Lav sannsynlighet for klinisk signifikant malign tumor, benigne funn.\n" +
                            "* PI-RADS 1 = Svært lav sannsynlighet for klinisk signifikant malign tumor, normale funn.\n" +
                            "Klinisk signifikant tumor er definert som histologisk Gleason score 7 eller høyere, og/eller volum større enn 0,5 ccm, og/eller ekstraprostatisk vekst."
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
                    description: {
                        no: "* PI-RADS 5 = Høy sannsynlighet for klinisk signifikant malign tumor som er 15 mm eller større, eller som har ekstraprostatisk vekst.\n" +
                            "* PI-RADS 4 = Høy sannsynlighet for klinisk signifikant malign tumor som er mindre enn 15 mm og uten suspekt ekstraprostatisk vekst.\n" +
                            "* PI-RADS 3 = Intermediær sannsynlighet for klinisk signifikant malign tumor, usikker lesjon, 50/50%.\n" +
                            "* PI-RADS 2 = Lav sannsynlighet for klinisk signifikant malign tumor, benigne funn.\n" +
                            "* PI-RADS 1 = Svært lav sannsynlighet for klinisk signifikant malign tumor, normale funn.\n" +
                            "Klinisk signifikant tumor er definert som histologisk Gleason score 7 eller høyere, og/eller volum større enn 0,5 ccm, og/eller ekstraprostatisk vekst."
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
                    type: "text",
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
                    type: "text",
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
                    type: "text",
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
                    },
                    expression: "iif({regionaleLKPaavist} = 2, 'X', iif({regionaleLKPaavist} = 0, '0', iif({regionaleLKPaavist} = 1, '1')))"
                },
                {
                    type: "expression",
                    name: "cm",
                    startWithNewLine: false,
                    title: {
                        no: "cM"
                    },
                    expression: "iif({fjernmetPaavist} = 0, '0', " +
                        "iif({lokalisasjonFjernmet} = ['fjerneLKmet'], '1a', " +
                        "iif({lokalisasjonFjernmet} = ['skjelettmet'] or {lokalisasjonFjernmet} = ['fjerneLKmet', 'skjelettmet'], '1b', " +
                        "iif({lokalisasjonFjernmet} contains 'annetFjernmet', '1c', ''))))"
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
            name: "oppfolging",
            description: {
                no: "Fortsatt kandidat for kirurgisk behandling"
            },
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
                    defaultValueExpression: "today()",
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

