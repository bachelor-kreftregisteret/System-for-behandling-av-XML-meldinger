import React from "react";
import {
    Route,
    Routes,
    BrowserRouter
} from "react-router-dom";

import SurveyLogic from "./components/SurveyLogic";
import Header from "./components/Header";
import Index from "./components/Index";
import SurveyJsonUtredning from "./surveys/prostata/ProstataUtredning";
import SurveyJSONKirugi from "./surveys/prostata/ProstataKirurgi";
import SurveyJSONStraale from "./surveys/prostata/ProstataStraale";
import SidebarNav from "./components/SidebarNav";


function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Header />}>
                    <Route index element={<Index />}/>
                    <Route path={`prostata-utredning`} element={<SurveyLogic SurveyType={SurveyJsonUtredning} />}/>
                    <Route path={`prostata-utredning/:id`} element={<SurveyLogic SurveyType={SurveyJsonUtredning} />}/>
                    <Route path={`prostata-straale`} element={<SurveyLogic SurveyType={SurveyJSONStraale} />}/>
                    <Route path={`prostata-straale/:id`} element={<SurveyLogic SurveyType={SurveyJSONStraale} />}/>
                    <Route path={`prostata-kirurgi`} element={<SurveyLogic SurveyType={SurveyJSONKirugi} />}/>
                    <Route path={`prostata-kirurgi/:id`} element={<SurveyLogic SurveyType={SurveyJSONKirugi} />}/>
                    <Route path={`sidebar`} element={<SidebarNav SurveyType={SurveyJSONKirugi} />}/>
                </Route>
            </Routes>
        </BrowserRouter>

    );
}

export default App;
