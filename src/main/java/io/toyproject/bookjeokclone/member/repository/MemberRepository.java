package io.toyproject.bookjeokclone.member.repository;

import io.toyproject.bookjeokclone.member.model.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
