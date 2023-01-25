package com.isaiah.endpoints.beans;

import java.util.*;

import com.isaiah.endpoints.objects.*;

public class RetrieveEmployeeBetweenDates {
	
	private LinkedList<Employee> empList = new LinkedList<>();
	private LinkedList<Employee> empsFound = new LinkedList<>();
	private FileData fileData = new FileData();
	
	Scanner scan = new Scanner(System.in);
	
	public LinkedList<Employee> retrieveEmployeesBetweenDates() {
		
		empList = fileData.retrieveEmpData();
		
		System.out.println("Type in the start date for your search: (MM-DD-YY)");
		String startDateStr = scan.nextLine().trim();
		
		System.out.println("Type in the end date for your search: (MM-DD-YY)");
		String endDateStr = scan.nextLine().trim();
		
		Date startDate = convertStringToDate(startDateStr);
		Date endDate = convertStringToDate(endDateStr);
		
		
		
		for(Employee emp : empList) {
			if(emp.getDateCreated().after(startDate) && emp.getDateCreated().before(endDate)) {
				empsFound.add(emp);
			}
		}
		
		
		
		
		return empsFound;
	}
	
	
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
