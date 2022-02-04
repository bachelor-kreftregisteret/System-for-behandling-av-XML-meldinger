const surveyJSON = {
    "locale": "no",
    "questionsOnPageMode": "singlePage",
    "title": "UTREDNING ",
    "logoPosition": "right",
    "pages": [{
        "name": "Pasient/behandlingsinstitusjon",
        "elements": [{
            "type": "text",
            "name": "Fødselsnummer",
            "hideNumber": true,
            "enableIf": "{ikke norsk personnummer} <> ['item1']",
            "isRequired": true,
            "requiredIf": "{ikke norsk personnummer} <> ['item1']",
            "requiredErrorText": {"no": "Skriv inn gyldig fødselsnummer "},
            "validators": [{"type": "regex", "regex": "((0[1-9]|[1-2]\\d|3[0-1])(0[1-9]|1[0-2])\\d{7})?"}],
            "inputType": "number"
        }, {
            "type": "checkbox",
            "name": "ikke norsk personnummer",
            "startWithNewLine": false,
            "titleLocation": "hidden",
            "hideNumber": true,
            "choices": [{"value": "item1", "text": {"no": "Ikke norsk personnummer"}}]
        }, {
            "type": "text",
            "name": "Navn",
            "hideNumber": true,
            "isRequired": true,
            "requiredErrorText": {"no": "Skriv inn gyldig navn"}
        }, {
            "type": "dropdown",
            "name": "Sykehus",
            "hideNumber": true,
            "isRequired": true,
            "choices": [{"value": "1", "text": {"no": "Helse Sør-Øst"}}, {
                "value": "2",
                "text": {"no": "Helse Vest"}
            }, {"value": "3", "text": {"no": "Helse Midt"}}, {
                "value": "4",
                "text": {"no": "Helse Nord"}
            }, {"value": "5", "text": {"no": "Spesialistsentre og private"}}, {"value": "6", "text": {"no": "Annet"}}]
        }, {
            "type": "dropdown",
            "name": "sykehus valg sør-øst",
            "visible": false,
            "visibleIf": "{Sykehus} = 1",
            "titleLocation": "hidden",
            "isRequired": true,
            "choices": ["item1", "item2", "item3"]
        }, {
            "type": "dropdown",
            "name": "sykehus valg vest",
            "visible": false,
            "visibleIf": "{Sykehus} = 2",
            "titleLocation": "hidden",
            "isRequired": true,
            "choices": ["item1", "item2", "item3"]
        }, {
            "type": "dropdown",
            "name": "sykehus valg midt",
            "visible": false,
            "visibleIf": "{Sykehus} = 3",
            "titleLocation": "hidden",
            "isRequired": true,
            "choices": ["item1", "item2", "item3"]
        }, {
            "type": "dropdown",
            "name": "sykehus valg nord",
            "visible": false,
            "visibleIf": "{Sykehus} = 4",
            "titleLocation": "hidden",
            "isRequired": true,
            "choices": ["item1", "item2", "item3"]
        }, {
            "type": "dropdown",
            "name": "sykehus valg spesialistsentre og private",
            "visible": false,
            "visibleIf": "{Sykehus} = 5",
            "titleLocation": "hidden",
            "isRequired": true,
            "choices": ["item1", "item2", "item3"]
        }, {
            "type": "text",
            "name": "sykehus valg annet",
            "visible": false,
            "visibleIf": "{Sykehus} = 6",
            "titleLocation": "hidden",
            "isRequired": true
        }, {
            "type": "dropdown",
            "name": "Avdeling",
            "hideNumber": true,
            "isRequired": true,
            "choices": [{"value": "14", "text": {"no": "Urologisk"}}, {
                "value": "01",
                "text": {"no": "Kiurgisk"}
            }, {"value": "47", "text": {"no": "Onkologisk"}}, {
                "value": "20",
                "text": {"no": "Medisinsk"}
            }, {"value": "1", "text": {"no": "Annen"}}, {"value": "2", "text": {"no": "Ikke relevant"}}]
        }, {"type": "text", "name": "Spesifiser", "visible": false, "visibleIf": "{Avdeling} = 1", "hideNumber": true}]
    }, {
        "name": "Funn i utredningen",
        "elements": [{
            "type": "radiogroup",
            "name": "funn i utredning",
            "titleLocation": "hidden",
            "defaultValue": "1",
            "requiredErrorText": {"no": "Velg en"},
            "choices": [{"value": "1", "text": {"no": "Primærtumor (med eller uten metastase(r))"}}, {
                "value": "3",
                "text": {"no": "Kun metastase(r)"}
            }]
        }]
    }, {
        "name": "Sykehistorie",
        "elements": [{
            "type": "text",
            "name": "PSA-verdi ved diagnosetidspunkt",
            "startWithNewLine": false,
            "hideNumber": true,
            "isRequired": true,
            "validators": [{
                "type": "regex",
                "regex": "([1-9]\\d{0,5}|\\d,\\d|[1-9]\\d{1,5},\\d)?"
            }, {"type": "numeric"}, {"type": "regex", "regex": "([1-9]\\d{0,5}|\\d,\\d|[1-9]\\d{1,5},\\d)?"}],
            "inputType": "number"
        }, {
            "type": "checkbox",
            "name": "PSA-verdi ikke tatt",
            "startWithNewLine": false,
            "titleLocation": "hidden",
            "hideNumber": true,
            "enableIf": "{PSA-verdi ukjent} <> ['item1']",
            "choices": [{"value": "item1", "text": {"no": "Ikke tatt"}}],
            "colCount": 2
        }, {
            "type": "checkbox",
            "name": "PSA-verdi ukjent",
            "startWithNewLine": false,
            "titleLocation": "hidden",
            "hideNumber": true,
            "enableIf": "{PSA-verdi ikke tatt} <> ['item1']",
            "choices": [{"value": "item1", "text": {"no": "Ukjent"}}]
        }, {
            "type": "radiogroup",
            "name": "Var vannlatingsproblemer en del av årsak til utredningen?",
            "hideNumber": true,
            "isRequired": true,
            "choices": [{"value": "item2", "text": {"no": "Ja"}}, {"value": "item3", "text": {"no": "Nei"}}],
            "hasOther": true,
            "otherText": {"no": "Ukjent"},
            "colCount": 3
        }, {
            "type": "radiogroup",
            "name": "Var kreftsymptomer (smerter, anemi eller annet) en del av årsak til utredningen?",
            "hideNumber": true,
            "isRequired": true,
            "choices": [{"value": "item1", "text": {"no": "Ja"}}, {
                "value": "item2",
                "text": {"no": "Nei"}
            }, {"value": "item3", "text": {"no": "Ukjent"}}],
            "colCount": 3
        }, {
            "type": "dropdown",
            "name": "Funksjonstilstand/WHO-status ved diagnose",
            "hideNumber": true,
            "isRequired": true,
            "choices": [{"value": "1", "text": {"no": "0: Normal aktivitet, uten begrensninger"}}, {
                "value": "2",
                "text": {"no": "1: Lett redusert arbeidskapasitet"}
            }, {"value": "3", "text": {"no": "2: > 50% av dagen oppegående"}}, {
                "value": "4",
                "text": {"no": "3: > 50% av dagen i seng / stillesittende"}
            }, {"value": "5", "text": {"no": "4: Totalt stillesittende eller i seng hele dagen"}}, {
                "value": "99",
                "text": {"no": "Ukjent / har ikke informasjon"}
            }]
        }, {
            "type": "text",
            "name": "Prostatavolum",
            "hideNumber": true,
            "isRequired": true,
            "inputType": "number",
            "min": "1",
            "max": "999"
        }, {
            "type": "checkbox",
            "name": "Prostatavolum ukjent",
            "startWithNewLine": false,
            "titleLocation": "hidden",
            "hideNumber": true,
            "choices": [{"value": "item1", "text": {"no": "Ukjent"}}]
        }]
    }, {
        "name": "Diagnostikk av primærtumor",
        "elements": [{
            "type": "radiogroup",
            "name": "MR prostata",
            "hideNumber": true,
            "isRequired": true,
            "choices": [{"value": "1", "text": {"no": "Ja"}}, {"value": "0", "text": {"no": "Nei"}}],
            "colCount": 2
        }, {
            "type": "text",
            "name": "MR prostata utført dato",
            "visible": false,
            "visibleIf": "{MR prostata} = 1",
            "startWithNewLine": false,
            "title": {"no": "Utført dato"},
            "hideNumber": true,
            "isRequired": true,
            "requiredIf": "{MR prostata ukjent dato} empty",
            "inputType": "date"
        }, {
            "type": "checkbox",
            "name": "MR prostata ukjent dato",
            "visible": false,
            "visibleIf": "{MR prostata} = 1",
            "startWithNewLine": false,
            "titleLocation": "hidden",
            "hideNumber": true,
            "choices": [{"value": "item1", "text": {"no": "Ukjent"}}]
        }, {
            "type": "radiogroup",
            "name": "Er det gjort annen bildediagnostikk av primærtumor?",
            "hideNumber": true,
            "isRequired": true,
            "choices": [{"value": "1", "text": {"no": "Ja"}}, {"value": "0", "text": {"no": "Nei"}}],
            "colCount": 2
        }, {
            "type": "text",
            "name": "Annen bildediagnostikk av primærtumor, spesifiser",
            "visible": false,
            "visibleIf": "{Er det gjort annen bildediagnostikk av primærtumor?} = 1",
            "startWithNewLine": false,
            "title": {"no": "Spesifiser"},
            "hideNumber": true
        }, {
            "type": "radiogroup",
            "name": "Celle-/vevsprøver",
            "hideNumber": true,
            "isRequired": true,
            "choices": [{"value": "1", "text": {"no": "Ja"}}, {"value": "0", "text": {"no": "Nei"}}],
            "colCount": 2
        }, {
            "type": "checkbox",
            "name": "Undersøkelser",
            "visible": false,
            "visibleIf": "{Celle-/vevsprøver} = 1",
            "startWithNewLine": false,
            "hideNumber": true,
            "isRequired": true,
            "choices": [{"value": "item1", "text": {"no": "Biopsi"}}, {
                "value": "item2",
                "text": {"no": " TUR-P"}
            }, {"value": "item3", "text": {"no": "Annet"}}],
            "colCount": 3
        }, {
            "type": "text",
            "name": "Undersøkelser, Spesifiser",
            "visible": false,
            "visibleIf": "{Undersøkelser} contains 'item3'",
            "startWithNewLine": false,
            "title": {"no": "Spesifiser"},
            "hideNumber": true
        }, {
            "type": "text",
            "name": "Dato sykdommen ble bekreftet/diagnosedato",
            "hideNumber": true,
            "isRequired": true,
            "inputType": "date"
        }]
    }],
    "triggers": [{
        "type": "setvalue",
        "expression": "{ikke norsk personnummer} = ['item1']",
        "setToName": "Fødselsnummer"
    }, {
        "type": "setvalue",
        "expression": "{PSA-verdi ikke tatt} = ['item1'] and {PSA-verdi ukjent} = ['item1']",
        "setToName": "PSA-verdi ved diagnosetidspunkt"
    }, {"type": "setvalue", "expression": "{MR prostata ukjent dato} notempty", "setToName": "MR prostata utført dato"}]
};

export default surveyJSON;