package com.isaiah.endpoints.beans;

import java.util.*;

import com.isaiah.endpoints.objects.*;

public class RetrieveAllUniqueCountries {
	
	private LinkedList<Employee> empList = new LinkedList<>();
	private FileData fileData = new FileData();
	private HashSet<String> uniqueCountries = new HashSet<String>();
	
	
	
	
	public HashSet<String> retrieveUniqueCountries() {
		
		empList = fileData.retrieveEmpData();
		
		for(Employee emp : empList) {
			if(uniqueCountries.contains(emp.getCountry()) == false) {
				uniqueCountries.add(emp.getCountry());
			} 
			
		}
		
		
		return uniqueCountries;
	}
	
}
