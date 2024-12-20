package com.grovince.rentalBoard.service.board;

import com.grovince.rentalBoard.dto.board.PostDTO;

public interface BoardService {

    PostDTO createPost(PostDTO postDTO); //글 작성 메서드
//    PostDTO getPost(PostDTO postDTO);
//
//    PostDTO editPost(PostDTO postDTO); //글 저장 메서드
//
//    void deletePost(Long postIdx);	//게시글 고유 번호

}
