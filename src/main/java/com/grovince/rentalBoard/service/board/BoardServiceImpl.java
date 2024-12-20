package com.grovince.rentalBoard.service.board;

import com.grovince.rentalBoard.dto.board.PostDTO;
import com.grovince.rentalBoard.entity.Post;
import com.grovince.rentalBoard.repository.board.BoardRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BoardServiceImpl implements BoardService{

    private final BoardRepository boardRepository;

    public BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public PostDTO createPost(PostDTO postDTO) { //게시글 작성
        validatePostData(postDTO); //유효성 검사

        Post post = convertToEntity(postDTO);
        Post savedPost = boardRepository.save(post);
        return convertToDTO(savedPost);
    }

    private void validatePostData(PostDTO postDTO) {
        if (postDTO.getTitle() == null || postDTO.getTitle().trim().isEmpty()){ //PostDTO 객체의 title 필드값 확인
            throw new IllegalArgumentException("제목은 필수 입력 항목입니다.");
        }
        if (postDTO.getContent() == null || postDTO.getContent().trim().isEmpty()) {
            throw new IllegalArgumentException("내용은 필수 입력 항목입니다.");
        }
        if (postDTO.getUserName() == null || postDTO.getUserName().trim().isEmpty()) {
            throw new IllegalArgumentException("작성자는 필수 입력 항목입니다.");
        }
    }
/*    @Override
    public PostDTO getPost(PostDTO postDTO) { //데이터베이스에서 게시글 가져오기
        Post post = boardRepository.findById(postDTO.getPostIdx())
                .orElseThrow(() -> new RuntimeException("게시글을 찾을 수 없습니다."));
        return convertToDTO(post);
    }*/


/*    @Override
    public PostDTO editPost(PostDTO postDTO) {
        validatePostData(postDTO);

        Post existingPost = boardRepository.findById(postDTO.getPostIdx())
                .orElseThrow(() -> new RuntimeException("수정할 게시글을 찾을 수 없습니다."));

        updatePostData(existingPost, postDTO);
        Post savedPost = boardRepository.save(existingPost);
        return convertToDTO(savedPost);
    }*/

/*    @Override
    public void deletePost(Long postIdx) {
        boardRepository.deleteById(postIdx);
    }*/




    private Post convertToEntity(PostDTO postDTO) { //DB와의 상호작용을 위해 PostDTO를 Post 엔티티로 변환
        return Post.builder()
                .postIdx(postDTO.getPostIdx())
                .title(postDTO.getTitle())
                .content(postDTO.getContent())
                .userName(postDTO.getUserName())
                .lecture(postDTO.getLecture())
                .department(postDTO.getDepartment())
                .createdAt(LocalDateTime.now())
                .build();
    }

    private PostDTO convertToDTO(Post post) {
        return PostDTO.builder()
                .postIdx(post.getPostIdx())
                .title(post.getTitle())
                .content(post.getContent())
                .userName(post.getUserName())
                .lecture(post.getLecture())
                .department(post.getDepartment())
                .createdAt(post.getCreatedAt())
                .build();
    }
}
