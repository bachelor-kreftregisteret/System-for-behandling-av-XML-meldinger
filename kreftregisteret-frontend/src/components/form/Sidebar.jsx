import {useState} from "react";
import "../css/sidebar.css"

const Sidebar = (props) => {
    const [activeId, setActiveId] = useState(0);
    const [showSidebar, setShowSidebar] = useState(true);
    const [titles, setTitles] = useState([]);

    const el = document.getElementsByClassName("sv_p_root");

    //Hører på endringer i DOM og oppdaterer titles dersom noe har endret seg
    const observer = (props.isModalOpen === false || props.postError === "") && new MutationObserver( _ => {
        const tempTitles = [...document.getElementsByTagName("h4")];
        setTitles(tempTitles);
        observer.disconnect();
    });

    (props.isModalOpen === false || props.postError === "") && Array.from(el).forEach(target => {
       observer.observe(target, {childList: true})
    })

    const scrollToTitle = (title) => {
         for (let index = 0; index < titles.length; index++) {
             if (titles && titles[index].innerText === title.innerText) {
                 document.querySelectorAll("h4")[index].scrollIntoView({behavior: "smooth"});
                 if (index === 0) {
                     document.getElementById("root").scrollIntoView();
                 }
             }
         }
     }

     const getTitle = (element) => {
        const parent = element.parentElement;
        if (parent && parent.className === "sv_p_container") {
            const titleFromElement = parent.children[0].children[0];
            for (const title in titles) {
                if (titleFromElement === titles[title]) {
                    setActiveId(title - 1);
                    return;
                }
            }
        }
        else if (parent) {
            getTitle(parent);
        }
     };

     const getScroll = () => {
        const posX = window.innerWidth / 2;
        const containerRect = document.getElementsByClassName("sv_p_container")[0].getBoundingClientRect();
        if (containerRect.top > 0) {
            return;
        }
        const posY = window.innerHeight / 2;
        const elem = document.elementFromPoint(posX, posY);
        getTitle(elem);
     };

    document.addEventListener("scroll", getScroll);

    const listOfTitles = (titles) => {
        return (
            <div className={showSidebar ? "sidebar" : "hide"} >
                {titles && titles.map((title, index) => {
                    return (
                        <span id={`${index}`} className={"sidebarNav"} key={index}
                              onClick={() => {
                                  scrollToTitle(title);
                              }}
                        >
                            <button aria-label={`${title.innerText}`} className={activeId === index ?
                                "titleBtn activeTitleBtn" : "titleBtn"}/>
                            <span className={"sidebarTitle"}> {title.innerText} </span>
                        </span>)
                })}
            </div>
        )}

    return (
        !props.loading ?
            <div className={"sidebarContainer"}>
            <button
                className={ showSidebar ? "hideSidebarBtn" : "showSidebarBtn"}
                onClick={() => {setShowSidebar(!showSidebar)}}>
                {showSidebar ? ">" : "<"}
            </button> {listOfTitles(titles)}  </div>
            : <p style={{marginLeft:"10px"}}>Laster inn..</p>
    )

}

export default Sidebar;