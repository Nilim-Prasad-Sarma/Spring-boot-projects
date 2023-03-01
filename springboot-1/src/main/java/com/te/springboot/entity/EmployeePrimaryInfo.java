package com.te.springboot.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class EmployeePrimaryInfo {

	@Id
	private String empId;
	private String empName;
	private String empEmail;
	private String empPassword;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "primaryInfo")
	@JsonManagedReference
	private EmployeeSecondaryInfo secondaryInfo;
}
