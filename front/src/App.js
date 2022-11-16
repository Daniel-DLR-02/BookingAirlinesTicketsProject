import { useState } from "react";
import logo from './logo.svg';
import './App.css';
import { of } from "rxjs";

import OriginForm from './components/OriginForm';
import PossibleDestinations from "./components/PossibleDestinations";
import TypeOfTrip from "./components/TypeOfTrip";

function App() {
  
  const [ originFormVisible, setOriginFormVisible ] = useState(true);
  const [ destinationCollVisible, setDestinationCollVisible ] = useState(false);
  const [ typeOfTrip, setTypeOfTrip ] = useState(false);
 
  const outputDestination = () => {

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
          <PossibleDestinations showTypeOfTrip={showTypeOfTrip} />
        )}

        { typeOfTrip && (
          <TypeOfTrip />
        )}


      </main>

    </div>
  );
}

export default App;
