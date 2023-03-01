package com.te.springboot.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class EmployeeSecondaryInfo {
	@Id
	private String panNo;
	private String fatherName;
	private String motherName;
	private String aadharNo;
	@OneToOne(cascade = CascadeType.ALL)
	@JsonBackReference
	private EmployeePrimaryInfo primaryInfo;

}
