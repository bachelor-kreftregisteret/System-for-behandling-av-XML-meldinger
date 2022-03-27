import useFetch from "../api/useFetch";
import {Link} from "react-router-dom";
import React from 'react';


const ShowData = () => {
    const {data, loading, error} = useFetch('/api/v1/meldinger');
    let msgList = []

    if (!loading && data !== null) {
        for (const key in data) {
            msgList.push(JSON.parse(key))
        }
        //TODO: Sett inn i form
        return msgList.map((item, index) =>
            <li key={index} style={{listStyle: "none", margin: "0", padding: "10px", display: "flex", alignItems:"center" }}>
                {item.Skjemanavn === 'KliniskProstataUtredning' &&
                    <Link to={"prostata-utredning/" + item.id}>{item.Filnavn} </Link> }
                {item.Skjemanavn === 'KliniskProstataStraale' &&
                    <Link to={"prostata-straalebehandling/" + item.id}>{item.Filnavn}</Link> }
                {item.Skjemanavn === 'KliniskProstataKirurgi' &&
                    <Link to={"prostata-kirurgi/" + item.id}> {item.Filnavn} </Link> }
            </li>)
    } else if (error !== null) {
        let string = " Noe gikk feil ved innlasting: " + error;
        return <h4> {string} </h4>
    } else {
        return <h4> Laster ...</h4>
    }
}

export default ShowData;