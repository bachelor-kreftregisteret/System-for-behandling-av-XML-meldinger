import { Modal, ModalBody, ModalFooter, ModalHeader} from "reactstrap";
import {useNavigate} from "react-router-dom";
import "../css/footer.css"
import React from "react";

const ConfirmationModal = (props) => {
    const navigate = useNavigate()

    //Errormessage er noe tregt når det kommer til network errors
return (
    <Modal
        animation={"false"}
        isOpen={props.isModalOpen}
    >
        <ModalHeader
            close={<button className="close btn" onClick={() => props.setIsModalOpen(false)}>✕</button>}
        > {props.postError ? props.postError : "Vellykket!"}
        </ModalHeader>
        <ModalBody>
            {props.postError !== "" ?
                (props.postError.includes("400") ?
                <p>Serveren kan eller vil ikke behandle forespørselen på grunn av noe som oppfattes som en klientfeil, (f.eks. ugyldig data).</p>
                : props.postError.includes("404") ? <p>Serveren finner ikke den forespurte ressursen. Endepunktet er gyldig, men selve ressursen eksisterer ikke.</p>
                : props.postError.includes("500") ? <p>Obs! Noe stemmer ikke på serveren.</p>
                : <p>Noe gikk galt!</p>) : <p>En ny melding med endringene er lagret.</p>}
        </ModalBody>
        <ModalFooter>
            {props.postError !== "" ?
                <button
                    className={"bttn submitBtn"}
                    onClick={() => props.setIsModalOpen(false)}>
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