const SurveyJSONKirugi = {
    locale: "no",
    title: "RADIKAL PROSTATEKTOMI",
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
                    renderAs: "select2",
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
                    }
                },
                {
                    type: "text",
                    name: "sykehusnavnHFSpesifiser",
                    visible: false,
                    visibleIf: "{sykehuskode} = 9998",
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
            name: "preoperativInformasjon",
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
                        no: "Er det gjort ny vurdering av sykdomsutbredelse (restaging) etter primær diagnose?"
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
            title: {
                no: "Preoperativ informasjon"
            }
        },
        {
            name: "sykdomsutbredelse",
            elements: [
                {
                    type: "dropdown",
                    name: "palpatoriskTumorHoyre",
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
                    type: "expression",
                    name: "samletPalpatoriskTumor",
                    minWidth: "450px",
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
                    }
                },
                {
                    type: "dropdown",
                    name: "kliniskVurdertAv",
                    visible: false,
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
                }
            ],
            visible: false,
            visibleIf: "{revurderingSykdomsutrbredelse} = 1",
            title: "Sykdomsutbredelse før prostatektomi"
        },
        {
            name: "behandling",
            elements: [
                {
                    type: "text",
                    name: "preoprPSAVerdi",
                    title: {
                        no: "PSA før prostatektomi og eventuell neoadjuvant endokrin behandling"
                    },
                    enableIf: "{preoprPSAVerdiUkjent} empty",
                    isRequired: true,
                    requiredIf: "{preoprPSAVerdiUkjent} empty",
                    validators: [
                        {
                            type: "regex",
                            text: "Må være mellom 0 og 1000000 med maks ett desimal",
                            regex: "^([1-9]\\d{0,5}|\\d{1,6},\\d)$"
                        }
                    ]
                },
                {
                    type: "checkbox",
                    name: "preoprPSAVerdiUkjent",
                    startWithNewLine: false,
                    title: {
                        no: "⠀"
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
                    name: "neoadjuvantEndokrinBehandling",
                    title: {
                        no: "Er det utført neoadjuvant endokrin behandling?"
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
                    name: "datoOppstartNeoadjBeh",
                    visible: false,
                    visibleIf: "{neoadjuvantEndokrinBehandling} = 1",
                    title: {
                        no: "Startdato for neoadjuvant endokrin behandling"
                    },
                    enableIf: "{datoOppstartNeoadjBehUkjent} empty",
                    isRequired: true,
                    requiredIf: "{datoOppstartNeoadjBehUkjent} empty",
                    validators: [
                        {
                            type: "expression",
                            text: "Startdato ikke være dagens eller senere dato",
                            expression: "getDate({datoOppstartNeoadjBeh}) < today()"
                        }
                    ],
                    inputType: "date"
                },
                {
                    type: "checkbox",
                    name: "datoOppstartNeoadjBehUkjent",
                    visible: false,
                    visibleIf: "{neoadjuvantEndokrinBehandling} = 1",
                    startWithNewLine: false,
                    title: {
                        no: "​⠀"
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
            title: {
                no: "Behandling"
            }
        },
        {
            name: "kirurgiskBehPrimaer",
            elements: [
                {
                    type: "text",
                    name: "operasjonsdatoPrimaer",
                    title: {
                        no: "Operasjonsdato "
                    },
                    isRequired: true,
                    validators: [
                        {
                            type: "expression",
                            text: "Operasjonsdato ikke være dagens eller senere dato",
                            expression: "getDate({operasjonsdatoPrimaer}) < today()"
                        }
                    ],
                    inputType: "date"
                },
                {
                    type: "dropdown",
                    name: "typeKirurgi",
                    title: {
                        no: "Kirurgi"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "6",
                            text: {
                                no: "Åpen retropubisk"
                            }
                        },
                        {
                            value: "7",
                            text: {
                                no: "Perineal"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "Laparoskopisk"
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "Robotassistert kirurgi"
                            }
                        },
                        {
                            value: "5",
                            text: {
                                no: "Annet"
                            }
                        }
                    ],
                    optionsCaption: {
                        no: "Velg..."
                    }
                },
                {
                    type: "text",
                    name: "typeKirurgiSpesifiser",
                    visible: false,
                    visibleIf: "{typeKirurgi} = 5",
                    title: {
                        no: "Spesifiser"
                    }
                },
                {
                    type: "dropdown",
                    name: "nervesparendeIntensjon",
                    title: {
                        no: "Nervesparende intensjon"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "0",
                            text: {
                                no: "Nei"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "Ja, høyre"
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "Ja, venstre"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "Ja, bilateralt"
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
                    type: "dropdown",
                    name: "samtidigLymfadenektomi",
                    title: {
                        no: "Er det foretatt lymfadenektomi samtidig?"
                    },
                    isRequired: true,
                    choices: [
                        {
                            value: "0",
                            text: {
                                no: "Nei"
                            }
                        },
                        {
                            value: "3",
                            text: {
                                no: "Ja, høyre"
                            }
                        },
                        {
                            value: "4",
                            text: {
                                no: "Ja, venstre"
                            }
                        },
                        {
                            value: "2",
                            text: {
                                no: "Ja, bilateralt"
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
                }
            ],
            title: {
                no: "Radikal prostatektomi"
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
                    choicesByUrl: {
                        url: "https://metadata.kreftregisteret.no/rest/v1/metadata/values/m_labAngittAvKliniker",
                        valueName: "value",
                        titleName: "description"
                    },
                    optionsCaption: {
                        no: "Velg..."
                    }
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
            expression: "{preoprPSAVerdiUkjent} notempty",
            setToName: "preoprPSAVerdi"
        },
        {
            type: "setvalue",
            expression: "{datoOppstartNeoadjBehUkjent} notempty",
            setToName: "datoOppstartNeoadjBeh"
        }
    ],
    showQuestionNumbers: "off",
    clearInvisibleValues: "onHidden",
    checkErrorsMode: "onValueChanged",
    questionsOnPageMode: "singlePage"
};

export default SurveyJSONKirugi;