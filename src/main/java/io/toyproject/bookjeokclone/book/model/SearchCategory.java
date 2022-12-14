package io.toyproject.bookjeokclone.book.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SearchCategory {

    KEYWORD("Keyword", "제목 + 저자"),
    TITLE("Title", "제목"),
    AUTHOR("Author", "저자"),
    PUBLISHER("Publisher", "출판사"),
    ;

    private final String value;

    private final String meaning;

}
