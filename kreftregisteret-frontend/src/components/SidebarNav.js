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
        return ( <div className={"sidebar"}>
            {props.titles.map((title, index) => {return (
                <span className={"sidebarTitles"} key={index} onClick={()=> {scrollToTitle(title)} }><button className={"sidebarBtn"}/><span> {title.innerText} </span></span>)}
            )}
        </div>)
    }

    return titleList();

}

export default SidebarNav;