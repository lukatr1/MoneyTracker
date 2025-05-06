package com.Tracker.PortfolioTracker.services.expense;

import com.Tracker.PortfolioTracker.dto.ExpenseDTO;
import com.Tracker.PortfolioTracker.entity.Expense;

import java.util.List;

public interface ExpenseService {

    Expense postExpense(ExpenseDTO expenseDTO);

    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);

    Expense updateExpense(Long id, ExpenseDTO expenseDTO);

    void deleteExpense(Long id);

}
