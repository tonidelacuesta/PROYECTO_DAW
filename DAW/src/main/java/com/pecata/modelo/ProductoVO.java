package com.pecata.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class ProductoVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproducto;
	
	private String nombre;
	
	private String tamanyo;
	
	private double precio;
	
	@OneToMany(mappedBy="producto",cascade= {CascadeType.ALL}, fetch=FetchType.EAGER)
	private List<ProductoEstaEnPedidoVO> productos = new ArrayList<ProductoEstaEnPedidoVO>();

	public ProductoVO(int idproducto, String nombre, String tamanyo, double precio,
			List<ProductoEstaEnPedidoVO> productos) {
		super();
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.tamanyo = tamanyo;
		this.precio = precio;
		this.productos = productos;
	}

	public ProductoVO(String nombre, String tamanyo, double precio, List<ProductoEstaEnPedidoVO> productos) {
		super();
		this.nombre = nombre;
		this.tamanyo = tamanyo;
		this.precio = precio;
		this.productos = productos;
	}

	public ProductoVO() {
		super();
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(String tamanyo) {
		this.tamanyo = tamanyo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public List<ProductoEstaEnPedidoVO> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoEstaEnPedidoVO> productos) {
		this.productos = productos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idproducto;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tamanyo == null) ? 0 : tamanyo.hashCode());
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
		ProductoVO other = (ProductoVO) obj;
		if (idproducto != other.idproducto)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
			return false;
		if (tamanyo == null) {
			if (other.tamanyo != null)
				return false;
		} else if (!tamanyo.equals(other.tamanyo))
			return false;
		return true;
	}
	
	
	
	

}
