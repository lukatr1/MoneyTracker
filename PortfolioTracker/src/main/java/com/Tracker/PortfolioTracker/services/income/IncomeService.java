package com.Tracker.PortfolioTracker.services.income;


import com.Tracker.PortfolioTracker.dto.IncomeDTO;
import com.Tracker.PortfolioTracker.entity.Income;

import java.util.List;

public interface IncomeService {

    Income postIncome(IncomeDTO incomeDTO);

    List<IncomeDTO> getAllIncomes();

    Income UpdateIncome(Long id, IncomeDTO incomeDTO);

    IncomeDTO getIncomeById(Long id);

}
