package org.example.spring_start_here;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(basePackages = {
        "org.example.spring_start_here.services",
        "org.example.spring_start_here.proxies",
        "org.example.spring_start_here.repositories",
})
public class ProjectConfiguration {
}
