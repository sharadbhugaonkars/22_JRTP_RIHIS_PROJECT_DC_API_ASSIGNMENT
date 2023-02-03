package com.example.demo.service;

import com.example.demo.entity.EducationDetails;
import java.lang.Long;
import java.util.List;


public interface IEducationDetailsService {
	
	String saveEducationDetails(EducationDetails educationdetails);

	void updateEducationDetails(EducationDetails educationdetails);

	void deleteEducationDetails(Long id);

	EducationDetails getOneEducationDetails(Long id);

	List<EducationDetails> getAllEducationDetailss();
}
