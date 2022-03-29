import React from 'react';
import "../App.css";
import useFetch from "../api/useFetch";
import {Button, Table} from "reactstrap";
import {useNavigate} from "react-router-dom";
import {Color, EnumRoutes} from "../utils/utils";


const MeldingList = () => {
    const navigate = useNavigate();

    //https://stackoverflow.com/questions/50644976/react-button-onclick-redirect-page
    const routeChange = (url) =>{
        navigate(url);
    }

    const {data, loading, error} = useFetch('/api/v1/meldinger');
    let msgList = []

    const formatDate = (date) => {
            const newDate = new Date(date)
            const dateString = `${newDate.getFullYear()}-${newDate.getMonth()+1}-${newDate.getDate()} 
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
                    <td ><Button  block
                                  className={"Button"}
                                  style={{backgroundColor: Color.king_blue, hover:"white"}}
                                  size={"sm"}
                                  onClick={()=> {
                        if (item.Skjemanavn === EnumRoutes.utredning.skjemanavn) {
                            routeChange(EnumRoutes.utredning.url + item.id)
                        } else if (item.Skjemanavn === EnumRoutes.straalebehandling.skjemanavn) {
                            routeChange(EnumRoutes.straalebehandling.url + item.id)
                        } else if (item.Skjemanavn === EnumRoutes.kirurgi.skjemanavn) {
                            routeChange(EnumRoutes.kirurgi.url + item.id)
                        }
                    } }> Endre </Button></td>
                </tr>
            ))

        const table = (
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
        )

        return table

    } else if (error !== null) {
        let string = " Noe gikk feil ved innlasting: " + error;
        return <h4> {string} </h4>
    } else {
        return <h4> Laster ...</h4>
    }
}

export default MeldingList;