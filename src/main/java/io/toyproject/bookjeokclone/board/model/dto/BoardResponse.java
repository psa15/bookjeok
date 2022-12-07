package io.toyproject.bookjeokclone.board.model.dto;

import io.toyproject.bookjeokclone.board.model.entity.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardResponse {

    private Long id;

    private String title;

    private String writer;

    private String content;

    @Builder
    public BoardResponse(Long id, String title, String writer, String content) {
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.content = content;
    }

    public static BoardResponse response(final Board board) {
        return BoardResponse.builder()
                .id(board.getId())
                .title(board.getTitle())
                .writer(board.getWriter())
                .content(board.getContent())
                .build();
    }
}
