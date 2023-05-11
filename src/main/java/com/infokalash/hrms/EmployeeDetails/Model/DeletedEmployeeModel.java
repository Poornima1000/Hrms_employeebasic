package com.infokalash.hrms.EmployeeDetails.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="DeleteEmployees")
public class DeletedEmployeeModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int del_id;
	
	@Column(name="empid")
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
	
	@Column(name="emp_active_status")
	private boolean empActiveStatus;
	
	@Column(name="last_updated_user")
	private String lastUpdatedUser;
	
	@Column(name="last_tx_id")
	private int lastTxId;

	public int getDel_id() {
		return del_id;
	}

	public void setDel_id(int del_id) {
		this.del_id = del_id;
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

	public DeletedEmployeeModel(int del_id, long empid, String firstName, String middleName, String lastName,
			String emailid, int age, String gender, Date dateOfBirth, Date dateOfJoining, boolean empActiveStatus,
			String lastUpdatedUser, int lastTxId) {
		super();
		this.del_id = del_id;
		this.empid = empid;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.emailid = emailid;
		this.age = age;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = dateOfJoining;
		this.empActiveStatus = empActiveStatus;
		this.lastUpdatedUser = lastUpdatedUser;
		this.lastTxId = lastTxId;
	}

	public DeletedEmployeeModel() {
		super();
	}

	
	

}
