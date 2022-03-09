import React from "react";
import RenderSurvey from "./surveyPostGet/surveyRender";
import {
    Route,
    Routes,
    BrowserRouter
} from "react-router-dom";
import Navigation from "./Navigation";
import Layout from "./Layout";


function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Layout/>}>
                    <Route index element={<Navigation/>}/>
                    <Route path={`utredning`} element={<RenderSurvey />}/>
                    <Route path={`utredning/:id`} element={<RenderSurvey />}/>
                </Route>
            </Routes>
        </BrowserRouter>

    );
}

export default App;
