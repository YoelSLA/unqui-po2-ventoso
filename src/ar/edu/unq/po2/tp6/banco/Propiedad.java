package ar.edu.unq.po2.tp6.banco;

public class Propiedad implements Garantia {
	
	private String descripcion, direccion;
	private Double valorFiscal;

	@Override
	public Double getValorFiscal() {
		return valorFiscal;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getDescripcion() {
		return descripcion;
	}

}
