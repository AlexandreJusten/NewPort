package com.spring.blogalex.service.serviceImplement;

import com.spring.blogalex.model.Post;
import com.spring.blogalex.repository.BlogAlexRepository;
import com.spring.blogalex.service.BlogAlexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogAlexServiceImplement implements BlogAlexService {

    @Autowired
    BlogAlexRepository blogAlexRepository;

    @Override
    public List<Post> findAll() {
        return blogAlexRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return blogAlexRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return blogAlexRepository.save(post);
    }
}
