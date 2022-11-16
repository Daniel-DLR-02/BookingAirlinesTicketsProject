import { useState } from "react";

const PossibleDestinations = () => {
    const destinations = ["Sevilla","Cosas"];

    const selectDestination = (destination) => {
        console.log(destination);
    }

    return(       
        <div className="card col-7">
            <ul className="list-group">
                { destinations.map( (destination,index) => {
                        return (
                            <li key={index} className="list-group-item">
                                <p>{destination}</p>
                                <button type="submit" className="btn btn-primary"   onClick={() => selectDestination(destination)}>Select Destination</button>
                            </li>
                        )
                    }) }   
            </ul>                
        </div>
    );
    
}

export default PossibleDestinations; 