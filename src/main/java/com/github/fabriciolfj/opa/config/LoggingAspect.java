package com.github.fabriciolfj.opa.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Aspect
@Component
public class LoggingAspect {

    @Before("@annotation(com.github.fabriciolfj.opa.core.LogMethod)")
    public void logMethodName(JoinPoint joinPoint) {
        final var method = joinPoint.getSignature().getName();
        final var params = Arrays.toString(joinPoint.getArgs());
        log.info("Method [ {} ] gets called with parameters {}", method, params);
    }
}
