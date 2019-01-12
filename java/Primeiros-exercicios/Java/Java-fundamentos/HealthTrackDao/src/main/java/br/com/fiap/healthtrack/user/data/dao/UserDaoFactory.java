package br.com.fiap.healthtrack.user.data.dao;

import br.com.fiap.healthtrack.user.data.UserDaoDomain;

public class UserDaoFactory {

	private static UserDaoFactory instance;
	
	public static UserDaoFactory getInstance() {
		if(instance == null) {
			instance = new UserDaoFactory();
		}
		return instance;
	}
	
	public UserDao getDao(UserDaoDomain domain) {
		//Outros tipos serao implementados futuramente
		return new UserDaoTesteImpl();
	}
	
}
