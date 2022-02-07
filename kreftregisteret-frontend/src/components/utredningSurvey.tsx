import React, { useEffect, useState } from 'react';
import { Spinner } from 'reactstrap';
import * as Survey from 'survey-react';

export interface ISurveyProps {
    css: any;
    json: any;
    data: any;
    onComplete: (survey: any) => void;
}

const SurveyComponent: React.FunctionComponent<ISurveyProps> = props => {
    const { css, data, json, onComplete } = props;

    const [loading, setLoading] = useState<boolean>(true);

    useEffect(() => {
        Survey.StylesManager.applyTheme("bootstrap");

        setLoading(false);
    }, []);

    if (loading) return <Spinner />;

    return (
        <Survey.Survey
            css={css}
            data={data}
            json={json}
            onComplete={onComplete}
        />
    );
}

export default SurveyComponent;