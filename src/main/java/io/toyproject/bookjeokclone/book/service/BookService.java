package io.toyproject.bookjeokclone.book.service;

import io.toyproject.bookjeokclone.book.model.dto.BookRequest;
import io.toyproject.bookjeokclone.book.model.entity.Book;
import io.toyproject.bookjeokclone.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor //private final 키워드가 붙어있는 생성자를 자동으로 생성해줌
@Transactional(readOnly = true)
public class BookService {

    private final BookRepository bookRepository;

    @Transactional
    public Book create(BookRequest request) {

        Book book = Book.create(request);
        return bookRepository.save(book);

    }


}
