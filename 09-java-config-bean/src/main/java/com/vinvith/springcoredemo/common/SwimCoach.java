package com.vinvith.springcoredemo.common;


public class SwimCoach implements Coach{
    public SwimCoach(){
        System.out.println("In Constructor : "+getClass().getSimpleName());
    }
    
    @Override
    public String getDailyWorkout() {
        return "Swim everyday for 60 minutes";
    }
}
