import React from 'react';
import {useNavigate} from 'react-router-dom';
import MeldingList, {EnumRoutes} from "./MeldingList";
//https://www.w3schools.com/react/react_router.asp


const Navigation = () => {
    const navigate = useNavigate();

    //https://stackoverflow.com/questions/50644976/react-button-onclick-redirect-page
    const routeChange = (url) =>{
        navigate(url);
    }

    return (
        <div style={{display: "flex", alignItems: "center", flexDirection: "column"}}>
            <h2>Velg en fil du vil redigere</h2>
            <MeldingList/>
            <div style={{ width: "100%", display: "flex", alignItems:"center", justifyItems: "center", justifyContent:"space-around", margin: "30px 0 0 0"}}>
                <button onClick={() => routeChange(EnumRoutes.utredning.url + "-1")}> Utredning </button>
                <button onClick={() => routeChange(EnumRoutes.kirurgi.url + "-1")}> Kirurgi </button>
                <button onClick={() => routeChange(EnumRoutes.straalebehandling.url + "-1")}> Straalebehandling </button>
            </div>
        </div>
    );
}

export default Navigation;
