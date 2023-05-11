package com.infokalash.hrms.EmployeeDetails.EmployeeService;
import java.util.List;
import java.util.Optional;

import javax.management.AttributeNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.infokalash.hrms.EmployeeDetails.Model.AddressModel;
import com.infokalash.hrms.EmployeeDetails.Model.DeletedEmployeeModel;
import com.infokalash.hrms.EmployeeDetails.Model.EmployeeModel;
import com.infokalash.hrms.EmployeeDetails.Repository.AddressRepository;
import com.infokalash.hrms.EmployeeDetails.Repository.DeletedEmployeeRepository;
import com.infokalash.hrms.EmployeeDetails.Repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImp implements EmployeeServiceInterface{
	
	//these two objects are of two different repository classes
	@Autowired
	private EmployeeRepository repository;
	
	@Autowired
	private AddressRepository addRepository;
	
	//create or insert a new employee details
	@Override
	public EmployeeModel addEmployee(EmployeeModel employee) {
		return repository.save(employee);
	}

	//get all employee details
	@Override
	public List<EmployeeModel> getAllEmployees() {
		List<EmployeeModel> allemployees=repository.findAll();
		return allemployees;
	}
	
	//get single employee details
	@Override
	public Optional<EmployeeModel> getEmployee(Long id) {
		return repository.findById(id);
	}
	
	//get employee details by employee name
	@Override
	public List<EmployeeModel> getEmployeeName(String firstName) {
		return repository.findByfirstName(firstName);
	}

	//get employee details by employee active status
	@Override
	public List<EmployeeModel> getEmployeeActiveStatus(boolean empActiveStatus) {
		return repository.findByempActiveStatus(empActiveStatus);
	}

	//get employee details by last updated user
	@Override
	public List<EmployeeModel> getlastUpdatedUser(String lastUpdatedUser) {
		
		return repository.findBylastUpdatedUser(lastUpdatedUser);
	}

	//delete employee details from employee table and from address table
	@Override
	public void deleteEmployeeById(Long id)  {
		        EmployeeModel employeeId = repository.findById(id).orElseThrow();
		        
		        //DeletedEmployeeModel deletedEmployee = new DeletedEmployeeModel();
		        
//		        if(employee!=null) {
//		        deletedEmployee.setEmpid(employee.getEmpid());
//		        deletedEmployee.setFirstName(employee.getFirstName());
//		        deletedEmployee.setMiddleName(employee.getMiddleName());
//		        deletedEmployee.setLastName(employee.getLastName());
//		        deletedEmployee.setAge(employee.getAge());
//		        deletedEmployee.setEmailid(employee.getEmailid());
//		        deletedEmployee.setGender(employee.getGender());
//		        deletedEmployee.setDateOfBirth(employee.getDateOfBirth());
//		        deletedEmployee.setDateOfJoining(employee.getDateOfJoining());
//		        deletedEmployee.setLastTxId(employee.getLastTxId());
//		        deletedEmployee.setLastUpdatedUser(employee.getLastUpdatedUser());
//		        deletedEmployee.setEmpActiveStatus(employee.isEmpActiveStatus());
//		        }
		        repository.delete(employeeId);
		        
		        //deletedrepository.save(deletedEmployee);
		
	}
	
	//Update the employee details by using employee id
	@Override
	public EmployeeModel updateEmployeeById(Long id,EmployeeModel employee) {
		EmployeeModel emp=repository.findById(id).orElseThrow();
		if(emp!=null) {
		emp.setFirstName(employee.getFirstName());
		emp.setMiddleName(employee.getMiddleName());
		emp.setLastName(employee.getLastName());
		emp.setAge(employee.getAge());
		emp.setGender(employee.getGender());
		emp.setEmailid(employee.getEmailid());
		emp.setDateOfBirth(employee.getDateOfBirth());
		emp.setDateOfJoining(employee.getDateOfJoining());
		emp.setEmpActiveStatus(employee.isEmpActiveStatus());
		emp.setLastTxId(employee.getLastTxId());
		emp.setLastUpdatedUser(employee.getLastUpdatedUser());
		
		
	}
		return repository.save(emp);
	}

	//search the employeedetails by employeeId
	@Override
	public EmployeeModel findById(Long empid) {
		Optional<EmployeeModel> employeeOptional = repository.findById(empid);
		return employeeOptional.orElse(null);
	}

//	@Override
//	public EmployeeModel addEmployeewithAddress(EmployeeModel employee) {
//		AddressModel address=addRepository.save(employee.getAddressModel());
//		employee.
//		return null;
//	}

	
	
	
	
	
	
	

	
}
