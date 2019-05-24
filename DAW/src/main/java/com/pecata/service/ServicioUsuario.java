package com.pecata.service;

import java.util.Optional;

import com.pecata.modelo.UsuarioVO;

public interface ServicioUsuario {

	UsuarioVO findByNombre(String nombre);

	<S extends UsuarioVO> S save(S entity);

	Optional<UsuarioVO> findById(Integer id);

	Iterable<UsuarioVO> findAll();

	long count();

	void deleteById(Integer id);

	void delete(UsuarioVO entity);

}