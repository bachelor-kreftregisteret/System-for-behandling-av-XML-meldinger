var request = require('request');
var querystring = require('querystring');
console.log("KJØRER TEST(?)")
json = {
    "meldingsinformasjon": {
        "skjema": "KliniskProstataUtredning",
        "versjonsNr": "4.0",
        "versjonsNrOriginal": "String",
        "krgguid": "",
        "versjonIP": 0,
        "versjonBT": 0,
        "tidspunktSubmit": "2001-12-17T09:30:47Z",
        "brukernavn": "",
        "filnavn": "",
        "versjonInternEkstern": "1",
        "feilSkjema": true
    },
    "navigering": {"meldingstittel": "", "meldingsNr": ""},
    "stdInfo": {
        "pasientInstitusjon": {
            "fodselsnummerKRG": "",
            "fodselsnummerHF": "",
            "fodselnummerUtland": true,
            "fodselsnummerUtlandSpesifiser": "String",
            "navnPasient": "",
            "sykehuskode": "",
            "sykehusnavnRHF": "6",
            "sykehusnavnHFSorOst": "0605",
            "sykehusnavnHFVest": "1",
            "sykehusnavnHFMidt": "1702",
            "sykehusnavnHFNord": "1805",
            "sykehusnavnSpesSenter": "6002",
            "sykehusnavnHFSpesifiser": "",
            "sykehusnavnKRGSpesifiser": "",
            "avdelingskode": "",
            "avdelingsnavn": "2",
            "avdelingsnavnHFSpesifiser": "",
            "avdelingsnavnKRGSpesifiser": ""
        },
        "oppfolging": {
            "oppfolgingBehandling": {
                "videreTiltakUtredning": "4",
                "videreTiltakUtredningSpesifiser": "3",
                "videreTiltakUtredningSpesifiser2": "String",
                "videreTiltakUtredningDato": "1957-08-13"
            }
        },
        "kommentarfelt": {"kommentar": ""},
        "filmBilde": {"filmNr": "", "bildeNr": ""},
        "melder": {"meldersNavn": "", "meldeDato": "1957-08-13", "melderID": ""}
    },
    "laboratorium": {
        "labnavnKRG": "",
        "labnavnHF": "28",
        "labnavnHFIkkeRelevant": true,
        "labnavnHFSpesifiser": "",
        "preparatnummer": "",
        "labkode": ""
    },
    "infiltrerendeKreft": {"kreft": "1"},
    "utredning": {
        "funnUtredning": "2",
        "diagnosedato": "1957-08-13",
        "sykehistorie": {
            "vannlatingsproblem": "",
            "kreftsymptomer": "99",
            "prostatavolum": "",
            "prostatavolumUkjent": "99",
            "spsa": {"psaverdi": "", "psaverdiIkkeTatt": true, "psaverdiUkjent": "99"},
            "whostatus": "5"
        },
        "diagnostiskeUS": {
            "bildediagnostikkUS": {
                "datoMRDiagnostikk": "1957-08-13",
                "datoMRDiagnostikkUkjent": "",
                "annetBildediagnostikk": "",
                "annetBildediagnostikkSpesifiser2": "",
                "mrdiagnostikk": "1"
            },
            "vevsprover": "",
            "vevsproverUS": {
                "biopsiVevsprover": true,
                "annetVevsprover": true,
                "annetVevsproverSpesifiser2": "",
                "turpvevsprover": true
            }
        },
        "datoMetastaser": "1957-08-13",
        "sykdomsutbredelse": {
            "tumor": {
                "palpatoriskTumorHoyre": "3",
                "palpatoriskTumorVenstre": "2",
                "samletPalpatoriskTumor": "",
                "samletMRBasertKliniskT": "",
                "totalVurderingKliniskT": "1",
                "kliniskVurdertAv": "2",
                "piradshoyre": "",
                "piradsvenstre": "2",
                "mrbasertKliniskTHoyre": "4",
                "mrbasertKliniskTVenstre": "1"
            },
            "regionaleLK": {"regionaleLKPaavist": "1"},
            "fjernmetastaser": {
                "fjernmetPaavist": "1",
                "lokalisasjonFjernmet": {
                    "fjerneLKmet": true,
                    "skjelettmet": true,
                    "annetFjernmet": true,
                    "annetFjernmetSpesifiser": ""
                }
            },
            "utredningsmetodeMetastaser": {
                "utredningsmetodeLK": "5",
                "annenDiagnostikkLKSpesifiser": "",
                "utredningsmetodeFjernmet": {
                    "skjelettscintigrafiMet": true,
                    "rtgThoraxMet": true,
                    "rtgBekkenMet": true,
                    "cytologiMet": true,
                    "biopsiMet": true,
                    "annenDiagnostikkMet": true,
                    "annenDiagnostikkMetSpesifiser": "",
                    "utredningsmetodeFjernmetUkjent": "",
                    "ctmet": true,
                    "mrmet": true,
                    "petmet": true
                }
            }
        },
        "kliniskTNM": {"ct": "", "cn": "", "cm": ""}
    },
    "skjemaNavn": "KliniskProstataUtredning"
}


var formData = querystring.stringify(json);
var contentLength = formData.length;

request({
        headers: {
            'Content-Length': contentLength,
            'Content-Type': 'application/json'
        },
        uri: 'http://localhost:8080/api/v1/meldinger',
        body: formData,
        method: 'POST'
    },
    function (error, response, body) {
        if (!error && response.statusCode === 200) {
            console.log(response.statusCode)
            console.log(body);
        }
    }
)
;

/***fetch("http://localhost:8080/api/v1/meldinger", {
  "headers": {
    "accept": "application/json, text/plain",
"accept-language": "nb-NO,nb;q=0.9,no;q=0.8,nn;q=0.7,en-US;q=0.6,en;q=0.5",
    "cache-control": "no-cache",
    "content-type": "application/json",
    "pragma": "no-cache",
    "sec-ch-ua": "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"98\", \"Google Chrome\";v=\"98\"",
    "sec-ch-ua-mobile": "?0",
    "sec-ch-ua-platform": "\"macOS\"",
    "sec-fetch-dest": "empty",
    "sec-fetch-mode": "cors",
    "sec-fetch-site": "same-origin"
},
"referrer": "http://localhost:8080/",
    "referrerPolicy": "strict-origin-when-cross-origin",
    "body": "{\"type\":\"KliniskProstataUtredning\",\"meldingsinformasjon\":{\"skjema\":\"KliniskProstataUtredning\",\"versjonsNr\":\"4.0\",\"versjonsNrOriginal\":\"String\",\"krgguid\":\"\",\"versjonIP\":0,\"versjonBT\":0,\"tidspunktSubmit\":\"2001-12-17T09:30:47Z\",\"brukernavn\":\"\",\"filnavn\":\"\",\"versjonInternEkstern\":\"1\",\"feilSkjema\":true},\"navigering\":{\"meldingstittel\":\"\",\"meldingsNr\":\"\"},\"stdInfo\":{\"pasientInstitusjon\":{\"fodselsnummerKRG\":\"\",\"fodselsnummerHF\":33243214,\"fodselnummerUtland\":true,\"fodselsnummerUtlandSpesifiser\":\"String\",\"navnPasient\":\"fsdafdsafsd\",\"sykehuskode\":\"\",\"sykehusnavnRHF\":\"6\",\"sykehusnavnHFSpesifiser\":\"af33af\",\"sykehusnavnKRGSpesifiser\":\"\",\"avdelingskode\":\"\",\"avdelingsnavn\":\"2\",\"avdelingsnavnHFSpesifiser\":\"\",\"avdelingsnavnKRGSpesifiser\":\"\"},\"oppfolging\":{\"oppfolgingBehandling\":{\"videreTiltakUtredning\":\"4\",\"videreTiltakUtredningSpesifiser\":\"3\",\"videreTiltakUtredningSpesifiser2\":\"String\"}},\"kommentarfelt\":{\"kommentar\":\"\"},\"filmBilde\":{\"filmNr\":\"\",\"bildeNr\":\"\"},\"melder\":{\"meldersNavn\":\"3afa3f\",\"meldeDato\":\"1957-08-13\",\"melderID\":\"\"}},\"laboratorium\":{\"labnavnKRG\":\"\",\"labnavnHF\":\"03\",\"labnavnHFIkkeRelevant\":true,\"labnavnHFSpesifiser\":\"\",\"preparatnummer\":\"\",\"labkode\":\"\"},\"infiltrerendeKreft\":{\"kreft\":\"1\"},\"utredning\":{\"funnUtredning\":\"1\",\"diagnosedato\":\"1957-08-13\",\"sykehistorie\":{\"vannlatingsproblem\":\"0\",\"kreftsymptomer\":\"99\",\"prostatavolum\":\"\",\"prostatavolumUkjent\":\"99\",\"spsa\":{\"psaverdi\":\"\",\"psaverdiIkkeTatt\":true,\"psaverdiUkjent\":\"99\"},\"whostatus\":\"5\"},\"diagnostiskeUS\":{\"bildediagnostikkUS\":{\"datoMRDiagnostikk\":\"1957-08-13\",\"datoMRDiagnostikkUkjent\":\"\",\"annetBildediagnostikk\":\"0\",\"annetBildediagnostikkSpesifiser2\":\"\",\"mrdiagnostikk\":\"1\"},\"vevsprover\":\"0\",\"vevsproverUS\":{\"biopsiVevsprover\":false,\"annetVevsprover\":false,\"annetVevsproverSpesifiser2\":\"\",\"turpvevsprover\":false}},\"sykdomsutbredelse\":{\"tumor\":{\"palpatoriskTumorHoyre\":\"3\",\"palpatoriskTumorVenstre\":\"2\",\"samletPalpatoriskTumor\":\"\",\"totalVurderingKliniskT\":\"1\",\"kliniskVurdertAv\":\"2\",\"piradshoyre\":\"3\",\"piradsvenstre\":\"2\"},\"regionaleLK\":{\"regionaleLKPaavist\":\"1\"},\"fjernmetastaser\":{\"fjernmetPaavist\":\"1\",\"lokalisasjonFjernmet\":{\"fjerneLKmet\":true,\"skjelettmet\":true,\"annetFjernmet\":true,\"annetFjernmetSpesifiser\":\"\"}},\"utredningsmetodeMetastaser\":{\"utredningsmetodeLK\":\"5\",\"annenDiagnostikkLKSpesifiser\":\"\",\"utredningsmetodeFjernmet\":{\"skjelettscintigrafiMet\":true,\"rtgThoraxMet\":true,\"rtgBekkenMet\":false,\"cytologiMet\":true,\"biopsiMet\":true,\"annenDiagnostikkMet\":true,\"annenDiagnostikkMetSpesifiser\":\"\",\"utredningsmetodeFjernmetUkjent\":\"\",\"ctmet\":true,\"mrmet\":false,\"petmet\":true}}},\"kliniskTNM\":{\"ct\":\"\",\"cn\":\"\",\"cm\":\"\"}},\"skjemaNavn\":\"KliniskProstataUtredning\"}",
    "method": "POST",
    "mode": "cors",
    "credentials": "include"
});***/