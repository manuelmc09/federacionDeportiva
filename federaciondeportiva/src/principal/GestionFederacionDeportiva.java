package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import fachada.Fachada;

public class GestionFederacionDeportiva {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Fachada portal = new Fachada();

		int opcion = 0;
		do {
			System.out.println("\n------------------------------------");
			System.out.println("Gestion de la Federacion Deportiva ");
			System.out.println("------------------------------------\n");
			portal.mostrarMenuSeleccionRol();
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
						portal.mostrarMenuDirectiva();

						try {
							subopcion = teclado.nextInt();
							if (subopcion < 1 || subopcion > 4) {
								System.out.println("Opcion incorrecta.\n");
								continue;
							}

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
						portal.mostrarMenuManager();

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
						portal.mostrarMenuColegiado();
						
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
						portal.mostrarMenuAtleta();
						
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
	}

}
