package com.jungle.week13.board.repository;

import com.jungle.week13.board.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Post, Long> {
}
