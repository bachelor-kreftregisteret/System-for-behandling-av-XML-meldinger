import {Outlet, Link} from "react-router-dom";
import {Color} from "../utils/utils";

const Header = () => {

    return (
        <>
            <nav>
                <ul>
                    <li style={{listStyle: "none", marginTop: "0.5em", padding:"0"}}>
                        <Link style={{textDecoration: "none", color: Color.turquoise, fontWeight: "bold"}} to="/"> ⫷ Til meldingsoversikt </Link>
                    </li>
                </ul>
            </nav>

            <Outlet />
        </>
    )
};

export default Header;