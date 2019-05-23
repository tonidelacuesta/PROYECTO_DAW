package com.pecata;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.FixMethodOrder;

import com.pecata.modelo.PedidoVO;
import com.pecata.modelo.ProductoEstaEnPedidoVO;
import com.pecata.modelo.ProductoVO;
import com.pecata.modelo.UsuarioVO;
import com.pecata.repository.PedidoRepository;
import com.pecata.repository.ProductoRepository;
import com.pecata.repository.UsuarioRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DawApplicationTests {
	
	@Autowired
	ProductoRepository pr;
	
	@Autowired
	PedidoRepository pdr;
	
	@Autowired
	UsuarioRepository ur;
	
	@Test
	public void M1insertaUsuario() {
		
		String nombre = "Pedro";
		String apellido1 = "Gutierrez";
		String apellido2 = "Perez";
		String direccion = "Calle oscura";
		String correo = "miCorreo@mail.com";
		String telefono ="66666666";
		
		UsuarioVO user = new UsuarioVO(nombre,apellido1,apellido2,direccion,correo,telefono,null,null);
		ur.save(user);
		assertEquals("Gutierrez", ur.findByNombre("Pedro").getApellido1());
		
	}

	@Test
	public void M2insertaProducto() {
		
		ProductoVO p = new ProductoVO("Margarita","Mediana",7.5,null);
		pr.save(p);
		assertEquals("Margarita", pr.findByNombre("Margarita").getNombre());
		
	}
	
	@Test
	public void M3insertaPedido() {
		
		LocalDate fecha_pedido = LocalDate.now();
		UsuarioVO user = ur.findById(1).get();
		String direccion_envio = user.getDireccion();
		
		PedidoVO nuevo_pedido = new PedidoVO(fecha_pedido,direccion_envio,user);
		pdr.save(nuevo_pedido);
		assertEquals("Calle oscura",pdr.findById(2).get().getDireccion_envio());
		
		
	}
	
	@Test
	public void M4addProductoAlPedido() {
		
		PedidoVO pedido = pdr.findById(2).get();
		ProductoVO p1 = pr.findByNombre("Margarita");
		
		ProductoEstaEnPedidoVO detallePedido = new ProductoEstaEnPedidoVO(p1,pedido);
		
		pedido.addProducto(detallePedido);
		pdr.save(pedido);
		
		assertEquals("Margarita",pdr.findById(2).get().getPedidos().get(0).getProducto().getNombre());
		
	}

}
