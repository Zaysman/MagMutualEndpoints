package com.isaiah.endpoints.beans;


import java.util.*;
import java.io.*;

import com.isaiah.endpoints.objects.*;

public class RetrieveEmployeeByNameBean {
	private Employee empData;
	
	private LinkedList<Employee> empList = new LinkedList<>(); //holds the list containing our employees
	
	
	
	private Scanner scan = new Scanner(System.in);
	
	//no argument constructor
	public RetrieveEmployeeByNameBean() {
		
	}
	
	
	
	//this method will read through the file and get the data on the employees
	public Employee readFile() {
		String searchName = new String(), firstName = new String(), lastName = new String();
		
		
		System.out.println("Type in the first name of the employee you want to search");
		firstName = scan.nextLine().trim();
		
		
		System.out.println("Type in the last name of the employee you want to search");
		lastName = scan.nextLine().trim();
		
		
		FileData fileData = new FileData();
		empList = fileData.retrieveEmpData();
		
		for(int i = 0; i < empList.size(); i++) {
			if(empList.get(i).getFirstName().equals(firstName)) {
				
				if(empList.get(i).getLastName().equals(lastName)) {
					empData = empList.get(i);
					return empData;
				}
				
			}
		}
		Employee miss = new Employee();
		
		miss.setFirstName("Employee Not Found");
		
		return miss;
	}
	
	//format: Month/Day/Year
	public Date convertStringToDate(String dateStr) {
		String dateDelimiter = "-";
		String[] tempArr = dateStr.split(dateDelimiter);
		Date date = new Date();
		date.setMonth(Integer.parseInt(tempArr[0]));
		date.setDate(Integer.parseInt(tempArr[1]));
		date.setYear(Integer.parseInt(tempArr[2]));
		
		
		return date;
	}
	
	

}
