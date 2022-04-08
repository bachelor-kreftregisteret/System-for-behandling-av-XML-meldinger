import {useState, useEffect} from "react";
import axios from 'axios';

//Inspired by https://www.youtube.com/watch?v=Vspeudp-M9k
function useFetch(url) {
    const [data, setData] = useState(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(async () => {
        try {
            let data = await axios.get(url); //'http://localhost:8080' + url
            console.log(data.data);
            setData(data.data);
            setError(null);
        } catch (err) {
            console.log(err);
            setError(err);
        } finally {
            setLoading(false);
        }

    }, [])

    return {
        data, loading, error
    }

}

export default useFetch;