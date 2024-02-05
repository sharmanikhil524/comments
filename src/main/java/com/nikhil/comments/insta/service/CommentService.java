package com.nikhil.comments.insta.service;



import com.nikhil.comments.insta.model.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getCommentsByImageId(Long imageId);

    List<Comment> getCommentsByUserId(Long userId);

    void deleteComment(Long commentId);
}
