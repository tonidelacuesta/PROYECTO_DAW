package com.pecata.repository;

import org.springframework.data.repository.CrudRepository;

import com.pecata.modelo.ProductoEstaEnPedidoVO;

public interface DetallePedidoRepository extends CrudRepository<ProductoEstaEnPedidoVO, Integer> {

	
	
}
