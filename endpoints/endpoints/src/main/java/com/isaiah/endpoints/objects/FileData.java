package com.isaiah.endpoints.objects;

import java.io.*;
import java.util.*;

public class FileData {

	private LinkedList<Employee> empList = new LinkedList<>();
	
	private final String fileDelimiter = ",";
	
	public LinkedList<Employee> retrieveEmpData() {
		try {
			File file = new File("./files/UserInformation[90].csv");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			String[] tempArr;
			while((line = br.readLine()) != null) {
				tempArr = line.split(fileDelimiter);
				Employee tempEmp = new Employee();
				if(tempArr[0].equals("id")) {
					continue;
				}
				
				tempEmp.setId(Integer.parseInt(tempArr[0]));
				tempEmp.setFirstName(tempArr[1]);
				tempEmp.setLastName(tempArr[2]);
				tempEmp.setEmail(tempArr[3]);
				tempEmp.setProfession(tempArr[4]);
				
				tempEmp.setDateCreated(convertStringToDate(tempArr[5]));
				
				tempEmp.setCountry(tempArr[6]);
				tempEmp.setCity(tempArr[7]);
				empList.add(tempEmp);
				
				
				
			}
			
			br.close();
			
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		
		return empList;
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
