package com.example.demo.repo;

import com.example.demo.entity.IncomeDetails;
import java.lang.Long;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeDetailsRepository extends JpaRepository<IncomeDetails, Long> {
}
