package ar.edu.unq.po2.tp2.empleado;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import ar.edu.unq.po2.tp2.Concepto;
import ar.edu.unq.po2.tp2.EstadoCivil;

public abstract class Empleado {

	private String nombre, dirección;
	private EstadoCivil estadoCivil;
	private LocalDate fechaNacimiento;
	private double sueldoBasico;

	public Empleado(String nombre, String dirección, EstadoCivil estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico) {
		this.nombre = nombre;
		this.dirección = dirección;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDirección() {
		return dirección;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public int edad() {
		return Period.between(fechaNacimiento, LocalDate.now()).getYears();
	}
	
	public final double calcularSueldoNeto() {
		return this.calcularSueldoBruto() - this.calcularRetenciones();
	}
	
	public abstract double calcularSueldoBruto();
	
	public abstract double calcularRetenciones();

	public abstract List<Concepto> conceptos();

}
