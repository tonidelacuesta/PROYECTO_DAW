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
@Table(name="usuario")
public class UsuarioVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idusuario;
	
	private String nombre;
	
	private String apellido1;
	
	private String apellido2;
	
	private String direccion;
	
	private String correo;
	
	private String telefono;
	
	@OneToMany(mappedBy="cliente")
	private List<PedidoVO> mispedidos;
	
	@OneToMany(mappedBy="usuario")
	private List<RolesUsuariosVO> misroles = new ArrayList<RolesUsuariosVO>();

	public UsuarioVO(int idusuario, String nombre, String apellido1, String apellido2, String direccion, String correo,
			String telefono, List<PedidoVO> mispedidos, List<RolesUsuariosVO> misroles) {
		super();
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.mispedidos = mispedidos;
		this.misroles = misroles;
	}

	public UsuarioVO(String nombre, String apellido1, String apellido2, String direccion, String correo,
			String telefono, List<PedidoVO> mispedidos, List<RolesUsuariosVO> misroles) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.mispedidos = mispedidos;
		this.misroles = misroles;
	}

	public UsuarioVO() {
		super();
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<PedidoVO> getMispedidos() {
		return mispedidos;
	}

	public void setMispedidos(List<PedidoVO> mispedidos) {
		this.mispedidos = mispedidos;
	}

	public List<RolesUsuariosVO> getMisroles() {
		return misroles;
	}

	public void setMisroles(List<RolesUsuariosVO> misroles) {
		this.misroles = misroles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido1 == null) ? 0 : apellido1.hashCode());
		result = prime * result + ((apellido2 == null) ? 0 : apellido2.hashCode());
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + idusuario;
		result = prime * result + ((mispedidos == null) ? 0 : mispedidos.hashCode());
		result = prime * result + ((misroles == null) ? 0 : misroles.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioVO other = (UsuarioVO) obj;
		if (apellido1 == null) {
			if (other.apellido1 != null)
				return false;
		} else if (!apellido1.equals(other.apellido1))
			return false;
		if (apellido2 == null) {
			if (other.apellido2 != null)
				return false;
		} else if (!apellido2.equals(other.apellido2))
			return false;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (idusuario != other.idusuario)
			return false;
		if (mispedidos == null) {
			if (other.mispedidos != null)
				return false;
		} else if (!mispedidos.equals(other.mispedidos))
			return false;
		if (misroles == null) {
			if (other.misroles != null)
				return false;
		} else if (!misroles.equals(other.misroles))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}
	
	

}
