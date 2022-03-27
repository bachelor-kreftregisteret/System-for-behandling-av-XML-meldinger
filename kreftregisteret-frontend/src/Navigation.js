import React from 'react';
import {Link, useNavigate} from 'react-router-dom';
import useFetch from "./api/useFetch";
import Skjema from "./components/Skjema";
//https://www.w3schools.com/react/react_router.asp

const Navigation = () => {
    const navigate = useNavigate();
    // //const [msgList, setMsgList] = useState([]);

    //https://stackoverflow.com/questions/50644976/react-button-onclick-redirect-page
    const routeChange = (url) =>{
        navigate(url);
    }

    return (
        <div style={{display: "flex", alignItems: "center", flexDirection: "column"}}>
            <h2>Velg en fil du vil redigere</h2>
            <Skjema/>
            <div style={{ width: "50%", display: "flex", alignItems:"center", justifyItems: "center", justifyContent:"space-around", margin: "30px 0 0 0"}}>
                <button onClick={() => routeChange('/prostata-utredning/-1')}> Utredning </button>
                <button onClick={() => routeChange('/prostata-kirurgi/')}> Kirurgi </button>
                <button onClick={() => routeChange('/prostata-straalebehandling/')}> Straalebehandling </button>
            </div>
        </div>
    );
}

export default Navigation;
