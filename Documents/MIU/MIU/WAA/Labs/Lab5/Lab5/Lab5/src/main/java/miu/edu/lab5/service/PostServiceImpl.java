package miu.edu.lab5.service;


import miu.edu.lab5.domain.Post;
import miu.edu.lab5.dto.PostDto;
import miu.edu.lab5.util.ListMapper;
import miu.edu.lab5.repository.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepository postRepository;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    ListMapper<Post, PostDto> listMapperPostToDto;

    @Override
    public PostDto findById(long id) {
        return modelMapper.map(postRepository.findById(id).orElse(null), PostDto.class);
    }

    @Override
    public List<PostDto> findAll() {
        return (List<PostDto>) listMapperPostToDto.mapList((List<Post>) postRepository.findAll(),new PostDto());
    }

    @Override
    public PostDto save(PostDto postDto) {
        return modelMapper.map(postRepository.save(modelMapper.map(postDto, Post.class)), PostDto.class);
    }

    @Override
    public void delete(PostDto post) {
        postRepository.delete(modelMapper.map(post, Post.class));
    }

    @Override
    public PostDto update(long id, PostDto postDto) {
        postDto.setId(id);
        postRepository.save(modelMapper.map(postDto, Post.class));
        return postDto;
    }


}
