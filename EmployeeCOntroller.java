package com.example.demo.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeServiceImpl;
/*
 * localhost:8080/edubridge.com/readAllEmp
 * localhost:8080/edubridge.com/updateEmp/89
 */

/*@COntroller
@Req*/
@RestController
@RequestMapping("/edubridge.com")

//handle all the req that start with edubridge
public class EmployeeCOntroller {

	//no need to add autowired annotation
	//whenever there is only one attr injection is performed without annotation
	//perofermed injection here is CI
	public EmployeeServiceImpl empServ;
	
	
	
	public EmployeeCOntroller(EmployeeServiceImpl empServ) {
		this.empServ = empServ;
	}


	@PostMapping("/saveEmp")
	/*@requestBody --> {
	   "firstName" : "janani",
	   "lastName" : "viswa",
	   "email" : "janani@123"
	}   --> emp*/
	public ResponseEntity<Employee> saveEmp(@RequestBody Employee emp){
		return new ResponseEntity<Employee>(empServ.saveEmp(emp), HttpStatus.CREATED);
	}
	
	
	@PutMapping("/updateEmp/{empId}")
	public ResponseEntity<Employee> updateEmpDetailsById(@PathVariable("empId") int id,
			@RequestBody Employee emp){
		return new ResponseEntity<Employee>(empServ.updateEmpDetails(emp, id), HttpStatus.OK);
		
	}
	@GetMapping("/readAllEmp")
	public List<Employee> getAllEmps(){
		return  empServ.getEmpsFromDb();
	}
	
	
	@GetMapping("readForEmail/{email}")
	public List<Employee> getEmpsByEmailId(@PathVariable("email") String email){
		return  empServ.getEmpsRecByEmail(email);
	}
	
	
	@GetMapping("/readByFirstAndLast/{fname}/{lname}")
	public List<Employee> getEmpsByNames(@PathVariable("fname") String fname,@PathVariable("lname") String lname){
		return  empServ.getEmpsRecByNames(fname, lname);
	}
	
//	@GetMapping("/readAllEmpWithFirstName/{name}")
//	public List<Employee> getAllEmpsByFirstName(@PathVariable("name") String fname){
//		return  empServ.getEmpsRecByFirstName(fname);
//	}
	//localhost:8080/edubridge.com/readEmp/5
	@GetMapping("/readEmp/{id}")
	public ResponseEntity<Employee>  getEmployeeById(@PathVariable("id")  int empId){
		return new ResponseEntity<Employee>(empServ.getEmployeeById(empId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public void  deleteEmployeeById(@PathVariable("id")  int empId){
		empServ.deleteEmpById(empId);
		//return new ResponseEntity<String>("deleted successfully", HttpStatus.OK);
	}
}
