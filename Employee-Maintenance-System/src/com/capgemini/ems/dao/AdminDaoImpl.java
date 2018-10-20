package com.capgemini.ems.dao;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.capgemini.ems.bean.EmployeeBean;
import com.capgemini.ems.exception.EMSException;

public class AdminDaoImpl implements IAdminDao {

	@PersistenceContext
	private EntityManager eManager;
	@Override
	public boolean addEmployee(EmployeeBean employee) throws EMSException{

		boolean success = false;
		try{
			eManager.persist(employee);
			success=true;
			
		}
		catch(Exception e){
			throw new EMSException("");
			
		}
		
		return success;
	}

}
