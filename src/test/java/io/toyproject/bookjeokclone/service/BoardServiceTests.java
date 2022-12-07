package io.toyproject.bookjeokclone.service;

import io.toyproject.bookjeokclone.board.model.dto.BoardRequest;
import io.toyproject.bookjeokclone.board.model.entity.Board;
import io.toyproject.bookjeokclone.board.service.BoardService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardServiceTests {

    @Autowired
    BoardService boardService;


    @Test
    void 게시글_등록(){

        //given
        String title = "제목입니다.";
        String writer = "sua";
        String content = "content content";

        BoardRequest request = new BoardRequest(title,writer,content);

        //when
        Board board = boardService.create(request);

        //then
        Assertions.assertThat(board.getTitle()).isEqualTo(title);
        Assertions.assertThat(board.getWriter()).isEqualTo(writer);
        Assertions.assertThat(board.getContent()).isEqualTo(content);

    }
}
