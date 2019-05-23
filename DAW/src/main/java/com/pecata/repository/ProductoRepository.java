package com.pecata.repository;

import org.springframework.data.repository.CrudRepository;

import com.pecata.modelo.ProductoVO;

public interface ProductoRepository extends CrudRepository<ProductoVO, Integer>{
	
	ProductoVO findByNombre(String nombre);
	
	

}
