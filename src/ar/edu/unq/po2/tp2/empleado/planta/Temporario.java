package ar.edu.unq.po2.tp2.empleado.planta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp2.Concepto;
import ar.edu.unq.po2.tp2.EstadoCivil;

public class Temporario extends Planta {

	private LocalDate fechaDesignación;
	private int horasExtras;

	public Temporario(String nombre, String dirección, EstadoCivil estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico, LocalDate fechaDesignación, int horasExtras) {
		super(nombre, dirección, estadoCivil, fechaNacimiento, sueldoBasico);
		this.fechaDesignación = fechaDesignación;
		this.horasExtras = horasExtras;
	}

	public LocalDate getFechaDesignación() {
		return fechaDesignación;
	}

	public int getHorasExtras() {
		return horasExtras;
	}
	
	@Override
	public double calcularSueldoBruto() {
		return this.getSueldoBasico() + horasExtras * 40;
	}

	@Override
	protected double obraSocial() {
		return super.obraSocial() + ((edad() > 50) ? 25 : 0);
	}
	
	@Override
	protected double aportesJubilatorios() {
		return super.aportesJubilatorios() + horasExtras * 5;
	}

	@Override
	protected double porcentajeJubilación() {
		return 0.10;
	}

	@Override
	protected List<Concepto> conceptosSueldoBruto() {
		List<Concepto> conceptos = new ArrayList<>();
		conceptos.add(new Concepto("Sueldo Basico", this.getSueldoBasico()));
		conceptos.add(new Concepto("Horas extras", this.getHorasExtras() * 40));
		return conceptos;
	}



}
