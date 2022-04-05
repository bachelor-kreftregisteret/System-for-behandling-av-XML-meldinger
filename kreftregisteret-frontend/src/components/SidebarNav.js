import React, {useEffect, useState} from "react";
import 'survey-react/survey.css';
import "./stylesheet.css"

const SidebarNav = (props) => {

    const [activeId, setActiveId] = useState(0)

    const scrollToTitle = (title) => {
        for(let i=0; i < props.titles.length; i++) {
            if(props.elements[i].innerText === title.innerText){
                document.querySelectorAll("h4")[i].scrollIntoView({behavior: "smooth"});
                if (i === 0) {
                    document.getElementById("root").scrollIntoView();
                }
            }
        }
    }

    const titleList = () => {
        return ( <div className={"sidebar"}>
            {props.titles.map((title, index) => {return (
                <span id={index} className={"sidebarTitles"} key={index} onClick={()=> {scrollToTitle(title); setActiveId(index)} }><button className={activeId === index ? "sidebarBtn activeSidebarBtn": "sidebarBtn"}/><span> {title.innerText} </span></span>)}
            )}
        </div>)
    }

    return titleList();

}

export default SidebarNav;