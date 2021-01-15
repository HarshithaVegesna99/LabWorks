/**Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.
 * Write a Java Program to validate the full name of an employee. Create and throw a user defined exception if firstName and lastName is blank.
 * Create an Exception class named as “EmployeeException”(User defined Exception) in a package named as “com.cg.eis.exception” and throw an exception if salary of an employee is below than 3000. Use Exception Handling mechanism to handle exception properly.
 * @Author Vegesna.Harshitha
 */
package com.cg.exception;

public class InvalidNameexception extends Exception {
	

	public InvalidNameexception()
	{
		
	}
	public InvalidNameexception(String name)
	{
		super(name);
	}

}