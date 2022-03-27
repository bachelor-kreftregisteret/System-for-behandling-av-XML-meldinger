import useFetch from "../api/useFetch";
import { useNavigate} from "react-router-dom";
import React from 'react';
import "../App.css";


const ShowMeldingList = () => {
    const {data, loading, error} = useFetch('/api/v1/meldinger');
    let msgList = []

    const navigate = useNavigate();

    //https://stackoverflow.com/questions/50644976/react-button-onclick-redirect-page
    const routeChange = (url) =>{
        navigate(url);
    }

    const formatDate = (date) => {
            const newDate = new Date(date)
            const dateString = `${newDate.getDate()}-${newDate.getMonth()}-${newDate.getFullYear()} 
        kl.${newDate.getHours()}:${newDate.getMinutes()} `
        if(dateString.includes("NaN")) {
            return date;
        }
            return dateString;

    }

    if (!loading && data !== null) {
        for (const key in data) {
            msgList.push(JSON.parse(key))
        }

        const rows = msgList.sort((a, b) => a.id > b.id ? 1 : -1).map((item, index) => (
                <tr key={index}>
                    <td >{item.id}</td>
                    <td>{item.Skjemanavn}</td>
                    <td>{item.Filnavn}</td>
                    <td>{formatDate(item.Endrettidspunkt)}</td>
                    <td ><button onClick={()=> {
                        if (item.Skjemanavn === 'KliniskProstataUtredning') {
                            routeChange("prostata-utredning/" + item.id)
                        } else if (item.Skjemanavn === 'KliniskProstataStraale') {
                            routeChange("prostata-straale/" + item.id)
                        } else if (item.Skjemanavn === 'KliniskProstataKirurgi') {
                            routeChange("prostata-kirurgi/" + item.id)
                        }
                    } }> Endre </button></td>
                </tr>
            ))

        return (
        <div className={"centeredFlex"}>
            <table>
                <thead style={{textAlign: "left"}}>
                <tr>
                    <th style={{minWidth: "50px", maxWidth: "100px"}}>
                        Id
                    </th>
                    <th style={{ maxWidth: "150px"}}>
                        Type
                    </th>
                    <th style={{ maxWidth: "150px"}}>
                        Filnavn
                    </th>
                    <th style={{ maxWidth: "150px"}}>
                        Endret
                    </th>
                    <th style={{ maxWidth: "150px"}}>
                        Handling
                    </th>
                </tr>
                </thead>
                <tbody>
                {rows}
                </tbody>
            </table>
        </div>)
    } else if (error !== null) {
        let string = " Noe gikk feil ved innlasting: " + error;
        return <h4> {string} </h4>
    } else {
        return <h4> Laster ...</h4>
    }
}

export default ShowMeldingList;