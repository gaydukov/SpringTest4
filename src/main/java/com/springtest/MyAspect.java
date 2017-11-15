package com.springtest;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Маша on 19.10.2017.
 */
@Component("loger")

public class MyAspect {



    void start(){
        System.out.println("Start driver");
    }

    void finish(){
        System.out.println("Finish driver");
    }
}
