import React, {useEffect, useState, createElement} from "react";
import 'survey-react/survey.css';
import {Model, Survey} from "survey-react";
import * as SurveyReact from "survey-react";
import './stylesheet.css';
import axios from "axios";
import {useParams} from "react-router-dom";
import useFetch from "../api/useFetch";
import SurveyComplete from "./ConfirmationModal";
import SurveyCustomSelect from "./SurveyCustomSelect";
import Sidebar from "./Sidebar";
import Footer from "./Footer";


const SurveyLogic = ({SurveyType}) => {

    console.log("rerenderer denne nuuuuu")
    // Henter data fra backend
    let {id} = useParams();
    // Lager en modell av surveyen vi har laget
    const survey = new Model(SurveyType);

    const {data, loading, error} = useFetch('/api/v1/meldinger/' + id);
    const [isSuccess, setIsSuccess] = useState(false);
    const [isOpen, setIsOpen] = useState(false);
    const [postError, setPostError] = useState(null)

    // Registrerer CustomSelect komponenten som en render type under navnet "sv-dropdown-react"
    SurveyReact.ReactQuestionFactory.Instance.registerQuestion("sv-dropdown-react", (props) => {
        return createElement(SurveyCustomSelect, props);
    });
    // Registrerer "sv-dropdown-react" som en type render for spørsmål hvor "type" er "dropdown" og "renderAs" er "dropdown-react"
    SurveyReact.RendererFactory.Instance.registerRenderer("dropdown", "dropdown-react", "sv-dropdown-react");


    // Templister for array
    let checkboxes = [];
    let flattenedJSON = [];

    // Finner checkboxene med mer enn en boks i JSON-en til en survey
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

    // Legger til checkboxer med flere enn en checkbox til den flate JSON-en
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

    // Går gjennom input JSON og gjør den flat
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

    // Funksjon for å hente sykehuskode fra andre sykhusnavn-felt
    const setSykehusKode = () => {
        for (const key in flattenedJSON) {
            if (key === "sykehusnavnHFSorOst" || key === "sykehusnavnHFVest" || key === "sykehusnavnHFMidt" || key === "sykehusnavnHFNord" || key === "sykehusnavnSpesSenter") {
                if (flattenedJSON[key]) {
                    flattenedJSON["sykehuskode"] = flattenedJSON[key];
                    flattenedJSON[key] = "";  // Fjerner dataen fra det gamle feltet
                    return;
                }
            }
        }
    }

    const setDataValues = (data, JSONType, flattenedJSON) => {
        findCheckboxes(JSONType);
        flatten(data);
        setSykehusKode();
        survey.data = flattenedJSON;
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
                                            } else if (typeof (JSONdata[key][key2]) === "string" || typeof (JSONdata[key][key2]) === "number") {
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

    // Når et felt i JSON er undefined og det koverteres til XML så blir feltet borte i XML-en.
    // Bytter derfor ut undefined med en tom string slik at feltet ikke blir borte.
    const replaceUndefined = (JSONdata) => {
        for (const key in JSONdata) {
            if (JSONdata[key] === undefined) {
                JSONdata[key] = "";
            } else if (typeof (JSONdata[key]) === "object") {
                replaceUndefined(JSONdata[key])
            }
        }
    }


    useEffect(() =>  {
        setDataValues(data, SurveyType, flattenedJSON);
    },[data, SurveyType, flattenedJSON]);

    useEffect(() =>  {
        survey.onValueChanged.add(function (sender, options) {
            setChangedValue(options, data, false);
        });
    }, [setDataValues]); // Venter på setValues så den ikke skriver over data mens data blir satt inn

    const submit = () => {
        if (survey.isCurrentPageHasErrors) {
            setIsOpen(false);
        } else {
            setIsOpen(true);
            const headers = {
                'Content-Type': 'application/json'
            }
            axios.post('http://localhost:8080/api/v1/meldinger', data, {headers})
                .then(response => {
                    setPostError(null)
                    setIsSuccess(true)
                    console.log("Kommer vi hit: ", response, isSuccess)
                })
                .catch(error => {
                    setPostError(error.toString())
                    setIsSuccess(false);
                    console.log("Eller hit", isSuccess, postError)

                })
        }
    }

    // Todo: Oncomplete function - Legg til en modal eller annet som kan beskrive feilen


    return (
        /*Render skjema*/
        <>
            {error === null ?
            <div className={"surveyContainer"}>
                <Survey
                    model={survey}
                    showCompletedPage={false}
                    showNavigationButtons={false}/>
                <Sidebar
                    className={"sidebar"}
                    loading={loading}/>
                <Footer onSubmit={submit} isSuccess={isSuccess} isOpen={isOpen} setIsOpen={setIsOpen} postError={postError}/>
            </div>
            :
                <div className={"error"}>
                    <h2>Noe gikk galt</h2>
                    <p>{error.toString()}</p>
                </div>
            }
        </>

)

}

export default SurveyLogic;
