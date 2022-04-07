import React, {useEffect, useState} from "react";
import 'survey-react/survey.css';
import './stylesheet.css';
import {Model, Survey, StylesManager} from "survey-react";
import axios from "axios";
import {useParams} from "react-router-dom";
import useFetch from "../api/useFetch";
import SurveyComplete from "./SurveyComplete";
import Sidebar from "./Sidebar";
import Footer from "./Footer";

StylesManager.applyTheme("default")

const SurveyLogic = ({SurveyType}) => {
    //Henter data fra backend
    let { id } = useParams();
    const {data, loading, error} = useFetch('/api/v1/meldinger/' + id);

    //Booleans for showing other components
    const [isSuccess, setIsSuccess] = useState(false);
    const [showSidebar, setShowSidebar] = useState(true);

    //Sidebar props
    const titles = [...document.querySelectorAll("h4")]


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
        survey.setValue("survey")
    }




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
        setDataValues(data, SurveyType, flattenedJSON);
    }, [data, SurveyType, flattenedJSON]);

    useEffect(() =>  {
        survey.onValueChanged.add(function (sender, options) {
            setChangedValue(options, data, false);
        });
    }, [setDataValues]); //Dependent on setValues so it doesnt override


    // Todo: Oncomplete function - Legg til en modal eller annet som kan beskrive feilen
    const submit = () => {
        const headers = {
            'Content-Type': 'application/json'
        }
        axios.post('http://localhost:8080/api/v1/meldinger', data, {headers})
            .then(response => {
                setIsSuccess(true);
                console.log("Kommer vi hit: ", response)
            })
            .catch(error => {
                console.log("Eller hit")
                alert(error.response.data)
                setIsSuccess(false);
            })
    }

    /*TODO: Fix new function for customized submit button*/
    /*TODO: create a CSS-file for styling | maybe create SCSS files for use of constants*/

    return (
        /*Render skjema*/
        !isSuccess ?
            <div className={showSidebar ? "surveyContainerGrid" : "surveyContainer"}>
                <div className={showSidebar ? "sidebarContainer" : "showSidebarContainer"}>
                    <button
                        className={ showSidebar ? "hideSidebarBtn" : "showSidebarBtn"}
                        onClick={() => setShowSidebar(!showSidebar)}>
                        {showSidebar ? "Lukk sidemeny >" : "< Sidemeny"}
                    </button>
                {showSidebar &&
                    <Sidebar
                        className={"sidebar"}
                        titles={titles}
                        loading={loading}/>}
                </div>
                <Survey
                    model={survey}
                    showCompletedPage={false}
                    showNavigationButtons={false}/>
                <Footer onSubmit={submit}/>
            </div>
            : <SurveyComplete/>)

}

export default SurveyLogic;
