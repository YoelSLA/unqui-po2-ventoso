package ar.edu.unq.po2.tp2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReciboDeHaberes {
	
	private String nombreEmpleado, dirección;
	private LocalDateTime fechaDeEmisión;
	private double sueldoBruto;
	private double sueldoNeto;
	private List<Concepto> conceptos;
	
	public ReciboDeHaberes(String nombreEmpleado, String dirección, LocalDateTime fechaDeEmisión, double sueldoBruto,
			double sueldoNeto) {
		this.nombreEmpleado = nombreEmpleado;
		this.dirección = dirección;
		this.fechaDeEmisión = fechaDeEmisión;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.conceptos = new ArrayList<Concepto>();
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public String getDirección() {
		return dirección;
	}
	public LocalDateTime getFechaDeEmisión() {
		return fechaDeEmisión;
	}
	public double getSueldoBruto() {
		return sueldoBruto;
	}
	public double getSueldoNeto() {
		return sueldoNeto;
	}
	public List<Concepto> getConceptos() {
		return conceptos;
	}
	
	public void agregarConcepto(Concepto c) {
		conceptos.add(c);
	}
	
	public void mostrarRecibo() {
		String border = "+--------------------------------------------------------------+";
        String titleBorder = "+--------------------------------------------------------------+";
        String headerBorder = "+--------------------------------------------------------------+";
        String innerBorder = "+--------------------------------------------------------------+";
        String conceptBorder = "+------------------------------+------------+";

        System.out.println(titleBorder);
        System.out.println("|                RECIBO DE HABERES                             |");
        System.out.println(titleBorder);
        System.out.printf("| Nombre del Empleado: %-30s          |%n", nombreEmpleado);
        System.out.printf("| Direccion: %-35s |%n", dirección);
        System.out.printf("| Fecha de Emision: %-26s |%n", fechaDeEmisión.toLocalDate());
        System.out.println(headerBorder);
		
	
		
	}
	
	

}
