package org.example.main;


import org.example.main.services.CommentService;
import org.example.main.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1 = context.getBean(CommentService.class);
        var s2 = context.getBean(UserService.class);

        boolean isSameObject = s1.getCommentRepository() == s2.getCommentRepository();

        System.out.println(isSameObject);
    }
}
