package org.example.demo.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Aspect
@Component
public class LoggingAspect {
    final private java.util.logging.Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* org.example.demo.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        this.logger.info("Method will execute");

        joinPoint.proceed();

        this.logger.info("Method executed");
    }
}