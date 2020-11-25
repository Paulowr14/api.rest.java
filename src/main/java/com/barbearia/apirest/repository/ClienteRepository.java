package com.barbearia.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbearia.apirest.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	Cliente findById(long id);
}
