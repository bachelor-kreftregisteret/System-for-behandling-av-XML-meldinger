import React from "react";
import {
    Route,
    Routes,
    BrowserRouter
} from "react-router-dom";
import Navigation from "./Navigation";
import Layout from "./Layout";
import ProstataUtredning from "./components/surveys/ProstataUtredning";
import ProstataStraalebehandling from "./components/surveys/ProstataStraalebehandling";
import ProstataKirurgi from "./components/surveys/ProstataKirurgi";


function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Layout/>}>
                    <Route index element={<Navigation/>}/>
                    <Route path={`prostata-utredning`} element={<ProstataUtredning />}/>
                    <Route path={`prostata-utredning/:id`} element={<ProstataUtredning />}/>
                    <Route path={`prostata-straalebehandling`} element={<ProstataStraalebehandling />}/>
                    <Route path={`prostata-kirurgi`} element={<ProstataKirurgi />}/>
                </Route>
            </Routes>
        </BrowserRouter>

    );
}

export default App;
