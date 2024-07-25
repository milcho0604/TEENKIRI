package com.beyond.board_demo.notice.dto;

import com.beyond.board_demo.notice.domain.Notice;
import com.beyond.board_demo.post.domain.Post;
import com.beyond.board_demo.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NoticeSaveReqDto {
    private String title;
    private String content;
    private String email;

    public Notice toEntity(User user){
        return Notice.builder()
                .title(this.title)
                .content(this.content)
                .user(user)
                .build();
    }
}
