package io.toyproject.bookjeokclone.member.service;

import io.toyproject.bookjeokclone.member.model.dto.MemberRequest;
import io.toyproject.bookjeokclone.member.model.entity.Member;
import io.toyproject.bookjeokclone.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public Member create(MemberRequest request) {
        Member member = Member.create(request);
        return memberRepository.save(member);
    }

}
