package com.pecata.repository;

import org.springframework.data.repository.CrudRepository;

import com.pecata.modelo.UsuarioVO;

public interface UsuarioRepository extends CrudRepository<UsuarioVO, Integer>{

	UsuarioVO findByNombre(String nombre);
	
}
