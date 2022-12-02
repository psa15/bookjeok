package io.toyproject.bookjeokclone.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardUpdateRequest {

    private String title;
    private String content;

    @Builder
    public BoardUpdateRequest(String title, String cotent) {
        this.content = cotent;
        this.title = title;
    }
}
