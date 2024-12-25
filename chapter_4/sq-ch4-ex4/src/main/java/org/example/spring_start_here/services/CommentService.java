package org.example.spring_start_here.services;

import org.example.spring_start_here.model.Comment;
import org.example.spring_start_here.proxies.CommentNotificationProxy;
import org.example.spring_start_here.repositories.CommentRepository;

public class CommentService {
    final private CommentRepository commentRepository;
    final private CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
