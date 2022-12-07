package io.toyproject.bookjeokclone.board.api;

import io.toyproject.bookjeokclone.board.model.dto.BoardRequest;
import io.toyproject.bookjeokclone.board.model.dto.BoardUpdateRequest;
import io.toyproject.bookjeokclone.board.model.entity.Board;
import io.toyproject.bookjeokclone.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/boards")
@RequiredArgsConstructor
public class BoardApi {

    private final BoardService boardService;

    @PostMapping
    public Board write(@RequestBody BoardRequest request) {
        return boardService.create(request);
    }

    @GetMapping
    public List<Board> list() {
        List<Board> list = boardService.list();
        return list;
    }

    @PatchMapping("/{id}")
    public Long update(@PathVariable Long id, @RequestBody BoardUpdateRequest request) {
        return boardService.update(id, request);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        boardService.delete(id);
    }
}
