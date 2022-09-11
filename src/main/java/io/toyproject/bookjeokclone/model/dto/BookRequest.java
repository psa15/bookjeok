package io.toyproject.bookjeokclone.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BookRequest {

    private String title;

    private String writer;

    private String detail;

    private String publisher;

    private String isbn;

    private Integer page;

}
