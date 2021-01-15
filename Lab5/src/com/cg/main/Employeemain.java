/**Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.
 * Write a Java Program to validate the full name of an employee. Create and throw a user defined exception if firstName and lastName is blank.
 * Create an Exception class named as “EmployeeException”(User defined Exception) in a package named as “com.cg.eis.exception” and throw an exception if salary of an employee is below than 3000. Use Exception Handling mechanism to handle exception properly.
 * @Author Vegesna.Harshitha
 */
package com.cg.main;

import java.util.Scanner;

import javax.naming.InvalidNameException;

import com.cg.DAOimpl.EmployeeDAOimpl;
import com.cg.domain.Employee;
import com.cg.exception.InvalidAgeexception;
import com.cg.exception.InvalidSalaryexception;

public class Employeemain {
	public static void main(String[] args) throws InvalidNameException, InvalidAgeexception, InvalidSalaryexception {
		Scanner sc=new Scanner(System.in);
		Employee empl=new Employee();
		EmployeeDAOimpl employee=new EmployeeDAOimpl();
		System.out.println("Enter Your name:");
		String name=sc.nextLine();
		empl.setName(name);
		System.out.println("Enter Your age:");
		empl.setAge(sc.nextInt());
		System.out.println("Enter Your Salary:");
		empl.setSalary(sc.nextInt());
		

		try
		{
			
			employee.checkEmployee(empl.getName(),empl.getAge(),empl.getSalary())  ;
		}
		catch(InvalidNameException e)
		{
		System.out.println(e.getMessage());
     	}
		catch(InvalidAgeexception e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidSalaryexception e)
		{
			System.out.println(e.getMessage());
		}
		}


}
