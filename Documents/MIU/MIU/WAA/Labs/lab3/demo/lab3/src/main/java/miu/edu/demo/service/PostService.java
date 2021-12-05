package miu.edu.demo.service;

import miu.edu.demo.domain.Post;

import java.util.List;

public interface PostService {
    public List<Post> findAll();
    public Post getById(long id);
}
