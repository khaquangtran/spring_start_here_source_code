package org.example.spring_start_here;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.spring_start_here.services", "org.example.spring_start_here.proxies", "org.example.spring_start_here.repositories"})
public class ProjectConfiguration {
}
