package com.hackathon.ai_cron.controllers;

import com.hackathon.ai_cron.services.AIScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedule")
public class SchedulingController {

    @Autowired
    AIScheduleService scheduleService;

    @PostMapping("/create")
    public String handleCronScheduleCreated(){
        return scheduleService.findFirstScheduleAndCreateWorkflow();
    }

    @PostMapping("/complete")
    public String handleWorkflowRunCompleted(){
        return scheduleService.findNextScheduleAndUpdateWorkflowCron();
    }
}
