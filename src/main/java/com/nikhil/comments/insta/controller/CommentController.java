package com.nikhil.comments.insta.controller;


import com.nikhil.comments.insta.model.Comment;
import com.nikhil.comments.insta.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/image/{imageId}")
    public List<Comment> getCommentsByImageId(@PathVariable Long imageId) {
        return commentService.getCommentsByImageId(imageId);
    }

    @GetMapping("/user/{userId}")
    public List<Comment> getCommentsByUserId(@PathVariable Long userId) {
        return commentService.getCommentsByUserId(userId);
    }

    @DeleteMapping("/{commentId}")
    public void deleteComment(@PathVariable Long commentId) {
        commentService.deleteComment(commentId);
    }
}
