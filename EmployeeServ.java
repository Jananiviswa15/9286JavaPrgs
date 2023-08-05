package com.example.demo.EmpservInter;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeServ {

	Employee saveEmp(Employee emp);
	List<Employee>  getEmpsFromDb();
	Employee getEmployeeById(int empId);
	Employee updateEmpDetails(Employee emp, int empId);
	void deleteEmpById(int empId);
}
