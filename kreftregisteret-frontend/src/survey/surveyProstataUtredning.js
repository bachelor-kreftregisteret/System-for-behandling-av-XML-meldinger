import 'survey-react/survey.css';

const surveyJSON = {
    locale: "no",
    title: "UTREDNING ",
    logoPosition: "right",
    pages: [{
        name: "Pasient/behandlingsinstitusjon",
        elements: [{
            type: "text",
            name: "Fødselsnummer",
            hideNumber: true,
            enableIf: "{ikke norsk personnummer} <> ['item1']",
            isRequired: true,
            requiredIf: "{ikke norsk personnummer} <> ['item1']",
            requiredErrorText: {no: "Skriv inn gyldig fødselsnummer "},
            validators: [{type: "regex", regex: "((0[1-9]|[1-2]\\d|3[0-1])(0[1-9]|1[0-2])\\d{7})?"}],
            inputType: "number"
        }, {
            type: "checkbox",
            name: "ikke norsk personnummer",
            startWithNewLine: false,
            title: {no: "ㅤ"},
            hideNumber: true,
            choices: [{value: "item1", text: {no: "Ikke norsk personnummer"}}]
        }, {
            type: "text",
            name: "Navn",
            hideNumber: true,
            isRequired: true,
            requiredErrorText: {no: "Skriv inn gyldig navn"}
        }, {
            type: "dropdown",
            name: "Sykehus",
            hideNumber: true,
            isRequired: true,
            choices: [{value: "1", text: {no: "Helse Sør-Øst"}}, {value: "2", text: {no: "Helse Vest"}}, {
                value: "3",
                text: {no: "Helse Midt"}
            }, {value: "4", text: {no: "Helse Nord"}}, {
                value: "5",
                text: {no: "Spesialistsentre og private"}
            }, {value: "6", text: {no: "Annet"}}]
        }, {
            type: "dropdown",
            name: "sykehus valg sør-øst",
            visible: false,
            visibleIf: "{Sykehus} = 1",
            titleLocation: "hidden",
            isRequired: true,
            choices: ["item1", "item2", "item3"]
        }, {
            type: "dropdown",
            name: "sykehus valg vest",
            visible: false,
            visibleIf: "{Sykehus} = 2",
            titleLocation: "hidden",
            isRequired: true,
            choices: ["item1", "item2", "item3"]
        }, {
            type: "dropdown",
            name: "sykehus valg midt",
            visible: false,
            visibleIf: "{Sykehus} = 3",
            titleLocation: "hidden",
            isRequired: true,
            choices: ["item1", "item2", "item3"]
        }, {
            type: "dropdown",
            name: "sykehus valg nord",
            visible: false,
            visibleIf: "{Sykehus} = 4",
            titleLocation: "hidden",
            isRequired: true,
            choices: ["item1", "item2", "item3"]
        }, {
            type: "dropdown",
            name: "sykehus valg spesialistsentre og private",
            visible: false,
            visibleIf: "{Sykehus} = 5",
            titleLocation: "hidden",
            isRequired: true,
            choices: ["item1", "item2", "item3"]
        }, {
            type: "text",
            name: "sykehus valg annet",
            visible: false,
            visibleIf: "{Sykehus} = 6",
            titleLocation: "hidden",
            isRequired: true
        }, {
            type: "dropdown",
            name: "Avdeling",
            hideNumber: true,
            isRequired: true,
            choices: [{value: "14", text: {no: "Urologisk"}}, {value: "#01", text: {no: "Kiurgisk"}}, {
                value: "47",
                text: {no: "Onkologisk"}
            }, {value: "20", text: {no: "Medisinsk"}}, {value: "1", text: {no: "Annen"}}, {
                value: "2",
                text: {no: "Ikke relevant"}
            }]
        }, {type: "text", name: "Spesifiser", visible: false, visibleIf: "{Avdeling} = 1", hideNumber: true}]
    }, {
        name: "Funn i utredningen",
        elements: [{
            type: "radiogroup",
            name: "funn i utredning",
            titleLocation: "hidden",
            defaultValue: "1",
            requiredErrorText: {no: "Velg en"},
            choices: [{value: "1", text: {no: "Primærtumor (med eller uten metastase(r))"}}, {
                value: "3",
                text: {no: "Kun metastase(r)"}
            }]
        }]
    }, {
        name: "Sykehistorie",
        elements: [{
            type: "text",
            name: "PSA-verdi ved diagnosetidspunkt",
            startWithNewLine: false,
            hideNumber: true,
            enableIf: "{PSA-verdi ikke tatt} empty",
            isRequired: true,
            requiredIf: "{PSA-verdi ikke tatt} empty",
            validators: [{
                type: "regex",
                regex: "([1-9]\\d{0,5}|\\d,\\d|[1-9]\\d{1,5},\\d)?"
            }, {type: "numeric"}, {type: "regex", regex: "([1-9]\\d{0,5}|\\d,\\d|[1-9]\\d{1,5},\\d)?"}],
            inputType: "number"
        }, {
            type: "checkbox",
            name: "PSA-verdi ikke tatt",
            startWithNewLine: false,
            title: {no: "ㅤ"},
            hideNumber: true,
            choices: [{value: "item1", text: {no: "Ikke tatt"}}, {value: "item2", text: {no: "Ukjent"}}],
            colCount: 2
        }, {
            type: "radiogroup",
            name: "Var vannlatingsproblemer en del av årsak til utredningen?",
            hideNumber: true,
            isRequired: true,
            choices: [{value: "1", text: {no: "Ja"}}, {value: "0", text: {no: "Nei"}}, {
                value: "99",
                text: {no: "Ukjent"}
            }],
            otherText: {no: "Ukjent"},
            colCount: 3
        }, {
            type: "radiogroup",
            name: "Var kreftsymptomer (smerter, anemi eller annet) en del av årsak til utredningen?",
            hideNumber: true,
            isRequired: true,
            choices: [{value: "item1", text: {no: "Ja"}}, {value: "item2", text: {no: "Nei"}}, {
                value: "item3",
                text: {no: "Ukjent"}
            }],
            colCount: 3
        }, {
            type: "dropdown",
            name: "Funksjonstilstand/WHO-status ved diagnose",
            hideNumber: true,
            isRequired: true,
            choices: [{value: "1", text: {no: "0: Normal aktivitet, uten begrensninger"}}, {
                value: "2",
                text: {no: "1: Lett redusert arbeidskapasitet"}
            }, {value: "3", text: {no: "2: > 50% av dagen oppegående"}}, {
                value: "4",
                text: {no: "3: > 50% av dagen i seng / stillesittende"}
            }, {value: "5", text: {no: "4: Totalt stillesittende eller i seng hele dagen"}}, {
                value: "99",
                text: {no: "Ukjent / har ikke informasjon"}
            }]
        }, {
            type: "text",
            name: "Prostatavolum",
            hideNumber: true,
            enableIf: "{Prostatavolum ukjent} <> ['item1']",
            isRequired: true,
            requiredIf: "{Prostatavolum ukjent} <> ['item1']",
            inputType: "number",
            min: "1",
            max: "999"
        }, {
            type: "checkbox",
            name: "Prostatavolum ukjent",
            startWithNewLine: false,
            title: {no: "ㅤ"},
            hideNumber: true,
            choices: [{value: "item1", text: {no: "Ukjent"}}]
        }],
        visible: false,
        visibleIf: "{funn i utredning} = 1"
    }, {
        name: "Diagnostikk av primærtumor",
        elements: [{
            type: "radiogroup",
            name: "MR prostata",
            hideNumber: true,
            isRequired: true,
            choices: [{value: "1", text: {no: "Ja"}}, {value: "0", text: {no: "Nei"}}],
            colCount: 2
        }, {
            type: "text",
            name: "MR prostata utført dato",
            visible: false,
            visibleIf: "{MR prostata} = 1",
            startWithNewLine: false,
            title: {no: "Utført dato"},
            hideNumber: true,
            enableIf: "{MR prostata ukjent dato} empty",
            isRequired: true,
            requiredIf: "{MR prostata ukjent dato} empty",
            inputType: "date"
        }, {
            type: "checkbox",
            name: "MR prostata ukjent dato",
            visible: false,
            visibleIf: "{MR prostata} = 1",
            startWithNewLine: false,
            title: {no: "ㅤ"},
            hideNumber: true,
            choices: [{value: "item1", text: {no: "Ukjent"}}]
        }, {
            type: "radiogroup",
            name: "Er det gjort annen bildediagnostikk av primærtumor?",
            hideNumber: true,
            isRequired: true,
            choices: [{value: "1", text: {no: "Ja"}}, {value: "0", text: {no: "Nei"}}],
            colCount: 2
        }, {
            type: "text",
            name: "Annen bildediagnostikk av primærtumor, spesifiser",
            visible: false,
            visibleIf: "{Er det gjort annen bildediagnostikk av primærtumor?} = 1",
            startWithNewLine: false,
            title: {no: "Spesifiser"},
            hideNumber: true
        }, {
            type: "radiogroup",
            name: "Celle-/vevsprøver",
            hideNumber: true,
            isRequired: true,
            choices: [{value: "1", text: {no: "Ja"}}, {value: "0", text: {no: "Nei"}}],
            colCount: 2
        }, {
            type: "checkbox",
            name: "Undersøkelser",
            visible: false,
            visibleIf: "{Celle-/vevsprøver} = 1",
            startWithNewLine: false,
            hideNumber: true,
            isRequired: true,
            choices: [{value: "item1", text: {no: "Biopsi"}}, {value: "item2", text: {no: " TUR-P"}}, {
                value: "item3",
                text: {no: "Annet"}
            }],
            colCount: 3
        }, {
            type: "text",
            name: "Undersøkelser, Spesifiser",
            visible: false,
            visibleIf: "{Undersøkelser} contains 'item3'",
            startWithNewLine: false,
            title: {no: "Spesifiser"},
            hideNumber: true
        }, {
            type: "text",
            name: "Dato sykdommen ble bekreftet/diagnosedato",
            hideNumber: true,
            isRequired: true,
            inputType: "date"
        }],
        visible: false,
        visibleIf: "{funn i utredning} = 1"
    }, {
        name: "Patologilaboratorium",
        elements: [{
            type: "dropdown",
            name: "Laboratorium",
            hideNumber: true,
            enableIf: "{Laboratorium Ikke relevant} <> ['item1']",
            isRequired: true,
            requiredIf: "{Laboratorium Ikke relevant} <> ['item1']",
            choices: [{value: "21", text: {no: "AHUS, Akershus universitetssykehus"}}, {
                value: "03",
                text: {no: "Fürst Patologi"}
            }, {value: "07", text: {no: "Haukeland universitetssjukehus"}}, {
                value: "1",
                text: {no: "Annet laboratorium"}
            }]
        }, {
            type: "checkbox",
            name: "Laboratorium Ikke relevant",
            startWithNewLine: false,
            title: {no: "ㅤ"},
            hideNumber: true,
            choices: [{value: "item1", text: {no: "Ikke relevent"}}]
        }, {
            type: "text",
            name: "Laboratorium spesifiser",
            visible: false,
            visibleIf: "{Laboratorium} = 1",
            title: {no: "Spesifiser"},
            hideNumber: true
        }, {
            type: "text",
            name: "Laboratorium preparatnummer",
            visible: false,
            visibleIf: "{Laboratorium} notempty",
            startWithNewLine: false,
            title: {no: "Preparatnummer"},
            hideNumber: true
        }]
    }, {
        name: "Sykdomsutbredelse etter ferdig primærutredning og før primærbehandling",
        elements: [{
            type: "dropdown",
            name: "Palpatorisk T-stadium høyre side (laveste stadium velges ved tvil)",
            visibleIf: "{funn i utredning} = 1",
            hideNumber: true,
            isRequired: true,
            choices: [{value: "1", text: {no: "Ikke palpabel tumor (tilsvarende T0/T1)"}}, {
                value: "2",
                text: {no: "Tumor uten ekstraprostatisk vekst (tilsvarende T2)"}
            }, {value: "3", text: {no: "Ekstraprostatisk vekst (tilsvarende T3a)"}}, {
                value: "4",
                text: {no: "Innvekst i vesikler (tilsvarende T3b)"}
            }, {value: "5", text: {no: "Innvekst i omliggende vev (tilsvarende T4)"}}, {
                value: "6",
                text: {no: "Ikke vurdert / kan ikke vurderes (tilsvarende TX)"}
            }],
            optionsCaption: {no: "Velg..."}
        }, {
            type: "dropdown",
            name: "Palpatorisk T-stadium venstre side (laveste stadium velges ved tvil)",
            visibleIf: "{funn i utredning} = 1",
            startWithNewLine: false,
            hideNumber: true,
            isRequired: true,
            choices: [{value: "1", text: {no: "Ikke palpabel tumor (tilsvarende T0/T1)"}}, {
                value: "2",
                text: {no: "Tumor uten ekstraprostatisk vekst (tilsvarende T2)"}
            }, {value: "3", text: {no: "Ekstraprostatisk vekst (tilsvarende T3a)"}}, {
                value: "4",
                text: {no: "Innvekst i vesikler (tilsvarende T3b)"}
            }, {value: "5", text: {no: "Innvekst i omliggende vev (tilsvarende T4)"}}, {
                value: "6",
                text: {no: "Ikke vurdert / kan ikke vurderes (tilsvarende TX)"}
            }],
            optionsCaption: {no: "Velg..."}
        }, {
            type: "text",
            name: "Samlet palpatorisk T-stadium",
            visibleIf: "{funn i utredning} = 1",
            hideNumber: true,
            readOnly: true
        }, {
            type: "dropdown",
            name: "PI-RADS høyre side (laveste stadium velges ved tvil)",
            visible: false,
            visibleIf: "{MR prostata} = 1",
            hideNumber: true,
            isRequired: true,
            choices: ["1", "2", "3", "4", "5", {value: "99", text: {no: "Ukjent"}}],
            optionsCaption: {no: "Velg..."}
        }, {
            type: "dropdown",
            name: "PI-RADS venstre side (laveste stadium velges ved tvil)",
            visible: false,
            visibleIf: "{MR prostata} = 1",
            startWithNewLine: false,
            hideNumber: true,
            isRequired: true,
            choices: ["1", "2", "3", "4", "5", {value: "99", text: {no: "Ukjent"}}],
            optionsCaption: {no: "Velg..."}
        }, {
            type: "dropdown",
            name: "MR-basert T-stadium høyre side (laveste stadium velges ved tvil)",
            visible: false,
            visibleIf: "{PI-RADS høyre side (laveste stadium velges ved tvil)} = 4 or {PI-RADS høyre side (laveste stadium velges ved tvil)} = 5",
            hideNumber: true,
            isRequired: true,
            choices: [{value: "1", text: {no: "Tumor uten ekstraprostatisk vekst (tilsvarende T2)"}}, {
                value: "2",
                text: {no: "Ekstraprostatisk vekst (tilsvarende T3a)"}
            }, {value: "3", text: {no: "Innvekst i vesikler (tilsvarende T3b)"}}, {
                value: "4",
                text: {no: "Innvekst i omliggende vev (tilsvarende T4)"}
            }, {value: "5", text: {no: "Ikke vurdert / kan ikke vurderes (tilsvarende TX)"}}],
            optionsCaption: {no: "Velg..."}
        }, {
            type: "dropdown",
            name: "MR-basert T-stadium venstre side (laveste stadium velges ved tvil)",
            visible: false,
            visibleIf: "{PI-RADS venstre side (laveste stadium velges ved tvil)} = 4 or {PI-RADS venstre side (laveste stadium velges ved tvil)} = 5",
            startWithNewLine: false,
            hideNumber: true,
            isRequired: true,
            choices: [{value: "1", text: {no: "Tumor uten ekstraprostatisk vekst (tilsvarende T2)"}}, {
                value: "2",
                text: {no: "Ekstraprostatisk vekst (tilsvarende T3a)"}
            }, {value: "3", text: {no: "Innvekst i vesikler (tilsvarende T3b)"}}, {
                value: "4",
                text: {no: "Innvekst i omliggende vev (tilsvarende T4)"}
            }, {value: "5", text: {no: "Ikke vurdert / kan ikke vurderes (tilsvarende TX)"}}],
            optionsCaption: {no: "Velg..."}
        }, {
            type: "text",
            name: "Samlet MR-basert T-stadium",
            visible: false,
            visibleIf: "{PI-RADS høyre side (laveste stadium velges ved tvil)} = 4 or {PI-RADS høyre side (laveste stadium velges ved tvil)} = 5 or {PI-RADS venstre side (laveste stadium velges ved tvil)} = 4 or {PI-RADS venstre side (laveste stadium velges ved tvil)} = 5",
            hideNumber: true,
            readOnly: true
        }, {
            type: "dropdown",
            name: "Totalvurdering av klinisk T (laveste stadium velges ved tvil)",
            visibleIf: "{funn i utredning} = 1",
            hideNumber: true,
            isRequired: true,
            choices: [{value: "X", text: {no: "TX - Primærtumor kan ikke vurderes"}}, {
                value: "0",
                text: {no: "T0 - Primærtumor ikke påvist"}
            }, {
                value: "1",
                text: {no: "T1 - Ingen tumor påvisbar med palpasjon, ultralyd eller annen radiologisk metode, men cancer er påvist ved prostatabiopsier"}
            }, {
                value: "1a",
                text: {no: "T1a - Ikke palpabel tumor, påvist ved TUR-P, < 5 % av resektatet"}
            }, {
                value: "1b",
                text: {no: "T1b - Ikke palpabel tumor, påvist ved TUR-P, ≥5% av resektatet"}
            }, {
                value: "1c",
                text: {no: "T1c - Ikke palpabel tumor, påvist ved nålebiopsi (for eksempel på grunn av forhøyet PSA)"}
            }, {
                value: "2",
                text: {no: "T2 - Palpabel eller synlig tumor begrenset til prostatakjertelen (innenfor kapselbegrensning)"}
            }, {value: "2a", text: {no: "T2a - Tumor omfatter en halv lapp eller mindre"}}, {
                value: "2b",
                text: {no: "T2b - Tumor omfatter mer enn halvparten av en lapp, men ikke begge lapper."}
            }, {value: "2c", text: {no: "T2c - Tumor omfatter begge lapper"}}, {
                value: "3",
                text: {no: "T3 - Ekstrakapsulær tumorvekst. NB: Innvekst i apex prostata eller inn i (men ikke gjennom) prostatakapselen klassifiseres som T2"}
            }, {value: "3a", text: {no: "T3a - Ekstrakapsulær vekst (unilateral eller bilateral)"}}, {
                value: "3b",
                text: {no: "T3b - Tumor vokser inn i sædblære(r) "}
            }, {
                value: "4",
                text: {no: "T4 - Tumor er fiksert eller vokser inn i nabostruktur(er) annet enn sædblære(r) "}
            }]
        }, {
            type: "dropdown",
            name: "Hvem har gjort totalvurderingen av klinisk T?",
            visible: false,
            visibleIf: "{funn i utredning} = 1",
            hideNumber: true,
            isRequired: true,
            choices: [{value: "1", text: {no: "MDT (tverrfaglig møte)"}}, {
                value: "2",
                text: {no: "Utredende lege"}
            }, {value: "3", text: {no: "Melder (ikke utredende lege)"}}]
        }, {
            type: "radiogroup",
            name: "Er regionale lymfeknutemetastaser påvist (N-sykdom)?",
            hideNumber: true,
            isRequired: true,
            choices: [{value: "2", text: {no: "NX = Ikke undersøkt"}}, {
                value: "0",
                text: {no: "N0 = Ingen regionale lymfeknutemetastaser"}
            }, {value: "1", text: {no: "N1 = Regionale lymfeknutemetastaser"}}],
            colCount: 3
        }, {
            type: "radiogroup",
            name: "Utredningsmetode (velg viktigste undersøkelse som basis for cN)",
            visible: false,
            visibleIf: "{Er regionale lymfeknutemetastaser påvist (N-sykdom)?} = 0 or {Er regionale lymfeknutemetastaser påvist (N-sykdom)?} = 1",
            hideNumber: true,
            isRequired: true,
            choices: [{value: "1", text: {no: "CT"}}, {value: "2", text: {no: "MR"}}, {
                value: "3",
                text: {no: "PET"}
            }, {value: "4", text: {no: "Lymfadenektomi (diagnostisk i forkant av behandling)"}}, {
                value: "5",
                text: {no: "Annet"}
            }, {value: "99", text: {no: "Ukjent"}}],
            colCount: 3
        }, {
            type: "text",
            name: "Utredningsmetode (velg viktigste undersøkelse som basis for cN) spesifiser",
            visible: false,
            visibleIf: "{Utredningsmetode (velg viktigste undersøkelse som basis for cN)} = 5",
            startWithNewLine: false,
            title: {no: "Spesifiser"},
            hideNumber: true
        }, {
            type: "radiogroup",
            name: "Er fjernmetastaser, inkludert fjerne lymfeknutemetastaser, påvist (M-sykdom)?",
            hideNumber: true,
            isRequired: true,
            choices: [{value: "2", text: {no: "Ikke undersøkt"}}, {
                value: "0",
                text: {no: "M0 = Ingen fjernmetastaser"}
            }, {value: "1", text: {no: "M1 = Fjernmetastaser"}}],
            colCount: 3
        }, {
            type: "checkbox",
            name: "Er fjernmetastaser, inkludert fjerne lymfeknutemetastaser, påvist (M-sykdom)? Lokalisasjon",
            visible: false,
            visibleIf: "{Er fjernmetastaser, inkludert fjerne lymfeknutemetastaser, påvist (M-sykdom)?} = 1",
            title: {no: "Lokalisasjon"},
            hideNumber: true,
            isRequired: true,
            choices: [" Ikke-regionale lymfeknuter (M1a)", " Skjelett (M1b)", "Annet (M1c)"],
            colCount: 3
        }, {
            type: "text",
            name: "Lokalisasjon spesifiser",
            visible: false,
            visibleIf: "{Er fjernmetastaser, inkludert fjerne lymfeknutemetastaser, påvist (M-sykdom)? Lokalisasjon} contains 'Annet (M1c)'",
            startWithNewLine: false,
            title: {no: "Spesifiser"},
            hideNumber: true
        }, {
            type: "checkbox",
            name: "Er fjernmetastaser, inkludert fjerne lymfeknutemetastaser, påvist (M-sykdom)? Utredningsmetode",
            visibleIf: "{Er fjernmetastaser, inkludert fjerne lymfeknutemetastaser, påvist (M-sykdom)?} = 1",
            title: {no: "Utredningsmetode"},
            hideNumber: true,
            isRequired: true,
            choices: ["CT", "MR", "PET", "Skjelettscintigrafi", "Røntgen thorax", " Røntgen korsrygg/bekken", "Cytologi", "Biopsi", "Annet", "Ukjent"],
            colCount: 4
        }, {
            type: "text",
            name: "Utredningsmetode spesifiser",
            visible: false,
            visibleIf: "{Er fjernmetastaser, inkludert fjerne lymfeknutemetastaser, påvist (M-sykdom)? Utredningsmetode} contains 'Annet'",
            title: {no: "Spesifiser"},
            hideNumber: true
        }, {
            type: "text",
            name: "Dato for utredning av metastaser (dd.mm.åååå)",
            visible: false,
            visibleIf: "{funn i utredning} = 3",
            hideNumber: true,
            isRequired: true,
            inputType: "date"
        }]
    }, {
        name: "Klinisk TNM",
        elements: [{type: "text", name: "cT", hideNumber: true, readOnly: true}, {
            type: "text",
            name: "cN",
            startWithNewLine: false,
            hideNumber: true,
            readOnly: true
        }, {type: "text", name: "cM", startWithNewLine: false, hideNumber: true, readOnly: true}],
        visible: false,
        visibleIf: "{funn i utredning} = 1"
    }, {
        name: "Oppfølging/tiltak page",
        elements: [{
            type: "dropdown",
            name: "Oppfølging/tiltak",
            hideNumber: true,
            isRequired: true,
            choices: [{value: "6", text: {no: "Kurativt rettet lokalbehandling"}}, {
                value: "5",
                text: {no: "Aktiv overvåkning"}
            }, {value: "7", text: {no: "Antihormonell behandling alene"}}, {
                value: "4",
                text: {no: "Observasjon / ikke kandidat for radikal behandling"}
            }, {value: "8", text: {no: "Behandlingsbesluttning ikke tatt"}}, {
                value: "9",
                text: {no: "Kjemoterapi"}
            }, {value: "1", text: {no: "Henvist videre til"}}, {value: "99", text: {no: "Ukjent"}}]
        }, {
            type: "dropdown",
            name: "Behandlingssted",
            hideNumber: true,
            isRequired: true,
            choices: [{value: "1", text: {no: "Egen institusjon"}}, {
                value: "2",
                text: {no: "Annen norsk institusjon / spesialist"}
            }, {value: "4", text: {no: "Allmennpraktiker"}}, {
                value: "5",
                text: {no: "Samarbeid egen institusjon og allmennpraktiker"}
            }, {value: "3", text: {no: "Utlandet (spesifiser)"}}, {value: "99", text: {no: "Ukjent"}}]
        }, {
            type: "text",
            name: "Behandlingssted spesifiser",
            visible: false,
            title: {no: "Spesifiser"},
            hideNumber: true
        }, {
            type: "text",
            name: "Oppfølging/tiltak behandlingsdato",
            visible: false,
            visibleIf: "{Oppfølging/tiltak} = 7",
            title: {no: "Behandlingsdato"},
            hideNumber: true,
            inputType: "date"
        }]
    }, {
        name: "Kommentar",
        elements: [{type: "text", name: "Kommentarer til utfylling av meldingen", hideNumber: true}]
    }, {
        name: "Melder",
        elements: [{
            type: "text",
            name: "Meldedato",
            hideNumber: true,
            isRequired: true,
            inputType: "date"
        }, {
            type: "text",
            name: "Melders navn",
            startWithNewLine: false,
            hideNumber: true,
            isRequired: true
        }, {type: "text", name: "Melder ID", startWithNewLine: false, hideNumber: true}]
    }],
    triggers: [{
        type: "setvalue",
        expression: "{ikke norsk personnummer} = ['item1']",
        setToName: "Fødselsnummer"
    }, {
        type: "setvalue",
        expression: "{MR prostata ukjent dato} notempty",
        setToName: "MR prostata utført dato"
    }, {
        type: "setvalue",
        expression: "{PSA-verdi ikke tatt} notempty",
        setToName: "PSA-verdi ved diagnosetidspunkt"
    }, {
        type: "setvalue",
        expression: "{PSA-verdi ikke tatt} contains 'item1'",
        setToName: "PSA-verdi ikke tatt",
        setValue: ["item1"]
    }, {
        type: "setvalue",
        expression: "{PSA-verdi ikke tatt} contains 'item2'",
        setToName: "PSA-verdi ikke tatt",
        setValue: ["item2"]
    }, {
        type: "setvalue",
        expression: "{Laboratorium Ikke relevant} = ['item1']",
        setToName: "Laboratorium"
    }, {
        type: "setvalue",
        expression: "{Er fjernmetastaser, inkludert fjerne lymfeknutemetastaser, påvist (M-sykdom)? Utredningsmetode} contains 'Ukjent'",
        setToName: "Er fjernmetastaser, inkludert fjerne lymfeknutemetastaser, påvist (M-sykdom)? Utredningsmetode",
        setValue: ["Ukjent"]
    }, {
        type: "setvalue",
        expression: "{Prostatavolum ukjent} = ['item1']",
        setToName: "Prostatavolum"
    }, {type: "setvalue", expression: "{MR prostata ukjent dato} = ['item1']", setToName: "MR prostata utført dato"}],
    questionsOnPageMode: "singlePage"
};

export default surveyJSON;