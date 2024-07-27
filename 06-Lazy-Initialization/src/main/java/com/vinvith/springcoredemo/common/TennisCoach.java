package com.vinvith.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach {
    public TennisCoach(){
        System.out.println("In Constructor : "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice backend volley for 40 minutes";
    }
}
