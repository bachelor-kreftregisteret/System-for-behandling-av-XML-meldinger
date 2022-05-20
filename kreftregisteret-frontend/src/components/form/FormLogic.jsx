import React, {useEffect, useState, createElement} from "react";
import 'survey-react/survey.css';
import {Model, Survey} from "survey-react";
import * as SurveyReact from "survey-react";
import '../../css/stylesheet.css';
import {useParams} from "react-router-dom";
import Sidebar from "./Sidebar";
import Footer from "./Footer";
import ReactSelect from "./ReactSelect";
import GetMeldinger from "../../api/getMeldinger";
import {URL} from "../../utils/utils";
import axios from "axios";

const FormLogic = ({FormType}) => {
    // Henter data fra backend
    const {id} = useParams();
    const {data, loading, error} = GetMeldinger(id);

    // Lager en modell av surveyen vi har laget
    const survey = new Model(FormType);

    const [isModalOpen, setIsModalOpen] = useState(false);
    const [postError, setPostError] = useState("");

    // Registrerer CustomSelect komponenten som en render type under navnet "sv-dropdown-react"
    SurveyReact.ReactQuestionFactory.Instance.registerQuestion("sv-dropdown-react", (props) => {
        return createElement(ReactSelect, props);
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
    };

    // Legger til checkboxer med flere enn en checkbox til den flate JSON-en
    const addCheckboxToFlattenedJSON = (JSONdata, checkboxGroup) => {
        let values = [];
        for (const key in JSONdata) {
            if (JSONdata[key] === true || JSONdata[key] === 99) {
                for (const checkbox in checkboxes[checkboxGroup]) {
                    if (key === checkboxes[checkboxGroup][checkbox]) {
                        values.push(key);
                        break
                    }
                }
            }
        }
        flattenedJSON[checkboxes[checkboxGroup][0]] = values;
    };

    // Går gjennom input JSON og gjør den flat
    const flatten = (JSONdata) => {
        for (const key in JSONdata) {
            if (typeof JSONdata[key] !== "object") {
                for (const checkboxGroup in checkboxes) {
                    for (const checkbox in checkboxes[checkboxGroup]) {
                        if (key === checkboxes[checkboxGroup][checkbox]) {
                            addCheckboxToFlattenedJSON(JSONdata, checkboxGroup);
                            return
                        }
                    }
                }
                flattenedJSON[key] = JSONdata[key];
            } else {
                flatten(JSONdata[key]);
            }
        }
    };

    // Funksjon for å hente sykehuskode fra andre sykhusnavn-felt
    const setSykehusKode = () => {
        for (const key in flattenedJSON) {
            if (key === "sykehusnavnRHF") {
                flattenedJSON["sykehusnavnRHF"] = ""; // Fjerner region fra dataen
                data.stdInfo.pasientInstitusjon.sykehusnavnRHF = "";
            }
            else  if (key === "sykehusnavnHFSorOst" || key === "sykehusnavnHFVest" || key === "sykehusnavnHFMidt" || key === "sykehusnavnHFNord" || key === "sykehusnavnSpesSenter") {
                if (flattenedJSON[key]) {
                    flattenedJSON["sykehuskode"] = flattenedJSON[key];
                    flattenedJSON[key] = "";
                    data.stdInfo.pasientInstitusjon.sykehuskode = flattenedJSON["sykehuskode"];
                    data.stdInfo.pasientInstitusjon[key] = "";
                    // Denne returnerer ikke i tilfelle det av en eller annen grunne skulle være flere sykehuskoder lagt inn
                }
            }
        }
    };

    const setDataValues = (data, JSONType, flattenedJSON) => {
        findCheckboxes(JSONType);
        flatten(data);
        if (data !== "" && data !== null) { // Hvis det ikke blir lastet data, så blir ikke deafaultValues endret
            let StringJSONType = "";
            for (const key in data) {
                if (key === "@type") {
                    StringJSONType = data[key];
                    break;
                }
            }
            if (StringJSONType !== JSONType.name) { // Hvis data blir lastet inn i feil type skjema
                setIsModalOpen(true);
                setPostError("Innlasting feil");
            } else {
                setSykehusKode();
                survey.data = flattenedJSON;
            }
        }
        // Todo
        // deafaultValues vil ikke blir lagret i data når nytt skjema lagring blir implementert
    };

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
    };

    // Når et felt i JSON er undefined og det koverteres til XML så blir feltet borte i XML-en.
    // Bytter derfor ut undefined med en tom string slik at feltet ikke blir borte.
    const replaceUndefined = (JSONdata) => {
        for (const key in JSONdata) {
            if (JSONdata[key] === undefined) {
                JSONdata[key] = "";
            } else if (typeof (JSONdata[key]) === "object") {
                replaceUndefined(JSONdata[key]);
            }
        }
    };

    useEffect(() => {
        setDataValues(data, FormType, flattenedJSON);
    }, [data, FormType, flattenedJSON]);

    useEffect(() => {
        survey.onValueChanged.add(function (sender, options) {
            setChangedValue(options, data, false);
        });
        survey.onPanelVisibleChanged.add(function (survey, options) {
            if (!options.visible) {
                const questions = options.panel.questions;
                for (let i = 0; i < questions.length; i++) {
                    questions[i].clearValue();
                }
            }
        }); // Gjør slik at hvis en page blir gjem så tømmes de gjemte veridene i pagen
    }, [setDataValues]); // Venter på setValues så den ikke triggrer mens data blir lastet inn

    const submit = () => {
        replaceUndefined(data);
        // Funksjon for å scrolle til spørsmål med error
        if (survey.isCurrentPageHasErrors) {
            const array = survey.getAllQuestions();
            const firstError = true;
            for (const question in array) {
                if (array[question].errors.length > 0) {
                    if (firstError) {
                        document.getElementById(array[question].id).scrollIntoView();
                        return;
                    }
                }
            }
            setIsModalOpen(false);
        } else {
            const checkLabValueURL = "https://metadata.kreftregisteret.no/rest/v1/variables/" +
                "validate/:variable/m_labAngittAvKliniker?value_codes[]=" + data.laboratorium.labnavnHF;
            fetch(checkLabValueURL)
                .then(response => response.json())
                .then(StatusData => {
                    if (StatusData.status === "OK") {
                        const headers = {
                            'Content-Type': 'application/json'
                        };
                        axios.post(URL.url, data, {headers})
                            .then(_ => {
                                setPostError("")
                            })
                            .catch(error => {
                                setPostError(error.toString())
                            });
                    }
                    else {
                        setPostError(StatusData.status);
                    }
                })
                .catch(error => {
                    setPostError(error.toString())
                });
            setIsModalOpen(true);
        }
    };

    return (
        <>
            {error === null ?
                <div className={"surveyContainer"}>
                    <Sidebar
                        className={"sidebar"}
                        loading={loading}
                        isModalOpen={isModalOpen}
                        postError={postError}
                    />
                    <Survey
                        model={survey}
                        showCompletedPage={false}
                        showNavigationButtons={false}
                    />
                    <Footer
                        onSubmit={submit}
                        isModalOpen={isModalOpen}
                        setIsModalOpen={setIsModalOpen}
                        postError={postError}
                    />
                </div>
                :
                <div className={"errorContainer"}>
                    <h2>Noe gikk galt</h2>
                    <p>{error.toString()}</p>
                </div>
            }
        </>
    )

};

export default FormLogic;
