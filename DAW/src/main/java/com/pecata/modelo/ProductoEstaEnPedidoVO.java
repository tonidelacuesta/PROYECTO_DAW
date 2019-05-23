package com.pecata.modelo;

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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idproductoestaenpedido;
	
	@ManyToOne
	@JoinColumn(name="idproducto")
	private ProductoVO producto;
	
	@ManyToOne
	@JoinColumn(name="idpedido")
	private PedidoVO pedido;

	public ProductoEstaEnPedidoVO(int idproductoestaenpedido, ProductoVO producto, PedidoVO pedido) {
		super();
		this.idproductoestaenpedido = idproductoestaenpedido;
		this.producto = producto;
		this.pedido = pedido;
	}

	public ProductoEstaEnPedidoVO(ProductoVO producto, PedidoVO pedido) {
		super();
		this.producto = producto;
		this.pedido = pedido;
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
	
	
	
	

}
