package com.example.agenda.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.services.DBService;

@Configuration
@Profile("test")
public class TestConfig{
	@Autowired
	private DBService dbservice;

	@Bean
	public boolean instantiateDataBase() throws ParseException {

		dbservice.instantiateTestDataBase();

		return true;
	}

	
}
