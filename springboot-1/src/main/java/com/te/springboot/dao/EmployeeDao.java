package com.te.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.te.springboot.entity.EmployeePrimaryInfo;

public interface EmployeeDao extends CrudRepository<EmployeePrimaryInfo, Integer> {
	public EmployeePrimaryInfo findByEmpId(String empId);
}
