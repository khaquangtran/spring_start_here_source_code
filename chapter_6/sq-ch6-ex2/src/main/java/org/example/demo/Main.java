package org.example.demo;

import org.example.demo.configs.ProjectConfig;
import org.example.demo.models.Comment;
import org.example.demo.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        String value = commentService.publishComment(comment);
        System.out.println(value);
    }
}
