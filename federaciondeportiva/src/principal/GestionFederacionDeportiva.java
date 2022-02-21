package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import modelo.Atleta;

public class GestionFederacionDeportiva {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int opcion = 0;
		do {
			System.out.println("\n---------------------------------------------------");
			System.out.println("\tGestion de la Federacion Deportiva ");
			System.out.println("---------------------------------------------------\n");
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
							if (subopcion < 1 || subopcion > 7) {
								System.out.println("Opcion incorrecta.Intente otra vez.... \n");
								continue;
							}
							int eleccion = -1;
							// Aqui ya se tienen las opciones para el submenu de la DIRECTIVA
							switch (subopcion) {
							case 1:
								System.out.println("\n--------------------------------------");
								System.out.println("\tGestion de Medallas");
								System.out.println("--------------------------------------\n");
								// Aquí se tienen las dos opciones para gestionar las medallas
								mostrarGestionMedallas();
								try {
									eleccion = teclado.nextInt();
									if (eleccion < 1 || eleccion > 3) {
										System.out.println("Opcion incorrecta.Intente otra vez.... \n");
										continue;
									}

									switch (eleccion) {
									case 1:
										System.out.println("\n#############################");
										System.out.println("\tNueva Medalla");
										System.out.println("#############################\n");
										break;
									case 2:
										System.out.println("\n#############################");
										System.out.println();
										System.out.println("#############################\n");
										break;
									default:
										System.out.println("Volviendo al menu de Gestion de Medallas....");
										break;
									}
								} catch (InputMismatchException e) {
									System.out
											.println("La eleccion debe de ser un número entre 1 y 3 Intente de nuevo ");
									teclado.next();
								}
								break;
							case 2:
								System.out.println("\n------------------------------------------");
								System.out.println("\tConformar la Competición");
								System.out.println("------------------------------------------\n");
								break;
							case 3:
								System.out.println("\n----------------------------------------");
								System.out.println("\tConformar la Prueba");
								System.out.println("----------------------------------------\n");
								break;
							case 4:
								System.out.println("\n------------------------------------------------------------");
								System.out.println("\tMétodo para exportar a un fichero de texto");
								System.out.println("------------------------------------------------------------\n");
								break;
							case 5:
								System.out.println("\n------------------------------------------------------------");
								System.out.println("\tMétodo para importar a un fichero de bytes");
								System.out.println("------------------------------------------------------------\n");
								break;
							case 6:
								System.out.println("\n-------------------------------------------------------------------------------------------");
								System.out.println("\tMétodo para exportar hacia un fichero binario una serie de objetos\n\t\t\t de la entidad Atleta");
								System.out.println("-------------------------------------------------------------------------------------------\n");
								break;
							default:
								System.out.println("Saliendo...");
								System.out.println("Volvemos al Menu Principal");
								break;
							}

						} catch (InputMismatchException e) {
							System.out.println("La eleccion debe de ser un número entre 1 y 7 Intente de nuevo ");
							teclado.next();
						}

					} while (subopcion != 7);
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
								System.out.println("Opcion incorrecta. Intente otra vez.... \n");
								continue;
							}
							// Aqui ya se tienen las opciones para el submenu del MANAGER
							switch (subopcion) {
							case 1:
								System.out.println("\n--------------------------------------");
								System.out.println("\tConformar Equipo");
								System.out.println("--------------------------------------\n");
								
								break;
							case 2:
								System.out.println("\n------------------------------------------");
								System.out.println("\tInscribirse en Prueba");
								System.out.println("------------------------------------------\n");
								break;

							default:
								System.out.println("Saliendo...");
								System.out.println("Volvemos al Menu Principal");
								break;
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
								System.out.println("Opcion incorrecta. Intente otra vez.... \n");
								continue;
							}
							// Aqui ya se tienen las opciones para el submenu del COLEGIADO
							switch (subopcion) {
							case 1:
								System.out.println("\n--------------------------------------");
								System.out.println("\tDesarrollo prueba");
								System.out.println("--------------------------------------\n");
								break;
							case 2:
								System.out.println("\n------------------------------------------");
								System.out.println("\tValidar Desarrollo de Prueba");
								System.out.println("------------------------------------------\n");
								break;

							default:
								System.out.println("Saliendo...");
								System.out.println("Volvemos al Menu Principal");
								break;
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
								System.out.println("Opcion incorrecta. Intente otra vez.... \n");
								continue;
							}
							// Aqui ya se tienen las opciones para el submenu del ATLETA
							switch (subopcion) {
							case 1:
								System.out.println("\n--------------------------------------");
								System.out.println("\tFederarse");
								System.out.println("--------------------------------------\n");
								Atleta a = Atleta.nuevoAtleta();
								break;
							case 2:
								System.out.println("\n------------------------------------------");
								System.out.println("\tInscribirse en Prueba");
								System.out.println("------------------------------------------\n");
								break;

							default:
								System.out.println("Saliendo...");
								System.out.println("Volvemos al Menu Principal");
								break;
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
		System.out
				.println("4. Método para exportar a un fichero de texto la información completa de todas aquellas \r\n"
						+ "medallas cuya pureza es mayor o igual a una dada ");
		System.out
				.println("5. Método para importar desde un fichero de bytes que contiene varios objetos Colegiado, \r\n"
						+ "aquellos que sean de una categoría en concreto ");
		System.out.println(
				"6. Método para exportar hacia un fichero binario una serie de objetos de la entidad Atleta, \r\n"
						+ "que cumplen unos criterios físicos, de entre una colección de Atletas que se pasa como parámetro ");
		System.out.println("7. Salir ");
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

	private static void mostrarGestionMedallas() {
		System.out.println("Indique la opcion que vaya a realizar: \n");
		System.out.println("1. Nueva medalla ");
		System.out.println("2. Ver medallas ");
		System.out.println("3. Salir ");
	}
}
