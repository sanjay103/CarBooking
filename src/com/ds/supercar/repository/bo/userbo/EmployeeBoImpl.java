package com.ds.supercar.repository.bo.userbo;

import java.util.List;

import org.osgi.framework.hooks.bundle.FindHook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ds.supercar.model.usermodel.Employee;
import com.ds.supercar.repository.usersmodelrepository.EmployeeDao;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.ForArray.ReadOnly;

@Service
@Transactional
public class EmployeeBoImpl implements EmployeeBo {
	
	@Autowired
	private EmployeeDao dao;

	@Override
	public int createEmployee(Employee employee) throws Exception {
		
		return dao.save(employee);
	}

	@Override
	public boolean updateEmployee(Employee employee) throws Exception {

		return dao.update(employee);
	}

	@Override
	public boolean deleteEmployee(Employee employee) throws Exception {
		return dao.delete(employee);
	}

	@Override
	@Transactional(readOnly=true)
	public Employee selectEmployee(int id) throws Exception {
		
		return dao.find(id);
	}

	@Override
	@Transactional(readOnly=true)
	public  List<Employee> selectAllEmployee()   throws Exception {
	
		return dao.findAll();
	}

}
