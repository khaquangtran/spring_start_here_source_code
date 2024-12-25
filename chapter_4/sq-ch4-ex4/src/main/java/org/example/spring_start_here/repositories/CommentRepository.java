package org.example.spring_start_here.repositories;

import org.example.spring_start_here.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
