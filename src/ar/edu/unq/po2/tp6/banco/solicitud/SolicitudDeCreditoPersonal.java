package ar.edu.unq.po2.tp6.banco.solicitud;

import ar.edu.unq.po2.tp6.banco.Cliente;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito {

	private static final double PORCENTAJE_INGRESO_ANUAL = 0.7;
	private static final double REQUISITO_INGRESO_ANUAL = 15000.00;

	public SolicitudDeCreditoPersonal(Cliente solicitante, Double monto, Integer plazoEnMeses) {
		super(solicitante, monto, plazoEnMeses);
	}

	@Override
	public boolean esAceptable() {
		return cumpleRequisitoDeIngresoMensual() && cumpleRequisitoDeIngresoAnual();
	}

	private boolean cumpleRequisitoDeIngresoAnual() {
		return getSolicitante().getSueldoNetoAnual() >= REQUISITO_INGRESO_ANUAL;
	}

	private boolean cumpleRequisitoDeIngresoMensual() {
		return getCuotaMensual() <= getSolicitante().getSueldoNetoMensual() * PORCENTAJE_INGRESO_ANUAL;
	}

}
