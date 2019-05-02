package com.diogotorres.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diogotorres.cursomc.domain.Cliente;
import com.diogotorres.cursomc.repositories.ClienteRepository;
import com.diogotorres.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> cat = repo.findById(id);
		return cat.orElseThrow(() ->
			new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName())
		); 
	}
}
