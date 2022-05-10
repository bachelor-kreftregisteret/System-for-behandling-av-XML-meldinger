import axios from "axios";
import {useEffect, useState} from "react";
import {URL} from "../utils/utils";

const PostMeldinger = (data) => {
    let error = "";

    const postData = async () => {
        const headers = {
            'Content-Type': 'application/json'
        };
        axios.post(URL.url, data, {headers})
            .then(_ => {
                error = "";
            })
            .catch(err => {
                error = err.toString();
            })
    };

    postData();

    return error
};

export default PostMeldinger;