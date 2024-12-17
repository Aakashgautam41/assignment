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
class Node {
    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String label;

}
