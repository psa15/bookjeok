package io.toyproject.bookjeokclone.repository;

import io.toyproject.bookjeokclone.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
