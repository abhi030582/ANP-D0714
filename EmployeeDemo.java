package com.example;

import java.util.Scanner;

class Employee
{
	//Attributes
	int empId;
	public String name;
	private double salary; //encapsulation
	//Method
	public void setDetails() //Abstraction
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter empid,salary,name");
	empId = sc.nextInt();
	name = sc.next();
	salary = sc.nextDouble();
    }
	public void getDetails() //Abstraction
	{
		System.out.println("Employee Id"+"\t"+empId);
		System.out.println("Employee Name"+"\t"+name);
		System.out.println("Employee Salary"+"\t"+salary);
		
	}
}



public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee emp = new Employee();	
    emp.setDetails();
    emp.getDetails();
   // System.out.println(emp.salary);
 	}

}
