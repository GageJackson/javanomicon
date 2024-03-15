import React from "react";
import CoffeeModel from "../../../models/TastingModel";
import {Link} from "react-router-dom";

export const ReturnCoffee: React.FC<{tasting: TastingModel}> = (props) => {
    return (
        <p>{props.tasting.description}</p>
    );
}