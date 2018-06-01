package pl.mrmario.tutorials.spring.owczarek.cz28.implementations;

import java.util.Date;

import pl.mrmario.tutorials.spring.owczarek.cz28.api.Logger;

public class DateLogger implements Logger{
	public void log(String message) {
		System.out.println(new Date() + ": "+message);
	}
}
