package com.yugham.ind.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;

import lombok.Data;
import lombok.RequiredArgsConstructor;
@Entity
@Data

@RequiredArgsConstructor
public class Employee {

	@Id
	@GeneratedValue
	
	private long id;
	private String firstName;
	private String lastName;
	
}