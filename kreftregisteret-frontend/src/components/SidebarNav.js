import React, {useEffect, useState} from "react";
import 'survey-react/survey.css';
import "./stylesheet.css"

const SidebarNav = (props) => {
    const scrollToTitle = (title) => {
        for(let i=0; i < props.titles.length; i++) {
            if(props.elements[i].innerText === title.innerText){
                document.querySelectorAll("h4")[i].scrollIntoView({behavior: "smooth"});
            }
        }
    }

    const titleList = () => {
        return ( <ul className={"sidebar"}>
            {props.titles.map((title, index) => {return (
                <li className={"sidebarTitles"} key={index} onClick={()=> {scrollToTitle(title)} }>{title.innerText}</li>)}
            )}
        </ul>)
    }

    return titleList();

}

export default SidebarNav;