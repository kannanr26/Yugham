package com.yugham.ind.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yugham.ind.dto.EmployeeDTO;
import com.yugham.ind.service.EmployeeService;

@RestController
@RequestMapping("yugham")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	@GetMapping("/getemployees")
	public ResponseEntity<Object> getEmployee(){
		List<EmployeeDTO> empLst=empService.getAllEmployee();
		
		return ResponseEntity.ok(empLst);
	}

	@PostMapping("/addemployee")
	public ResponseEntity<Object> addEmployee(@RequestBody EmployeeDTO empDto){
		
		Optional<EmployeeDTO> emp= empService.addEmployee(empDto);
	
		return ResponseEntity.ok(emp);
	}
	
}
