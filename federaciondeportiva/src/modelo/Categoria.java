package modelo;

import java.util.Scanner;

public enum Categoria {
	NORTE("Norte", 'N'), SUR("Sur", 'S');

	// Atributos
	String nombre;
	private char cod;

	// Constructor
	Categoria(String nombre, char cod) {
		this.nombre = nombre;
		this.cod = cod;
	}

	// Métodos públicos

	public char getCod() {
		return cod;
	}

	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para mostrar la Categoria del arbitro y su corespondiente codigo
	 */
	public static void mostrarCategoria() {
		int i = 1;
		for (Categoria cat : Categoria.values()) {
			System.out.println(i + "--> " + cat.getNombre() + " se corresponde con el codigo " + cat.getCod());
		}
	}

	/**
	 * Metodo para seleccionar la Categoria a la que pertenece el arbitro entre las
	 * dos opciones dadas
	 * 
	 * @return categoria
	 */
	public static Categoria seleccionarCategoria() {
		Categoria cat;
		boolean valido = false;
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		do {
			try {
				System.out.println("Elija el tipo de categoria:\n1: para 'N'-->Norte \t2 para 'S' -->Sur");
				opcion = teclado.nextInt();
				if (opcion < 1 || opcion > 2) {
					System.out.println("Opcion incorrecta ");
					valido = false;
				} else {
					valido = true;
				}

			} catch (Exception e) {
				System.out.println("Se ha producido una excepcion: " + e.getMessage());
				valido = false;
			}

		} while (!valido);
		if (opcion == 1) {
			cat = Categoria.NORTE;
		} else {
			cat = Categoria.SUR;
		}
		return cat;
	}

}
