package ar.edu.unq.po2.tp2.empleado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp2.Concepto;
import ar.edu.unq.po2.tp2.EstadoCivil;

public class Contratado extends Empleado {
	
	private int nroContrato;
	private String medioDePago;

	public Contratado(String nombre, String dirección, EstadoCivil estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico, int nroContrato, String medioDePago) {
		super(nombre, dirección, estadoCivil, fechaNacimiento, sueldoBasico);
		this.nroContrato = nroContrato;
		this.medioDePago = medioDePago;
	}
	
	public int getNroContrato() {
		return nroContrato;
	}

	public String getMedioDePago() {
		return medioDePago;
	}

	@Override
	public double calcularSueldoBruto() {
		return this.getSueldoBasico();
	}

	@Override
	public double calcularRetenciones() {
		return 50;
	}

	@Override
	public List<Concepto> conceptos() {
		List<Concepto> conceptos = new ArrayList<>();;
		conceptos.add(new Concepto("Sueldo Basico", this.getSueldoBasico()));
		conceptos.add(new Concepto("Gastos Administrativos Contractuales", 50.0));
		return conceptos;
	}

	


}
