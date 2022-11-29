package io.toyproject.bookjeokclone.model.dto;

import lombok.Data;


@Data
public class BoardRequest {


    private String title;

    private String writer;

    private String content;
}
