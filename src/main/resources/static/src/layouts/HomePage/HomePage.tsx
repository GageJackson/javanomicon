import React from "react";
import {useEffect, useState} from "react";
import TastingModel from "../../models/TastingModel";
import ScoreModel from "../../models/ScoreModel";
import BrewDetailModel from "../../models/BrewDetailModel";
import CoffeeDetailModel from "../../models/CoffeeDetailModel";
import {SpinnerLoading} from "../../Utils/SpinnerLoading";

export const HomePage = () => {

    const [tastings, setTastings] = useState<TastingModel[]>([])
    const [isLoading, setIsLoading] = useState(true);
    const [httpError, setHttpError] = useState(null);

    useEffect(() => {
        const fetchTastings = async () => {
            const url: string = "http://localhost:8080/api/tastings/all";
            //const url: string = `${baseUrl}?page=0&size=4`;
            const response = await fetch(url);

            if (!response.ok) {
                throw new Error('Something went wrong fetching tastings from API');
            }

            const responseJson = await response.json();

            console.log(responseJson);

            //const responseData = responseJson._embedded.tastings;
            const loadedTastings: TastingModel[] = [];

            for (const key in responseJson){
                loadedTastings.push(new TastingModel(
                    responseJson[key].id,
                    responseJson[key].tastingDate,
                    responseJson[key].overallScore,
                    responseJson[key].description,
                    responseJson[key].tastingFlavors,
                    responseJson[key].scoreAcidity,
                    responseJson[key].scoreAroma,
                    responseJson[key].scoreBalance,
                    responseJson[key].scoreBody,
                    responseJson[key].scoreFinish,
                    responseJson[key].scoreFlavor,
                    responseJson[key].scoreRoast,
                    responseJson[key].scoreSweetness,
                    responseJson[key].coffeeDetails,
                    responseJson[key].brewDetails
                ));
            }

            setTastings(loadedTastings);
            setIsLoading(false);
        };

        fetchTastings().catch((error:any) => {
            setIsLoading(false);
            setHttpError(error.message);
        })
    }, []);

    if (isLoading){
        return (
            <SpinnerLoading/>
        )
    }

    if (httpError){
        return (
            <div className={'container m-5'}>
                <p>{httpError}</p>
            </div>
        )
    }

    return (
        <div>
            <h1>hello</h1>
        </div>
    );
}