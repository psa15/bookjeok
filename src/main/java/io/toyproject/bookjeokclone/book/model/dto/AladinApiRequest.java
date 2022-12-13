package io.toyproject.bookjeokclone.book.model.dto;

import lombok.Getter;

@Getter
public class AladinApiRequest {
    private String ttbKey;
    private String query;
    private final String Output = "js";
    private final String Version = "20131101";

    public AladinApiRequest(String query) {
        this.query = query;
    }
}
