import React from 'react';
import "../../App.css";
import GetMeldinger from "../../api/getMeldinger";
import {useNavigate} from "react-router-dom";
import {Color, EnumRoutes} from "../../utils/utils";
import {Button, Table} from "reactstrap";


const MeldingList = () => {
    const navigate = useNavigate();

    const {data, loading, error} = GetMeldinger();
    let msgList = []

    // https://dd.engineering/blog/a-guide-to-handling-date-and-time-for-full-stack-javascript-developers 31.03
    const addZero = (num) => `${num}`.padStart(2, '0');

    const formatJsonDate = (date) => {
            const newDate = new Date(date)
        return `${newDate.getFullYear()}-${addZero(newDate.getMonth() + 1)}-${addZero(newDate.getDate())} 
        kl.${addZero(newDate.getUTCHours())}:${addZero(newDate.getMinutes())} `;
    }

    const tableOfMeldinger = (data) => {
        //data.replaceAll('\\', '')
        msgList = data
        const rows = msgList.sort((a, b) => a.id > b.id ? 1 : -1).map((item, index) => (
                <tr key={index}>
                    <td>{item.id}</td>
                    <td>{item.skjemanavn}</td>
                    <td>{item.filnavn}</td>
                    <td>{formatJsonDate(item.endrettidspunkt)}</td>
                    <td><Button block
                                className={"Button"}
                                style={{backgroundColor: Color.king_blue}}
                                size={"sm"}
                                onClick={() => {
                                    if (item.skjemanavn === EnumRoutes.utredning.skjemanavn) {
                                        navigate(EnumRoutes.utredning.url + item.id)
                                    } else if (item.skjemanavn === EnumRoutes.straalebehandling.skjemanavn) {
                                        navigate(EnumRoutes.straalebehandling.url + item.id)
                                    } else if (item.skjemanavn === EnumRoutes.kirurgi.skjemanavn) {
                                        navigate(EnumRoutes.kirurgi.url + item.id)
                                    }
                                }}> Endre </Button></td>
                </tr>
            ))

            return (
                <Table hover
                       responsive
                       size="xl"
                       striped>
                    <thead style={{textAlign: "left", backgroundColor: Color.king_blue, color: "white"}}>
                    <tr>
                        <th scope="row">
                            Id
                        </th>
                        <th scope="row">
                            Type
                        </th>
                        <th scope="row">
                            Filnavn
                        </th>
                        <th scope="row">
                            Sist endret
                        </th>
                        <th scope="row">
                            Handling
                        </th>
                    </tr>
                    </thead>
                    <tbody>
                    {rows}
                    </tbody>
                </Table>
            );
    }

    return (
        !loading && data !== null ?
        tableOfMeldinger(data) :
        error !== null ?
            <div><h4>`${error.toString()}`</h4>
            <p>Noe gikk galt ved innlasting</p></div> :
            <h4>Laster inn meldinger...</h4>);
}

export default MeldingList;
