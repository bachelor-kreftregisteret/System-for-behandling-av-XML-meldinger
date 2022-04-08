import React from "react";
import "./css/footer.css"

const Footer = (props) => {

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