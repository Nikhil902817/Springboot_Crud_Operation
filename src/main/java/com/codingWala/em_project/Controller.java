package com.codingWala.em_project;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
//@Autowired	
// serviceimp empService;
	serviceimp empService = new implemetation();
	
	@GetMapping("emp")
	public List<Employee> getAllEmploye() {
		return empService.readEmp();
		
		
		
	}
	@PostMapping("saveEmp")
	public String createEmployee(@RequestBody Employee employee) {
		return empService.createEmp(employee);	
		
		
	}
	@DeleteMapping("delete/{id}")
	public String deleteId(@PathVariable Long id) {
		if(empService.deleteEmp(id))
			return "delete Sucessfully";
		return "Not Found";
		
	}
}
