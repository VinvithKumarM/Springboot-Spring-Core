package com.vinvith.springcoredemo.rest;

import com.vinvith.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach myAnotherCoach;

   @Autowired
   public DemoController(@Qualifier("cricketCoach") Coach coach, @Qualifier("cricketCoach") Coach anotherCoach ){

       System.out.println("In Controller : "+getClass().getSimpleName());
       myCoach = coach;
       myAnotherCoach = anotherCoach;
   }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans : myCoach == anotherCoach, "+ (myCoach == myAnotherCoach);
    }
}

