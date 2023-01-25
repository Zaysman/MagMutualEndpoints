package com.isaiah.endpoints.beans;

import java.util.*;

import com.isaiah.endpoints.objects.*;

public class RetrieveEmployeeByProfessionBean {
	
	private LinkedList<Employee> empList = new LinkedList<>();
	private FileData fileData = new FileData();
	private LinkedList<Employee> empsFound = new LinkedList<>();
	
	Scanner scan = new Scanner(System.in);
	
	public LinkedList<Employee> retrieveEmployeesByProfession() {
		
		empList = fileData.retrieveEmpData();
		
		System.out.println("Type in the profession you'd like to search with");
		String searchProf = scan.nextLine().trim();
		
		for(Employee Emp : empList) {
			if(Emp.getProfession().equals(searchProf)) {
				empsFound.add(Emp);
			}
		}
		
		return empsFound;
	}
	
	
	
	
	

}
