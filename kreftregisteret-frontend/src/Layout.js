import {Outlet, Link, useParams} from "react-router-dom";

const Layout = () => {

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

export default Layout;