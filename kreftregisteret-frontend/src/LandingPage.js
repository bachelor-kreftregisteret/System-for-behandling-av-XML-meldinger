import React, {useCallback, useEffect, useState} from 'react';
import {useNavigate} from 'react-router-dom';
import useFetch from "./surveyPostGet/useFetch";
//https://www.w3schools.com/react/react_router.asp
//https://stackoverflow.com/questions/29244731/react-router-how-to-manually-invoke-link
const LandingPage = () => {
    const navigate = useNavigate();
    //const [msgList, setMsgList] = useState([]);
    //hvordan kan jeg sende med
    const handleOnClick = useCallback(() => navigate('/utredning', {replace: true}), [navigate]);
    const {data, loading, error} = useFetch('http://localhost:8080/api/v1/meldinger');
    let msgList = []

    function ShowData() {
        if (!loading) {
            msgList = Object.keys(data).map((key) => [key, data[key]]);
            console.log(JSON.stringify(msgList))

            //alert(JSON.stringify(msgList))
            return msgList.map((item, id) =>
                <li key={item[1]}>
                    <a href={"/utredning/" + item[1]}>{item[0]}</a>
                </li>)
        } else {
            return <h1>Loading...</h1>
        }
    }


    return (
        <div>
            <h2>Landing Page</h2>
            <div>{ShowData()}</div>

            <button onClick={handleOnClick}>Click me for å gå til /utredning</button>
        </div>
    );
}

export default LandingPage;