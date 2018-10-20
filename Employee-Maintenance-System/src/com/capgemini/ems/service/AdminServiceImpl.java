package com.capgemini.ems.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.ems.bean.EmployeeBean;
import com.capgemini.ems.dao.IAdminDao;
import com.capgemini.ems.exception.EMSException;

public class AdminServiceImpl implements IAdminService {
	
	@Autowired
	private IAdminDao adminDao;

	@Override
	public boolean addEmployee(EmployeeBean employee) throws EMSException {
		// TODO Auto-generated method stub
		return adminDao.addEmployee(employee);
	}

}
