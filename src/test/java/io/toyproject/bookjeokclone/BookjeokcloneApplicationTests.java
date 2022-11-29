package io.toyproject.bookjeokclone;

import io.toyproject.bookjeokclone.model.entity.Board;
import io.toyproject.bookjeokclone.repository.BoardRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BookjeokcloneApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	BoardRepository boardRepository;

	@Test
	public void 게시판테스트(){
		//given
		String title = "제목입니다.";
		String writer = "sua";
		String content = "content content";

		boardRepository.save(Board.builder()
				.title(title)
				.writer(writer)
				.content(content)
				.build());

		//when
		List<Board> boardList = boardRepository.findAll();

		//then
		Board board = boardList.get(0);
		Assertions.assertThat(board.getContent()).isEqualTo(content);
		Assertions.assertThat(board.getWriter()).isEqualTo(writer);
		Assertions.assertThat(board.getTitle()).isEqualTo(title);

	}

}
