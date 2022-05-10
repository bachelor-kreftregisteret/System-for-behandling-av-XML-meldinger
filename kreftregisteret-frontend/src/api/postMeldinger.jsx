import axios from "axios";
import {useEffect, useState} from "react";
import {URL} from "../utils/utils";

const PostMeldinger = (data) => {
    const [postError, setPostError] = useState("");

    useEffect( () => {

        const postData = async () => {
            const headers = {
                'Content-Type': 'application/json'
            };
            axios.post(URL.url, data, {headers})
                .then(_ => {
                    setPostError("")
                })
                .catch(error => {
                    setPostError(error.toString())
                })
        };

        postData();
    }, []);

    return postError
};

export default PostMeldinger;