package com.pecata.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pecata.modelo.ProductoEstaEnPedidoVO;
import com.pecata.repository.DetallePedidoRepository;

@Service
public class ServicioDetallePedidoImp implements ServicioDetallePedido {

	@Autowired
	DetallePedidoRepository dpr;

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioDetallePedido#save(S)
	 */
	@Override
	public <S extends ProductoEstaEnPedidoVO> S save(S entity) {
		return dpr.save(entity);
	}

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioDetallePedido#findById(java.lang.Integer)
	 */
	@Override
	public Optional<ProductoEstaEnPedidoVO> findById(Integer id) {
		return dpr.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioDetallePedido#findAll()
	 */
	@Override
	public Iterable<ProductoEstaEnPedidoVO> findAll() {
		return dpr.findAll();
	}

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioDetallePedido#deleteById(java.lang.Integer)
	 */
	@Override
	public void deleteById(Integer id) {
		dpr.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioDetallePedido#delete(com.pecata.modelo.ProductoEstaEnPedidoVO)
	 */
	@Override
	public void delete(ProductoEstaEnPedidoVO entity) {
		dpr.delete(entity);
	}
	
	
	
}
