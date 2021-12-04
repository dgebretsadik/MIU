package miu.edu.lab5.service;

import miu.edu.lab5.dto.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PostService {
    public PostDto findById(long id);
    public List<PostDto> findAll();
    public PostDto save(PostDto post);
    public void delete(PostDto post);
    public PostDto update(long id, PostDto post);
}
