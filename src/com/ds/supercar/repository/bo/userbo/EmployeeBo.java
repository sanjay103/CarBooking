package com.ds.supercar.repository.bo.userbo;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ds.supercar.model.usermodel.Employee;

@Service
@Transactional
public interface EmployeeBo {
	
	public int createEmployee(Employee employee) throws Exception;
	public boolean updateEmployee(Employee employee) throws Exception;
	public boolean deleteEmployee(Employee employee) throws Exception;
	public Employee selectEmployee(int id) throws Exception;
	public List<Employee> selectAllEmployee() throws Exception;
		

}
