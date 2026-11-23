package com.codingWala.em_project;

import java.util.ArrayList;
import java.util.List;

public class implemetation implements serviceimp {
	
	List<Employee> employees = new ArrayList<>();

	@Override
	public String createEmp(Employee employee) {
		employees.add(employee);
		return "data saved";
		
		
		
	}

	@Override
	public List<Employee> readEmp() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public boolean deleteEmp(Long id) {
		employees.remove(id);
		return true;
	}

}
