package com.vinvith.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    public BaseballCoach(){
        System.out.println("In Constructor : "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice batting for 30 minutes";
    }
}
