import {useState, useEffect} from "react";
import axios from 'axios';

const BASE_URL = 'http://localhost:8080/api/v1/meldinger/';

//Inspired by https://www.youtube.com/watch?v=Vspeudp-M9k
const GetMeldinger = (id = "") => {

    const [data, setData] = useState(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect( () => {
        const getData = async () => {
            setLoading(true);
            setError(null);
            try {
                const response = await axios.get(BASE_URL + id);
                response && setData(response.data);
            } catch (err) {
                console.log(err);
                setError(err);
            } finally {
                setLoading(false);
            }
        }

        getData();


    }, [])

    return {
        data, loading, error
    }

}

export default GetMeldinger;
