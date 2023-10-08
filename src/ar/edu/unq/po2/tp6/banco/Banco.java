package ar.edu.unq.po2.tp6.banco;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp6.banco.solicitud.Solicitud;

public class Banco {

	private List<Cliente> clientes;
	private DepartamentoPrestamos departamentoPrestamos;

	public Banco() {
		clientes = new ArrayList<Cliente>();
		departamentoPrestamos = new DepartamentoPrestamos();
	}

	public Integer cantidadDeClientesRegistrados() {
		return clientes.size();
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void registrar(Cliente cliente) {
		clientes.add(cliente);
	}

	public void otorgarSolicitudDeCreditoPara(Solicitud solicitud, Cliente cliente) {
		chequearSiElClienteEstaRegistrado(cliente);
		departamentoPrestamos.chequearSolicitud(solicitud);
	}

	private void chequearSiElClienteEstaRegistrado(Cliente cliente) {
		if (seEncuentraRegistrado(cliente)) {
			throw new RuntimeException("El cliente no se encuentra registrado en el banco.");
		}
	}

	private boolean seEncuentraRegistrado(Cliente cliente) {
		return clientes.stream().anyMatch(c -> cliente.equals(c));
	}

	public Object getDepartamentoPrestamos() {
		return departamentoPrestamos;
	}

}
