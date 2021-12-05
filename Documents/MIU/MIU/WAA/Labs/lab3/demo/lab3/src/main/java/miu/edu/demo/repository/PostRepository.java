package miu.edu.demo.repository;

import miu.edu.demo.domain.Post;

import java.util.List;

public interface PostRepository {
    public List<Post> findAll();
    public Post getById(long id);
}
