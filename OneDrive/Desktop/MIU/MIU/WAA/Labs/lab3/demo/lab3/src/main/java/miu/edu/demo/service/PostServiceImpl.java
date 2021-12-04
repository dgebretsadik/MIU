package miu.edu.demo.service;

import miu.edu.demo.domain.Post;
import miu.edu.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepository postRepository;
    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post getById(long id) {
        return postRepository.getById(id);
    }

}
