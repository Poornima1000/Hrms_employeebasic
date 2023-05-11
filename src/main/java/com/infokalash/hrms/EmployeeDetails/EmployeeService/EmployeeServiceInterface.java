package com.infokalash.hrms.EmployeeDetails.EmployeeService;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.infokalash.hrms.EmployeeDetails.Model.EmployeeModel;

public interface EmployeeServiceInterface {
	
	//interface method to create or insert a new employee details
	EmployeeModel addEmployee(EmployeeModel employee);
	
	//interface method to get all employee details
	List<EmployeeModel> getAllEmployees();
	
	//interface method to get single employee details
	Optional<EmployeeModel> getEmployee(Long id);
	
	//interface method to get employee details by employee name
	List<EmployeeModel> getEmployeeName(String firstName);
	
	//interface method to get employee details by employee active status
	List<EmployeeModel> getEmployeeActiveStatus(boolean empActiveStatus);
	
	//interface method to get employee details by last updated user
	List<EmployeeModel> getlastUpdatedUser(String lastUpdatedUser);
	
	//interface method to delete employee details from employee table and from address table
	void deleteEmployeeById(Long id);
	
	//interface method to Update the employee details by using employee id
	EmployeeModel updateEmployeeById(Long id,EmployeeModel employee);
	
	//interface method to search the employeedetails by employeeId
	EmployeeModel findById(Long id);
	
	
		
}
