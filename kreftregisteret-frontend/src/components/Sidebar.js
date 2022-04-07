import React, { useState} from "react";
import 'survey-react/survey.css';
import "./css/sidebar.css"

const Sidebar = (props) => {

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
                    <button aria-label={`${title.innerText}`} className={activeId === index ?
                        "sidebarBtn activeSidebarBtn" : "sidebarBtn"}/>
                    <span className={"sidebarTitle"}> {title.innerText} </span>
                </span>)
                })}
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