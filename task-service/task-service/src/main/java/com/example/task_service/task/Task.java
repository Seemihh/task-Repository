package com.example.task_service.task;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Table(name = "Task")
@Entity
public class Task {
    @Id
    @Column(name = "ID")
    private long id;
    @Column(name = "Title")
    private String title;
    @Column(name = "StartDate")
    private LocalDateTime startDate;
    @Column(name = "EndDate")
    private LocalDateTime endDate;
    @Column(name = "FlightID")
    private long flightId;

}
