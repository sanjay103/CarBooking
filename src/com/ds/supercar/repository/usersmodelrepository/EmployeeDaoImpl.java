package com.ds.supercar.repository.usersmodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.ds.supercar.model.usermodel.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private HibernateTemplate ht;
	

	public int save(Employee employee) {
		
		return (Integer)((EmployeeDao) ht).save(employee);
	}

	public boolean update(Employee employee) {
		((EmployeeDao)ht).update(employee);
		return true;
	}

	public boolean delete(Employee employee) {
		((EmployeeDao)ht).delete(employee);
		return true;
	}

	public Employee find(int id) {
		
		return (Employee) ht.get(Employee.class,id);
	}

	public List<Employee> findAll() {
		return  (List<Employee>) ht.find("from Employee",Employee.class);
	}

}
