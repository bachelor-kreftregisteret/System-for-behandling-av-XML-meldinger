import React from "react";
import surveyJSON from "./survey/surveyProstataUtredning";
import * as Survey from "survey-react";

function App() {
  return (
      <div className="App">
        <main>
          <Survey.Survey
              json={surveyJSON}
          />
        </main>
      </div>
  );
}

export default App;
