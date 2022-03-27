import React from "react";
import {Model, Survey} from "survey-react";
import SurveyJSONStraale from "../../surveyJsons/ProstataStraale";

const ProstataStraalebehandling = () => {
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