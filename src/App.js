import React from 'react';
import { BrowserRouter as Router, Routes, Route, useLocation } from 'react-router-dom';
import HomeHeader from './Components/HomeHeader';
import Home from './Pages/Home/Home';
import BoardWritePage from './Pages/Board/BoardWritePage';

function App() {
  return (
    <Router>
      <AppContent />
    </Router>
  );
}

function AppContent() {
  const location = useLocation();

  return (
    <div>
       {location.pathname === '/' && <HomeHeader />}
      
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/BoardWrite" element={<BoardWritePage />} />

      </Routes> 
    </div>
  );
}

export default App;
