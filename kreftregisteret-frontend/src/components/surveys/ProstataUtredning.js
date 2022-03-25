import React, {useEffect, useState} from "react";
import 'survey-react/survey.css';
import {Model, StylesManager, Survey} from "survey-react";
import axios from "axios";
import {useParams} from "react-router-dom";
import useFetch from "../../api/useFetch";
import SurveyJsonUtredning from "../../surveyJsons/ProstataUtredning";
import SurveyJSONKirugi from "../../surveyJsons/ProstataKirurgi";

StylesManager.applyTheme('default')

const ProstataUtredning = () => {
    let { id } = useParams();
    //Henter data fra backend
    const {data, loading, error} = useFetch('http://localhost:8080/api/v1/meldinger/' + id);
    const [showSuccess, setShowSuccess] = useState(false);
    //Lager en modell av surveyen vi har laget
    const survey = new Model(SurveyJsonUtredning);
    const storageName = "Meldiiiiiing";


    //templister for array
    let tempArr = [];
    const lokalisasjonsListe = [];
    const utredningsmetodeFjernmetValues = [];
    const vevsproverUSValues = [];
    const prevData = localStorage.getItem(storageName) || null;

    // prevData && (survey.data = JSON.parse(prevData));
    console.log("setter data",survey.data )
    //Lager en array av navnene i skjemaet fra surveyjs
    const [arrayOfNames, setArrayOfNames] = useState([]);

    const setDataValues = (incomingDataObject) => {
        if (incomingDataObject === undefined) console.log(error)
        for (const key in incomingDataObject) {
            if (typeof (incomingDataObject[key]) === "object") {
                setDataValues(incomingDataObject[key]);
                // Hvis det er et objekt vil denne funksjonen rekursivt
                // fortsette å lete til det ikke lenger er det slik at vi kommer til siste objekt i strukturen.
            } else {
                if (arrayOfNames) {
                    arrayOfNames.map((name) => {
                        if (key === name) {
                            if (key === "SamletMRBasertKliniskT" || key === "SamletPalpatoriskTumor" || key === "cn" || key === "cm") {
                                return
                            }
                            survey.setValue(`${name}`, incomingDataObject[key])
                            survey.setValue("lokalisasjonFjernmet", getLokalisasjonValues(incomingDataObject))
                            survey.setValue("utredningsmetodeMetastaser", getUtredningsmetodeFjernmetValues(incomingDataObject))
                            survey.setValue("vevsproverUS", getVevsproverUSValues(incomingDataObject))
                            if (key === "funnUtredning" && incomingDataObject[key] === "2") { //2 eksisterer ikke som verdi lenger.
                                survey.setValue(`${name}`, "1");
                            }
                        }
                        //psaverdiIkkeTatt eksisterer ikke som navn i nytt skjema
                        if (key === "psaverdiIkkeTatt") {
                            console.log("OBJEKT", key)
                            if (incomingDataObject[key] === true) {
                                survey.setValue(`spsa`, "psaverdiIkkeTatt")
                            } else if (incomingDataObject[key] === "99") {
                                survey.setValue(`spsa`, "psaverdiUkjent")
                            }
                        }
                    })
                }

            }

        }
    }

    const getVevsproverUSValues = (incomingDataObject) => {
        for (const key in incomingDataObject)
            if (incomingDataObject[key] === true) {
                if (key === "biopsiVevsprover") {
                    vevsproverUSValues.push(key);
                }
                if (key === "turpvevsprover") {
                    vevsproverUSValues.push(key);
                }
                if (key === "annetVevsprover") {
                    vevsproverUSValues.push(key);
                }
            }
        return vevsproverUSValues;
    }

    const getLokalisasjonValues = (incomingDataObject) => {
        for (const key in incomingDataObject)
            if (incomingDataObject[key] === true) {
                if (key === "annetFjernmet") {
                    lokalisasjonsListe.push(key);
                }
                if (key === "fjerneLKmet") {
                    lokalisasjonsListe.push(key);
                }
                if (key === "skjelettmet") {
                    lokalisasjonsListe.push(key);
                }
            }
        return lokalisasjonsListe;
    }

    const getUtredningsmetodeFjernmetValues = (incomingDataObject) => {
        for (const key in incomingDataObject)
            if (incomingDataObject[key] === true) {
                if (key === "annenDiagnostikkMet")
                    utredningsmetodeFjernmetValues.push(key);

                if (key === "biopsiMet") {
                    utredningsmetodeFjernmetValues.push(key);
                }
                if (key === "ctmet") {
                    utredningsmetodeFjernmetValues.push(key);
                }
                if (key === "mrmet")
                    utredningsmetodeFjernmetValues.push(key);

                if (key === "petmet") {
                    utredningsmetodeFjernmetValues.push(key);
                }
                if (key === "rtgBekkenMet") {
                    utredningsmetodeFjernmetValues.push(key);
                }
                if (key === "utredningsmetodeFjernmetUkjent") {
                    utredningsmetodeFjernmetValues.push(key);
                }
                if (key === "skjelettscintigrafiMet") {
                    utredningsmetodeFjernmetValues.push(key);
                }
                if (key === "rtgThoraxMet") {
                    utredningsmetodeFjernmetValues.push(key);
                }
                if (key === "cytologiMet") {
                    utredningsmetodeFjernmetValues.push(key);
                }

            }
        return utredningsmetodeFjernmetValues;
    }

    //Henter og lager en liste av alle navn fra surveyJS-skjemaet vårt
    const addPropertyNamesToArray = (obj) => {
        obj = SurveyJsonUtredning.pages; //SurveyJSON.pages er et array med flere elementer i hvert object
        obj.map(el => {
            if (typeof (el) == "object") {
                el.elements.map(ele =>
                    tempArr.push(ele.name));
            }
        });
        setArrayOfNames(tempArr);
    };

    //Kjører metoden
    useEffect(() =>  {
        addPropertyNamesToArray(SurveyJsonUtredning);
    }, [SurveyJsonUtredning]);

    useEffect(() =>  {
        setDataValues(data);
    }, [loading]); //Dependent på loading. Når loading endrer seg, vil setValues kjøre. Altså da er dataene klare

    function saveSurveyData(survey) {
        localStorage.setItem(storageName, JSON.stringify(survey.data));
    }


    const setChangedValue = (options, JSONdata, changed) => {
        for (const key in JSONdata) {
            if (key === options.name) {
                if (options.question.getType() === "checkbox") {
                    if (options.name === "utredningsmetodeMetastaser") {
                        for (const fieldInJSON in JSONdata[key]["utredningsmetodeFjernmet"]) {
                            let found = false;
                            for (const fieldInSurvey in options.value) {
                                if (options.value[fieldInSurvey] === fieldInJSON) {
                                    if (typeof (JSONdata[key]["utredningsmetodeFjernmet"][fieldInJSON]) === "string") {
                                        JSONdata[key]["utredningsmetodeFjernmet"][fieldInJSON] = 99;
                                    } else {
                                        JSONdata[key]["utredningsmetodeFjernmet"][fieldInJSON] = true;
                                    }
                                    found = true;
                                }
                            }
                            if (!found) {
                                if (typeof (JSONdata[key]["utredningsmetodeFjernmet"][fieldInJSON]) === "string") {
                                    JSONdata[key]["utredningsmetodeFjernmet"][fieldInJSON] = "";
                                } else {
                                    JSONdata[key]["utredningsmetodeFjernmet"][fieldInJSON] = false;
                                }
                            }
                        }
                    }
                    else if (typeof (JSONdata[key]) === "boolean") {
                        JSONdata[key] = options.value.length > 0;
                    }
                    else if (options.name === "spsa") {
                        console.log(typeof (JSONdata[key]))
                        for (const k in JSONdata[key]) {
                            if (options.value.length <= 1) {
                                if (options.value.includes("psaverdiIkkeTatt")) {
                                    JSONdata[key][`psaverdiIkkeTatt`] = true;
                                } else {
                                    JSONdata[key]['psaverdiIkkeTatt'] = false;
                                }
                                if (options.value.includes("psaverdiUkjent")) {
                                    JSONdata[key]["psaverdiUkjent"] = 99;
                                } else {
                                    JSONdata[key]["psaverdiUkjent"] = "";
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    else if (typeof (JSONdata[key]) === "string") {
                        if (options.value.length > 0) {
                            JSONdata[key] = 99;
                        } else {
                            JSONdata[key] = "";
                        }
                    }
                    else if (options.name === "vevsproverUS") {
                        for (const k in JSONdata[key]) {
                            if (options.value.length >= 0) {
                                JSONdata[key]['biopsiVevsprover'] = !!options.value.includes("biopsiVevsprover");
                                JSONdata[key]["turpvevsprover"] = !!options.value.includes("turpvevsprover");
                                JSONdata[key]["annetVevsprover"] = !!options.value.includes("annetVevsprover");
                            }
                        }
                    }
                } else {
                    JSONdata[key] = options.value;
                }
                changed = true;
            } else if (typeof (JSONdata[key]) === "object" && !changed) {
                setChangedValue(options, JSONdata[key], changed);
            }
        }
    }

    const replaceUndefined = (JSONdata) => {
        for (const key in JSONdata) {
            if (JSONdata[key] === undefined) {
                JSONdata[key] = "";
            }
            else if (typeof (JSONdata[key]) === "object") {
                replaceUndefined(JSONdata[key])
            }
        }
    }

    useEffect(() =>  {
        survey.onValueChanged.add(function (sender, options) {
            setChangedValue(options, data, false);
        });
    }, [setDataValues]);

    //Sender tilbake det gamle skjemaet. Må fikses slik at det nye skjemaet sendes i gamle drakter..
    survey.onComplete.add(function (sender, options) {
        replaceUndefined(data);
        saveSurveyData(survey);
        console.log(survey.data)
        console.log("Hva har vi her? ", localStorage.getItem("Meldiiiiiing"))

        const headers = {
            'Content-Type': 'application/json'
        }
        axios.post('http://localhost:8080/api/v1/meldinger', data, {headers})
            .then(response => { options.showDataSavingSuccess("Dataene var korrekte og er nå lagret på serveren"); localStorage.clear()})
            .catch(error => {
                options.showDataSavingError(error.response.data);
                console.log(error.response.data)
            })
    })

    return (
        /*Render skjema*/
       <Survey model={survey} />

    )
}

export default ProstataUtredning;
