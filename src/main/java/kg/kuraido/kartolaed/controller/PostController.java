package kg.kuraido.kartolaed.controller;


import kg.kuraido.kartolaed.model.Post;
import kg.kuraido.kartolaed.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("api/postService")
public class PostController {

    final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/save")
    public ArrayList<Post> submitPost(@RequestBody Post post){
        return postService.submitPostToDB(post);
    }

    @GetMapping("/getPost")
    public ArrayList<Post> getAllPost(){
        return postService.getPostFromDB();
    }

    @DeleteMapping("/delete/{postId}")
    public void deleteChosenPost(@PathVariable("postId") UUID postId){
        postService.deletePostFromDB(postId);
    }
}
