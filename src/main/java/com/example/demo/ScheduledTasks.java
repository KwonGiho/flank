package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by kwongiho on 2017. 5. 21..
 */
@Component

public class ScheduledTasks {

    @Scheduled(fixedRate = 500)
    public void reportCurrentTime() {

        //System.out.println("Testing successful ");
    }
}