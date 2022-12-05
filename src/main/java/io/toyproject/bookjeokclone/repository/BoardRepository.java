package io.toyproject.bookjeokclone.repository;

import io.toyproject.bookjeokclone.model.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

    default Board getById(Long id){
        return this.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다."));
    }
}
