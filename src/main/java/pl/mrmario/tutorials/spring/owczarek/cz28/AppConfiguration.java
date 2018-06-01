package pl.mrmario.tutorials.spring.owczarek.cz28;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.mrmario.tutorials.spring.owczarek.cz28.api.Logger;
import pl.mrmario.tutorials.spring.owczarek.cz28.api.UsersRepository;
import pl.mrmario.tutorials.spring.owczarek.cz28.domain.User;
import pl.mrmario.tutorials.spring.owczarek.cz28.implementations.DateLogger;
import pl.mrmario.tutorials.spring.owczarek.cz28.implementations.UsersRepositoryImpl;

@Configuration
public class AppConfiguration {
	@Bean
	public Logger logger() {
		return new DateLogger();
	}
	@Bean
	public UsersRepository usersRepository() {
		UsersRepositoryImpl usersRepositoryImpl = new UsersRepositoryImpl();
		usersRepositoryImpl.setLogger(logger());
		return usersRepositoryImpl;
			

	}
}
