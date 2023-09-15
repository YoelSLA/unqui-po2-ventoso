package ar.edu.unq.po2.tp4;

public class Main {
	public static void main(String[] args) {
		double numero = 17.387999999999998;

		// Redondea el número a dos decimales
		double numeroRecortado = Math.round(numero * 100.0) / 100.0;

		System.out.println(numeroRecortado); // Esto imprimirá 17.38
	}
}