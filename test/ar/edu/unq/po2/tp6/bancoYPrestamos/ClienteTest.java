package ar.edu.unq.po2.tp6.bancoYPrestamos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {
	
	Cliente yoel;

	@BeforeEach
	void setUp() {
		yoel = new Cliente("Yoel", "Ventoso", "Brown 5066", LocalDate.of(2000, Month.FEBRUARY, 1), 15000.00);
	}

	@Test
	void UnClienteConoceSusDatos() {
		assertEquals("Yoel", yoel.getNombre());
		assertEquals("Ventoso", yoel.getApellido());
		assertEquals("Brown 5066", yoel.getDireccion());
		assertEquals(LocalDate.of(2000, Month.FEBRUARY, 1), yoel.getFechaNacimiento());
		assertEquals(15000, yoel.getSueldoNeto());
	}
	
	@Test
	void UnClienteSabeSuEdad() {
		assertEquals(23, yoel.getEdad());
	}
	
	@Test
	void UnClienteSabeSuSueldoNetoAnual() {
		assertEquals(yoel.getSueldoNeto() * 12, yoel.getSueldoNetoAnual());
	}
	
	@Test
	void UnClienteHaceUnaSolicitudAlBanco() {
		// Test Double Configuration
		Banco bancoNacion = mock(Banco.class); // DOC
		Solicitud solicitud = mock(Solicitud.class); // DOC
			
		// Exercise
		yoel.pedirSolicitudDeCredito(solicitud, bancoNacion); // SUT
		
		// Verify
		verify(bancoNacion, times(1)).otorgarSolicitudDeCreditoPara(solicitud, yoel);
	}

}
