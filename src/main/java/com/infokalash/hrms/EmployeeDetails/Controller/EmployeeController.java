package com.infokalash.hrms.EmployeeDetails.Controller;
import java.util.List;
import java.util.Optional;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
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

import com.infokalash.hrms.EmployeeDetails.EmployeeService.EmployeeServiceImp;
import com.infokalash.hrms.EmployeeDetails.Model.DeletedEmployeeModel;
import com.infokalash.hrms.EmployeeDetails.Model.EmployeeModel;
import com.infokalash.hrms.EmployeeDetails.Repository.EmployeeRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping("/employeeDetails")
@Api(value = "EmployeeController", description = "Operations pertaining to employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImp service;
	
//	@ApiOperation(value = "new employees", response = EmployeeModel.class)
	@PostMapping("/CreateNewEmployee")
	public ResponseEntity<EmployeeModel> create(@RequestBody EmployeeModel employee) {
		EmployeeModel newemployee=service.addEmployee(employee);
		return new  ResponseEntity<>(newemployee, HttpStatus.CREATED);
	}
	
//	@ApiOperation(value = "Get all Employees", response = List.class)
	@GetMapping("/getAllEmployeeDetails")
	public ResponseEntity<List<EmployeeModel>> getAllEmployeeDetails() {
		List<EmployeeModel> employee=service.getAllEmployees();
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}
	
//	@ApiOperation(value = "Get all employees by Id", response = Optional.class)
	@GetMapping("/getSingleEmployeeDetails/{id}")
	public ResponseEntity<Optional<EmployeeModel>> getEmployee(@PathVariable Long id){
		Optional<EmployeeModel> emp=service.getEmployee(id);
		return new ResponseEntity<>(emp,HttpStatus.OK);
	}
	
//	@ApiOperation(value = "Get all employee by firstname", response = List.class)
	@GetMapping("/getEmployeeDetailsByFirstName/{firstName}")
	public ResponseEntity<List<EmployeeModel>> getEmployee(@PathVariable String firstName){
		List<EmployeeModel> nameEmp=service.getEmployeeName(firstName);
		return new ResponseEntity<>(nameEmp,HttpStatus.OK);
	}
	
//	@ApiOperation(value = "Get employees by employee active status", response = List.class)
	@GetMapping("/getEmployeeDetailsByEmployeeActiveStatus/{empActiveStatus}")
	public ResponseEntity<List<EmployeeModel>> getActiveStatus(@PathVariable boolean empActiveStatus){
		List<EmployeeModel> emp=service.getEmployeeActiveStatus(empActiveStatus);
			return new ResponseEntity<>(emp,HttpStatus.OK);
	}
	
//	@ApiOperation(value = "Get all employees by lastupdateduser", response = List.class)
	@GetMapping("/getEmployeeByLastupdateduser/{lastUpdatedUser}")
	public ResponseEntity<List<EmployeeModel>> getEmployeeLastUpdatedUser(@PathVariable String lastUpdatedUser){
		List<EmployeeModel> empuser=service.getlastUpdatedUser(lastUpdatedUser);
		return new ResponseEntity<>(empuser,HttpStatus.OK);
	}
	
//	@ApiOperation(value = "Update employee by Id", response = EmployeeModel.class)
	@PutMapping("/updateEmployee/{id}")
	public ResponseEntity<EmployeeModel> updateEmployee(@PathVariable Long id,@RequestBody EmployeeModel employee){
		EmployeeModel emp=service.updateEmployeeById(id, employee);
		return ResponseEntity.ok(emp);
	}
	
//	@ApiOperation(value = "Delete employee by id", response =String .class)
	@DeleteMapping("/deleteEmployee/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Long id){
	        service.deleteEmployeeById(id);
	        return ResponseEntity.ok("Employee deleted and stored in another delete employee table successfully");
	}
	
//	 @ApiOperation(value = "Get all employee by ID", response = EmployeeModel.class)
	 @GetMapping("/searchEmployee/{empid}")
	 public ResponseEntity<EmployeeModel> searchById(@PathVariable Long empid) {
	    EmployeeModel emp=service.findById(empid);
	    if(emp!=null) {
	    	return ResponseEntity.ok(emp);
	    }else {
	    	return ResponseEntity.notFound().build();
	    }
	 }
	 
	 
//	 @PostMapping("/CreateNewEmployee")
//	 public ResponseEntity<EmployeeModel> createEmployeeWithAddress(@RequestBody EmployeeModel employee) {
//		EmployeeModel newemployee=service.addEmployeewithAddress(employee);
//		return new  ResponseEntity<>(newemployee, HttpStatus.CREATED);
//	}
//	 
		
}
