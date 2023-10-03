package ar.edu.unq.po2.tp6.mail;

import java.util.ArrayList;
import java.util.List;

public class ServidorPop implements IServidor {

	public List<Correo> recibirNuevos(String user, String pass) {
		List<Correo> retorno = new ArrayList<Correo>();
		// Verificar autenticidad de usuario.
		// obtener emails Nuevos del usuario.
		// asignar a retorno la lista de los nuevos e-mails.
		return retorno;
	}

	public void conectar(String nombreUsuario, String passUsuario) {
		// Verifica que el usuario sea valido y establece la conexion.

	}

	public void enviar(Correo correo) {
		// realiza lo necesario para enviar el correo.
	}

	@Override
	public float tazaDeTransferencia() {
		return 0;
	}

	@Override
	public void resetear() {
	}

	@Override
	public void realizarBackUp() {

	}

}
