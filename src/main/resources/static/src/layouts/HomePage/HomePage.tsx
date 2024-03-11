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

            const responseData = responseJson._embedded.tastings;

            console.log(responseData);

            const loadedTastings: TastingModel[] = [];

            for (const key in responseData){
                loadedTastings.push(new TastingModel(
                    responseData[key].id,
                    responseData[key].tastingDate,
                    responseData[key].overallScore,
                    responseData[key].description,
                    responseData[key].tastingFlavors,
                    responseData[key].scoreAcidity,
                    responseData[key].scoreAroma,
                    responseData[key].scoreBalance,
                    responseData[key].scoreBody,
                    responseData[key].scoreFinish,
                    responseData[key].scoreFlavor,
                    responseData[key].scoreRoast,
                    responseData[key].scoreSweetness,
                    responseData[key].coffeeDetails,
                    responseData[key].brewDetails
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