package com.pecata.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pecata.modelo.ProductoVO;
import com.pecata.repository.ProductoRepository;

@Service
public class ServicioProductoImp implements ServicioProducto {
	
	@Autowired
	ProductoRepository pr;

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioProducto#save(S)
	 */
	@Override
	public <S extends ProductoVO> S save(S entity) {
		return pr.save(entity);
	}

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioProducto#findById(java.lang.Integer)
	 */
	@Override
	public Optional<ProductoVO> findById(Integer id) {
		return pr.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioProducto#findAll()
	 */
	@Override
	public Iterable<ProductoVO> findAll() {
		return pr.findAll();
	}

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioProducto#delete(com.pecata.modelo.ProductoVO)
	 */
	@Override
	public void delete(ProductoVO entity) {
		pr.delete(entity);
	}

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioProducto#findByNombre(java.lang.String)
	 */
	@Override
	public ProductoVO findByNombre(String nombre) {
		return pr.findByNombre(nombre);
	}
	
	

}
