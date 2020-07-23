package com.example.services;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Cliente;
import com.example.repository.ClienteRepository;

@Service
public class DBService {

	@Autowired
	private ClienteRepository repo;

	public void instantiateTestDataBase() throws ParseException {
	
		Cliente cli1 = new Cliente(null,"cli1","cli1@gmail.com","7730821043");
      	Cliente cli2 = new Cliente(null,"cli2","cli2@gmail.com","7730821043");
		Cliente cli3 = new Cliente(null,"cli3","cli1@gmail.com","7730821043");
	
		List<Cliente> list = new ArrayList();
		list.addAll(Arrays.asList(cli1,cli2,cli3));
		
		repo.saveAll(list);

}
}
