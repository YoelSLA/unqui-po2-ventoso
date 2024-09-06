package ar.edu.unq.po2.tp2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp2.empleado.Empleado;

public class Empresa {

	private String nombre;
	private int CUIT;
	private List<Empleado> empleados;
	private List<ReciboDeHaberes> recibosDeHaberes;
	
	public Empresa(String nombre, int CUIT) {
		this.nombre = nombre;
		this.CUIT = CUIT;
		this.empleados = new ArrayList<>();
		this.recibosDeHaberes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public int getCUIT() {
		return CUIT;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public List<ReciboDeHaberes> getRecibosDeHaberes() {
		return recibosDeHaberes;
	}

	public void contratarEmpleado(Empleado e) {
		empleados.add(e);
	}

	public double totalDeSueldosNetos() {
		double total = 0.0;
		for (Empleado e : empleados) {
			total += e.calcularSueldoNeto();
		}
		return total;
	}

	public double totalDeSueldosBrutos() {
		double total = 0.0;
		for (Empleado e : empleados) {
			total += e.calcularSueldoBruto();
		}
		return total;
	}

	public double totalDeRetenciones() {
		double total = 0.0;
		for (Empleado e : empleados) {
			total += e.calcularRetenciones();
		}
		return total;
	}

	public void realizarLiquidaciónDeSueldos() {
		for (Empleado e : empleados) {
			this.generarReciboPara(e);
		}
	}

	private void generarReciboPara(Empleado e) {
		ReciboDeHaberes reciboDeHaberes = new ReciboDeHaberes(e.getNombre(), e.getDirección(), LocalDateTime.now(),
				e.calcularSueldoBruto(), e.calcularSueldoNeto());

		for (Concepto c : e.conceptos()) {
			reciboDeHaberes.agregarConcepto(c);
		}

		recibosDeHaberes.add(reciboDeHaberes);

	}

}
