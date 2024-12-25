package org.example.demo;


import org.example.demo.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SqCh5Ex1Application {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs1 = context.getBean("commentService", CommentService.class);
        var cs2 = context.getBean("commentService", CommentService.class);

        boolean isSameObject = cs1 == cs2;

        System.out.println(isSameObject);
    }
}
