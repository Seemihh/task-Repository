package com.example.task_service.taskController;


import com.example.task_service.TaskServiceApplication;
import com.example.task_service.taskService.TaskService;
import com.example.task_service.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class TaskController {
    @Autowired
    private TaskService TaskServicee;
    @Autowired
    private TaskServiceApplication taskServiceApplication;

    @GetMapping("task/process")
    public List<Task> process(@RequestParam("flightId") Long flightId) {
        return TaskService.getByFlightId(flightId);

    }

}

