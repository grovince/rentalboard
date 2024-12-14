import React from 'react';
import { Link } from 'react-router-dom';
import '../../Styles/Board/BoardForm.css';

const BoardWriteForm = ({ board, onChange, onSubmit, onCancel }) => {
  const { title, tag, contents } = board;

  return (
    <div className="boardWrite">
      <header className="boardHeader">
        <Link to="/" className="backToHomeButton" onClick={onCancel}>뒤로가기</Link>
        <button className="writeCompleteButton" onClick={onSubmit}>확인</button>
      </header>

      <div className='boardBlankSpace'></div>

      <div className="boardContent">
        <input 
          className="boardWriteField" 
          type="text" 
          name="title" 
          placeholder="제목" 
          value={title} 
          onChange={onChange}
        />
        <input 
          className="boardWriteField" 
          type="text" 
          name="tag" 
          placeholder="태그" 
          value={tag} 
          onChange={onChange}
        />
        <textarea 
          className="boardWriteContent"
          placeholder="내용"
          name="contents"
          value={contents}
          onChange={onChange}
        />
      </div>
    </div>
  );
};

export default BoardWriteForm;
