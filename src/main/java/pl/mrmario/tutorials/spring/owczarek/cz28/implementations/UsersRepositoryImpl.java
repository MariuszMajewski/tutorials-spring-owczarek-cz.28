package pl.mrmario.tutorials.spring.owczarek.cz28.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.mrmario.tutorials.spring.owczarek.cz28.api.Logger;
import pl.mrmario.tutorials.spring.owczarek.cz28.api.UsersRepository;
import pl.mrmario.tutorials.spring.owczarek.cz28.domain.User;


public class UsersRepositoryImpl implements UsersRepository {

	private Logger logger;

	public User createUser(String name) {
		if(logger!=null) {
			logger.log("Tworzenie u¿ytkownika " + name);
			
		}
		return new User(name);
	}
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
