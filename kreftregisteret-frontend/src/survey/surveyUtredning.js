const surveyJSON = {
    locale: "no", title: "UTREDNING ", logoPosition: "right", pages: [{
        name: "page1",
        elements: [{
            type: "text",
            name: "Fødselsnummer input",
            minWidth: "100px",
            maxWidth: "100px",
            title: {no: "Fødselsnummer"},
            hideNumber: true,
            enableIf: "{ikke norsk personnummer} <> ['item1']",
            placeHolder: {no: "11111111111"}
        }, {
            type: "checkbox",
            name: "ikke norsk personnummer",
            minWidth: "100px",
            startWithNewLine: false,
            indent: 10,
            titleLocation: "hidden",
            hideNumber: true,
            choices: [{value: "item1", text: {no: "Ikke norsk personnummer"}}],
            colCount: ""
        }, {
            type: "text",
            name: "Navn",
            startWithNewLine: false,
            hideNumber: true,
            placeHolder: {no: "Ola Normann"}
        }, {
            type: "dropdown",
            name: "sykehus input",
            title: {no: "Sykehus"},
            hideNumber: true,
            isRequired: true,
            choices: [{value: "valg sør-øst", text: {no: "Helse Sør-Øst"}}, {
                value: "valg vest",
                text: {no: "Helse Vest"}
            }, {value: "valg midt", text: {no: "Helse Midt"}}, {
                value: "valg nord",
                text: {no: "Helse Nord"}
            }, {value: "valg privat", text: {no: "Privat"}}, {value: "valg annet", text: {no: "Annet"}}]
        }, {
            type: "dropdown",
            name: "helse sør-øst valg",
            visible: false,
            visibleIf: "{sykehus input} = 'valg sør-øst'",
            hideNumber: true,
            choices: ["item1", "item2", "item3"]
        }, {
            type: "dropdown",
            name: "helse vest valg",
            visible: false,
            visibleIf: "{sykehus input} = 'valg vest'",
            hideNumber: true,
            choices: ["item1", "item2", "item3"]
        }, {
            type: "dropdown",
            name: "helse midt valg",
            visible: false,
            visibleIf: "{sykehus input} = 'valg midt'",
            hideNumber: true,
            choices: ["item1", "item2", "item3"]
        }, {
            type: "dropdown",
            name: "helse nord valg",
            visible: false,
            visibleIf: "{sykehus input} = 'valg nord'",
            hideNumber: true,
            choices: ["item1", "item2", "item3"]
        }, {
            type: "dropdown",
            name: "privat valg",
            visible: false,
            visibleIf: "{sykehus input} = 'valg privat'",
            hideNumber: true,
            choices: ["item1", "item2", "item3"]
        }, {
            type: "text",
            name: "annet sykehus input",
            visible: false,
            visibleIf: "{sykehus input} = 'valg annet'",
            hideNumber: true,
            isRequired: true
        }, {
            type: "dropdown",
            name: "avdeling input",
            title: {no: "Avdeling"},
            hideNumber: true,
            isRequired: true,
            choices: [{value: "item1", text: {no: "Urologisk"}}, {
                value: "item2",
                text: {no: "Kiurgisk"}
            }, {value: "item3", text: {no: "Onkologisk"}}, {value: "item4", text: {no: "Medisinsk"}}, {
                value: "item5",
                text: {no: "Annen"}
            }, {value: "item6", text: {no: "Ikke relevant"}}]
        }]
    }]
};

export default surveyJSON;