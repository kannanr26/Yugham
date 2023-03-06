package com.yugham.ind.service;

import java.util.List;
import java.util.Optional;

import com.yugham.ind.dto.EmployeeDTO;

public interface EmployeeService  {

	Optional<EmployeeDTO> addEmployee(EmployeeDTO empDto);

	List<EmployeeDTO> getAllEmployee();

}
