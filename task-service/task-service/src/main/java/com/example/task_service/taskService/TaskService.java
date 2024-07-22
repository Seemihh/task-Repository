package com.example.task_service.taskService;

import com.example.task_service.task.Task;
import com.example.task_service.task.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TaskService {

    public static List<Task> getByFlightId(long flightId) {
        Task task1 = new Task();
        Task task2 = new Task();
        Task task3 = new Task();
        task1.setId(151);
        task2.setId(152);
        task3.setId(153);
        task1.setTitle("asd1");
        task2.setTitle("asd2");
        task3.setTitle("asd3");
        task1.setFlightId(1);
        task2.setFlightId(1);
        task3.setFlightId(2);
        List<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        List<Task> filterTasks = new ArrayList<>();
        for (Task task : taskList) {
            if (task.getFlightId() == flightId) {
                filterTasks.add(task);
            }
        }
        return filterTasks;
    }
    //task-service
}
