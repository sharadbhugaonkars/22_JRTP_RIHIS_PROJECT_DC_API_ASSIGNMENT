package com.example.demo.serviceimpl;

import com.example.demo.entity.EducationDetails;
import com.example.demo.repo.EducationDetailsRepository;
import com.example.demo.service.IEducationDetailsService;
import java.lang.Long;
import java.lang.Override;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EducationDetailsServiceImpl implements IEducationDetailsService {
  @Autowired
  private EducationDetailsRepository repo;

  @Override
  @Transactional
  public String saveEducationDetails(EducationDetails educationdetails) {
     
	  repo.save(educationdetails);
	  
     return "Education Details Saved";
  }

  @Override
  @Transactional
  public void updateEducationDetails(EducationDetails educationdetails) {
    repo.save(educationdetails);
  }

  @Override
  @Transactional
  public void deleteEducationDetails(Long id) {
    repo.deleteById(id);
  }

  @Override
  @Transactional(
      readOnly = true
  )
  public EducationDetails getOneEducationDetails(Long id) {
    return repo.findById(id).get();
  }

  @Override
  @Transactional(
      readOnly = true
  )
  public List<EducationDetails> getAllEducationDetailss() {
    return repo.findAll();
  }
}
