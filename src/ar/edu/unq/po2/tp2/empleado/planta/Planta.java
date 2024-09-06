package ar.edu.unq.po2.tp2.empleado.planta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp2.Concepto;
import ar.edu.unq.po2.tp2.EstadoCivil;
import ar.edu.unq.po2.tp2.empleado.Empleado;

public abstract class Planta extends Empleado {
	
	public Planta(String nombre, String dirección, EstadoCivil estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico) {
		super(nombre, dirección, estadoCivil, fechaNacimiento, sueldoBasico);
	}

	public final double calcularRetenciones() {
		return this.obraSocial() + this.aportesJubilatorios() ; // TEMPLED METHOD
	}

	protected double aportesJubilatorios() {
		return this.calcularSueldoBruto() * this.porcentajeJubilación();
	}

	protected double obraSocial() {
		return this.calcularSueldoBruto() * 0.10;
	}
	
	protected abstract double porcentajeJubilación();
	
	@Override
	public List<Concepto> conceptos() {
		List<Concepto> conceptos = new ArrayList<Concepto>();
		conceptos.addAll(this.conceptosSueldoBruto());
		conceptos.addAll(this.conceptosRetenciones());
		return conceptos;
		
	}
	
	protected abstract List<Concepto> conceptosSueldoBruto();
	
	protected List<Concepto> conceptosRetenciones() {
		List<Concepto> conceptos = new ArrayList<>();
		conceptos.add(new Concepto("Obra Social", this.obraSocial()));
		conceptos.add(new Concepto("Aportes Jubilatorios", this.aportesJubilatorios()));
		return conceptos;
		
	}
	

}
