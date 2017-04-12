package com.lbibera.tradebutler.datacore.util.logging;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Aspect
@Component
@Log
public class RestRepositoryMonitor {

    @Before("execution(* com.lbibera..*RESTRepository.*(..))")
    public void logBeforeMethodInvocation(JoinPoint joinPoint) {
        log.config(methodParamLog(joinPoint));
    }

    private Supplier<String> methodParamLog(JoinPoint joinPoint) {
        return () -> String.format("Method: %s | Parameters: %s", joinPoint.getSignature(), joinPoint.getArgs());
    }

    @AfterReturning(value = "execution(* com.lbibera..*RESTRepository.*(..))", returning = "returnValue")
    public void logServiceAccess(JoinPoint joinPoint, Object returnValue) {
        log.config(methodReturnLog(joinPoint, returnValue));
    }

    private Supplier<String> methodReturnLog(JoinPoint joinPoint, Object returnValue) {
        return () -> String.format("Method: %s | Return: %s", joinPoint.getSignature(), returnValue);
    }

}
