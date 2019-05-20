package com.pecata.modelo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
public class PedidoVO {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idpedido;
	
	private LocalDate fecha_pedido;
	
	@OneToMany(mappedBy="pedido")
	private List<ProductoVO> productos;
	
	
}
