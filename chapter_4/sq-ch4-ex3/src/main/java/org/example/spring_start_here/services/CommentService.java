package org.example.spring_start_here.services;

import org.example.spring_start_here.model.Comment;
import org.example.spring_start_here.proxies.CommentNotificationProxy;
import org.example.spring_start_here.repositories.CommentRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private CommentNotificationProxy commentNotificationProxy;

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
