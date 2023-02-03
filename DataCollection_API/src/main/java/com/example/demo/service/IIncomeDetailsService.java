package com.example.demo.service;

import com.example.demo.entity.IncomeDetails;
import java.lang.Long;
import java.util.List;


public interface IIncomeDetailsService {
	String saveIncomeDetails(IncomeDetails incomedetails);

	void updateIncomeDetails(IncomeDetails incomedetails);

	void deleteIncomeDetails(Long id);

	IncomeDetails getOneIncomeDetails(Long id);

	List<IncomeDetails> getAllIncomeDetailss();
}
