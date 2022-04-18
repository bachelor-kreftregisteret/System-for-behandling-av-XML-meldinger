import {BrowserRouter, Route, Routes} from "react-router-dom";
import Header from "./Header";
import Dashboard from "./dashboard/Dashboard";
import FormLogic from "./form/FormLogic";
import SurveyJsonUtredning from "../surveys/prostata/ProstataUtredning";
import SurveyJSONStraale from "../surveys/prostata/ProstataStraale";
import SurveyJSONKirugi from "../surveys/prostata/ProstataKirurgi";
import React from "react";

const Routing = () => {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Header/>}>
                    <Route index element={<Dashboard/>}/>
                    <Route path={`prostata-utredning`} element={<FormLogic SurveyType={SurveyJsonUtredning}/>}/>
                    <Route path={`prostata-utredning/:id`} element={<FormLogic SurveyType={SurveyJsonUtredning}/>}/>
                    <Route path={`prostata-straale`} element={<FormLogic SurveyType={SurveyJSONStraale}/>}/>
                    <Route path={`prostata-straale/:id`} element={<FormLogic SurveyType={SurveyJSONStraale}/>}/>
                    <Route path={`prostata-kirurgi`} element={<FormLogic SurveyType={SurveyJSONKirugi}/>}/>
                    <Route path={`prostata-kirurgi/:id`} element={<FormLogic SurveyType={SurveyJSONKirugi}/>}/>
                </Route>
            </Routes>
        </BrowserRouter>)
}

export default Routing;