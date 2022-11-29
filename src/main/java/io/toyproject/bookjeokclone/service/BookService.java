package io.toyproject.bookjeokclone.service;

import io.toyproject.bookjeokclone.model.dto.BookRequest;
import io.toyproject.bookjeokclone.model.entity.Book;
import io.toyproject.bookjeokclone.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.asm.Advice;
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
