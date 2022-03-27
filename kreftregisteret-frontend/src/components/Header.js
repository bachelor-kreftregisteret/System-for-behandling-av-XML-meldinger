import {Outlet, Link} from "react-router-dom";

const Header = () => {

    return (
        <>
            <nav>
                <ul>
                    <li style={{listStyle: "none", margin: "0", padding:"0"}}>
                        <Link to="/">Forside</Link>
                    </li>
                </ul>
            </nav>

            <Outlet />
        </>
    )
};

export default Header;