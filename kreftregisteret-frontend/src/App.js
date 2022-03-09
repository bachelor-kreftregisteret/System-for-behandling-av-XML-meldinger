import React from "react";
import {
    Route,
    Routes,
    BrowserRouter
} from "react-router-dom";
import Navigation from "./Navigation";
import Layout from "./Layout";
import ProstataUtredning from "./components/surveys/ProstataUtredning";


function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Layout/>}>
                    <Route index element={<Navigation/>}/>
                    <Route path={`prostata-utredning`} element={<ProstataUtredning />}/>
                    <Route path={`prostata-utredning/:id`} element={<ProstataUtredning />}/>
                </Route>
            </Routes>
        </BrowserRouter>

    );
}

export default App;
