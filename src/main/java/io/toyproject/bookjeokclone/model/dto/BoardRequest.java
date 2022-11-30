package io.toyproject.bookjeokclone.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class BoardRequest {


    private String title;

    private String writer;

    private String content;
}
