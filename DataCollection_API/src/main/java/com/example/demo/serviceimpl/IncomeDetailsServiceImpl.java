package com.example.demo.serviceimpl;

import com.example.demo.entity.IncomeDetails;
import com.example.demo.repo.IncomeDetailsRepository;
import com.example.demo.service.IIncomeDetailsService;
import java.lang.Long;
import java.lang.Override;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IncomeDetailsServiceImpl implements IIncomeDetailsService {
  @Autowired
  private IncomeDetailsRepository repo;

  @Override
  @Transactional
  public String saveIncomeDetails(IncomeDetails incomedetails) {
     repo.save(incomedetails);
     return null;
  }

  @Override
  @Transactional
  public void updateIncomeDetails(IncomeDetails incomedetails) {
    repo.save(incomedetails);
  }

  @Override
  @Transactional
  public void deleteIncomeDetails(Long id) {
    repo.deleteById(id);
  }

  @Override
  @Transactional(
      readOnly = true
  )
  public IncomeDetails getOneIncomeDetails(Long id) {
    return repo.findById(id).get();
  }

  @Override
  @Transactional(
      readOnly = true
  )
  public List<IncomeDetails> getAllIncomeDetailss() {
    return repo.findAll();
  }
}
