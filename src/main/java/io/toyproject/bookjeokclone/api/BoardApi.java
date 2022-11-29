package io.toyproject.bookjeokclone.api;

import io.toyproject.bookjeokclone.model.dto.BoardRequest;
import io.toyproject.bookjeokclone.model.entity.Board;
import io.toyproject.bookjeokclone.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardApi {

    private final BoardService boardService;

/*    @GetMapping("/write")
    public String write() {
        return "board/write";
    }*/

    @PostMapping("/write")
    public Board write(@RequestBody BoardRequest request) {
        return boardService.create(request);
    }
}
