package io.toyproject.bookjeokclone.service;

import io.toyproject.bookjeokclone.model.dto.BoardRequest;
import io.toyproject.bookjeokclone.model.dto.BoardUpdateRequest;
import io.toyproject.bookjeokclone.model.entity.Board;
import io.toyproject.bookjeokclone.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    //저장
    @Transactional
    public Board create(BoardRequest request) {

        Board board = Board.create(request);
        return boardRepository.save(board);
    }

    //목록
    public List<Board> list() {
        return boardRepository.findAll();
    }

    public Board get(final Long id) {

        Board board = boardRepository.getById(id);
        return Board.builder()
                .title(board.getTitle())
                .content(board.getContent())
                .writer(board.getWriter())
                .build();
    }

    public Long update(Long id, BoardUpdateRequest updateRequest) {
        Board board = boardRepository.getById(id);
        board.update(updateRequest.getTitle(), updateRequest.getContent());
        boardRepository.save(board);
        return id;

    }

    public void delete(Long id) {
        Board board = boardRepository.getById(id);
        boardRepository.delete(board);
    }


}
