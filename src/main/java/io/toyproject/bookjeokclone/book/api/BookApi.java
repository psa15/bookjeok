package io.toyproject.bookjeokclone.book.api;

import io.toyproject.bookjeokclone.book.model.dto.AladinApiResponse;
import io.toyproject.bookjeokclone.book.model.dto.BookRequest;
import io.toyproject.bookjeokclone.book.model.entity.Book;
import io.toyproject.bookjeokclone.book.service.AladinApiService;
import io.toyproject.bookjeokclone.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/book")
public class BookApi {

    private final BookService bookService;

    private final AladinApiService aladinApiService;

    @GetMapping
    public void search() throws IOException {
         aladinApiService.search();
    }


}
