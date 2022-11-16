import { useState } from "react";
import logo from './logo.svg';
import './App.css';
import { of } from "rxjs";

import OriginForm from './components/OriginForm';
import PossibleDestinations from "./components/PossibleDestinations";
import TypeOfTrip from "./components/TypeOfTrip";

function App() {
  
  const [ originFormVisible, setOriginFormVisible ] = useState(true);
  const [ originColl, setOriginColl ] = useState([]);


  const [ destinationCollVisible, setDestinationCollVisible ] = useState(false);
  const [ typeOfTrip, setTypeOfTrip ] = useState(false);
 
  const outputDestination = ( origins ) => {

    setOriginColl(origins)
    setOriginFormVisible(false)
    setDestinationCollVisible(true)

  }

  const showTypeOfTrip = () => {

    setTypeOfTrip(true)

  }

  return (
    <div className="App container">

      <main>
        
        <OriginForm outputDestination={outputDestination} /> 

        { destinationCollVisible && (
          <PossibleDestinations showTypeOfTrip={showTypeOfTrip} originColl={originColl} />
        )}

        { typeOfTrip && (
          <TypeOfTrip />
        )}


      </main>

    </div>
  );
}

export default App;
