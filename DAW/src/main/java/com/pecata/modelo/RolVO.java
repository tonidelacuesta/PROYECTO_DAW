package com.pecata.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="rol")
public class RolVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idrol;
	
	private String tipo;
	
	@OneToMany(mappedBy="rol")
	private List<RolesUsuariosVO> roles = new ArrayList<RolesUsuariosVO>();

	public RolVO(int idrol, String tipo, List<RolesUsuariosVO> roles) {
		super();
		this.idrol = idrol;
		this.tipo = tipo;
		this.roles = roles;
	}

	public RolVO(String tipo, List<RolesUsuariosVO> roles) {
		super();
		this.tipo = tipo;
		this.roles = roles;
	}

	public RolVO() {
		super();
	}

	public int getIdrol() {
		return idrol;
	}

	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<RolesUsuariosVO> getRoles() {
		return roles;
	}

	public void setRoles(List<RolesUsuariosVO> roles) {
		this.roles = roles;
	}
	
	
	

}
