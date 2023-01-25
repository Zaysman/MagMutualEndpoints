package com.isaiah.endpoints;

import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  

import java.util.*;
import com.isaiah.endpoints.objects.*;
import com.isaiah.endpoints.beans.*;


@RestController
public class ConfigurationController {
	
	String name = new String();
	
	@GetMapping("/")
	public String root() {
		return "welcome to root";
	}
	
	@GetMapping("/searchByName")
	public String retrieveEmployeeByName() {
		RetrieveEmployeeByNameBean retrieveEmployeeByNameBean = new RetrieveEmployeeByNameBean();
		String emp = retrieveEmployeeByNameBean.readFile().toString();
		
		
		
		return emp;
	}
	
	@GetMapping("/searchByProfession")
	public String retrieveEmployeesByProfession() {
		RetrieveEmployeeByProfessionBean retrieveEmployeeByProfessionBean = new RetrieveEmployeeByProfessionBean();
		LinkedList<Employee> empList = retrieveEmployeeByProfessionBean.retrieveEmployeesByProfession();
		
		String empListStr = new String();
		
		for(Employee emp : empList) {
			empListStr = empListStr.concat(emp.toString() + "\n");
		}
		
		return empListStr;
	}
	
	@GetMapping("/searchBetweenDates")
	public String retrieveEmployeesBetweenDates() {
		RetrieveEmployeeBetweenDates retrieveEmployeeBetweenDates = new RetrieveEmployeeBetweenDates();
		LinkedList<Employee> empList = retrieveEmployeeBetweenDates.retrieveEmployeesBetweenDates();
		
		String empListStr = new String();
		
		for(Employee emp : empList) {
			empListStr = empListStr.concat(emp.toString() + "\n");
		}
		
		return empListStr;
	}
	
	@GetMapping("/getAllUniqueCountries")
	public String retrieveAllUniqueCountries() {
		RetrieveAllUniqueCountries retrieveAllUniqueCountries = new RetrieveAllUniqueCountries();
		HashSet<String> uniqueCountriesSet = retrieveAllUniqueCountries.retrieveUniqueCountries();
		
		String UniqueCountryStr = new String();
		
		for(String str : uniqueCountriesSet) {
			UniqueCountryStr = UniqueCountryStr.concat(str + ", ");
		}
		
		
		return  UniqueCountryStr;
	}
	

}
