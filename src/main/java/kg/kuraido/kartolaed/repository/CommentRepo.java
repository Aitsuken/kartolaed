package kg.kuraido.kartolaed.repository;

import kg.kuraido.kartolaed.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface CommentRepo extends JpaRepository<Comment, UUID> {
    ArrayList<Comment> findAllByPostId(UUID postId);

}
