import React from 'react';
import { BrowserRouter as Router, Routes, Route, useLocation } from 'react-router-dom';
import HomeHeader from './Components/HomeHeader';
import BoardHeader from './Components/BoardHeader';
import Home from './Pages/Home/Home';
import BoardWrite from './Pages/Board/BoardWrite';

function App() {
  return (
    <Router>
      <AppContent />
    </Router>
  );
}

function AppContent() {
  const location = useLocation();

  const Header = location.pathname.startsWith('/Board') ? BoardHeader : HomeHeader;

  return (
    <div>
      <Header />
      
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/BoardWrite" element={<BoardWrite />} />

      </Routes> 
    </div>
  );
}

export default App;
