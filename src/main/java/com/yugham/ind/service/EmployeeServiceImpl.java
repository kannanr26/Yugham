package com.yugham.ind.service;

import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yugham.ind.dto.EmployeeDTO;
import com.yugham.ind.mapper.EmployeeMapper;
import com.yugham.ind.repo.EmployeeRepo;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper empMapper;

	@Autowired
	private EmployeeRepo empRepo;
	@Override
	public Optional<EmployeeDTO> addEmployee(EmployeeDTO empDto) {
		// TODO Auto-generated method stub
		
		
		return Optional.of(empMapper.mapToEmployeeDTO(  empRepo.save(empMapper.mapToEmployee(empDto))));
	}
	@Override
	public List<EmployeeDTO> getAllEmployee() {
		// TODO Auto-generated method stub
	//	return   StreamSupport.stream(Spliterators.spliteratorUnknownSize(empRepo.findAll(), Spliterator.ORDERED), false)   .collect(Collectors.toList());
	return empMapper.toEmployeeDTOs(empRepo.findAll());
	}
}
