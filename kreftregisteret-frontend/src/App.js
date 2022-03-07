import React from "react";
import RenderSurvey from "./surveyPostGet/surveyRender";
import {
    Route,
    NavLink,
    Routes,
    BrowserRouter
} from "react-router-dom";
import LandingPage from "./LandingPage";
import Layout from "./Layout";
import useFetch from "./surveyPostGet/useFetch";

function App() {
const {data, loading, error} = useFetch("http://localhost:8080/api/v1/meldinger")

    //TODO: Legg inn sjekk som sjekker om hvilken type melding data er også render riktig skjema

  return (
      <BrowserRouter>
          <Routes>
              <Route path="/" element={<Layout />}>
                  <Route index element={<LandingPage />} />
                  <Route path="utredning" element={<RenderSurvey data={data} loading={loading} error={error} />} />
              </Route>
          </Routes>
      </BrowserRouter>

      );
}

export default App;
