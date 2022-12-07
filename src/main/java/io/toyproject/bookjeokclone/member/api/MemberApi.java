package io.toyproject.bookjeokclone.member.api;

import io.toyproject.bookjeokclone.member.model.dto.MemberRequest;
import io.toyproject.bookjeokclone.member.model.entity.Member;
import io.toyproject.bookjeokclone.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/member")
public class MemberApi {

    private final MemberService memberService;

    @PostMapping
    public Member create(@RequestBody MemberRequest request) {
        return memberService.create(request);
    }

}
