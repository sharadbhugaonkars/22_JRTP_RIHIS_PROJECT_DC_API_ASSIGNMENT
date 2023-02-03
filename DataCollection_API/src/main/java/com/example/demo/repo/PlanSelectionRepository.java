package com.example.demo.repo;

import com.example.demo.entity.PlanSelection;
import java.lang.Long;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanSelectionRepository extends JpaRepository<PlanSelection, Long> {
}
