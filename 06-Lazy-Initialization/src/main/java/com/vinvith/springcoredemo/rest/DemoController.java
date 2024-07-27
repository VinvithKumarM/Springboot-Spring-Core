package com.vinvith.springcoredemo.rest;

import com.vinvith.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

   @Autowired
   public DemoController(@Qualifier("cricketCoach") Coach coach){

       System.out.println("In Controller : "+getClass().getSimpleName());
       myCoach = coach;
   }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
