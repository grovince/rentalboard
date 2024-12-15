package com.grovince.rentalBoard.service.board;

import com.grovince.rentalBoard.dto.board.ContentDTO;

public interface BoardService {

    ContentDTO writeContent(ContentDTO contentDTO); //글 작성 메서드
    ContentDTO getContent(ContentDTO contentDTO);

    ContentDTO saveContent(ContentDTO contentDTO); //글 저장 메서드

    void deleteContent(Long content_board_idx);	//게시글 고유 번호

}
