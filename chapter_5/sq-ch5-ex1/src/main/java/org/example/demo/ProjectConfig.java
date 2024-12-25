package org.example.demo;

import org.example.demo.services.CommentService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class ProjectConfig {
    @Bean
    public CommentService commentService() {
        // instruct Spring to create this singleton bean
        // and pass it into the context
        return new CommentService();
    }
}
