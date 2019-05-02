package com.diogotorres.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.diogotorres.cursomc.domain.Cliente;
import com.diogotorres.cursomc.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	//utiliza-se interrogação para o caso de não encontrar o objeto desejado
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Cliente cat = service.find(id);
		return ResponseEntity.ok().body(cat);
	}
}
