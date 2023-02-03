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
@Table(name="KIDS_DETAILS_TAB")

public class KidsDetails {
	@Id
	private Long caseId;
	
	private String kidName;
	
	private Integer kidAge;
	
	private Long kidSsn;
	
	}
