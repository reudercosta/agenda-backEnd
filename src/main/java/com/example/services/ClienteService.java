package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Cliente;
import com.example.repository.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public Optional<Cliente> find(Integer id) throws ObjectNotFoundException {
	Optional<Cliente> obj = clienteRepository.findById(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado, id: "+id+" Tipo: "+Cliente.class.getName());			
		}
		return obj;
	}
	

}
