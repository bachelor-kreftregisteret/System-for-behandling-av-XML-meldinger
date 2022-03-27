import React, {useState} from "react";
import {useParams} from "react-router-dom";
import useFetch from "../../api/useFetch";
import {Model, Survey} from "survey-react";
import SurveyJSONKirugi from "../../surveyJsons/ProstataKirurgi";

const ProstataKirurgi = () => {

    //Lager en modell av surveyen vi har laget
    const survey = new Model(SurveyJSONKirugi);

    return (
        /*Render skjema*/
        <div>
            <Survey model={survey}/>
        </div>
    )
}

export default ProstataKirurgi;