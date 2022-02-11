import React, {useEffect, useState} from "react";
import surveyJSON from "./survey/surveyProstataUtredning";
import * as Survey from "survey-react";
import DataFetching from "./DataFetching";

function App() {
  return (

      <div className="App">
        <main>
          <Survey.Survey
              json={surveyJSON}
          />
            <DataFetching/>

        </main>
      </div>
  );
}

export default App;
