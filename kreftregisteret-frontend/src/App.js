import { useCallback } from "react";
import './App.css';
import surveyJSON from "./survey/surveyUtredning";
import { Survey, StylesManager, Model } from "surveyjs-react";

StylesManager.applyTheme("modern");

function App() {
  const survey = new Model(surveyJSON);
  survey.focusFirstQuestionAutomatic = false;

  const alertResults = useCallback((sender) => {
    const results = JSON.stringify(sender.data);
    alert(results);
  }, []);

  survey.onComplete.add(alertResults);

  return <Survey model={survey} />;
}


export default App;
