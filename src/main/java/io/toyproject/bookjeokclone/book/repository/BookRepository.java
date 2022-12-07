package io.toyproject.bookjeokclone.book.repository;

import io.toyproject.bookjeokclone.book.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
