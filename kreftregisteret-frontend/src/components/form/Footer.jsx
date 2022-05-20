import React from "react";
import "../../css/footer.css"
import {useNavigate} from "react-router-dom";
import ConfirmationModal from "./ConfirmationModal";


const Footer = (props) => {
    const navigate = useNavigate();

    //https://stackoverflow.com/questions/50644976/react-button-onclick-redirect-page

    return (
        <>
        <footer
            className="surveyFooter">
            <p className={"asterixMeaning"} aria-label={"Asteriks er obligatorisk"}>* Obligatorisk</p>
            <div className={"actionBtnContainer "}>

                <button
                    aria-label={"Lagre"}
                    type={"submit"}
                    className={"bttn submitBtn"}
                    onClick={() => {props.onSubmit() }}
                >Lagre
                </button>
                <button
                    aria-label={"Lagre utkast"}
                    type={"submit"}
                    className={"bttn submitBtn"}
                    onClick={() => function noRefCheck(){}}
                >Lagre utkast
                </button>
                <button
                    aria-label={"Avbryt"}
                    type={"button"}
                    className={"bttn cancelBtn"}
                    onClick={() => navigate("/")}
                >Avbryt
                </button>

            </div>
        </footer>
           <ConfirmationModal isModalOpen={props.isModalOpen} setIsModalOpen={props.setIsModalOpen} postError={props.postError}/>
        </>
    )
};

export default Footer;