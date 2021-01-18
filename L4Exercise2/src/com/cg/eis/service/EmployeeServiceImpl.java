package com.cg.eis.service;

import com.cg.eis.bean.Employee;



public class EmployeeServiceImpl implements EmployeeService {
	Employee e=new Employee();
	public void userInfo(int id, String name, double salary, String designation)
	{
		e.setId(id); 
		e.setName(name);
		e.setSalary(salary);
		e.setDesignation(designation);
	}

	public void showEmployeeData()
	{
		System.out.println("The employee details are as follows");
		System.out.println("id:"+e.getId());
		System.out.println("Name:"+e.getName());
		System.out.println("Salary:"+e.getSalary());
		System.out.println("Designation:"+e.getDesignation());
		System.out.println("Insurance Scheme:"+insuranceScheme(e.getSalary(),e.getDesignation()));
		
	}
	public String insuranceScheme(double salary, String designation) {
		if((salary>1000)&&(designation=="analyst"))
		{
			return "scheme1";
		}
		else 
		{
			return "scheme2";
		}
		
	}

}
