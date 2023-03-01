package com.te.springboot.service;

import com.te.springboot.dto.EmployeeDto;
import com.te.springboot.entity.EmployeePrimaryInfo;

public interface EmployeeService {
	
	public EmployeePrimaryInfo register(EmployeeDto employeeDto);
}
