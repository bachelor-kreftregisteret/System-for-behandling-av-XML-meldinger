import React from "react";
import "./css/footer.css"
import {useNavigate} from "react-router-dom";

const Footer = (props) => {
    const navigate = useNavigate();

    //https://stackoverflow.com/questions/50644976/react-button-onclick-redirect-page
    const routeChange = (url) =>{
        navigate(url);
    }

    return (
        <footer
            className="surveyFooter">
            {/*<button
                className={"footerBtn toTopBtn"}
                    onClick={() =>
                        document
                            .getElementById("root")
                            .scrollIntoView({behavior: "smooth"})}
            >Til topp
            </button>*/}
            <span
                className={"actionBtnContainer "}>
                        <button
                            type={"reset"}
                            className={"footerBtn cancelBtn"}
                            onClick={() => routeChange("/")}
                        >Avslutt</button>
                        <button
                            type={"submit"}
                            className={"footerBtn submitBtn"}
                        >Lagre utkast</button>
                        <button
                            type={"submit"}
                            className={"footerBtn submitBtn"}
                            onClick={() => props.onSubmit() }
                        >Lagre</button>
                    </span>
        </footer>
    )
}

export default Footer;