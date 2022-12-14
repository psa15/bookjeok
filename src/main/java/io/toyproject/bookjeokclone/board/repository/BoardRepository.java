package io.toyproject.bookjeokclone.board.repository;

import io.toyproject.bookjeokclone.board.model.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

    default Board getById(Long id){
        return this.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다."));
    }
}
