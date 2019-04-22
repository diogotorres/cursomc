package com.diogotorres.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diogotorres.cursomc.domain.Categoria;
import com.diogotorres.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> cat = repo.findById(id);
		return cat.orElse(null);
	}
}
