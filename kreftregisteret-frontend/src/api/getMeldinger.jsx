import {useState, useEffect} from "react";
import axios from 'axios';

const BASE_URL = 'api/v1/meldinger/'; // 'api/v1/meldinger/';

//Inspired by https://www.youtube.com/watch?v=Vspeudp-M9k
const GetMeldinger = () => {

    const [data, setData] = useState(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect( () => {
        const controller = new AbortController(); //Cancel request if needed to prevent memory leak
        const getData = async () => {
            setLoading(true);
            setError(null);
            try {
                const response = await axios.get(BASE_URL);
                console.log(response.data);
                setData(response.data);
            } catch (err) {
                console.log(err);
                setError(err);
            } finally {
                setLoading(false);
            }
        }

        getData();

        return () => controller.abort();

    }, [])

    return {
        data, loading, error
    }

}

export default GetMeldinger;
