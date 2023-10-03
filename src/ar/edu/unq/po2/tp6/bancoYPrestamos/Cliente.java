package ar.edu.unq.po2.tp6.bancoYPrestamos;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {

	private String apellido;
	private String direccion;
	private LocalDate fechaNacimiento;
	private String nombre;
	private double sueldoNeto;

	public Cliente(String nombre, String apellido, String direccion, LocalDate fechaNacimiento, double sueldoNeto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoNeto = sueldoNeto;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public double getSueldoNeto() {
		return sueldoNeto;
	}

	public int getEdad() {
		return Period.between(fechaNacimiento, LocalDate.now()).getYears();
	}

	public Double getSueldoNetoAnual() {
		final int cantidadMeses = 12;
		return getSueldoNeto() * cantidadMeses;
	}

	public void pedirSolicitudDeCredito(Solicitud solicitud, Banco banco) {
		banco.otorgarSolicitudDeCreditoPara(solicitud, this);
		
	}

}
