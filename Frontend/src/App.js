import { Routes, Route } from "react-router-dom";
import './App.css';
import { HomePage } from "./components/home";

function App() {
  return (
    <div>
      <Routes>
        <Route path="/home" element={< HomePage/>}/>
      </Routes>
    </div>
  );
}

export default App;
