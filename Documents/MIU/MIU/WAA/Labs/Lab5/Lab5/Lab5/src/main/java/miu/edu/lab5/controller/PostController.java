package miu.edu.lab5.controller;

import miu.edu.lab5.dto.PostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;
import miu.edu.lab5.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;
    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<PostDto> findAll(){
        return postService.findAll();
    }

    @GetMapping(value = "/{id}", headers = "X-API-VERSION=1")
    public EntityModel<PostDto> findPostV1(@PathVariable("id") long id){
        PostDto post = postService.findById(id);
        EntityModel<PostDto> postEntityModel = EntityModel.of(post);
        WebMvcLinkBuilder linkBuilder = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findAll());
        postEntityModel.add(linkBuilder.withRel("allPosts"));
        return postEntityModel;
    }

    @GetMapping(value = "/{id}", headers = "X-API-VERSION=2")
    public EntityModel<PostDto> findPostV2(@PathVariable("id") long id){
        PostDto post = postService.findById(id);
        EntityModel<PostDto> postEntityModel = EntityModel.of(post);
        WebMvcLinkBuilder linkBuilder = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findAll());
        postEntityModel.add(linkBuilder.withRel("allPosts"));
        return postEntityModel;
    }


    @PostMapping(consumes = "application/json")
    public EntityModel<PostDto> createPost(@RequestBody PostDto post){
        PostDto p = postService.save(post);
        EntityModel<PostDto> entityModel = EntityModel.of(p);
        WebMvcLinkBuilder findPostLink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findPostV1(p.getId()));
        WebMvcLinkBuilder findAllLink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findAll());
        entityModel.add(findPostLink.withRel("findPost"));
        entityModel.add(findAllLink.withRel("findAllPost"));
        return entityModel;
    }


    @DeleteMapping(value = "{id}")
    public void deletePost(@PathVariable("id") long id){
        PostDto post = postService.findById(id);
        postService.delete(post);
    }

    @PostMapping(path = "{id}", consumes = "application/json")
    public EntityModel<PostDto> updatePost(@PathVariable("id") long id, @RequestBody PostDto post){
        PostDto p = postService.update(id, post);
        EntityModel<PostDto> entityModel = EntityModel.of(p);
        WebMvcLinkBuilder findAllLink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findAll());
        entityModel.add(findAllLink.withRel("findAll"));
        return entityModel;
    }

}
