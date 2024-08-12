package com.example.task_service.taskRepository;

import com.example.task_service.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByFlightId(long flightId);
}
