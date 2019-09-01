package com.diogotorres.cursomc.services;

import com.diogotorres.cursomc.domain.Pedido;
import com.diogotorres.cursomc.repositories.PedidoRepository;
import com.diogotorres.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> cat = repo.findById(id);
		return cat.orElseThrow(() ->
			new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName())
		); 
	}
}
