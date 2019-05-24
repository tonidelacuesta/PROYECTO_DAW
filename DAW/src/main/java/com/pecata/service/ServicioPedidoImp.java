package com.pecata.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pecata.modelo.PedidoVO;
import com.pecata.repository.PedidoRepository;

@Service
public class ServicioPedidoImp implements ServicioPedido {

	@Autowired
	PedidoRepository pdr;

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioPedido#save(S)
	 */
	@Override
	public <S extends PedidoVO> S save(S entity) {
		return pdr.save(entity);
	}

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioPedido#findById(java.lang.Integer)
	 */
	@Override
	public Optional<PedidoVO> findById(Integer id) {
		return pdr.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioPedido#findAll()
	 */
	@Override
	public Iterable<PedidoVO> findAll() {
		return pdr.findAll();
	}

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioPedido#deleteById(java.lang.Integer)
	 */
	@Override
	public void deleteById(Integer id) {
		pdr.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioPedido#delete(com.pecata.modelo.PedidoVO)
	 */
	@Override
	public void delete(PedidoVO entity) {
		pdr.delete(entity);
	}
	
	
	
}
