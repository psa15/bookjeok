package io.toyproject.bookjeokclone.service;

import io.toyproject.bookjeokclone.model.dto.BoardRequest;
import io.toyproject.bookjeokclone.model.entity.Board;
import io.toyproject.bookjeokclone.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class BoardService {

    private final BoardRepository boardRepository;

    //저장
    @Transactional
    public Board create(BoardRequest request) {

        Board board = Board.create(request);
        return boardRepository.save(board);
    }
}
