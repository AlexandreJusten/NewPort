package com.spring.blogalex.controller;

import com.spring.blogalex.model.Post;
import com.spring.blogalex.service.BlogAlexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogAlexController {

    @Autowired
    BlogAlexService blogAlexService;

    @RequestMapping(value = "posts",method = RequestMethod.GET)
    public ModelAndView getPosts(){
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = blogAlexService.findAll();
        mv.addObject("posts",posts);
        return mv;
    }

}
