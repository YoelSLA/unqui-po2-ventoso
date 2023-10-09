package ar.edu.unq.po2.tp61;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.tp6.banco.Banco;
import ar.edu.unq.po2.tp6.banco.Cliente;
import ar.edu.unq.po2.tp6.banco.solicitud.Solicitud;

class BancoTest {
	
	Banco bancoNacion;
	
	@Mock
	Cliente yoel;
	
	@Mock
	Solicitud solicitud;

	@BeforeEach
	void setUp() {
		bancoNacion = new Banco();
		yoel = mock(Cliente.class);
		solicitud = mock(Solicitud.class);
	}
	
	@Test
	void testElBancoNacionNoTieneRegistradoNingunCliente() {
		assertEquals(0, bancoNacion.cantidadDeClientesRegistrados());
	}
	
	@Test
	void testElBancoNacionTieneRegistradoUnCliente() {
		bancoNacion.registrar(yoel);
		assertEquals(1, bancoNacion.cantidadDeClientesRegistrados());
	}
	
	@Test
	void testElBancoNacionConoceASusClientesRegistrados() {
		bancoNacion.registrar(yoel);
		assertEquals(List.of(yoel), bancoNacion.getClientes());
	}
	
	@Test
	void testElBancoNoPuedeOtorgarUnaSolcitudAUnClientePorqueNoEstaRegistrado() {
		assertThrows(RuntimeException.class, ()-> bancoNacion.otorgarSolicitudDeCreditoPara(solicitud, yoel));
	}
	
	@Test
	void testElBancoPuedeOtorgarUnaSolcitudAUnCliente() {	
		
		// Set Up
		when(solicitud.esAceptable()).thenReturn(true);

		bancoNacion.otorgarSolicitudDeCreditoPara(solicitud, yoel); // SUT
		
		
		verify(solicitud, times(1)).esAceptable();
		
	}
	
	
	
	
	
	

}