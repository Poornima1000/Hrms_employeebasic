package com.infokalash.hrms.EmployeeDetails.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class AddressModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long addrId;
	
	@Column(name="address_type")
	private String addressType;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="pincode")
	private int pincode;
	
	@Column(name="address_line1")
	private String addressLine1;
	
	@Column(name="address_line2")
	private String addressLine2;
	
	@Column(name="empid")
	private long empid;
	
	@Column(name="emp_active_status")
	private boolean empActiveStatus;
	
	@Column(name="last_updated_user")
	private String lastUpdatedUser;
	
	@Column(name="last_tx_id")
	private int lastTxId;

//	@ManyToOne
//	private EmployeeModel employee;
////@JoinColumn(name = "employee_id")
	public boolean isEmpActiveStatus() {
		return empActiveStatus;
	}

	public void setEmpActiveStatus(boolean empActiveStatus) {
		this.empActiveStatus = empActiveStatus;
	}

	public String getLastUpdatedUser() {
		return lastUpdatedUser;
	}

	public void setLastUpdatedUser(String lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}

	public int getLastTxId() {
		return lastTxId;
	}

	public void setLastTxId(int lastTxId) {
		this.lastTxId = lastTxId;
	}

	public long getAddrId() {
		return addrId;
	}

	public void setAddrId(long addrId) {
		this.addrId = addrId;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	
	public AddressModel(long addrId, String addressType, String city, String state, int pincode, String addressLine1,
			String addressLine2, long empid, boolean empActiveStatus, String lastUpdatedUser, int lastTxId) {
		super();
		this.addrId = addrId;
		this.addressType = addressType;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.empid = empid;
		this.empActiveStatus = empActiveStatus;
		this.lastUpdatedUser = lastUpdatedUser;
		this.lastTxId = lastTxId;
	}

	public AddressModel() {
		super();
	}
	
	
	

}
