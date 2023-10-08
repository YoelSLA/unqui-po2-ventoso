package ar.edu.unq.po2.tp6.banco.solicitud;

import ar.edu.unq.po2.tp6.banco.Cliente;
import ar.edu.unq.po2.tp6.banco.Garantia;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito {

	private static final Integer EDAD_MAXIMA_PARA_CREDITO = 65;
	private static final Double PORCENTAJE_VALOR_FISCAL_GARANTIA = 0.7;
	private static final Double REQUISITO_CUOTA_INGRESO_MENSUAL = 0.5;
	private Garantia garantia;

	public SolicitudDeCreditoHipotecario(Cliente solicitante, Garantia garantia, Double monto, Integer plazoEnMeses) {
		super(solicitante, monto, plazoEnMeses);
		this.garantia = garantia;
	}

	@Override
	public boolean esAceptable() {
		return cumpleRequisitoDeIngresoMensual() && cumpleRequisitoDeValorFiscal() && cumpleRequisitoDeEdad();
	}

	private boolean cumpleRequisitoDeEdad() {
		return getSolicitante().getEdad() <= EDAD_MAXIMA_PARA_CREDITO;
	}

	private boolean cumpleRequisitoDeValorFiscal() {
		return garantia.getValorFiscal() * PORCENTAJE_VALOR_FISCAL_GARANTIA >= getCuotaMensual();
	}

	private boolean cumpleRequisitoDeIngresoMensual() {
		return getCuotaMensual() <= REQUISITO_CUOTA_INGRESO_MENSUAL * getSolicitante().getSueldoNetoMensual();
	}

}
