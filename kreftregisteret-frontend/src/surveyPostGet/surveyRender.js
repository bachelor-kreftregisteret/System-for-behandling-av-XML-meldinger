import React, {useEffect, useState} from "react";
import 'survey-react/survey.css';
import SurveyJSON from '../surveyJSONs/surveyProstataUtredning';
import * as Survey from "survey-react";
import {Model, StylesManager} from "survey-react";
import useFetch from "./useFetch";
import axios from "axios";


const RenderSurvey = () => {
    //Henter data fra backend
    const importData = useFetch('http://localhost:8080/api/v1/meldinger');

    //Lager en modell av surveyen vi har laget
    const survey = new Model(SurveyJSON);
    StylesManager.applyTheme('default')
    console.log(StylesManager.ThemeColors)

    //En templiste for array
    let tempArr = [];
    const [arrayOfNames, setArrayOfNames] = useState([]);

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
                            console.log("Its a match")
                            survey.setValue(`${arrayOfNames[keyz]}`, incomingDataObject[key])
                            console.log(`Array: ${arrayOfNames[keyz]} og ${key}`)

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
        })
        console.log("Dette er tempArr", tempArr)
        setArrayOfNames(tempArr);

    }

    //Kjører metoden
    useEffect(() =>  {
        addPropertyNamesToArray(SurveyJSON)
    }, []);

    setDataValues(importData.data);

    survey.onValueChanged.add(function (sender, options) {
        const question = options.question;
        if (question.inputType === "date") {
            const currentDate = new Date();
            const inputDate = new Date(options.value);
            if (inputDate.getTime() > currentDate.getTime()) {
                question.addError(new Survey.SurveyError("Dato kan ikke være etter dagens dato"));
                console.log(options.name)
            }
        }
    })

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