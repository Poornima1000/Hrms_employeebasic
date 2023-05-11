package com.infokalash.hrms.EmployeeDetails.Repository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.infokalash.hrms.EmployeeDetails.Model.AddressModel;
import com.infokalash.hrms.EmployeeDetails.Model.EmployeeModel;


public interface EmployeeRepository extends JpaRepository<EmployeeModel,Long>,JpaSpecificationExecutor<AddressModel> {
	
	List<EmployeeModel> findByfirstName(String firstName);
	
	List<EmployeeModel> findByempActiveStatus(boolean empActiveStatus);
	
	List<EmployeeModel> findBylastUpdatedUser(String lastUpdatedUser);

}

