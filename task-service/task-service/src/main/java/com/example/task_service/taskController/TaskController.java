package com.example.task_service.taskController;


import com.example.task_service.TaskServiceApplication;
import com.example.task_service.taskDTO.TaskDTO;
import com.example.task_service.taskService.TaskService;
import com.example.task_service.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class TaskController {
    private TaskService taskService;
    private TaskServiceApplication taskServiceApplication;

    public TaskController(TaskServiceApplication taskServiceApplication, TaskService taskService) {
        this.taskServiceApplication = taskServiceApplication;
        this.taskService = taskService;
    }

    @GetMapping("task/process")
    public List<Task> process(@RequestParam("flightId") Long flightId) {
        return taskService.getByFlightId(flightId);

    }
    @PostMapping("/saveTask" )
    public TaskDTO saveEntity(@RequestBody TaskDTO taskDTO){
        return taskService.TaskToDTO(taskService.saveTask(taskDTO));
    }
    @PutMapping("/update")
    public TaskDTO update(@RequestBody TaskDTO taskDTO) {
        return taskService.TaskToDTO(taskService.updateTask(taskDTO));
    }
    @DeleteMapping("/remove/{id}")
    public long remove(@PathVariable Long id){
        taskService.deleteTask(id);
        return id;
    }
    @GetMapping("/{id}")
    public TaskDTO findByID(@PathVariable long id){
        return taskService.TaskToDTO(taskService.findTask(id));
    }


}

