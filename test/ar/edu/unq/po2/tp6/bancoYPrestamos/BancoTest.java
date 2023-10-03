package ar.edu.unq.po2.tp6.bancoYPrestamos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class BancoTest {
	
	Banco bancoNacion;

	@BeforeEach
	void setUp() {
		bancoNacion = new Banco();
		
	}
	
	@Mock
	Cliente yoel;

	@Test
	void ElBancoNacionNoTieneRegistradoNingunCliente() {
		assertEquals(0, bancoNacion.cantidadDeClientesRegistrados());
	}
	
	@Test
	void ElBancoNacionTieneRegistradoUnCliente() {
		bancoNacion.registrar(yoel);
		assertEquals(1, bancoNacion.cantidadDeClientesRegistrados());
	}

}
