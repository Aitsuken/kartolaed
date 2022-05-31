package kg.kuraido.kartolaed.controller;

import kg.kuraido.kartolaed.model.Comment;
import kg.kuraido.kartolaed.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("/api/comment")
public class CommentController {

    final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/save")
    public Comment save(@RequestBody Comment comment){
        return commentService.save(comment);
    }

    @GetMapping("/getAll/{postId})")
    public ArrayList<Comment> getAll(@PathVariable("postId") UUID postId){
        return commentService.getAll(postId);
    }
}
