package com.dao;

import com.model.User;

public class UserDAOImpl implements UserDAO{
	
	private boolean loginStatus;

	@Override
	public boolean loginAuthetication(User refUser) {
		if(refUser.getUserName().equals("admin")&&refUser.getPassword().equals("admin123")) {
		loginStatus=true;
	}else
		{
		loginStatus=false;
	}
	return loginStatus;
}

}
