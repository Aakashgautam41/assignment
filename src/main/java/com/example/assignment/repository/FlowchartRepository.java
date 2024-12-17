package com.example.assignment.repository;

import com.example.assignment.model.Flowchart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowchartRepository extends JpaRepository<Flowchart, String> {
}