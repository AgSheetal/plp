package com.capgemini.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.ems.bean.EmployeeBean;
import com.capgemini.ems.exception.EMSException;
import com.capgemini.ems.service.IAdminService;

public class AdminController {
	@Autowired
	private IAdminService adminService;
		
		@RequestMapping("/initPage.obj")
		public String addEmployeePage(Model model){
			System.out.println("addEmployee");
			model.addAttribute("addEmployee",new EmployeeBean());
			return "addEmployee";
			
			
		}
		
		@RequestMapping("/addEmployee")
		public String submitEmployee(@ModelAttribute("addEmployee") EmployeeBean employee, Model model) throws EMSException {
			// System.out.println("into controller");
			boolean status = adminService.addEmployee(employee);
			return "success";
		}
}
