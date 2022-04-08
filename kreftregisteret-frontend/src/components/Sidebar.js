import React, { useState} from "react";
import 'survey-react/survey.css';
import "./css/sidebar.css"

const Sidebar = (props) => {

    const [activeId, setActiveId] = useState(0)
    const [showSidebar, setShowSidebar] = useState(true);


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
            <div className={"sidebarContainer"}>
            <button
                className={ showSidebar ? "hideSidebarBtn" : "showSidebarBtn"}
                onClick={() => {setShowSidebar(!showSidebar)}}>
                {showSidebar ? ">" : "<"}
            </button>
                    <div className={showSidebar ? "sidebar" : "hide"}>

                {props.titles.map((title, index) => {
                    return (
                        <span id={index} className={"sidebarNav"} key={index}
                              onClick={() => {
                                  scrollToTitle(title);
                                  setActiveId(index)
                              }}>
                    <button aria-label={`${title.innerText}`} className={activeId === index ?
                        "titleBtn activeTitleBtn" : "titleBtn"}/>
                    <span className={"sidebarTitle"}> {title.innerText} </span>
                </span>)
                })}
            </div>
            </div>
        )
    }

    //Obs,
    return (
        !props.loading ? listOfTitles()
            : <p style={{marginLeft:"10px"}}>Laster inn..</p>
    )

}

export default Sidebar;