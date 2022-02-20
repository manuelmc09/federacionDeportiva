package utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Utilidades {
	public static java.time.LocalDate leerFecha() {
		Scanner teclado = new Scanner(System.in);
		LocalDate fecha = null;
		boolean valido = false;
		System.out.println("Introduzca un valor para el día. Debe de estar entre 1 y 31");
		int dia = teclado.nextInt();
		System.out.println("Introduzca un valor para el mes. Debe de estar entre 1 y 12");
		int mes = teclado.nextInt();
		System.out.println("Introduzca un valor para el año. Debera de estar entre 1920 y 2021");
		int anio = teclado.nextInt();
		try {
			fecha=LocalDate.of(anio, mes, dia);

		} catch (Exception e) {
			System.out.println("Fecha incorrecta");
			valido = false;
		}

		return fecha;
	}

}
