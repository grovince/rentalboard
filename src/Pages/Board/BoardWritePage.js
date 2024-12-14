import React from 'react';
import BoardForm from '../../Components/Board/BoardWriteForm';
import { useBoardWrite } from '../../Hooks/Board/useBoardWrite';

const BoardWritePage = () => {
  const { board, onChange, saveBoard, backToList } = useBoardWrite();

  return (
    <BoardForm
      board={board}
      onChange={onChange}
      onSubmit={saveBoard}
      onCancel={backToList}
    />
  );
};

export default BoardWritePage;
