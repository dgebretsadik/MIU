package miu.edu.demo.controller;

import miu.edu.demo.domain.Post;
import miu.edu.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping
    public @ResponseBody List<Post> getAllPost(){
        return postService.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Post getById(@PathVariable("id") long id){
        return postService.getById(id);
    }
}
