package org.example.main;


import org.example.main.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = context.getBean(CommentService.class);
        System.out.println("After retrieving the ComponentService");
    }
}
