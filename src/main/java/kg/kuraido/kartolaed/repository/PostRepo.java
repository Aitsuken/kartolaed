package kg.kuraido.kartolaed.repository;

import kg.kuraido.kartolaed.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface PostRepo extends JpaRepository<Post, UUID> {
    ArrayList<Post>  findAll();
    //Post save(Post post);
}
