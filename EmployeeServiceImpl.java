package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EmpservInter.EmployeeServ;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeServ{

	EmployeeRepo empRepo;

	public EmployeeServiceImpl(EmployeeRepo empRepo) {
		this.empRepo = empRepo;
	}

	public Employee saveEmp(Employee emp) {
		return empRepo.save(emp);  //
	}

	@Override
	public List<Employee> getEmpsFromDb() {
		return empRepo.findAll();  
	}

	@Override//5
	public Employee getEmployeeById(int empId) { //23
		Optional<Employee> emp = empRepo.findById(empId);  //null , or it can 5tg person rec
		if(emp.isPresent()) {
			return emp.get();
		}
		else {
			return null;
		}
	}

	@Override
	public Employee updateEmpDetails(Employee newVal, int empId) {

		Optional<Employee> emp = empRepo.findById(empId);
		if(emp.isPresent()) {
			Employee existingEmp = emp.get();  //'2', 'mny@123', 'abc', 'xyz'

			existingEmp.setFirstName(newVal.getFirstName());
			existingEmp.setLastName(newVal.getLastName());
			empRepo.save(existingEmp);
			return existingEmp;
		}
		else {
			return null;
		}
	}

	@Override
	public void deleteEmpById(int empId) {
		Optional<Employee> emp = empRepo.findById(empId);
		if(emp.isPresent()) {
			empRepo.deleteById(empId);
		}	
	}

	public List<Employee> getEmpsRecByEmail(String email) {
		return empRepo.findByEmailOrderByFirstNameDesc(email);
		
	}

	public List<Employee> getEmpsRecByNames(String fname, String lname) {
		
		return empRepo.findByFirstNameOrLastName(fname, lname);
	}
}