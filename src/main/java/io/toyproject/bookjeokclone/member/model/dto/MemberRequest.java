package io.toyproject.bookjeokclone.member.model.dto;

import lombok.Data;

@Data
public class MemberRequest {

    private String username;

    private String email;

    private String password;

}
