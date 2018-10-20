package com.capgemini.ems.dao;

import com.capgemini.ems.bean.EmployeeBean;
import com.capgemini.ems.exception.EMSException;

public interface IAdminDao {

	boolean addEmployee(EmployeeBean employee) throws EMSException;

}
