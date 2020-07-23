package com.example.agenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.domain.Cliente;
import com.example.repository.ClienteRepository;

@SpringBootApplication
public class AgendaApplication implements CommandLineRunner {
		
	public static void main(String[] args) {
		SpringApplication.run(AgendaApplication.class, args);
		
		
	}

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
	}

}
