package miu.edu.lab5.repository;

import miu.edu.lab5.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    @Override
    Optional<Post> findById(Long aLong);
}
