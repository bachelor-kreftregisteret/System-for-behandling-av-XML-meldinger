import React, {useEffect, useState} from "react";
import 'survey-react/survey.css';
import {Model, StylesManager, Survey} from "survey-react";
import axios from "axios";
import {useParams} from "react-router-dom";
import useFetch from "../api/useFetch";
import SurveyComplete from "./SurveyComplete";

StylesManager.applyTheme('default')

const SurveyLogic = ({SurveyType}) => {
    //Henter data fra backend
    let { id } = useParams();
    const {data, loading, error} = useFetch('/api/v1/meldinger/' + id);
    const [isSuccess, setIsSuccess] = useState(false);

    //Lager en modell av surveyen vi har laget
    const survey = new Model(SurveyType);

    //templister for array
    let checkboxes = [];
    let flattenedJSON = [];

    // Finds checkboxes with more than one box in the given surveyJS json
    const findCheckboxes = (JSONdata) => {
        for (const key in JSONdata) {
            if (JSONdata[key].type === "checkbox" && JSONdata[key].choices.length > 1) {
                let checkboxChoices = [JSONdata[key].name];
                for (let i = 0; i < JSONdata[key].choices.length; i++) {
                    checkboxChoices.push(JSONdata[key].choices[i].value);
                }
                checkboxes.push(checkboxChoices);
            } else if (typeof (JSONdata[key]) === "object") {
                findCheckboxes(JSONdata[key]);
            }
        }
    }

    // Adds excluded checkbox data to the flattened JSON
    const addCheckboxToFlattenedJSON = (JSONdata, checkboxGroup) => {
        let values = []
        for (const key in JSONdata) {
            if (JSONdata[key] === true || JSONdata[key] === 99) {
                for (const checkbox in checkboxes[checkboxGroup]) {
                    if (key === checkboxes[checkboxGroup][checkbox]) {
                        values.push(key)
                        break
                    }
                }
            }
        }
        flattenedJSON[checkboxes[checkboxGroup][0]] = values;
    }

    // Loops through input JSON and flattens the JSON, but excludes checkboxes with more than one box
    const flatten = (JSONdata) => {
        for (const key in JSONdata) {
            if (typeof JSONdata[key] !== "object") {
                for (const checkboxGroup in checkboxes) {
                    for (const checkbox in checkboxes[checkboxGroup]) {
                        if (key === checkboxes[checkboxGroup][checkbox]) {
                            addCheckboxToFlattenedJSON(JSONdata, checkboxGroup)
                            return
                        }
                    }
                }
                flattenedJSON[key] = JSONdata[key];
            } else {
                flatten(JSONdata[key]);
            }
        }
    }

    const setDataValues = (data, JSONType, flattenedJSON) => {
        findCheckboxes(JSONType);
        flatten(data);
        survey.data = flattenedJSON;
    }

    useEffect(() =>  {
        setDataValues(data, SurveyType, flattenedJSON);
    }, [data, SurveyType, flattenedJSON]); //Dependent på loading. Når loading endrer seg, vil setValues kjøre. Altså da er dataene klare | Good practice å ha parameterne i dependency array


    const setChangedValue = (options, JSONdata) => {
        for (const key in JSONdata) {
            if (key === options.name) {
                if (options.question.getType() === "checkbox") {
                    // Singel checkbox med lagringsverdi true/false
                    if (typeof (JSONdata[key]) === "boolean") {
                        JSONdata[key] = options.value.length > 0;
                        return;
                    }
                    // Singel checkbox med lagringsverdi 99/""
                    else if (typeof (JSONdata[key]) === "string" || typeof (JSONdata[key]) === "number") {
                        if (options.value.length > 0) {
                            JSONdata[key] = 99;
                        } else {
                            JSONdata[key] = "";
                        }
                        return;
                    }
                    // Checkbox gruppe med flere checkboxer
                    else {
                        for (const checkboxGroup in checkboxes) {
                            if (checkboxes[checkboxGroup][0] === key) {
                                for (let i = 1; i < checkboxes[checkboxGroup].length; i++) {
                                    for (const key2 in JSONdata[key]) {
                                        if (checkboxes[checkboxGroup][i] === key2) {
                                            console.log(options.value.length)
                                            if (typeof (JSONdata[key][key2]) === "boolean") {
                                                JSONdata[key][key2] = options.value.includes(key2) && options.value.length > 0;
                                                break;
                                            }
                                            else if (typeof (JSONdata[key][key2]) === "string" || typeof (JSONdata[key][key2]) === "number") {
                                                if (options.value.includes(key2) && options.value.length > 0) {
                                                    JSONdata[key][key2] = 99;
                                                } else {
                                                    JSONdata[key][key2] = "";
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                                return;
                            }
                        }
                    }
                } else {
                    JSONdata[key] = options.value;
                    return;
                }
            } else if (typeof (JSONdata[key]) === "object") {
                setChangedValue(options, JSONdata[key],);
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
    }, [setDataValues]); //Dependent on setValues so it doesnt override



        survey
            .onCompleting
            .add(function (sender, options) {
                options.allowComplete = false;
                const headers = {
                    'Content-Type': 'application/json'
                }
                axios.post('http://localhost:8080/api/v1/meldinger', data, {headers})
                    .then(response => {
                        setIsSuccess(true);
                        console.log("Kommer vi hit: ", response)
                        options.allowComplete = true;
                    })
                    .catch(error => {
                        console.log("Eller hit")
                        alert(error.response.data)
                        setIsSuccess(false);
                    })
            })


    // Todo: Oncomplete function - Legg til en modal eller annet som kan beskrive feilen


    return (
        /*Render skjema*/
       <div>
           {!isSuccess ? <Survey model={survey} showCompletedPage={false}/> : <SurveyComplete/>}
       </div>
    )
}

export default SurveyLogic;
