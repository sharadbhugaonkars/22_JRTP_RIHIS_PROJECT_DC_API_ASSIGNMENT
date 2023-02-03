package com.example.demo.service;

import com.example.demo.entity.CreateCase;
import java.lang.Long;
import java.util.List;

public interface ICreateCaseService {
	String saveCreateCase(CreateCase createcase);

	void updateCreateCase(CreateCase createcase);

	void deleteCreateCase(Long id);

	CreateCase getOneCreateCase(Long id);

	List<CreateCase> getAllCreateCases();
}
