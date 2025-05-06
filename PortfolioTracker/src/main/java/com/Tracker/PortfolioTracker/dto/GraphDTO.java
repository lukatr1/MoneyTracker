package com.Tracker.PortfolioTracker.dto;

import com.Tracker.PortfolioTracker.entity.Expense;
import com.Tracker.PortfolioTracker.entity.Income;
import lombok.Data;

import java.util.List;

@Data
public class GraphDTO {

    private List<Expense> expenseList;

    private List<Income> incomeList;
}
