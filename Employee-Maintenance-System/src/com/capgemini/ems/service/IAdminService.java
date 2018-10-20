package com.capgemini.ems.service;

import java.util.List;

import com.capgemini.ems.bean.EmployeeBean;
import com.capgemini.ems.exception.EMSException;

public interface IAdminService {

	boolean addEmployee(EmployeeBean employee) throws EMSException;

	

}
