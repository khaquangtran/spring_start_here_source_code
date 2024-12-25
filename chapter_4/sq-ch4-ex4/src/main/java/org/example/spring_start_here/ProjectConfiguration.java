package org.example.spring_start_here;

import org.example.spring_start_here.proxies.CommentNotificationProxy;
import org.example.spring_start_here.proxies.EmailNotificationProxy;
import org.example.spring_start_here.repositories.CommentRepository;
import org.example.spring_start_here.repositories.DBCommentRepository;
import org.example.spring_start_here.services.CommentService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class ProjectConfiguration {
    @Bean
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailNotificationProxy();
    }

    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }

    @Bean
    public CommentService commentService(CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
        return new CommentService(commentRepository, commentNotificationProxy);
    }
}
