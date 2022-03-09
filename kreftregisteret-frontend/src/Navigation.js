import React, {useCallback, useEffect, useState} from 'react';
import {Link, useNavigate} from 'react-router-dom';
import useFetch from "./api/useFetch";
//https://www.w3schools.com/react/react_router.asp
//https://stackoverflow.com/questions/29244731/react-router-how-to-manually-invoke-link
const Navigation = () => {
    const navigate = useNavigate();
    // //const [msgList, setMsgList] = useState([]);
    // //hvordan kan jeg sende med
    const goToKirurgi = useCallback(() => navigate('/prostata-kirurgi', {replace: true}), [navigate]);
    const goToUtredning = useCallback(() => navigate('/prostata-utredning', {replace: true}), [navigate]);
    const goTostraalebehandling = useCallback(() => navigate('/prostata-straalebehandling', {replace: true}), [navigate]);

    const {data, loading} = useFetch('http://localhost:8080/api/v1/meldinger');
    let msgList = []

    function ShowData() {
        if (!loading) {
            msgList = Object.keys(data).map((key) => [key, data[key]]);
            console.log(msgList)
            return msgList.map((item, index) =>

                <li key={index} style={{listStyle: "none", margin: "0", padding: "10px", display: "flex", alignItems:"center" }}>
                    {item[0].includes('ProstataUtredning') &&
                        <Link style={{textDecoration: "none"}} to={"prostata-utredning/" + item[1]}><img src="https://img.icons8.com/cotton/26/000000/file.png"/> {item[0]} </Link> }
                    {item[0].includes('ProstataStraalebehandling') &&
                        <Link to={"prostata-straalebehandling/" + item[1]}><img src="https://img.icons8.com/cotton/26/000000/file.png"/> {item[0]} </Link> }
                    {item[0].includes('ProstataKirurgi') &&
                        <Link to={"prostata-kirurgi/" + item[1]}><img src="https://img.icons8.com/cotton/26/000000/file.png"/> {item[0]} </Link> }
                </li>)
        } else {
            return <h4> Loading ... </h4>
        }
    }

    return (
        <div style={{display: "flex", alignItems: "center", flexDirection: "column"}}>
            <h2>Velg en fil du vil redigere</h2>
            <div> {ShowData()}</div>
            <div style={{ width: "50%", display: "flex", alignItems:"center", justifyItems: "center", justifyContent:"space-around", margin: "30px 0 0 0"}}>
                <button onClick={goToUtredning}> Utredning </button>
                <button onClick={goToKirurgi}> Kirurgi </button>
                <button onClick={goTostraalebehandling}> Straalebehandling </button>
            </div>
        </div>
    );
}

export default Navigation;