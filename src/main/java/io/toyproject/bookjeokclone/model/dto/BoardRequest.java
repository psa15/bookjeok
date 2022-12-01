package io.toyproject.bookjeokclone.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor

@NoArgsConstructor

public class BoardRequest {


    private String title;

    private String writer;

    private String content;
}
