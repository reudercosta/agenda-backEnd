package com.example.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Cliente;
import com.example.services.ClienteService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService clienteService;
	
	
	  @RequestMapping(value="/{id}", method = RequestMethod.GET) 
	  public ResponseEntity<Optional<Cliente>> find(@PathVariable Integer id) throws ObjectNotFoundException{ 
	  Optional<Cliente>  obj = clienteService.find(id); 
	  return ResponseEntity.ok().body(obj); 
	  }
	 
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String test() {
		return "REst funcionando!!";
	}
	
	
}
