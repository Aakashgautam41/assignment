package com.example.assignment.service;

import com.example.assignment.model.Flowchart;
import com.example.assignment.repository.FlowchartRepository;

import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class FlowchartService {
    private final FlowchartRepository flowchartRepository;

    public FlowchartService(FlowchartRepository flowchartRepository) {
        this.flowchartRepository = flowchartRepository;
    }

    public Flowchart createFlowchart(Flowchart flowchart) {
        return flowchartRepository.save(flowchart);
    }

    public Optional<Flowchart> getFlowchartById(String id) {
        return flowchartRepository.findById(id);
    }

    public Flowchart updateFlowchart(String id, Flowchart updatedFlowchart) {
        return flowchartRepository.findById(id)
                .map(existingFlowchart -> {
                    existingFlowchart.setName(updatedFlowchart.getName());
                    existingFlowchart.setNodes(updatedFlowchart.getNodes());
                    existingFlowchart.setEdges(updatedFlowchart.getEdges());
                    return flowchartRepository.save(existingFlowchart);
                })
                .orElseThrow(() -> new RuntimeException("Flowchart not found"));
    }

    public void deleteFlowchart(String id) {
        flowchartRepository.deleteById(id);
    }

}