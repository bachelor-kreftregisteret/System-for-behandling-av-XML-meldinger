import React, {useCallback, useEffect, useState} from 'react';
import {Link, useNavigate} from 'react-router-dom';
import useFetch from "./api/useFetch";
//https://www.w3schools.com/react/react_router.asp
//https://stackoverflow.com/questions/29244731/react-router-how-to-manually-invoke-link
const Navigation = () => {
    const navigate = useNavigate();
    // //const [msgList, setMsgList] = useState([]);
    // //hvordan kan jeg sende med
    const handleOnClick = useCallback(() => navigate('/prostata-utredning', {replace: true}), [navigate]);
    const {data, loading} = useFetch('http://localhost:8080/api/v1/meldinger');
    let msgList = []

    function ShowData() {
        if (!loading) {
            msgList = Object.keys(data).map((key) => [key, data[key]]);
            console.log(msgList)
            return msgList.map((item, index) =>
                <li key={index}>
                    {item[0].includes('ProstataUtredning') &&
                        <Link to={"prostata-utredning/" + item[1]}>{item[0]} </Link> }
                    {item[0].includes('ProstataStraalebehandling') &&
                        <Link to={"prostata-straalebehandling/" + item[1]}>{item[0]} </Link> }
                    {item[0].includes('ProstataKirurgi') &&
                        <Link to={"prostata-kirurgi/" + item[1]}>{item[0]} </Link> }
                </li>)
        } else {
            return <h4> Loading ... </h4>
        }
    }

    return (
        <div>
            <h2>Velg en fil du vil redigere</h2>
            <h4>XML-filer: </h4>
            <div> {ShowData()}</div>
            <button onClick={handleOnClick}> Skjema </button>

        </div>
    );
}

export default Navigation;