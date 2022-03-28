import React from "react";
import {
    Route,
    Routes,
    BrowserRouter
} from "react-router-dom";

import SurveyLogic from "./components/SurveyLogic";
import Header from "./components/Header";
import Navigation from "./components/Navigation";
import SurveyJsonUtredning from "./surveyJsons/ProstataUtredning";
import SurveyJSONKirugi from "./surveyJsons/ProstataKirurgi";
import SurveyJSONStraale from "./surveyJsons/ProstataStraale";


function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Header />}>
                    <Route index element={<Navigation />}/>
                    <Route path={`prostata-utredning`} element={<SurveyLogic SurveyType={SurveyJsonUtredning} />}/>
                    <Route path={`prostata-utredning/:id`} element={<SurveyLogic SurveyType={SurveyJsonUtredning} />}/>
                    <Route path={`prostata-straale`} element={<SurveyLogic SurveyType={SurveyJSONStraale} />}/>
                    <Route path={`prostata-straale/:id`} element={<SurveyLogic SurveyType={SurveyJSONStraale} />}/>
                    <Route path={`prostata-kirurgi`} element={<SurveyLogic SurveyType={SurveyJSONKirugi} />}/>
                    <Route path={`prostata-kirurgi/:id`} element={<SurveyLogic SurveyType={SurveyJSONKirugi} />}/>
                </Route>
            </Routes>
        </BrowserRouter>

    );
}

export default App;
