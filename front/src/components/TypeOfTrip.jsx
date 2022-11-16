import { useState, useEffect } from "react";
import { of } from "rxjs";
import axios from "axios";

const TypeOfTrip = ({...props}) => {

    return (
        <div  class="card row mt-3" >
            <div class="form-check">
                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1" />
                <label class="form-check-label" for="flexRadioDefault1">
                    One-Way
                </label>
                </div>
                <div class="form-check">
                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked />
                <label class="form-check-label" for="flexRadioDefault2">
                    Round Trip
                </label>
            </div>
        </div>
    );

}

export default TypeOfTrip; 