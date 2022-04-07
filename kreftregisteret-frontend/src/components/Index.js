import React from 'react';
import {useNavigate} from 'react-router-dom';
import MeldingList from "./MeldingList";
import {DropdownItem, DropdownMenu, DropdownToggle, UncontrolledButtonDropdown} from "reactstrap";
import {Color, EnumRoutes} from "../utils/utils";
//https://www.w3schools.com/react/react_router.asp


const Index = () => {
    const navigate = useNavigate();

    //https://stackoverflow.com/questions/50644976/react-button-onclick-redirect-page
    const routeChange = (url) =>{
        navigate(url);
    }

    return (
        <div style={{display: "flex", placeItems:"center", flexDirection: "column", marginTop: "2%"}}>
            <div style={{width: "90%"}}>
                <h4>Velg en fil du vil redigere</h4>
                <MeldingList/>
                <UncontrolledButtonDropdown >
                    <DropdownToggle style={{backgroundColor: Color.king_blue, width: "200px"}} caret>
                        Velg nytt skjema
                    </DropdownToggle>
                    <DropdownMenu>
                        <DropdownItem onClick={() => routeChange(EnumRoutes.utredning.url + "-1")}>
                            {EnumRoutes.utredning.skjemanavn}
                        </DropdownItem>
                        <DropdownItem onClick={() => routeChange(EnumRoutes.kirurgi.url + "-1")}>
                            {EnumRoutes.kirurgi.skjemanavn}
                        </DropdownItem>
                        <DropdownItem onClick={() => routeChange(EnumRoutes.straalebehandling.url + "-1")}>
                            {EnumRoutes.straalebehandling.skjemanavn}
                        </DropdownItem>
                    </DropdownMenu>
                </UncontrolledButtonDropdown>
            </div>
        </div>
    );
}

export default Index;
