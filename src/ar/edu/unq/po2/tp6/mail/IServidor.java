package ar.edu.unq.po2.tp6.mail;

import java.util.List;

public interface IServidor {

	List<Correo> recibirNuevos(String user, String pass);

	void conectar(String nombreUsuario, String passUsuario);

	void enviar(Correo correo);

	float tazaDeTransferencia();

	void resetear();

	void realizarBackUp();

}
