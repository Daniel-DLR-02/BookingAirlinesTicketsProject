import { useState } from "react";
import logo from './logo.svg';
import './App.css';
import { of } from "rxjs";

import OriginForm from './components/OriginForm';
import PossibleDestinations from "./components/PossibleDestinations";

function App() {
  
  const [ originFormVisible, setOriginFormVisible ] = useState(true);
  const [ destinationCollVisible, setDestinationCollVisible ] = useState(false);
 
  const outputDestination = () => {

    setOriginFormVisible(false)


  }

  return (
    <div className="App container">

      <main>
        
        {/* { originFormVisible ? <OriginForm outputDestination={outputDestination} /> : <PossibleDestinations />} */}
        <PossibleDestinations />

      </main>

    </div>
  );
}

export default App;
