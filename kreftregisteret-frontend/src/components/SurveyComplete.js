import {Button} from "reactstrap";
import {useNavigate} from "react-router-dom";
import {Color} from "../utils/utils";

const SurveyComplete = () => {
    const navigate = useNavigate();

    //https://stackoverflow.com/questions/50644976/react-button-onclick-redirect-page
    const routeChange = (url) =>{
        navigate(url);
    }

    //TODO: Design the success page. Should it show and overview of the data?
return (
    <div style={{display: "flex", placeItems: "center", flexDirection: "column"}}>
        <h3> Lagring er vellykket </h3>
        <Button
            className={"Button"}
            style={{backgroundColor: Color.king_blue}}
            size={"sm"}
            onClick={() => routeChange("/")}>Til oversikt</Button>
    </div>

)

}

export default SurveyComplete;