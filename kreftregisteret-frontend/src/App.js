import logo from './logo.svg';
import { useCallback } from "react";
import './App.css';
// import 'survey-react/survey.min.css';
import { Survey, StylesManager, Model } from "surveyjs-react";

StylesManager.applyTheme("modern");



function App() {
  const survey = new Model(surveyJson);
  survey.focusFirstQuestionAutomatic = false;

  const alertResults = useCallback((sender) => {
    const results = JSON.stringify(sender.data);
    alert(results);
  }, []);

  survey.onComplete.add(alertResults);

  return <Survey model={survey} />;
}


export default App;
