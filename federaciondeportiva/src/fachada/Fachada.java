package fachada;

import java.util.Scanner;

public class Fachada {

	Scanner teclado = new Scanner(System.in);
	private static Fachada portal;

	public Fachada() {

	}

	public void mostrarMenuSeleccionRol() {
		System.out.println("Seleccione su perfil de usuario: \n");
		System.out.println("1. Directiva ");
		System.out.println("2. Manager ");
		System.out.println("3. Colegiado ");
		System.out.println("4. Atleta ");
		System.out.println("5. Salir ");
	}

	public void mostrarMenuDirectiva() {
		System.out.println("Seleccione que operacion desee realizar: \n");
		System.out.println("1. Gestión de medallas ");
		System.out.println("2. Conformar Competición ");
		System.out.println("3. Conformar Prueba ");
		System.out.println("4. Salir ");
	}

	public void mostrarMenuManager() {
		System.out.println("Seleccione que operación desee realizar: \n");
		System.out.println("1. Conformar equipo ");
		System.out.println("2. Inscribirse en Prueba ");
		System.out.println("3. Salir ");

	}

	public void mostrarMenuColegiado() {
		System.out.println("Seleccione que operación desee realizar: \n");
		System.out.println("1. Desarrollo de Prueba ");
		System.out.println("2. Validar Desarrollo de Prueba ");
		System.out.println("3. Salir ");

	}

	public void mostrarMenuAtleta() {
		System.out.println("Seleccione que operación desee realizar: \n");
		System.out.println("1. Federarse ");
		System.out.println("2. Inscripción de Atleta en Prueba ");
		System.out.println("3. Salir ");


	}
}
