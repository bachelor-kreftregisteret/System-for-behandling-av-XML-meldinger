import React from "react";
import {
    Route,
    Routes,
    BrowserRouter
} from "react-router-dom";

import ProstataUtredning from "./components/surveys/ProstataUtredning";
import ProstataStraalebehandling from "./components/surveys/ProstataStraalebehandling";
import ProstataKirurgi from "./components/surveys/ProstataKirurgi";
import Header from "./components/Header";
import Navigation from "./components/Navigation";


function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Header />}>
                    <Route index element={<Navigation />}/>
                    <Route path={`prostata-utredning`} element={<ProstataUtredning />}/>
                    <Route path={`prostata-utredning/:id`} element={<ProstataUtredning />}/>
                    <Route path={`prostata-straale`} element={<ProstataStraalebehandling />}/>
                    <Route path={`prostata-straale/:id`} element={<ProstataStraalebehandling />}/>
                    <Route path={`prostata-kirurgi`} element={<ProstataKirurgi />}/>
                    <Route path={`prostata-kirurgi/:id`} element={<ProstataKirurgi />}/>
                </Route>
            </Routes>
        </BrowserRouter>

    );
}

export default App;
