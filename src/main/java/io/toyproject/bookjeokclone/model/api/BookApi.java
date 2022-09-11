package io.toyproject.bookjeokclone.model.api;

import io.toyproject.bookjeokclone.model.dto.BookRequest;
import io.toyproject.bookjeokclone.model.entity.Book;
import io.toyproject.bookjeokclone.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/book")
public class BookApi {

    private final BookService bookService;

    @PostMapping
    public Book create(@RequestBody BookRequest request) {
        return bookService.create(request);
    }

}
