package com.nikhil.comments.insta.repository;



import com.nikhil.comments.insta.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByImageId(Long imageId);

    List<Comment> findByUserId(Long userId);
}
