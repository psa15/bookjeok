package io.toyproject.bookjeokclone.controller;

import io.toyproject.bookjeokclone.model.dto.BoardRequest;
import io.toyproject.bookjeokclone.model.entity.Board;
import io.toyproject.bookjeokclone.service.BoardService;
import io.toyproject.bookjeokclone.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/write")
    public String write() {
        return "board/write";
    }

    @PostMapping("/write")
    public Board write(BoardRequest request) {
        return boardService.create(request);
    }
}