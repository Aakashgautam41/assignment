package com.example.assignment.model;

import jakarta.persistence.*;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "flowcharts")
public class Flowchart {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String name;

    @ElementCollection
    @CollectionTable(name = "flowchart_nodes", joinColumns = @JoinColumn(name = "flowchart_id"))
    private List<Node> nodes;

    @ElementCollection
    @CollectionTable(name = "flowchart_edges", joinColumns = @JoinColumn(name = "flowchart_id"))
    private List<Edge> edges;
}
