package com.pecata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pecata.modelo.ProductoVO;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoVO, Integer>{
	
	ProductoVO findByNombre(String nombre);
	
	

}
