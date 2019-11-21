package com.example.springaopplaying.aop.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class StartEndLog {
    private static final Logger logger = LoggerFactory.getLogger(StartEndLog.class);

    @Before("execution(* *..*ServiceA.*(..))")
    public void startLog(JoinPoint joinPoint) {
        logger.info("Start {}, time: {}", joinPoint.getSignature(), LocalDateTime.now());
    }

    @After("execution(* *..*ServiceA.*(..))")
    public void afterLog(JoinPoint joinPoint) {
        logger.info("End {}, time: {}", joinPoint.getSignature(), LocalDateTime.now());
    }
}
