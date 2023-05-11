package com.infokalash.hrms.EmployeeDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infokalash.hrms.EmployeeDetails.Model.DeletedEmployeeModel;

public interface DeletedEmployeeRepository  extends JpaRepository<DeletedEmployeeModel,Integer>{

}
