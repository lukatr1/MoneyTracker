package com.Tracker.PortfolioTracker.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ExpenseDTO {

    // maybe rather Integer?
    private Long id;

    private String title;

    private String description;

    private String category;

    private LocalDate date;

    private Integer amount;

}
