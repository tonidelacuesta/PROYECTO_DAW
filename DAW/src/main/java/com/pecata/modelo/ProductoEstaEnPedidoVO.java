package com.pecata.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="productoestaenpedido")
public class ProductoEstaEnPedidoVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproductoestaenpedido;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idproducto")
	private ProductoVO producto;
	
	@ManyToOne
	@JoinColumn(name="idpedido")
	private PedidoVO pedido;
	
	private int cantidad;


	public ProductoEstaEnPedidoVO(int idproductoestaenpedido, ProductoVO producto, PedidoVO pedido, int cantidad) {
		super();
		this.idproductoestaenpedido = idproductoestaenpedido;
		this.producto = producto;
		this.pedido = pedido;
		this.cantidad = cantidad;
	}

	public ProductoEstaEnPedidoVO(ProductoVO producto, PedidoVO pedido,int cantidad) {
		super();
		this.producto = producto;
		this.pedido = pedido;
		this.cantidad = cantidad;
	}

	public ProductoEstaEnPedidoVO() {
		super();
	}

	public int getIdproductoestaenpedido() {
		return idproductoestaenpedido;
	}

	public void setIdproductoestaenpedido(int idproductoestaenpedido) {
		this.idproductoestaenpedido = idproductoestaenpedido;
	}

	public ProductoVO getProducto() {
		return producto;
	}

	public void setProducto(ProductoVO producto) {
		this.producto = producto;
	}

	public PedidoVO getPedido() {
		return pedido;
	}

	public void setPedido(PedidoVO pedido) {
		this.pedido = pedido;
	}

<<<<<<< HEAD
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
=======
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idproductoestaenpedido;
		result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
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
		ProductoEstaEnPedidoVO other = (ProductoEstaEnPedidoVO) obj;
		if (idproductoestaenpedido != other.idproductoestaenpedido)
			return false;
		if (pedido == null) {
			if (other.pedido != null)
				return false;
		} else if (!pedido.equals(other.pedido))
			return false;
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		return true;
	}
	
>>>>>>> refs/heads/junit_test
	
	
	
	

}
