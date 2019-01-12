package br.com.fiap.healthtrack.user.data.dao;

import br.com.fiap.healthtrack.user.User;

public interface UserDao {

	User getUser();
	void addUser (User user);
	void updateUser (User user);
	
}
