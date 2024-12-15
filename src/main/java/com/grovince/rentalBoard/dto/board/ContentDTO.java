package com.grovince.rentalBoard.dto.board;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContentDTO {
    private int content_idx;	//게시글 번호

    @NotBlank(message = "게시글 제목은 null이 될 수 없습니다.")
    private String content_title;	//게시글 제목

    @NotBlank(message = "게시글 태그는 null이 될 수 없습니다.")
    private String content_tag;	//게시글 태그

    @NotBlank(message = "게시글 본문은 null이 될 수 없습니다.")
    private String content_text;    //게시글 본문

    private int content_writer_idx;	//작성자 회원번호
    private int content_board_idx;	//게시글 고유 번호
    private String content_date;	//작성일

}
