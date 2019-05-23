package com.pecata.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="pedido")
public class PedidoVO {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idpedido;
	
	private LocalDate fecha_pedido;
	
	private String direccion_envio;
	
	@OneToMany(mappedBy="pedido",cascade= {CascadeType.ALL}, fetch=FetchType.EAGER)
	private List<ProductoEstaEnPedidoVO> pedidos = new ArrayList<ProductoEstaEnPedidoVO>();
	
	@ManyToOne
	@JoinColumn(name="idusuario")
	private UsuarioVO cliente;

	public PedidoVO(int idpedido, LocalDate fecha_pedido, String direccion_envio, List<ProductoEstaEnPedidoVO> pedidos,
			UsuarioVO cliente) {
		super();
		this.idpedido = idpedido;
		this.fecha_pedido = fecha_pedido;
		this.direccion_envio = direccion_envio;
		this.pedidos = pedidos;
		this.cliente = cliente;
	}

	public PedidoVO(LocalDate fecha_pedido, String direccion_envio, List<ProductoEstaEnPedidoVO> pedidos,
			UsuarioVO cliente) {
		super();
		this.fecha_pedido = fecha_pedido;
		this.direccion_envio = direccion_envio;
		this.pedidos = pedidos;
		this.cliente = cliente;
	}
	
	

	public PedidoVO(LocalDate fecha_pedido, String direccion_envio, UsuarioVO cliente) {
		super();
		this.fecha_pedido = fecha_pedido;
		this.direccion_envio = direccion_envio;
		this.cliente = cliente;
	}

	public PedidoVO() {
		super();
	}

	public int getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}

	public LocalDate getFecha_pedido() {
		return fecha_pedido;
	}

	public void setFecha_pedido(LocalDate fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}

	public String getDireccion_envio() {
		return direccion_envio;
	}

	public void setDireccion_envio(String direccion_envio) {
		this.direccion_envio = direccion_envio;
	}

	public List<ProductoEstaEnPedidoVO> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<ProductoEstaEnPedidoVO> pedidos) {
		this.pedidos = pedidos;
	}

	public UsuarioVO getCliente() {
		return cliente;
	}

	public void setCliente(UsuarioVO cliente) {
		this.cliente = cliente;
	}
	
	public void addProducto(ProductoEstaEnPedidoVO producto) {
		this.pedidos.add(producto);
	}
	
	public List<ProductoEstaEnPedidoVO> removeProducto(ProductoVO p) {
		Iterator<ProductoEstaEnPedidoVO> it=pedidos.iterator();
		ProductoEstaEnPedidoVO a=new ProductoEstaEnPedidoVO();
		while(it.hasNext()) {
			a=it.next();
			if (p.equals(a.getProducto()))
				it.remove();
		}
		return pedidos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((direccion_envio == null) ? 0 : direccion_envio.hashCode());
		result = prime * result + ((fecha_pedido == null) ? 0 : fecha_pedido.hashCode());
		result = prime * result + idpedido;
		result = prime * result + ((pedidos == null) ? 0 : pedidos.hashCode());
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
		PedidoVO other = (PedidoVO) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (direccion_envio == null) {
			if (other.direccion_envio != null)
				return false;
		} else if (!direccion_envio.equals(other.direccion_envio))
			return false;
		if (fecha_pedido == null) {
			if (other.fecha_pedido != null)
				return false;
		} else if (!fecha_pedido.equals(other.fecha_pedido))
			return false;
		if (idpedido != other.idpedido)
			return false;
		if (pedidos == null) {
			if (other.pedidos != null)
				return false;
		} else if (!pedidos.equals(other.pedidos))
			return false;
		return true;
	}
	
	
	
	
}
