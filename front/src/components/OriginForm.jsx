import { useState, useEffect } from "react";
import { of } from "rxjs";
import axios from "axios";

const OriginForm = ({outputDestination, ...props}) => {

    const [ posibleOriginsColl, setPosibleOriginsColl ] = useState(["Málaga","Sevilla"]);
    const [ originColl, setOriginColl ] = useState([]);
    const [ newOrigin, setNewOrigin ] = useState(posibleOriginsColl[0]);

    const [ post, setPost] = useState(null);

    useEffect(() => {
      axios.get(`http://localhost:8081/travels/allOrigins`).then((response) => {
        console.log(response);
        // setPost(response.data);
      });
    }, []);
    

    const originChangeHandler = (event) => {
        setNewOrigin(event.target.value);
    };

    const addToOrigin = (event) => {
        event.preventDefault();

        if( newOrigin.trim().length > 0 ) {
            // setPosibleOriginsColl((prev) => {
            //     return [...prev].filter((origin => origin != newOrigin));
            // })

            setOriginColl((prev) => {
                return [newOrigin, ...prev];
            })
    
            setNewOrigin('');
        }
    }

    const submitForm = () => {
        if( originColl.length >= 5 || true ) {
            of(["Sevilla","Algo"]).subscribe( algo => {
                console.log(algo);
            })

            outputDestination();
        }
    } 

    return (
        <div  class="card row mt-3" >
            <h3>Origines</h3>
            <div class="card col-3">
                <div class="card-body">
                    <form onSubmit={addToOrigin}>
                        <div class="mb-3">
                            <select class="form-select" aria-label="Default select example"onChange={originChangeHandler}>
                                { posibleOriginsColl.map( (origin,index) => <option key={index} >{origin}</option>) }                              
                            </select>
                        </div>
                        <button type="submit" class="btn btn-primary">Enter Origin</button>
                    </form>
                </div>
            </div>


            <div class="card col-7">
                <ul class="list-group">
                    { originColl.map( (origin,index) => <li key={index} class="list-group-item">{origin}</li>) }                    
                </ul>                
            </div>

            <button type="submit" class="btn btn-primary" onClick={submitForm}>Get Destinations</button>
        </div>
    );

}

export default OriginForm; 