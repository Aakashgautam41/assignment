package com.example.assignment.controller;

import com.example.assignment.model.Flowchart;
import com.example.assignment.service.FlowchartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/flowcharts")
public class FlowchartController {
    private final FlowchartService flowchartService;

    public FlowchartController(FlowchartService flowchartService) {
        this.flowchartService = flowchartService;
    }

    @PostMapping
    public ResponseEntity<Flowchart> createFlowchart(@RequestBody Flowchart flowchart) {
        return ResponseEntity.ok(flowchartService.createFlowchart(flowchart));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flowchart> getFlowchart(@PathVariable String id) {
        return flowchartService.getFlowchartById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Flowchart> updateFlowchart(
            @PathVariable String id,
            @RequestBody Flowchart flowchart) {
        return ResponseEntity.ok(flowchartService.updateFlowchart(id, flowchart));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFlowchart(@PathVariable String id) {
        flowchartService.deleteFlowchart(id);
        return ResponseEntity.noContent().build();
    }

}
