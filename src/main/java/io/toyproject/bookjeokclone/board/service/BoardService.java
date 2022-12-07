package io.toyproject.bookjeokclone.board.service;

import io.toyproject.bookjeokclone.board.model.dto.BoardRequest;
import io.toyproject.bookjeokclone.board.model.dto.BoardResponse;
import io.toyproject.bookjeokclone.board.model.dto.BoardUpdateRequest;
import io.toyproject.bookjeokclone.board.model.entity.Board;
import io.toyproject.bookjeokclone.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    public BoardResponse get(final Long id) {

        Board board = boardRepository.getById(id);
        return BoardResponse.response(board);
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
