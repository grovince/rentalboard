package com.grovince.rentalBoard.repository.board;

import com.grovince.rentalBoard.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BoardRepository extends JpaRepository<Post, Long> {
    // 게시글 전체 조회
    @Override
    List<Post> findAll();

    // ID로 게시글 조회
    Optional<Post> findById(Long postIdx);

    // 게시글 저장
    @Override
    Post save(Post post);

    // ID로 게시글 삭제
    @Override
    void deleteById(Long id);

    // 강의로 게시글 조회
    List<Post> findByLecture(String lecture);

    // 학과로 게시글 조회
    List<Post> findByDepartment(String department);
}
