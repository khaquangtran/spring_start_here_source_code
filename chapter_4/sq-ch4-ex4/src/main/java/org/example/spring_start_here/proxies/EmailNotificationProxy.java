package org.example.spring_start_here.proxies;

import org.example.spring_start_here.model.Comment;
import org.springframework.stereotype.Component;

public class EmailNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
