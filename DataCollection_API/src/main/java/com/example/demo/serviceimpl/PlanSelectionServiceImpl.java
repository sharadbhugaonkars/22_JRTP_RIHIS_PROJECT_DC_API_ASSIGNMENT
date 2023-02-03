package com.example.demo.serviceimpl;

import com.example.demo.entity.PlanSelection;
import com.example.demo.repo.PlanSelectionRepository;
import com.example.demo.service.IPlanSelectionService;
import java.lang.Long;
import java.lang.Override;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlanSelectionServiceImpl implements IPlanSelectionService {
  @Autowired
  private PlanSelectionRepository repo;

  @Override
  @Transactional
  public String savePlanSelection(PlanSelection planselection) {
     repo.save(planselection);
     
     return "Selected Plan Saved";
  }

  @Override
  @Transactional
  public void updatePlanSelection(PlanSelection planselection) {
    repo.save(planselection);
  }

  @Override
  @Transactional
  public void deletePlanSelection(Long id) {
    repo.deleteById(id);
  }

  @Override
  @Transactional(
      readOnly = true
  )
  public PlanSelection getOnePlanSelection(Long id) {
    return repo.findById(id).get();
  }

  @Override
  @Transactional(
      readOnly = true
  )
  public List<PlanSelection> getAllPlanSelections() {
    return repo.findAll();
  }
}
