package io.toyproject.bookjeokclone.book.model.dto;

import io.toyproject.bookjeokclone.book.model.SearchCategory;
import lombok.Getter;

@Getter
public class AladinApiRequest {
    private String ttbKey;
    private String queryType;
    private String query;
    private final String Output = "js";
    private final String Version = "20131101";

    public AladinApiRequest(String query, SearchCategory category) {
        this.query = query;
        this.queryType = category == null ? SearchCategory.KEYWORD.getValue() : category.getValue();
    }
}
