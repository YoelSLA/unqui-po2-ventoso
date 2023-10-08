package ar.edu.unq.po2.tp6.banco.solicitud;

import ar.edu.unq.po2.tp6.banco.Cliente;

public abstract class SolicitudDeCredito implements Solicitud {

	private Cliente solicitante;
	private Double monto;
	private Integer cantidadCuotas;

	public SolicitudDeCredito(Cliente solicitante, Double monto, Integer cantidadCuotas) {
		this.solicitante = solicitante;
		this.monto = monto;
		this.cantidadCuotas = cantidadCuotas;
	}

	public Double getMonto() {
		return monto;
	}

	public Double getCuotaMensual() {
		return monto / cantidadCuotas;
	}

	public Cliente getSolicitante() {
		return solicitante;
	}

	public Integer getCantidadCuotas() {
		return cantidadCuotas;
	}

	public abstract boolean esAceptable();
}
