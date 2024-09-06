package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

import ar.edu.unq.po2.tp2.empleado.Contratado;
import ar.edu.unq.po2.tp2.empleado.planta.Permanente;
import ar.edu.unq.po2.tp2.empleado.planta.Temporario;

public class Main {

	public static void main(String[] args) {
		
		Empresa e = new Empresa("Coca-Cola", 112312);
				
		Permanente p = new Permanente("Yoel", "Brown 5066", EstadoCivil.CASADO, LocalDate.now(), 1000.0, 0, 0);
		Temporario t = new Temporario("Yoel", "Brown 5066", EstadoCivil.CASADO, LocalDate.now(), 1000.0, LocalDate.now(), 0);
		Contratado c = new Contratado("Yoel", "Brown 5066", EstadoCivil.CASADO, LocalDate.now(), 1000.0, 0, "Hola");

		
		e.contratarEmpleado(p);
		e.contratarEmpleado(c);
		e.contratarEmpleado(t);
		
		e.realizarLiquidaciónDeSueldos();
		
		e.getRecibosDeHaberes().get(0).mostrarRecibo();
		e.getRecibosDeHaberes().get(1).mostrarRecibo();
		e.getRecibosDeHaberes().get(2).mostrarRecibo();
		

	}

}
