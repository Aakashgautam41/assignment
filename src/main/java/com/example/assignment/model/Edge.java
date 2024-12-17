package com.example.assignment.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
class Edge {
    @Column(nullable = false)
    private String source;

    @Column(nullable = false)
    private String target;
}
