package io.toyproject.bookjeokclone.book.model.dto;

import io.toyproject.bookjeokclone.book.model.SearchCategory;
import lombok.Data;

@Data
public class BookSearchRequest {

    private SearchCategory category;

    private String query;
}
