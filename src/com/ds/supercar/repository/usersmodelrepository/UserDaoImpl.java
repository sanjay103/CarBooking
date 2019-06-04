package com.ds.supercar.repository.usersmodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.ds.supercar.model.usermodel.Employee;
import com.ds.supercar.model.usermodel.User;

public class UserDaoImpl implements UsersDao {
	@Autowired
	
	private HibernateTemplate ht;

	@Override
	public int save(User user) throws Exception {
		
		return (Integer)ht.save(user);
	}

	@Override
	public boolean update(User user) throws Exception {
		((UsersDao)ht).update(user);
		return true;
	}

	@Override
	public boolean delete(User user) throws Exception {
		((UsersDao)ht).delete(user);
		return true;
	}

	@Override
public User find(int id) {
		
		return (User) ht.get(User.class,id);
	}
@Override
	public List<User> findAll() {
		return  (List<User>) ht.find("from User",User.class);
}


}
