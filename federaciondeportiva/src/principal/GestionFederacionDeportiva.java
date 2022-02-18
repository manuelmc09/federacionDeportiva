package principal;

import java.util.InputMismatchException;
import java.util.Scanner;



public class GestionFederacionDeportiva {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int opcion = 0;
		do {
			System.out.println("\n------------------------------------");
			System.out.println("Gestion de la Federacion Deportiva ");
			System.out.println("------------------------------------\n");
			mostrarMenuSeleccionRol();
			try {
				opcion = teclado.nextInt();
				if (opcion < 1 || opcion > 5) {
					System.out.println("Opcion incorrecta.\n");
					continue;
				}
				int subopcion = -1;
				switch (opcion) {
				case 1:
					do {
						System.out.println("\nEligio perfil de usuario Directiva ");
						System.out.println("------------------------------------\n");
						// Aquí ya se tienen las opciones del menu para la Directiva
						mostrarMenuDirectiva();
						

						try {
							subopcion = teclado.nextInt();
							if (subopcion < 1 || subopcion > 4) {
								System.out.println("Opcion incorrecta.\n");
								continue;
							}
							int eleccion=-1;
							// Aqui ya se tienen las opciones para el submenu de la DIRECTIVA
							menugestionDirectiva(eleccion);

						} catch (InputMismatchException e) {
							System.out.println("La eleccion debe de ser un número entre 1 y 4 Intente de nuevo ");
							teclado.next();
						}

					} while (subopcion != 4);
					break;
				case 2:
					do {
						System.out.println("\nEligio perfil de usuario Manager ");
						System.out.println("------------------------------------\n");
						// Aquí ya se tienen las opciones del menu para el Manager
						mostrarMenuManager();

						try {
							subopcion = teclado.nextInt();
							if (subopcion < 1 || subopcion > 3) {
								System.out.println("Opcion incorrecta.\n");
								continue;
							}

						} catch (InputMismatchException e) {
							System.out.println("La eleccion debe de ser un número entre 1 y 3 Intente de nuevo ");
							teclado.next();
						}

					} while (subopcion != 3);
					break;
				case 3:
					do {
						System.out.println("\nEligio perfil de usuario Colegiado ");
						System.out.println("------------------------------------\n");
						// Aquí ya se tienen las opciones del menu para el Colegiado
						mostrarMenuColegiado();

						try {
							subopcion = teclado.nextInt();
							if (subopcion < 1 || subopcion > 3) {
								System.out.println("Opcion incorrecta.\n");
								continue;
							}

						} catch (InputMismatchException e) {
							System.out.println("La eleccion debe de ser un número entre 1 y 3 Intente de nuevo ");
							teclado.next();
						}

					} while (subopcion != 3);
					break;
				case 4:
					do {
						System.out.println("\nEligio perfil de usuario Atleta ");
						System.out.println("------------------------------------\n");
						// Aquí ya se tienen las opciones del menu para el Atleta
						mostrarMenuAtleta();

						try {
							subopcion = teclado.nextInt();
							if (subopcion < 1 || subopcion > 3) {
								System.out.println("Opcion incorrecta.\n");
								continue;
							}

						} catch (InputMismatchException e) {
							System.out.println("La eleccion debe de ser un número entre 1 y 3 Intente de nuevo ");
							teclado.next();
						}

					} while (subopcion != 3);
					break;
				default:
					System.out.println("\nSaliendo....");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("La eleccion debe de ser un número entre 1 y 5. Intente de nuevo ");
				teclado.next();
			}
		} while (opcion != 5);// opcion SALIR en el Menu de elección de su perfil de usuario
		System.out.println("Gracias por su participación");
	} // Final del main

	/**
	 * Metodo que gestiona la presentación de roles de usuario de la gestión de la
	 * FEDERACIÓN DEPORTIVA
	 */
	private static void mostrarMenuSeleccionRol() {
		System.out.println("Seleccione su perfil de usuario: \n");
		System.out.println("1. Directiva ");
		System.out.println("2. Manager ");
		System.out.println("3. Colegiado ");
		System.out.println("4. Atleta ");
		System.out.println("5. Salir ");
	}

	/**
	 * Metodo para mostrar las opciones del rol DIRECTIVA
	 */
	private static void mostrarMenuDirectiva() {
		System.out.println("Seleccione que operacion desee realizar: \n");
		System.out.println("1. Gestión de medallas ");
		System.out.println("2. Conformar Competición ");
		System.out.println("3. Conformar Prueba ");
		System.out.println("4. Salir ");
	}

	/**
	 * Metodo para mostrar las opciones del rol MANAGER
	 */
	private static void mostrarMenuManager() {
		System.out.println("Seleccione que operación desee realizar: \n");
		System.out.println("1. Conformar equipo ");
		System.out.println("2. Inscribirse en Prueba ");
		System.out.println("3. Salir ");

	}

	/**
	 * Metodo para mostrar las opciones del rol COLEGIADO
	 */
	private static void mostrarMenuColegiado() {
		System.out.println("Seleccione que operación desee realizar: \n");
		System.out.println("1. Desarrollo de Prueba ");
		System.out.println("2. Validar Desarrollo de Prueba ");
		System.out.println("3. Salir ");
	}

	/**
	 * Metodo para mostrar las opciones del rol COLEGIADO
	 */
	private static void mostrarMenuAtleta() {
		System.out.println("Seleccione que operación desee realizar: \n");
		System.out.println("1. Federarse ");
		System.out.println("2. Inscripción de Atleta en Prueba ");
		System.out.println("3. Salir ");
	}

	/**
	 * Menu para gestionar todos los servicios de la FEDERACION DEPORTIVA por parte
	 * de la DIRECTIVA
	 */
	private static void menugestionDirectiva(int eleccion) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("SUBMENUS de la DIRECTIVA");
		int subeleccion=-1;
		switch (subeleccion) {
		case 1:
			System.out.println("\n-----------------");
			System.out.println("Gestion de Medallas");
			System.out.println("--------------------\n");
			break;
		case 2:
			System.out.println("\\n--------------------------------");
			System.out.println("Gestion para conformar Competición");
			System.out.println("----------------------------------\n");
			break;
		case 3:
			System.out.println("\\n--------------------------------");
			System.out.println("Gestion para conformar Prueba");
			System.out.println("----------------------------------\n");
			break;
		default:
			System.out.println("Saliendo....");
			break;

		}
	}
}
