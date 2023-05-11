package com.infokalash.hrms.EmployeeDetails.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.infokalash.hrms.EmployeeDetails.EmployeeAddressService.AddressServiceImpl;
import com.infokalash.hrms.EmployeeDetails.Model.AddressModel;
import com.infokalash.hrms.EmployeeDetails.Repository.AddressRepository;

import io.swagger.annotations.Api;


@RestController
@RequestMapping("/address")
@Api(value = "AddressController", description = "Operations pertaining to employee address")
public class AddressController {
	
	@Autowired
	private AddressServiceImpl service;
	
	
	@Autowired
	private AddressRepository repo;
	
	@PostMapping("/insert")
	public ResponseEntity<AddressModel> createAddress(@RequestBody AddressModel address) {
		AddressModel addrescreate=service.create(address);
		return new ResponseEntity(addrescreate,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllAddresses")
	public ResponseEntity<List<AddressModel>> get(){
		List<AddressModel> allAddr=service.getAllAddress();
		return new ResponseEntity(allAddr,HttpStatus.OK);
	}
	
	@GetMapping("/getAddress/{addrId}")
	public ResponseEntity<Optional<AddressModel>> getAddressById(@PathVariable Long addrId){
		Optional<AddressModel> addressget=service.getAddress(addrId);
		return new ResponseEntity(addressget,HttpStatus.OK);	
	}
	
	@GetMapping("/getByEmployeeId/{empid}")
	public ResponseEntity<List<AddressModel>> getByEmpId(@PathVariable Long empid){
		List<AddressModel> address=service.getByEmpId(empid);
		return new ResponseEntity(address,HttpStatus.OK);
	}
	
	@GetMapping("/getAddressType/{addressType}")
	public ResponseEntity<List<AddressModel>> getByAddressType(@PathVariable String addressType){
		List<AddressModel> addrType=service.getAddressByAddressType(addressType);
		return new ResponseEntity(addrType,HttpStatus.OK);
	}
	
	@GetMapping("/getByLastUpdatedUser/{lastUpdatedUser}")
	public ResponseEntity<List<AddressModel>> getByLastUpdatedUser(@PathVariable String lastUpdatedUser){
		List<AddressModel> addr=service.getAddressByAddressType(lastUpdatedUser);
		return new ResponseEntity(addr,HttpStatus.OK);
	}
	
	@PutMapping("/UpdateAddress/{addrId}")
	public ResponseEntity<AddressModel> updateAddress(@PathVariable Long addrId,@RequestBody AddressModel address){
		AddressModel addr=service.updateEmployeeAddress(addrId, address);
		return ResponseEntity.ok(addr);
	} 
	
	@DeleteMapping("/deleteAddress/{addrId}")
	public ResponseEntity<String> deleteAddress(@PathVariable Long addrId){
		AddressModel add=repo.findById(addrId).orElseThrow();
		
		if(add!=null) {
			service.deleteAddress(addrId);
			return ResponseEntity.ok("Deleted successfully");
		}else
			return ResponseEntity.ok("Invalid id");
	}	
	
	@GetMapping("/serach/addressByaddrId/{addrId}")
	public ResponseEntity<AddressModel> serachByAddrId(@PathVariable Long addrId){
		AddressModel addressId=service.findByAddrId(addrId);
		if(addressId!=null) {
			return ResponseEntity.ok(addressId);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	
	@GetMapping("/serach/addressByempId/{empid}")
	public ResponseEntity<List<AddressModel>> serachByEmpId(@PathVariable Long empid){
		List<AddressModel> employeeId=service.searchByEmpid(empid);
		if(employeeId!=null) {
			return ResponseEntity.ok(employeeId);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	

}
