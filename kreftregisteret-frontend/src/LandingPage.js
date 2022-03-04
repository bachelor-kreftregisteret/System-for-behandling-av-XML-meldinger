import React, {useCallback} from 'react';
import {useNavigate} from 'react-router-dom';
//https://www.w3schools.com/react/react_router.asp
//https://stackoverflow.com/questions/29244731/react-router-how-to-manually-invoke-link
function LandingPage () {
    const navigate = useNavigate();
    const handleOnClick = useCallback(() => navigate('/utredning', {replace: true}), [navigate]);

        return (
            <div>
                <h2>Landing Page</h2>
                <button onClick={handleOnClick}>Click me for å gå til /utredning </button>
            </div>
        );
}

export default LandingPage;