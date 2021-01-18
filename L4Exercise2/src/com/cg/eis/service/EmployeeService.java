package com.cg.eis.service;

public interface EmployeeService {
	 default void userInfo(int id, String name, double salary, String designation)
	{
		
	}
	 default void showEmployeeData()
	 {
		 
	 }
	 default String insuranceScheme(double salary, String designation)
	 {
		return null;
		 
	 }
	

}