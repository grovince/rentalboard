import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { saveBoardAPI } from '../../API/saveBoardAPI';

export const useBoardWrite = () => {
  const navigate = useNavigate();
  const [board, setBoard] = useState({ 
    title: '',
    tag: '',
    contents: '',
  });

  const onChange = (event) => { 
    const { value, name } = event.target;
    setBoard({
      ...board,
      [name]: value,
    });
  };

  const saveBoard = async () => {
    try {
      // 입력값 검증
      if (!board.title.trim()) {
        alert('제목을 입력해주세요.');
        return;
      }
      if (!board.tag.trim()) {
        alert('태그를 입력해주세요.');
        return;
      }
      if (!board.contents.trim()) {
        alert('내용을 입력해주세요.');
        return;
      }
  
      // API 호출
      const response = await saveBoardAPI(board);
      
      if (response) {
        alert('등록되었습니다.');
        navigate('/board');
      }
    } catch (error) {
      console.error('게시글 저장 실패:', error);
      alert('게시글 저장에 실패했습니다. 다시 시도해주세요.');
    }
  };
  

  const backToList = () => {
    navigate('/board');
  };

  return { board, onChange, saveBoard, backToList };
};
