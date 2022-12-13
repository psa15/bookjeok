package io.toyproject.bookjeokclone.book.controller;

import io.toyproject.bookjeokclone.book.model.dto.AladinApiRequest;
import io.toyproject.bookjeokclone.book.model.dto.AladinApiResponse;
import io.toyproject.bookjeokclone.book.service.AladinApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import retrofit2.Response;

import java.io.IOException;

@Controller
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final AladinApiService aladinService;

    @GetMapping(params = "search")
    public String search() {
        return "book/bookSearch";
    }


    @GetMapping("/result")
    public String search(@RequestParam("query") String query, Model model) throws IOException {
        AladinApiRequest request = new AladinApiRequest(query);
        AladinApiResponse response = aladinService.searchBook(request);
        model.addAttribute("response", response);
        return "book/result";
    }
}
