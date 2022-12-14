package io.toyproject.bookjeokclone.book.api;

import io.toyproject.bookjeokclone.book.service.AladinApiService;
import io.toyproject.bookjeokclone.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/book")
public class BookApi {

    private final BookService bookService;

    private final AladinApiService aladinApiService;

}
