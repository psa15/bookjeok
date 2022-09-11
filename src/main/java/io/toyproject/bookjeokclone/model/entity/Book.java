package io.toyproject.bookjeokclone.model.entity;

import io.toyproject.bookjeokclone.model.dto.BookRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="book")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners({AuditingEntityListener.class})
public class Book {
    @GenericGenerator(
            name = "bookSequenceGenerator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "SEQ_BOOK"),
                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
            }
    )
    @Id
    @GeneratedValue(generator = "bookSequenceGenerator")
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "writer", nullable = false)
    private String writer;

    @Column(name = "detail", nullable = false)
    private String detail;

    @Column(name = "publisher", nullable = false)
    private String publisher;

    @Column(name = "isbn", nullable = false)
    private String isbn;

    @Column(name = "page", nullable = false)
    private Integer page;

    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at", nullable = true)
    private LocalDateTime updatedAt;

    public static Book create(BookRequest bookRequest){
        return Book.builder()
                .title(bookRequest.getTitle())
                .detail(bookRequest.getDetail())
                .isbn(bookRequest.getIsbn())
                .page(bookRequest.getPage())
                .publisher(bookRequest.getPublisher())
                .writer(bookRequest.getWriter())
                .build();
    }

    @Builder
    private Book(String title, String writer, String detail, String publisher, String isbn, Integer page) {
        this.title = title;
        this.writer = writer;
        this.detail = detail;
        this.publisher = publisher;
        this.isbn = isbn;
        this.page = page;
    }
}
