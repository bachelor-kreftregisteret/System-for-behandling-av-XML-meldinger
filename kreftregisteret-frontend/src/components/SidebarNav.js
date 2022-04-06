import React, {useEffect, useState} from "react";
import 'survey-react/survey.css';
import "./stylesheet.css"

const SidebarNav = (props) => {

    const [activeId, setActiveId] = useState(0)

    const scrollToTitle = (title) => {
        props.titles.map((_, index) => {
            if(props.titles[index].innerText === title.innerText){
                document.querySelectorAll("h4")[index].scrollIntoView({behavior: "smooth"});
                if (index === 0) {
                    document.getElementById("root").scrollIntoView();
                }
            }
        })
    }

    const listOfTitles = () => {
        return (
            <div id={"sidebar"} className={"sidebar"}>
                {props.titles.map((title, index) => {
                    return (
                        <span id={index} className={"sidebarNav"} key={index}
                              onClick={() => {
                                  scrollToTitle(title);
                                  setActiveId(index)
                              }}>
                    <button className={activeId === index ?
                        "sidebarBtn activeSidebarBtn" : "sidebarBtn"}/>
                    <span className={"sidebarTitle"}> {title.innerText} </span>
                </span>)
                })}
            </div>
        )
    }

    //Obs,
    return (
        !props.loading ? <div className={"sidebarContainer"} style={{height: "fit-content"}}> {listOfTitles()} </div>
            : <h6 style={{marginLeft:"10px"}}>Laster inn..</h6>
    )

}

export default SidebarNav;