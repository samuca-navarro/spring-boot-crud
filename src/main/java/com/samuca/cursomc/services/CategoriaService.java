package com.samuca.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuca.cursomc.domain.Categoria;
import com.samuca.cursomc.repositories.CategoriaRepository;
import com.samuca.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find (Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		
//		return obj.orElse(null);
		}
	
	public Categoria insert (Categoria obj) {
//		obj.setId(null);
		return repo.save(obj);
	}
}
