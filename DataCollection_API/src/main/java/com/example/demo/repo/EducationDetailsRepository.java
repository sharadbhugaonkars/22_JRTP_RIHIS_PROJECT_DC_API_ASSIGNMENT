package com.example.demo.repo;

import com.example.demo.entity.EducationDetails;
import java.lang.Long;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationDetailsRepository extends JpaRepository<EducationDetails, Long> {
}
