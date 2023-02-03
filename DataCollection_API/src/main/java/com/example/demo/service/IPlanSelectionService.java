package com.example.demo.service;

import com.example.demo.entity.PlanSelection;
import java.lang.Long;
import java.util.List;

public interface IPlanSelectionService {
	
	String savePlanSelection(PlanSelection planselection);

	void updatePlanSelection(PlanSelection planselection);

	void deletePlanSelection(Long id);

	PlanSelection getOnePlanSelection(Long id);

	List<PlanSelection> getAllPlanSelections();
}
