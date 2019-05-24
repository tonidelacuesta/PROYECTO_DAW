package com.pecata.service;

import java.util.Optional;

import com.pecata.modelo.ProductoVO;

public interface ServicioProducto {

	<S extends ProductoVO> S save(S entity);

	Optional<ProductoVO> findById(Integer id);

	Iterable<ProductoVO> findAll();

	void delete(ProductoVO entity);

	ProductoVO findByNombre(String nombre);

}