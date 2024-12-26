package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.example.demo.services",
        "com.example.demo.repositories",
})
public class ProjectConfig {
}
