package com.infokalash.hrms.EmployeeDetails.EmployeeAddressService;
import java.util.List;
import java.util.Optional;

import com.infokalash.hrms.EmployeeDetails.Model.AddressModel;

public interface AddressService {
	
	//create or insert method new employee Address details 
	public AddressModel create(AddressModel add);
	
	//get all Employee Address Details
	public List<AddressModel> getAllAddress();
	
	//get a Employee address by using address Id
	public Optional<AddressModel> getAddress(Long addrId);
	
	//get a list of employees by employee Id
	public List<AddressModel> getByEmpId(Long empid);
	
	//get the employee address by addressType
	public List<AddressModel> getAddressByAddressType(String addressType);
	
	//get employee Address by lastupdateduser
	public List<AddressModel> getByLastUpdatedUser(String lastUpdatedUser);
	
	//update employee address by address Id
	public AddressModel updateEmployeeAddress(Long addrId,AddressModel address);
	
	//delete EmployeeAddress by address Id
	public void deleteAddress(Long addrId);
	
	//search employee Address by address Id
	public AddressModel findByAddrId(Long addrId);
	
	//search employee Address by employeeId
	public List<AddressModel> searchByEmpid(Long empid);
	
	

}
