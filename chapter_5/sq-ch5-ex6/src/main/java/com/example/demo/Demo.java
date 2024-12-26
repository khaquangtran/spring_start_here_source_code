package com.example.demo;

import com.example.demo.services.CommentService;
import com.example.demo.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs1 = context.getBean(CommentService.class);
        var cs2 = context.getBean(UserService.class);

        boolean b1 = cs1.getCommentRepository() == cs2.getCommentRepository();

        System.out.println(b1);
    }
}
