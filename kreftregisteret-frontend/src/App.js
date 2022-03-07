import React from "react";
import RenderSurvey from "./surveyPostGet/surveyRender";
import {
    Route,
    Routes,
    BrowserRouter
} from "react-router-dom";
import LandingPage from "./LandingPage";
import Layout from "./Layout";


function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Layout/>}>
                    <Route index element={<LandingPage/>}/>
                    <Route path={`utredning/:id`} element={<RenderSurvey />}/>
                </Route>
            </Routes>
        </BrowserRouter>

    );
}

export default App;
