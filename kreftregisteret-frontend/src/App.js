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

function App() {

  return (
      <BrowserRouter>
          <Routes>
              <Route path="/" element={<Layout />}>
                  <Route index element={<LandingPage />} />
                  <Route path="utredning" element={<RenderSurvey  />} />
              </Route>
          </Routes>
      </BrowserRouter>

      );
}

export default App;
