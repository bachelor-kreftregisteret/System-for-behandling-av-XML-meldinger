import {Outlet, Link} from "react-router-dom";
import {Color} from "../utils/utils";
import React from "react";

const Header = () => {

    return (
        <>
            <nav >
                <ul>
                    <li style={{listStyle: "none", marginTop: "0.8em", padding:"0"}}>
                        <Link to="/"> <img src={"/logo-no.svg"} alt={"Logo kreftregisteret"} role={"button"} style={{width: "60px"}}/> </Link>
                    </li>
                </ul>
            </nav>
            <div style={{backgroundColor: Color.king_blue, height: "1px"}}> </div>

            <Outlet />
        </>
    )
};

export default Header;