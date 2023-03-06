package com.yugham.ind.mapper;


import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.yugham.ind.dto.EmployeeDTO;
import com.yugham.ind.model.Employee;

//@Mapper
@Mapper(componentModel = "spring")
//@org.mapstruct.Mapper

public interface EmployeeMapper {

	EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);

	    EmployeeDTO mapToEmployeeDTO(Employee emp);

	    Employee mapToEmployee(EmployeeDTO empDto);
	    List<EmployeeDTO> toEmployeeDTOs(Iterable<Employee> iterable);
}
