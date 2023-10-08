package ar.edu.unq.po2.tp6.banco;

public interface Prestamo {
	
	Cliente getCliente();
	
	boolean getEstaPagado();
	
	Double getMontoCuota();
	
	void registrarPagoDeCuota();
	

}
