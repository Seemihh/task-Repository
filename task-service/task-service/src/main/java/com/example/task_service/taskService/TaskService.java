package com.example.task_service.taskService;

import com.example.task_service.task.Task;
import com.example.task_service.task.Task;
import com.example.task_service.taskDTO.TaskDTO;
import com.example.task_service.taskRepository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public  List<Task> getByFlightId(long flightId) {
            return taskRepository.findByFlightId(flightId);
    }
    public Task saveTask(TaskDTO taskDTO) {
        Task newTask = new Task();
        newTask.setId(taskDTO.getId());
        newTask.setTitle(taskDTO.getTitle());
        newTask.setStartDate(taskDTO.getStartDate());
        newTask.setEndDate(taskDTO.getEndDate());
        newTask.setFlightId(taskDTO.getFlightId());

        taskRepository.save(newTask);
        return newTask;
    }

    public Task findTask(long flightId) {
        Optional<Task> myTask = taskRepository.findById(flightId);
        return myTask.get();

    }

    public Task updateTask(TaskDTO taskDTO) {
        Optional<Task> optionalTask = taskRepository.findById(taskDTO.getId());
        if (optionalTask.isPresent()) {
            Task task = optionalTask.get();
            task.setTitle(taskDTO.getTitle());
            task.setStartDate(taskDTO.getStartDate());
            task.setEndDate(taskDTO.getEndDate());
            task.setFlightId(taskDTO.getFlightId());
            return taskRepository.save(task);

        } else {

            return null;
        }
    }
        public long deleteTask ( long task_Id){
            taskRepository.deleteById(task_Id);
            return task_Id;
        }
        public TaskDTO TaskToDTO(Task task){
        TaskDTO myTask = new TaskDTO();
        myTask.setId(task.getId());
        myTask.setEndDate(task.getEndDate());
        myTask.setStartDate(task.getStartDate());
        myTask.setFlightId(task.getFlightId());
        myTask.setTitle(task.getTitle());
        return myTask;
        }


    }

