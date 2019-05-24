package com.pecata.service;

import java.util.Optional;

import com.pecata.modelo.UsuarioVO;
import com.pecata.repository.UsuarioRepository;

public class ServicioUsuarioImp implements ServicioUsuario {

	UsuarioRepository ur;

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioUsuario#findByNombre(java.lang.String)
	 */
	@Override
	public UsuarioVO findByNombre(String nombre) {
		return ur.findByNombre(nombre);
	}

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioUsuario#save(S)
	 */
	@Override
	public <S extends UsuarioVO> S save(S entity) {
		return ur.save(entity);
	}

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioUsuario#findById(java.lang.Integer)
	 */
	@Override
	public Optional<UsuarioVO> findById(Integer id) {
		return ur.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioUsuario#findAll()
	 */
	@Override
	public Iterable<UsuarioVO> findAll() {
		return ur.findAll();
	}

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioUsuario#count()
	 */
	@Override
	public long count() {
		return ur.count();
	}

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioUsuario#deleteById(java.lang.Integer)
	 */
	@Override
	public void deleteById(Integer id) {
		ur.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see com.pecata.service.ServicioUsuario#delete(com.pecata.modelo.UsuarioVO)
	 */
	@Override
	public void delete(UsuarioVO entity) {
		ur.delete(entity);
	}
	
	
	
}
