import { Routes, Route } from "react-router-dom";
import './App.css';
import { Menu } from "./components/menu";

function App() {
  return (
    <div>
      <Routes>
        <Route path="/" element={< Menu/>}/>
      </Routes>
    </div>
  );
}

export default App;
