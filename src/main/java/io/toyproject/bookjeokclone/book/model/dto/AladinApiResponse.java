package io.toyproject.bookjeokclone.book.model.dto;

import java.util.List;

public class AladinApiResponse {

    private int version;
    private String logo;
    private String tile;
    private String link;
    private String pubDate;
    private int totalResults;
    private int startIndex;
    private int itemsPerPage;
    private String query;
    private int searchCategoryId;
    private String searchCategoryName;

    private List<AladinItem> items;

}
