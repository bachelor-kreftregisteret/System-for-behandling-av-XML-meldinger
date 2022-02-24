import React, {useEffect, useState} from "react";
import 'survey-react/survey.css';
import SurveyJSON from '../surveyJSONs/surveyProstataUtredning';
import {Model, StylesManager, Survey } from "survey-react";
import {dateValidator} from "./surveyValidator";
import useFetch from "./useFetch";
import axios from "axios";

StylesManager.applyTheme('default')

const RenderSurvey = () => {
    //Henter data fra backend
    const importData = useFetch('http://localhost:8080/api/v1/meldinger');

    //Lager en modell av surveyen vi har laget
    const survey = new Model(SurveyJSON);
    StylesManager.applyTheme('default')

    //En templiste for array
    let tempArr = [];
    let lokalisasjonsListe = [];
    let utredningsmetodeFjernmetValues = [];
    let vevsproverUSValues = [];

    const [arrayOfNames, setArrayOfNames] = useState([]);

    const getVevsproverUSValues = (incomingDataObject) => {

        for (const key in incomingDataObject)
            if (incomingDataObject[key] === true) {
                if (key === "biopsiVevsprover")
                    vevsproverUSValues.push(key);
                console.log("Skjera", lokalisasjonsListe)

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
                if (key === "annetFjernmet")
                    lokalisasjonsListe.push(key);
                console.log("Skjera", lokalisasjonsListe)

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

    const setDataValues = (incomingDataObject) => {
        for (const key in incomingDataObject) {
            if (typeof (incomingDataObject[key]) === "object") {
                setDataValues(incomingDataObject[key]);
                //Hvis det er et objekt vil denne funksjonen rekursivt
                // fortsette å lete til det ikke lenger er det slik at vi kommer til siste objekt i strukturen.
            } else {
                if (arrayOfNames) {
                    for (const keyz in arrayOfNames) {
                        if (key === arrayOfNames[keyz]) {
                            survey.setValue(`${arrayOfNames[keyz]}`, incomingDataObject[key])
                            survey.setValue("lokalisasjonFjernmet", getLokalisasjonValues(incomingDataObject))
                            survey.setValue("utredningsmetodeMetastaser", getUtredningsmetodeFjernmetValues(incomingDataObject))
                            survey.setValue("vevsproverUS", getVevsproverUSValues(incomingDataObject))
                            if (key === "funnUtredning" && incomingDataObject[key] === "2") { //2 eksisterer ikke som verdi lenger.
                                survey.setValue(`${arrayOfNames[keyz]}`, "1");
                            }
                            if (key === "prostatavolumUkjent" ) {
                                if(incomingDataObject[key] === "99") {
                                    survey.setValue(`${arrayOfNames[keyz]}`, "item1")
                                } else {
                                    survey.setValue(`${arrayOfNames[keyz]}`, "")
                                }
                            }
                            if (key === "labnavnHFIkkeRelevant" ) {
                                if(incomingDataObject[key] === true) {
                                    survey.setValue(`${arrayOfNames[keyz]}`, "item1")
                                } else {
                                    survey.setValue(`${arrayOfNames[keyz]}`, "")
                                }
                            }
                        }

                        //psaverdiIkkeTatt eksisterer ikke som navn i nytt skjema
                        if (key === "psaverdiIkkeTatt") {
                            if (incomingDataObject[key] === true) {

                                survey.setValue(`psaverdiValg`, "psaverdiIkkeTatt")
                            } else {
                                survey.setValue(`psaverdiValg`, "psaverdiUkjent")
                            }
                        }
                    }
                }
                //console.log(key, ":", incomingDataObject[key])
            }
        }
    }

    //Henter og lager en liste av alle navn fra surveyJS-skjemaet vårt
    const addPropertyNamesToArray = (obj) => {
        obj = SurveyJSON.pages; //SurveyJSON.pages er et array med flere elementer i hvert object
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
        addPropertyNamesToArray(SurveyJSON);
    }, []);

    setDataValues(importData.data);

    const setChangedValue = (options, data) => {
        for (const key in data) {
            if (key === options.name) {
                data[key] = options.value;
            }
            else if (typeof (data[key]) === "object") {
                setChangedValue(options, data[key]);
            }
        }
    }

    survey.onValueChanged.add(function (sender, options) {
        setChangedValue(options, importData);
    });

    survey.onComplete.add(function (sender, options) {
        //Show message about "Saving..." the results
        options.showDataSaving();//you may pass a text parameter to show your own text
        const headers = {
            'Content-Type': 'application/json'}
        axios.post('http://localhost:8080/api/v1/meldinger', sender.data,{headers})
            .then(response => console.log(response))
            .finally(() => {
                    options.showDataSavingSuccess();
            } );
    });

    return (
        /*Render skjema*/
        <Survey
            model={survey}
        />
    )
}

export default RenderSurvey;