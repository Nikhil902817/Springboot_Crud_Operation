package com.codingWala.em_project;

import java.util.List;

public interface serviceimp {
	
	String createEmp(Employee employee);
	List<Employee> readEmp();
	boolean deleteEmp(Long id);

}
