package com.pecata.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rolesusuarios")
public class RolesUsuariosVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rolesusuarios;
	
	@ManyToOne
	@JoinColumn(name="idrol")
	private RolVO rol;
	
	@ManyToOne
	@JoinColumn(name="idusuario")
	private UsuarioVO usuario;

	public RolesUsuariosVO(int rolesusuarios, RolVO rol, UsuarioVO usuario) {
		super();
		this.rolesusuarios = rolesusuarios;
		this.rol = rol;
		this.usuario = usuario;
	}

	public RolesUsuariosVO(RolVO rol, UsuarioVO usuario) {
		super();
		this.rol = rol;
		this.usuario = usuario;
	}

	public RolesUsuariosVO() {
		super();
	}

	public int getRolesusuarios() {
		return rolesusuarios;
	}

	public void setRolesusuarios(int rolesusuarios) {
		this.rolesusuarios = rolesusuarios;
	}

	public RolVO getRol() {
		return rol;
	}

	public void setRol(RolVO rol) {
		this.rol = rol;
	}

	public UsuarioVO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioVO usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
