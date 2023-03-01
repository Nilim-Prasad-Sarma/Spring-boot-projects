package com.te.springboot.dto;

import com.te.springboot.entity.EmployeeSecondaryInfo;

import lombok.Data;

@Data
public class EmployeeDto {
	private String empId;
	private String empName;
	private String empEmail;
	private String empPassword;
	private EmployeeSecondaryInfo secondaryInfo;
}
