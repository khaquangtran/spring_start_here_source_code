package org.example.demo.services;

import org.example.demo.models.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    final private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        this.logger.info("Publishing comment: " + comment.getText());
    }
}
