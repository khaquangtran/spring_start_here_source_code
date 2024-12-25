package org.example.spring_start_here.proxies;

import org.example.spring_start_here.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
