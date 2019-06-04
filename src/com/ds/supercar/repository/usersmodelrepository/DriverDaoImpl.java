package com.ds.supercar.repository.usersmodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.ds.supercar.model.usermodel.Driver;

public class DriverDaoImpl implements DriverDao {
	
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int save(Driver driver) throws Exception {
		
		return (Integer)ht.save(driver);
	}

	@Override
	public boolean update(Driver driver) throws Exception {
	((DriverDao)ht).update(driver);
		return true;
	}

	@Override
	public boolean delete(Driver driver) throws Exception {
		((DriverDao)ht).delete(driver);
		return true;
	}

	@Override
	public Driver find(int id) throws Exception {

		return (Driver) ht.get(Driver.class, id); 
				}

	@Override
	public List<Driver> findAll() throws Exception {
		
		return (List<Driver>)ht.find("from Driver",Driver.class);
	}

}
