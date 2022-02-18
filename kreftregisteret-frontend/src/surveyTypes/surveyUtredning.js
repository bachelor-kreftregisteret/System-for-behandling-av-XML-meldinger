import React, {useEffect, useState} from "react";
import 'survey-react/survey.css';
import SurveyJSON from '../surveyJSONs/surveyUtredning'
import {Model, StylesManager, Survey} from "survey-react";
import useFetch from "../useFetch";
import axios from "axios";


const UtredningSurvey = () => {
    //Henter data fra backend
    const data = useFetch('http://localhost:8080/api/v1/meldinger');

    //Lager en modell av surveyen vi har laget
    const survey = new Model(SurveyJSON);
    StylesManager.applyTheme('default')
    console.log(StylesManager.ThemeColors)

    //En templiste for array
    let tempArr = [];
    const [arrayOfNames, setArrayOfNames] = useState([]);




    // const flattenJSON = (obj = {}, tempArr = {}, extraKey = '') => {
    //     for(const key in obj){
    //         if(typeof obj[key] !== 'object'){
    //             tempArr[extraKey + key] = obj[key];
    //         }else{
    //             flattenJSON(obj[key], tempArr, `${extraKey}${key}.`);
    //         };
    //     };
    //     return tempArr;
    // };


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
    setDataValues(data.data);
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

export default UtredningSurvey;