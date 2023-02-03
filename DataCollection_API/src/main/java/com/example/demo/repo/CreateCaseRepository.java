package com.example.demo.repo;

import com.example.demo.entity.CreateCase;
import java.lang.Long;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreateCaseRepository extends JpaRepository<CreateCase, Long> {
}
