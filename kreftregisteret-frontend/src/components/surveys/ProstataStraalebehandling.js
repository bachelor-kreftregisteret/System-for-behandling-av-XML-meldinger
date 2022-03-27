import React from "react";
import {Model, Survey} from "survey-react";
import SurveyJSONStraale from "../../surveyJsons/ProstataStraale";
import {useParams} from "react-router-dom";
import useFetch from "../../api/useFetch";

const ProstataStraalebehandling = () => {
    let { id } = useParams();
    //Henter data fra backend
    const {data, loading, error} = useFetch('/api/v1/meldinger/' + id);

    //Lager en modell av surveyen vi har laget
    const survey = new Model(SurveyJSONStraale);

    return (
        /*Render skjema*/
        <div>
            <Survey model={survey}/>
        </div>
    )
}

export default ProstataStraalebehandling;