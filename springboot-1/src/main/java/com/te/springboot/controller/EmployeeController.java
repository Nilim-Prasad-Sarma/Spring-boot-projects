package com.te.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.dto.EmployeeDto;
import com.te.springboot.dto.ResponseDTO;
import com.te.springboot.entity.EmployeePrimaryInfo;
import com.te.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody EmployeeDto employeeDto) {
		EmployeePrimaryInfo register = service.register(employeeDto);
		if (register != null) {
			return new ResponseEntity<>(new ResponseDTO(false, "Employee successfully registered", register),
					HttpStatus.OK);
		} else {
			return new ResponseEntity<>(new ResponseDTO(true, "Something went wrong", register),
					HttpStatus.BAD_REQUEST);
		}
	}
}
