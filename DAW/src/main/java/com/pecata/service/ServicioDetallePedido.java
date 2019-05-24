package com.pecata.service;

import java.util.Optional;

import com.pecata.modelo.ProductoEstaEnPedidoVO;

public interface ServicioDetallePedido {

	<S extends ProductoEstaEnPedidoVO> S save(S entity);

	Optional<ProductoEstaEnPedidoVO> findById(Integer id);

	Iterable<ProductoEstaEnPedidoVO> findAll();

	void deleteById(Integer id);

	void delete(ProductoEstaEnPedidoVO entity);

}