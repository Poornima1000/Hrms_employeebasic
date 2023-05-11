package com.infokalash.hrms.EmployeeDetails.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infokalash.hrms.EmployeeDetails.Model.AddressModel;

public interface AddressRepository extends JpaRepository<AddressModel,Long> {

	List<AddressModel> findByaddressType(String addressType);

	List<AddressModel> findBylastUpdatedUser(String lastUpdatedUser);
	
	List<AddressModel> findByempid(Long empid);
	
}
