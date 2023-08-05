package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;


//whenevr i interact with db // @REPOSITORY

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	List<Employee> findByFirstName(String firstName);
	List<Employee> findByFirstNameAndLastName(String fname, String lname);
	List<Employee> findByFirstNameOrLastName(String fname, String lname);
	List<Employee> findByEmailOrderByFirstNameDesc(String email);

}
