package com.grovince.rentalBoard.dto.board;

import lombok.*;

import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {
    private Long postIdx;
    private String title;
    private String content;
    private String userName;
    private String password;
    private String lecture;
    private String department;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;
}
