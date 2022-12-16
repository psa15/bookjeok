package io.toyproject.bookjeokclone.book.controller;

import io.toyproject.bookjeokclone.book.model.SearchCategory;
import io.toyproject.bookjeokclone.book.model.dto.AladinApiResponse;
import io.toyproject.bookjeokclone.book.service.AladinApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final AladinApiService aladinService;

    @GetMapping
    public String search(@RequestParam(value = "query", required = false) String query,
                         @RequestParam(value = "category", required = false) String category,
                         Model model) throws IOException {

        model.addAttribute("searchCategory", SearchCategory.values());
        AladinApiResponse response = query == null ? null : aladinService.searchBook(query, SearchCategory.of(category));
        model.addAttribute("response", response);
        return "book/search";
    }
}
