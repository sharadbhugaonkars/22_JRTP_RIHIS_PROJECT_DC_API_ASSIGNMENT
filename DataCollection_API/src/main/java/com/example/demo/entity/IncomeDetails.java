package com.example.demo.entity;

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
@Table(name="INCOME_DETAILS_TAB")

public class IncomeDetails {
	
	@Id
	private Long caseId;
	
	private Double monthSalIncome;
	
	private Double propertyIncome;
	
	private Double rentIncome;
	
	
}
