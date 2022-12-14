package io.toyproject.bookjeokclone.book.model.dto;

import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@Getter
@ToString
public class AladinItem {
    private String title;
    private String link;
    private String author;
    private String description;
    private String isbn;
    private String cover;
    private String publisher;


}
