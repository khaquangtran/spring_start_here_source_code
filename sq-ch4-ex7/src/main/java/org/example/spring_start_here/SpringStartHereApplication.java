package org.example.spring_start_here;

import org.example.spring_start_here.model.Comment;
import org.example.spring_start_here.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringStartHereApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var commentService = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Kha Tran");
        comment.setText("Demo comment");

        commentService.publishComment(comment);
    }
}
