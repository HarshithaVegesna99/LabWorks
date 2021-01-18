package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.service.EmployeeServiceImpl;
public class MenuUtil {
	public static void start() 
	{
		

EmployeeServiceImpl e = new EmployeeServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter ID:");
		int id = sc.nextInt(); 
		
		System.out.print("Enter name:");
		String name = sc1.nextLine();
		
		System.out.print("Enter salary:");
		double salary = sc.nextDouble();
		
		System.out.print("Enter designation:");
		String designation = sc1.nextLine();
		
		e.userInfo(id, name, salary, designation);
		e.showEmployeeData();
		
		sc.close();
		sc1.close();
		
	}
	
}