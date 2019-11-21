package com.example.springaopplaying.aop.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class StartEndLog {
    @Before("execution(* *..*ServiceA.*(..))")
    public void startLog(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature() + " 開始: " + LocalDateTime.now());
    }

    @After("execution(* *..*ServiceA.*(..))")
    public void afterLog(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature() + " 終了: " + LocalDateTime.now());
    }
}
