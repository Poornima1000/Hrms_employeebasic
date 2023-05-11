package com.infokalash.hrms.EmployeeDetails.Model;

import java.math.BigInteger;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Employeedetails")
public class EmployeeModel {
	
	
	@Id
	@SequenceGenerator(name = "empid_sequence", initialValue = 100001, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empid_sequence")
	private long empid;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="middlename")
	private String middleName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="email_id")
	private String emailid;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	
	@Column(name="date_of_joining")
	private Date dateOfJoining;
	
	@Column(name="phoneNumber")
	private BigInteger phone;
	
	@Column(name="emp_active_status")
	private boolean empActiveStatus;
	
	@Column(name="last_updated_user")
	private String lastUpdatedUser;
	
	@Column(name="last_tx_id")
	private int lastTxId;
	
	@Column(name="bloodGroup")
	private String bloodGroup;
	
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "empid")
	Set<AddressModel> address =new HashSet<>();
	
	
	
	
	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	

	public BigInteger getPhone() {
		return phone;
	}

	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	

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

	
	public EmployeeModel(long empid, String firstName, String middleName, String lastName, String emailid, int age,
			String gender, Date dateOfBirth, Date dateOfJoining, BigInteger phone, boolean empActiveStatus,
			String lastUpdatedUser, int lastTxId, String bloodGroup, Set<AddressModel> address) {
		super();
		this.empid = empid;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.emailid = emailid;
		this.age = age;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = dateOfJoining;
		this.phone = phone;
		this.empActiveStatus = empActiveStatus;
		this.lastUpdatedUser = lastUpdatedUser;
		this.lastTxId = lastTxId;
		this.bloodGroup = bloodGroup;
		this.address = address;
	}

	
	public EmployeeModel() {
		super();
	}

	public Set<AddressModel> getAddress() {
		return address;
	}
	public void setAddress(Set<AddressModel> address) {
		this.address = address;
	}
	
		
}
