package com.grovince.rentalBoard.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Content") //content 테이블과 매칭
@Getter
@Setter
@NoArgsConstructor //파라미터가 없는 기본 생성자를 자동으로 생성
@AllArgsConstructor //모든 필드를 파라미터로 받는 생성자를 자동으로 생성
@Builder //빌더 패턴을 구현한 내부 클래스를 자동으로 생성
public class Content {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String tag;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(nullable = false)
    private String author;

}
