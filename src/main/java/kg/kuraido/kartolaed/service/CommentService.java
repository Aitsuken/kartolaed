package kg.kuraido.kartolaed.service;

import kg.kuraido.kartolaed.model.Account;
import kg.kuraido.kartolaed.model.Comment;
import kg.kuraido.kartolaed.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Service
public class CommentService {
    @Autowired
    CommentRepo commentRepo;

    @Autowired
    AccountService accountService;
    public Comment save(Comment comment){

        comment.setId(UUID.randomUUID());
        comment.setDateCreated(new Timestamp(new Date().getTime()));
        return commentRepo.save(comment);
    }

    public ArrayList<Comment> getAll(UUID postId){
        return commentRepo.findAllByPostId(postId);
    }
}
