import { useState, useEffect } from "react";
import { of } from "rxjs";
import axios from "axios";

const OriginForm = ({outputDestination, ...props}) => {

    const [ posibleOriginsColl, setPosibleOriginsColl ] = useState([]);
    const [ originColl, setOriginColl ] = useState([]);
    const [ newOrigin, setNewOrigin ] = useState(posibleOriginsColl[0]);

    useEffect(() => {
      axios.get(`http://localhost:8081/travels/allOrigins`).then(({data}) => { 
        
        setPosibleOriginsColl(data);
      });
    }, []);    

    const addToOrigin = (value) => {

        // if( newOrigin.trim().length > 0 ) {
            // setPosibleOriginsColl((prev) => {
            //     return [...prev].filter((origin => origin != newOrigin));
            // })

            setOriginColl((prev) => {
                return [value, ...prev];
            })
    
            setNewOrigin('');
        // }
    }

    const submitForm = () => {
        if( originColl.length >= 5 || true ) {
            outputDestination(originColl);
        }
    } 

    return (
        <div  className="card row mt-3" >
            <h3>Origines</h3>
            <div className="card col-3">
                <div className="card-body">
                
                    <ul className="list-group">
                        { 
                            posibleOriginsColl.map( (origin,index) => {
                                return(
                                    <li key={index} className="list-group-item">
                                        <p>{origin}</p>
                                        <button type="submit" className="btn btn-primary" onClick={() => addToOrigin(origin)}>Select Origin</button>
                                    </li>
                                )
                            })
                        }    
                    </ul>     
                    <form onSubmit={addToOrigin}>
                        <div className="mb-3">
                            
                        </div>
                        <button type="submit" className="btn btn-primary">Enter Origin</button>
                    </form>
                </div>
            </div>


            <div className="card col-7">
                <ul className="list-group">
                    { originColl.map( (origin,index) => <li key={index} className="list-group-item">{origin}</li>) }                    
                </ul>                
            </div>

            <button type="submit" className="btn btn-primary" onClick={submitForm}>Get Destinations</button>
        </div>
    );

}

export default OriginForm; 