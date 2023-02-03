package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="EDUCATION_DETAILS_TAB")
public class EducationDetails {
	
	@Id
	private Long caseId;
	
	private String highestDegree;
	
	private String universityName;
	
	private LocalDate graduationYear;
	
	

}
