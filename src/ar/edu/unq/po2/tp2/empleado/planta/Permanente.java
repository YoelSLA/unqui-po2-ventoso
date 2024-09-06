package ar.edu.unq.po2.tp2.empleado.planta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp2.Concepto;
import ar.edu.unq.po2.tp2.EstadoCivil;

public class Permanente extends Planta {
 
	private int cantidadDeHijos, antiguedad;

	public Permanente(String nombre, String dirección, EstadoCivil estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico, int cantidadDeHijos, int antiguedad) {
		super(nombre, dirección, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantidadDeHijos = cantidadDeHijos;
		this.antiguedad = antiguedad;

	}

	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}
	
	@Override
	public double calcularSueldoBruto() {
		return this.getSueldoBasico() + this.salarioFamiliar();
	}

	private double salarioFamiliar() {
		return this.asignaciónPorHijo() + this.asignaciónPorCónyuge() + getAntiguedad() * 50;
	}
	
	private double asignaciónPorHijo() {
		return cantidadDeHijos * 150;
	}
	
	private double asignaciónPorCónyuge() {
		return (getEstadoCivil().equals(EstadoCivil.CASADO)) ? 100 : 0;
	}
	
	@Override
	protected double obraSocial() {
		return super.obraSocial() + + cantidadDeHijos * 20;
	}

	@Override
	protected double porcentajeJubilación() {
		return 0.15;
	}
	
	@Override
	protected List<Concepto> conceptosSueldoBruto() {
		List<Concepto> conceptos = new ArrayList<>();
		conceptos.add(new Concepto("Sueldo Basico", this.getSueldoBasico()));
		conceptos.add(new Concepto("Asignacion por Hijo", this.asignaciónPorHijo()));
		conceptos.add(new Concepto("Asignacion por Conyuge", this.asignaciónPorCónyuge()));
		conceptos.add(new Concepto("Antiguedad", this.getAntiguedad() * 50));
		return conceptos;
	}
	
}
