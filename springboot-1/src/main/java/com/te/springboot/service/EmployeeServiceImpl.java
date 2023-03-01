package com.te.springboot.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springboot.dao.EmployeeDao;
import com.te.springboot.dto.EmployeeDto;
import com.te.springboot.entity.EmployeePrimaryInfo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;

	public EmployeePrimaryInfo register(EmployeeDto dto) {
		EmployeePrimaryInfo employeePrimaryInfo = new EmployeePrimaryInfo();


		BeanUtils.copyProperties(dto, employeePrimaryInfo);

		System.out.println(dto.getSecondaryInfo() + "--------->");
		dto.getSecondaryInfo().setPrimaryInfo(employeePrimaryInfo);
		return dao.save(employeePrimaryInfo);

	}

}
