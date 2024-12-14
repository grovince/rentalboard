import React from 'react';
import { Link } from 'react-router-dom'; // Link를 import
import '../Styles/HomeHeader.css';

export default function HomeHeader() {
  return (
    <div className="header">
      <header className="headerObj">
        <h1 className="logo">LOGO</h1>
        <nav>
          <ul className="nav-links">
            <li>로그아웃</li>
            <li>채팅 목록</li>
            <li><Link to="/BoardWrite">작성하기</Link></li>
          </ul>
        </nav>
      </header>
    </div>
  );
}
