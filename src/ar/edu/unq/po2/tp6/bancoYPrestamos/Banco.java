package ar.edu.unq.po2.tp6.bancoYPrestamos;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Cliente> clientes;
	
	public Banco() {
		clientes = new ArrayList<Cliente>();
	}

	public int cantidadDeClientesRegistrados() {
		return clientes.size();
	}

	public void registrar(Cliente cliente) {
		clientes.add(cliente);
	}

	public void otorgarSolicitudDeCreditoPara(Solicitud solicitud, Cliente cliente) {
		
		
	}

}
