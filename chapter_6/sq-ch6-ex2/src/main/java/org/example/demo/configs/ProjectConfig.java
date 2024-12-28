package org.example.demo.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {
        "org.example.demo.services",
        "org.example.demo.aspects"
})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
