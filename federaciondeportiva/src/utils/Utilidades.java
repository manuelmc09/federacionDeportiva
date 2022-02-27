package utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.Normalizer;
import java.text.Normalizer.Form;

public class Utilidades {
	/**
	 * Metodo para validar el valor que el usuario introduce para una fecha donde
	 * hay 3 numeros enteros, uno para el día, otro el mes y otro para el año
	 * respectivamente. Si no es una fecha correcta, avisará al usuario y volverá a
	 * pedir introucir de nuevo los datos.
	 * 
	 * @return fecha de la clase java.time.LocalDate
	 */
	public static java.time.LocalDate leerFecha() {
		Scanner teclado = new Scanner(System.in);
		LocalDate fecha = null;
		boolean valido = false;
		do {

			System.out.println("Introduzca un valor para el día. Debe de estar entre 1 y 31");
			int dia = teclado.nextInt();
			System.out.println("Introduzca un valor para el mes. Debe de estar entre 1 y 12");
			int mes = teclado.nextInt();
			System.out.println("Introduzca un valor para el año.");
			int anio = teclado.nextInt();
			try {
				fecha = LocalDate.of(anio, mes, dia);
				valido = true;
			} catch (Exception e) {
				System.out.println("Fecha incorrecta");
				valido = false;
			}
		} while (!valido);

		return fecha;
	}

	/**
	 * Metodo que pide al usuario un valor por la entrada estandar. Si el dato es
	 * incorrecto, volverá a pedir el dato.
	 * 
	 * @return dato tipo float
	 */
	public static float leerFloat() {
		float dato = 0.0F;
		boolean valido = false;
		do {
			System.out.println("Introduzca valor con este formato (xx,xx)");
			Scanner teclado = new Scanner(System.in);
			try {
				dato = teclado.nextFloat();
				valido = true;
			} catch (InputMismatchException e) {
				System.out.println("Dato introducido incorrecto.");
				valido = false;
			}
		} while (!valido);
		// return Float.parseFloat(""+dato);
		return dato;
	}

	/**
	 * Metodo que valida una cadena de caracteres conteniendo tildes y caracter ñ
	 * 
	 * @param string
	 * @return
	 */
	public static String removeDiacriticalMarks(String string) {
		// Form.NFC acepta ñ y distingue las tildes en español
		return Normalizer.normalize(string, Form.NFC).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
	}

	/**
	 * Valida que una cadena de caracteres contiene dígitos únicamente
	 * 
	 * @param tfn
	 * @return
	 */
	public static boolean validarTelefono(String tfn) {
		return tfn.trim().chars().allMatch(Character::isDigit);
	}

	/**
	 * Valida que una cadena de caracteres contiene letras o espacios únicamente,
	 * longitud entre 1 y 50 caractreres
	 * 
	 * @param nombre
	 * @return
	 */
	public static boolean validarNombre(String nombre) {
		// regEx general para cadena de caracteres con longitud entre 1 y 50 caracteres,
		// aceptando dígitos, letras MAYUS y minúsculas, con tildes, diréresis y
		// diferentes símbolos especiales
		// Pattern patron = Pattern.compile("[
		// 0-9A-Za-zñÑáéíóúÁÉÍÓÚäëïöüÄËÏÖÜ¡!¿?@#$%()=+-€/.,]{1,50}");

		Pattern patron = Pattern.compile("[ A-Za-zñÑáéíóúÁÉÍÓÚäëïöüÄËÏÖÜ-]{1,50}");
		Matcher comprobacion = patron.matcher(nombre);
		return comprobacion.matches();//
	}

	/**
	 * Funcion auxiliar para validar direccion
	 * 
	 * @param dir
	 * @return
	 */
	public static boolean validarDireccion(String dir) {
		boolean ret = false;
		if (dir.length() <= 50)
			ret = true;
		return ret;
	}

	/**
	 * Metodo para verificar el valor del id
	 * 
	 * @param id
	 * @return
	 */
	public static boolean validarId(long id) {
		Scanner teclado = new Scanner(System.in);
		boolean valido = false;
		do {
			System.out.println("Introducir un valor valido para el id ");
			id = teclado.nextLong();
			try {
				if (id > 0)
					valido = true;
				else
					valido = false;

			} catch (InputMismatchException e) {
				System.out.println("Dato introducido incorrecto.");
				valido = false;
			}

		} while (!valido);
		return valido;

	}

	/**
	 * Metodo para validar la Categoria
	 * 
	 * @param c
	 * @return
	 */
	public static boolean validarCategoria(char c) {
		boolean valido = false;
		char[] letra = { 'N', 'n', 'S', 's' };
		System.out.println("Una letra para Categoria: ('n'/'N' o tambien 's'/'S'");
		for (int i = 0; i < letra.length; i++) {
			if (letra[i] == c) {
				valido = true;
			} else {
				valido = false;
			}
		}
		return valido;
	}

}
