package com.dialycodebuffer.Springboottutorial.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dialycodebuffer.Springboottutorial.entity.Department;
import com.dialycodebuffer.Springboottutorial.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {

		return departmentRepository.save(department);
	}

	public List<Department> fetchDepartmentList() {

		return departmentRepository.findAll();
	}

	public Department FetchDepartmentById(Long departmentId) {

		return departmentRepository.findById(departmentId).get();
	}

	@Override
	public void DeleteDepartmentByID(Long departmentId) {

		departmentRepository.deleteById(departmentId);

	}


	@Override
	public Department updateDepartment(Long departmentId, Department department) {
		Department depDB = departmentRepository.findById(departmentId).get();

		if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			depDB.setDepartmentName(department.getDepartmentName());
		}

		if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
			depDB.setDepartmentCode(department.getDepartmentCode());
		}

		if (Objects.nonNull(department.getDepartmentAddress())
				&& !"".equalsIgnoreCase(department.getDepartmentAddress())) {
			depDB.setDepartmentAddress(department.getDepartmentAddress());
		}
		return departmentRepository.save(depDB);
	}

	@Override
	public Department fetchDepartmentByName(String departmentName) {
		
		return departmentRepository.findBydepartmentNameIgnoreCase(departmentName);
	}
}
