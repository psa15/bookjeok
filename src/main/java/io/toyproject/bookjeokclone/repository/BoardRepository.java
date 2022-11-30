package io.toyproject.bookjeokclone.repository;

import io.toyproject.bookjeokclone.model.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
