package com.example.demo.repo;

import com.example.demo.entity.KidsDetails;
import java.lang.Long;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KidsDetailsRepository extends JpaRepository<KidsDetails, Long> {
}
