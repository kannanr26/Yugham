package com.yugham.ind.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yugham.ind.model.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long> {
	
}