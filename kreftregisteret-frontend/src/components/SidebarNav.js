import React, {useEffect, useState} from "react";
import 'survey-react/survey.css';
import {Model, StylesManager, Survey} from "survey-react";

const SidebarNav = ({SurveyType}) => {

    const survey = new Model(SurveyType)
    console.log(survey.visiblePages)
}

export default SidebarNav;