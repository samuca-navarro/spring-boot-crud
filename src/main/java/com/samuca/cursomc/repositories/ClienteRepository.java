package com.samuca.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samuca.cursomc.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Integer>{

	

}
