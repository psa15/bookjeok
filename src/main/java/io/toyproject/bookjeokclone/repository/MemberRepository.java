package io.toyproject.bookjeokclone.repository;

import io.toyproject.bookjeokclone.model.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
