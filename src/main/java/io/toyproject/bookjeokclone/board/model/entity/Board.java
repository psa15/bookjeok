package io.toyproject.bookjeokclone.board.model.entity;

//id(글번호), title, writer, content

import io.toyproject.bookjeokclone.board.model.dto.BoardRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "writer", nullable = false)
    private String writer;

    @Column(name = "content", nullable = false)
    private String content;

    public static Board create(BoardRequest boardRequest) {
        return Board.builder()
                .content(boardRequest.getContent())
                .writer(boardRequest.getWriter())
                .title(boardRequest.getTitle())
                .build();
    }

    @Builder
    private Board(String title, String writer, String content) {
        this.content = content;
        this.writer = writer;
        this.title = title;
    }

    public void update(String title, String content) {
        this.content = content;
        this.title = title;
    }

}
