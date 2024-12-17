package com.example.assignment.controller;

import com.example.assignment.model.Flowchart;
import com.example.assignment.service.FlowchartService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/flowcharts")
@Tag(name = "Flowchart Endpoints", description = "APIs for managing flowcharts")
public class FlowchartController {
    private final FlowchartService flowchartService;

    public FlowchartController(FlowchartService flowchartService) {
        this.flowchartService = flowchartService;
    }

    @PostMapping
    @Operation(summary = "Create a new flowchart")
    public ResponseEntity<Flowchart> createFlowchart(@RequestBody Flowchart flowchart) {
        return ResponseEntity.ok(flowchartService.createFlowchart(flowchart));
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get flowchart by ID")
    public ResponseEntity<Flowchart> getFlowchart(@PathVariable String id) {
        return flowchartService.getFlowchartById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing flowchart")
    public ResponseEntity<Flowchart> updateFlowchart(
            @PathVariable String id,
            @RequestBody Flowchart flowchart) {
        return ResponseEntity.ok(flowchartService.updateFlowchart(id, flowchart));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a flowchart")
    public ResponseEntity<Void> deleteFlowchart(@PathVariable String id) {
        flowchartService.deleteFlowchart(id);
        return ResponseEntity.noContent().build();
    }

}
