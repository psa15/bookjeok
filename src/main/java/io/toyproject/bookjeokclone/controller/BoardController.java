package io.toyproject.bookjeokclone.controller;

import io.toyproject.bookjeokclone.model.dto.BoardRequest;
import io.toyproject.bookjeokclone.model.dto.BoardResponse;
import io.toyproject.bookjeokclone.model.dto.BoardUpdateRequest;
import io.toyproject.bookjeokclone.model.entity.Board;
import io.toyproject.bookjeokclone.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ListIterator;

@Controller
@RequestMapping("/boards")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping(params = "write")
    public String write() {
        return "board/write";
    }

    @PostMapping
    public String write(BoardRequest request) {
        boardService.create(request);
        return "redirect:/boards/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Board> boardList = boardService.list();
        model.addAttribute("boardList", boardList);

        return "board/list";
    }


    //상세보기
    @GetMapping( "/{id}")
    public String detail(@PathVariable Long id, Model model) {

        BoardResponse board = boardService.get(id);
        model.addAttribute("board", board);
        return "board/detail";
    }

    //수정하기
    @GetMapping(value = "/{id}", params = "update")
    public String update(@PathVariable Long id, Model model) {

        BoardResponse board = boardService.get(id);
        model.addAttribute("board", board);
        return "board/update";
    }

    @PostMapping(params = "update")
    public String update(@RequestParam("id") Long id, BoardRequest request) {

        BoardUpdateRequest updateRequest = new BoardUpdateRequest(request.getTitle(), request.getContent());
        boardService.update(id, updateRequest);
        return "redirect:/boards/list";
    }

    //삭제하기
    @PostMapping(params = "delete")
    public String delete(@RequestParam("id") Long id) {
        boardService.delete(id);

        return "redirect:/boards/list";
    }
}
