package com.spring.blogalex.repository;

import com.spring.blogalex.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogAlexRepository extends JpaRepository<Post,Long> {
}
