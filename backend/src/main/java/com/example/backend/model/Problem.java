package com.example.backend.model;

import com.example.judge.common.enums.Difficulty;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "problems")
public class Problem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 100, nullable = false)
    String title;

    @Column(name = "description")
    String description;

    @Column(name = "difficulty", nullable = false)
    Difficulty difficulty;

    @Column(name = "time_limit_ms", nullable = false)
    Integer timeLimitMs;

    @Column(name = "memory_limit_mb", nullable = false)
    Integer memoryLimitMb;

    @OneToMany(mappedBy = "problem")
    List<TestCase> testCases;
}
