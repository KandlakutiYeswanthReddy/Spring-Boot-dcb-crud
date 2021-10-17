
package com.dialycodebuffer.Springboottutorial.service;

import java.util.List;

import com.dialycodebuffer.Springboottutorial.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department FetchDepartmentById(Long departmentId);

	public void DeleteDepartmentByID(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	public Department fetchDepartmentByName(String departmentName);

	

}
