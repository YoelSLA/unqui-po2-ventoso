package ar.edu.unq.po2.tp6.mail;

public class Cliente {

	private CasillaDeMails casillaMails;
	private String nombreUsuario;
	private String passUsuario;
	private IServidor servidor;

	public Cliente(IServidor servidor, String nombreUsuario, String passUsuario) {
		this.nombreUsuario = nombreUsuario;
		this.passUsuario = passUsuario;
		this.servidor = servidor;
		this.casillaMails = new CasillaDeMails();
		this.conectar();
	}

	public void conectar() {
		servidor.conectar(nombreUsuario, passUsuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo) {
		servidor.enviar(new Correo(asunto, destinatario, cuerpo));
		
	}
	
	public CasillaDeMails getCasillaMails() {
		return casillaMails;
	}

	public void recibirNuevos() {
		casillaMails.agregarMails(servidor.recibirNuevos(nombreUsuario, passUsuario));
	}





}
