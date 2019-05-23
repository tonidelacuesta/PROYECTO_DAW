package com.pecata.service;

import java.util.Optional;

import com.pecata.modelo.PedidoVO;

public interface ServicioPedido {

	<S extends PedidoVO> S save(S entity);

	Optional<PedidoVO> findById(Integer id);

	Iterable<PedidoVO> findAll();

	void deleteById(Integer id);

	void delete(PedidoVO entity);

}