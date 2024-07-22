package com.example.task_service.task;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class Task {

    private long id;
    private String title;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private long flightId;

}
