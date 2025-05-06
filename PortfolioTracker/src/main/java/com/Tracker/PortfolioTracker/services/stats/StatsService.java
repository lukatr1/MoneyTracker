package com.Tracker.PortfolioTracker.services.stats;


import com.Tracker.PortfolioTracker.dto.GraphDTO;
import com.Tracker.PortfolioTracker.dto.StatsDTO;

public interface StatsService {

    GraphDTO getGraph();

    StatsDTO getStats();

}
