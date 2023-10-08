package ar.edu.unq.po2.tp6.banco;

import java.time.LocalDate;
import java.time.Period;

import ar.edu.unq.po2.tp6.banco.solicitud.Solicitud;

public class Cliente {

	private String apellido, direccion, nombre;
	private LocalDate fechaNacimiento;
	private Double sueldoNetoMensual;

	public Cliente(String apellido, String direccion, LocalDate fechaNacimiento, String nombre,
			Double sueldoNetoMensual) {
		this.apellido = apellido;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getEdad() {
		return Period.between(fechaNacimiento, LocalDate.now()).getYears();
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public Double getSueldoNetoAnual() {
		final int cantidadMeses = 12;
		return getSueldoNetoMensual() * cantidadMeses;
	}

	public void pedirSolicitudDeCredito(Solicitud solicitud, Banco banco) {
		banco.otorgarSolicitudDeCreditoPara(solicitud, this);

	}

}
