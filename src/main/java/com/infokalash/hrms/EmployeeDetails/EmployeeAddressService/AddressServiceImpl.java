package com.infokalash.hrms.EmployeeDetails.EmployeeAddressService;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infokalash.hrms.EmployeeDetails.Model.AddressModel;
import com.infokalash.hrms.EmployeeDetails.Model.EmployeeModel;
import com.infokalash.hrms.EmployeeDetails.Repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepository repository;
	
	//create or insert method new employee Address details 
	@Override
	public AddressModel create(AddressModel add) {
		return repository.save(add);
	}
	
	//get all Employee Address Details
	@Override
	public List<AddressModel> getAllAddress() {
		List<AddressModel> address=repository.findAll();
		return address;
	}

	//get a Employee address by using address Id
	@Override
	public Optional<AddressModel> getAddress(Long addrId) {
		Optional<AddressModel> address=repository.findById(addrId);
		if(address.isEmpty())
			return null;
		return  address;
	}
	
	//get a list of employees by employee Id
	@Override
	public List<AddressModel> getByEmpId(Long empid) {
		List<AddressModel> address=repository.findByempid(empid);
		return address;
	}
	
	//get the employee address by addressType
	@Override
	public List<AddressModel> getAddressByAddressType(String addressType) {
		List<AddressModel> add=repository.findByaddressType(addressType);
		return add;
	}
	
	//get employee Address by lastupdateduser
	@Override
	public List<AddressModel> getByLastUpdatedUser(String lastUpdatedUser) {
		List<AddressModel> address=repository.findBylastUpdatedUser(lastUpdatedUser);
		return address;
	}

	//update employee address by address Id
	@Override
	public AddressModel updateEmployeeAddress(Long addrId, AddressModel address) {
		AddressModel oldaddress=repository.findById(addrId).orElseThrow();
		
		if(oldaddress!=null) {
			oldaddress.setCity(address.getCity());
			oldaddress.setState(address.getState());
			oldaddress.setPincode(address.getPincode());
			oldaddress.setAddressLine1(address.getAddressLine1());
			oldaddress.setAddressLine2(address.getAddressLine2());
			oldaddress.setAddressType(address.getAddressType());
			oldaddress.setEmpid(address.getEmpid());
		}
		return repository.save(oldaddress);
	}

	//delete EmployeeAddress by address Id
	@Override
	public void deleteAddress(Long addrId) {
		AddressModel address=repository.findById(addrId).orElseThrow();
		if(address!=null) {
			repository.delete(address);
		}
	}

	//search employee Address by address Id
	@Override
	public AddressModel findByAddrId(Long addrId) {
		Optional<AddressModel> addressId=repository.findById(addrId);
		return addressId.orElse(null);
	}
	
	//search employee Address by employeeId
	@Override
	public List<AddressModel> searchByEmpid(Long empid) {
		List<AddressModel> address = repository.findByempid(empid);
		return address;
	}
}
