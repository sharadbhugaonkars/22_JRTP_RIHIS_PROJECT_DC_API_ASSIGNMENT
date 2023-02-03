package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.CreateCase;
import com.example.demo.repo.CreateCaseRepository;
import com.example.demo.service.ICreateCaseService;


@Service
public class CreateCaseServiceImpl implements ICreateCaseService {
  @Autowired
  private CreateCaseRepository repo;

  @Override
  @Transactional
  public String saveCreateCase(CreateCase createcase) {
    repo.save(createcase);
    return null;
  }

  @Override
  @Transactional
  public void updateCreateCase(CreateCase createcase) {
    repo.save(createcase);
  }

  @Override
  @Transactional
  public void deleteCreateCase(Long id) {
    repo.deleteById(id);
  }

  @Override
  @Transactional(
      readOnly = true
  )
  public CreateCase getOneCreateCase(Long id) {
    return repo.findById(id).get();
  }

  @Override
  @Transactional(
      readOnly = true
  )
  public List<CreateCase> getAllCreateCases() {
    return repo.findAll();
  }
}
