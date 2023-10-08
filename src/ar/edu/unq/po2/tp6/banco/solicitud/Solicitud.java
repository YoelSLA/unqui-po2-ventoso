package ar.edu.unq.po2.tp6.banco.solicitud;

import ar.edu.unq.po2.tp6.banco.Cliente;

public interface Solicitud {

	boolean esAceptable();
	
	Double getMonto();
	
	Cliente getSolicitante();
	
	Integer getCantidadCuotas();
}
