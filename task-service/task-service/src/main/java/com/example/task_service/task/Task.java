package com.example.task_service.task;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Table(name = "Task")
@Entity
public class Task {
    @GeneratedValue(strategy = GenerationType.IDENTITY )
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

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public long getFlightId() {
        return flightId;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
