package com.dialycodebuffer.Springboottutorial.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dialycodebuffer.Springboottutorial.entity.Department;
import com.dialycodebuffer.Springboottutorial.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/departments")
	public Department saveDepartment(@Valid @RequestBody Department department) {
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList(){
		return departmentService.fetchDepartmentList();
	}
	
	@GetMapping("/departments/{id}")
	public Department FetchDepartmentNyId(@PathVariable("id") Long departmentId) {
		return departmentService.FetchDepartmentById(departmentId);
		
	}
	
	@DeleteMapping("/departments/{id}")
	public String DeleteDepartmentByID(@PathVariable("id") Long  departmentId) {
		 departmentService.DeleteDepartmentByID(departmentId);
		 return "Department deleted successfully!!";
	}
	
	@PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,
                                       @RequestBody Department department) {
        return departmentService.updateDepartment(departmentId,department);
    }
	
	@GetMapping("/departments/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name")String departmentName) {
	return departmentService.fetchDepartmentByName(departmentName);
	}

}