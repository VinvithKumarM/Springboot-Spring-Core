package com.vinvith.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("In Constructor : "+getClass().getSimpleName());
    }

    //Define our init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("MyStartup method");
    }
    //Define our destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("MyCleanup method");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 20 minutes";
    }
}
