package com.ds.supercar.repository.usersmodelrepository;

import java.util.List;


import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.supercar.model.usermodel.Address;

public class AddressDaoImpl implements AddressDao {
	@Autowired
	private HibernateTemplate ht;


	@Override
	public int save(Address address) throws Exception  {
	
		return (Integer) ht.save(address);
	}

	@Override
	public boolean update(Address address) throws Exception  {
		((AddressDao) ht).update(address);
		return true;
	}

	@Override
	public boolean delete(Address address) throws Exception  {
		((AddressDao) ht).delete(address);
		return true;
	}

	@Override
	public Address find(int id) throws Exception {
		return (Address)ht.get(Address.class,id); 
	}
	

	@Override
	public List<Address> findAll() {
		return  (List<Address>) ht.find("from Address",Address.class);
}
	
	}
