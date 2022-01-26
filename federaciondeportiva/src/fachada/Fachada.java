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
		System.out.println("1. Crear nuevos metales ");
		System.out.println("2. Modificar los datos de un metal ");
		System.out.println("3. Eliminar una medalla del sistema ");
		System.out.println("4. Salir ");
	}

	public void mostrarMenuManager() {

	}

	public void mostrarMenuColegiado() {

	}

	public void mostrarMenuAtleta() {

	}
}
