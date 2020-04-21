package com.samuca.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samuca.cursomc.domain.Pagamento;

@Repository
public interface PagamentoRepository extends JpaRepository <Pagamento, Integer>{

	
//A criação dessa classe é o suficiente para que os acesso ao banco de dados seja possível	

}
