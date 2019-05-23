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
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	
	
	

}
