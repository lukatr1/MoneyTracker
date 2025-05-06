package com.Tracker.PortfolioTracker.controller;

import com.Tracker.PortfolioTracker.dto.GraphDTO;
import com.Tracker.PortfolioTracker.services.stats.StatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stats")
@RequiredArgsConstructor
@CrossOrigin("*")
public class StatsController {

    private final StatsService statsService;

    // get data to visualize with graph
    // ToDO: add graph implementation when UI is ready
    @GetMapping("/chart")
    public ResponseEntity<GraphDTO> getChartDetails() {
        return ResponseEntity.ok(statsService.getGraph());
    }

    // get statistical summary of the data
    @GetMapping
    public ResponseEntity<?> getStats() {
        return ResponseEntity.ok(statsService.getStats());
    }
}
