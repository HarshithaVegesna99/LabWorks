/**Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.
 * Write a Java Program to validate the full name of an employee. Create and throw a user defined exception if firstName and lastName is blank.
 * Create an Exception class named as “EmployeeException”(User defined Exception) in a package named as “com.cg.eis.exception” and throw an exception if salary of an employee is below than 3000. Use Exception Handling mechanism to handle exception properly.
 * @Author Vegesna.Harshitha
 */
package com.cg.DAOimpl;

import javax.naming.InvalidNameException;

import com.cg.DAO.EmployeeDAO;
import com.cg.domain.Employee;
import com.cg.exception.InvalidAgeexception;
import com.cg.exception.InvalidSalaryexception;

public class EmployeeDAOimpl implements EmployeeDAO {
	
	

	@Override
	public void checkEmployee( String name,int age,int salary) throws InvalidNameException,InvalidAgeexception,InvalidSalaryexception
	{
		String[] val=name.split(" ");
		Employee obj=new Employee();
	if(name.contains("A-Za-z+"))
//		if((!val[0].contains("[A-Za-z]+"))&&(!val[1].contains("[A-Za-z]+")))
		{
			throw new InvalidNameException("Sorry! Your name is invalid.Enter Correct Format.Thank You.");
		}
		System.out.println("Your name is "+name);
		 if(age<15)
		{
			throw new InvalidAgeexception("Sorry! Your age is invalid.Enter Correct Format.Thank You.");
		}
		 System.out.println("Your age is "+age);
		 if (salary<3000)
		{
			throw new InvalidSalaryexception("Sorry!Your Salary is less than the limit.");
		}
		System.out.println("Your Salary is "+salary);
	}
}