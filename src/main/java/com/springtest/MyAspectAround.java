package com.springtest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * Created by Маша on 20.10.2017.
 */
@Component
public class MyAspectAround {
    public void aspectAround (ProceedingJoinPoint joinPoint){
        System.out.println("Hi");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Bay");
    }
}
