package ar.edu.unq.po2.tp6.banco;

import ar.edu.unq.po2.tp6.banco.solicitud.Solicitud;

public class Credito implements Prestamo {

	private Double cuotaMensual;
	private Integer cuotasRestantes;
	private Cliente cliente;

	public Credito(Cliente cliente, Double cuotaMensual, Integer cuotasRestantes) {
		this.cliente = cliente;
		this.cuotaMensual = cuotaMensual;
		this.cuotasRestantes = cuotasRestantes;
	}

	public static Credito nuevoCreditoPara(Solicitud solicitud) {
		return new Credito(solicitud.getSolicitante(), solicitud.getMonto() / solicitud.getCantidadCuotas(),
				solicitud.getCantidadCuotas());
	}

	public Double getCuotaMensual() {
		return cuotaMensual;
	}

	public Integer getCuotasRestantes() {
		return cuotasRestantes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public boolean getEstaPagado() {
		return cuotasRestantes.equals(0);
	}

	@Override
	public Double getMontoCuota() {
		return cuotaMensual;
	}

	@Override
	public void registrarPagoDeCuota() {
		if(cuotasRestantes > 0) {
			cuotasRestantes =- 1;
		}
		
	}

}
