package com.hackathon.ai_cron.services;

import org.springframework.stereotype.Service;

@Service
public class AIScheduleService {
    public String findFirstScheduleAndCreateWorkflow() {

        return "AI scheduler created!";
    }

    public String findNextScheduleAndUpdateWorkflowCron() {

        return "Workflow updated with next cron string!";
    }
}
