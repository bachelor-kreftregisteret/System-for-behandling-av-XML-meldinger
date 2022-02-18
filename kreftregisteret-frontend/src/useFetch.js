import React, {useState, useEffect} from "react";
import axios from 'axios'

//Inspired by https://www.youtube.com/watch?v=Vspeudp-M9k
function useFetch(url) {
    const [data, setData] = useState(null);
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState(null);

    useEffect(() => {
        setLoading(true);
        axios.get(url)
            .then(res => {
                console.log(res);
                setData(res.data);
            })
            .catch(err => {
                setError(err);
                console.log(err);
            })
            .finally(() => {
                setLoading(false);
            })
    }, [url])

    return {
        data, loading, error
    }

}

export default useFetch;