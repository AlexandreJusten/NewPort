package com.spring.blogalex.service;

import com.spring.blogalex.model.Post;

import java.util.List;

public interface BlogAlexService {

    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);
}
