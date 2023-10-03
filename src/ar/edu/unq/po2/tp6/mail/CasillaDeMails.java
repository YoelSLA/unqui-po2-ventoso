package ar.edu.unq.po2.tp6.mail;

import java.util.ArrayList;
import java.util.List;

public class CasillaDeMails {

	private List<Correo> borrados;
	private List<Correo> inbox;

	public CasillaDeMails() {
		this.borrados = new ArrayList<Correo>();
		this.inbox = new ArrayList<Correo>();
	}
	
	public void borrarCorreo(Correo correo) {
		inbox.remove(correo);
		borrados.remove(correo);
	}
	
	public int contarBorrados() {
		return borrados.size();
	}

	public int contarInbox() {
		return inbox.size();
	}
	
	public void eliminarBorrado(Correo correo) {
		borrados.remove(correo);
	}

	public void agregarMails(List<Correo> recibirNuevos) {
		inbox.stream().forEach(correo -> inbox.add(correo));
		
	}

}
