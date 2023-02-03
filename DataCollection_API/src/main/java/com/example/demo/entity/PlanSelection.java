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
@Table(name="PLAN_SELECTION_TAB")
public class PlanSelection {
    @Id
    private Long caseId;
	
	private String planName;
	
	}
