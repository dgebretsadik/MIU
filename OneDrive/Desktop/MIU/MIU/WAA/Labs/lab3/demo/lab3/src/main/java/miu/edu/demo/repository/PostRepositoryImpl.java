package miu.edu.demo.repository;

import miu.edu.demo.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PostRepositoryImpl implements PostRepository{
    List<Post> post = new ArrayList<>(Arrays.asList(

            new Post(1,"The Brothers Karamazov", "Philosophical Fiction Novel", "Fyodor Dostoevsky"),
            new Post(2, "The Ethics", "Philosophical Treatise", "Baruch Spinoza")

    ));
    @Override
    public List<Post> findAll() {
        return post;
    }

    @Override
    public Post getById(long id) {
        return post.stream().filter(x->x.getId() == id).findFirst().orElse(null);
    }
}
