package com.beyond.teenkiri.post.dto;



import com.beyond.teenkiri.common.domain.DelYN;
import com.beyond.teenkiri.post.domain.Post;
import com.beyond.teenkiri.user_board.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostSaveReqDto {
    private String title;
    private String contents;
    private String email;
    @Builder.Default
    private DelYN delYN = DelYN.N;

    public Post toEntity(User user){
        return Post.builder()
                .title(this.title)
                .contents(this.contents)
                .user(user)
                .build();
    }
}
