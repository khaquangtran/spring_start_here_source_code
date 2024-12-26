package org.example.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {
        "org.example.main.services",
        "org.example.main.repositories",
})
public class ProjectConfig {
}
