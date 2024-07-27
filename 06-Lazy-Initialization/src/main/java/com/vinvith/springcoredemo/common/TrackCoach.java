package com.vinvith.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    public TrackCoach(){
        System.out.println("In Constructor : "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run everyday for 50 minutes";
    }
}
