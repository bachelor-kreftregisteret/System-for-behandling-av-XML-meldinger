import { Modal, ModalBody, ModalFooter, ModalHeader} from "reactstrap";
import {useNavigate} from "react-router-dom";
import "./css/footer.css"
import React from "react";

const ConfirmationModal = (props) => {
    const navigate = useNavigate();
console.log(props.postError)

    //Errormessage er noe tregt og må oppdateres
return (
    <Modal
        animation={"false"}
        isOpen={props.isOpen}
    >
        <ModalHeader
            close={<button className="close btn" onClick={() => props.setIsOpen(false)}>✕</button>}
        > {props.postError ?
            (props.postError.includes("400")
                ? "Klientfeil" : props.postError.includes("404")
                    ? "Kan ikke behandle forespørselen"
                    : props.postError.includes("500") ? "Serverfeil"
                : "Feil") : "Vellykket!"}
        </ModalHeader>
        <ModalBody>
            {props.postError ?
                (props.postError.includes("400") ?
                <span><h6>{props.postError}</h6><p>Serveren kan eller vil ikke behandle forespørselen på grunn av noe som oppfattes som en klientfeil, (f.eks. ugyldig data).</p></span>
                : props.postError.includes("404") ? <span><h6>{props.postError}</h6><p>Serveren finner ikke den forespurte ressursen. Endepunktet er gyldig, men selve ressursen eksisterer ikke.</p></span>
                : props.postError.includes("500") ? <span><h6>{props.postError}</h6><p>Obs! Noe stemmer ikke på serveren.</p></span>
                : <span><h6>{props.postError}</h6><p>Noe gikk galt!</p></span>) : <p>Endringene i meldingen er lagret!</p>}
        </ModalBody>
        <ModalFooter>
            {props.postError ?
                <button
                    className={"bttn submitBtn"}
                    onClick={() => props.setIsOpen(false)}>
                    Til skjema
                </button> :
                <button
                    className={"bttn submitBtn"}
                    onClick={() => navigate("/")}>
                    Ok
                </button>
            }
        </ModalFooter>
    </Modal>

)

}

export default ConfirmationModal;