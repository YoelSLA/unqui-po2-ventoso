package ar.edu.unq.po2.tp6.banco;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp6.banco.solicitud.Solicitud;

public class DepartamentoPrestamos {

	private List<Solicitud> solicitudes;
	private List<Prestamo> prestamos;
	
	public DepartamentoPrestamos() {
		solicitudes = new ArrayList<Solicitud>();
		prestamos = new ArrayList<Prestamo>();
	}

	public List<Solicitud> getSolicitudes() {
		return solicitudes;
	}

	public List<Prestamo> getPrestamos() {
		return prestamos;
	}
	
	public void chequearSolicitud(Solicitud solicitud) {
		if (solicitud.esAceptable()) {
			solicitudes.add(solicitud);
			prestamos.add(Credito.nuevoCreditoPara(solicitud));
		} else {
			throw new RuntimeException("La solicitud del cliente no fue aceptada.");
		}
	}
	
	

}
