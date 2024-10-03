package com.epravidi.Courses.api.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "submissions")
@Data
@NoArgsConstructor
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "assignment_id")
    private Assignment assignment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "submission_date", nullable = false, updatable = false)
    private Timestamp submissionDate;

    @Column(name = "grade", precision = 5, scale = 2)  // Specify precision and scale
    private BigDecimal grade;  // Change to BigDecimal for DECIMAL(5,2)

    @Column(columnDefinition = "TEXT")
    private String feedback;

    @PrePersist
    protected void onCreate() {
        submissionDate = new Timestamp(System.currentTimeMillis());
    }

    
}
