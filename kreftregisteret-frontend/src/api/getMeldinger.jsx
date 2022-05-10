import {useState, useEffect} from "react";
import axios from 'axios';
import {URL} from "../utils/utils";

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
                const response = await axios.get(URL.url + id);
                response && setData(response.data);
            } catch (err) {
                console.log(err);
                setError(err);
            } finally {
                setLoading(false);
            }
        };

        getData();

    }, [id]);

    return {
        data, loading, error
    }
};

export default GetMeldinger;
