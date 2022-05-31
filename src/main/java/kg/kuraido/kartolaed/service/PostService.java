package kg.kuraido.kartolaed.service;

import kg.kuraido.kartolaed.model.Post;
import kg.kuraido.kartolaed.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Service
public class PostService {

    final PostRepo postRepo;
    public PostService(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    public ArrayList<Post> submitPostToDB(Post post){
        post.setPostId(UUID.randomUUID());
        post.setLikes(0);


        post.setDateCreated(new Timestamp(new Date().getTime()));
        postRepo.save(post);
        return getPostFromDB();
    }
    public ArrayList<Post> getPostFromDB(){
        return postRepo.findAll();
    }
    public void deletePostFromDB(UUID postId){
        postRepo.deleteById(postId);
    }
}
