package com.lbibera.tradebutler.datacore.util.logging;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Aspect
@Component
@Log
public class RestRepositoryMonitor {

    @Autowired
    ObjectMapper objectMapper;

    @Before("execution(* com.lbibera..*RestRepository.*(..))")
    public void logBeforeMethodInvocation(JoinPoint joinPoint) {
        log.config(methodParamLog(joinPoint));
    }

    @AfterReturning(value = "execution(* com.lbibera..*RestRepository.*(..))", returning = "returnValue")
    public void logServiceAccess(JoinPoint joinPoint, Object returnValue) {
        log.config(methodReturnLog(joinPoint, returnValue));
    }

    private Supplier<String> methodParamLog(JoinPoint joinPoint) {
        return () -> String.format("Method: %s <--IN--- Parameters: %s", joinPoint.getSignature(), Arrays.stream(joinPoint.getArgs()).map(a -> a.getClass() + ":" + a.toString()).collect(Collectors.joining(", ")));
    }

    private Supplier<String> methodReturnLog(JoinPoint joinPoint, Object returnValue) {
        return () -> {
            try {
                return String.format("Method: %s ---OUT--> Return: %s", joinPoint.getSignature(), objectMapper.writeValueAsString(returnValue));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                return null;
            }
        };
    }

}
