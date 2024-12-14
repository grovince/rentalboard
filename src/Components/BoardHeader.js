import React from 'react';
import { Link } from 'react-router-dom';
import '../Styles/BoardHeader.css';

export default function BoardHeader() {
  return (
    <div className="boardHeader">
      <header className="boardHeaderObj">
        <h1 className="backToHome"><Link to="Home">뒤로가기</Link></h1>
        <button className="writeCompleteButton">완료</button>
      </header>
    </div>
  );
}
