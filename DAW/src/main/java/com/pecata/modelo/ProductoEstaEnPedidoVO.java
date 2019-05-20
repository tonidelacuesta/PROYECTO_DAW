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
	
	

}
