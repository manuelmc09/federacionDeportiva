package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Colegiado {
	// Atributos
	private long id;
	private Categoria categoria;
	private DatosPersona colegiado;

	// Constructores
	/**
	 * Constructor por defecto
	 */
	public Colegiado() {
	}

	/**
	 * Constructor con todos 3 atributos
	 * 
	 * @param id
	 * @param categoria
	 * @param colegiado
	 */
	public Colegiado(long id, Categoria categoria, DatosPersona colegiado) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.colegiado = colegiado;
	}

	/**
	 * Constructor copia
	 * 
	 * @param c
	 */
	public Colegiado(Colegiado c) {
		this.id = c.id;
		this.categoria = c.categoria;
		this.colegiado = c.colegiado;
	}

	// Métodos públicos
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public DatosPersona getColegiado() {
		return colegiado;
	}

	public void setColegiado(DatosPersona colegiado) {
		this.colegiado = colegiado;
	}

	/**
	 * Método que devuelve toda la información del Colegiado
	 * 
	 * @return información de Colegiado
	 */
	@Override
	public String toString() {
		return "Colegiado [id=" + id + ", categoria=" + categoria + "\ncolegiado: " + colegiado.getNombre() + "\nNif: "
				+ colegiado.getTelefono() + "\nfechaNac: " + colegiado.getFechaNac().getYear();
	}

	/**
	 * Metodo para establecer una nuevo objeto Colegiado completo
	 * 
	 * @return col
	 */
	public static Colegiado nuevoColegiado() {
		Scanner teclado = new Scanner(System.in);
		Colegiado col = null;
		long id = -1;
		String categoria = "";
		String nif = "";
		String telefono = "";
		DatosPersona datos = null;
		System.out.println("Introduzca el id del colegiado:");
		id = teclado.nextLong();
		System.out.println("Introducir la categoria del colegiado. (Solo puede escoger entre N y S");
		categoria = teclado.next();
		System.out.println("Introducir el nif del colegiado ");
		nif = teclado.next();
		System.out.println("Introducir el resto de datos personales: ");
		datos = DatosPersona.nuevaPersona();
		return col;
	}

	/**
	 * Método para importar desde un fichero de bytes que contiene varios objetos
	 * Colegiado, aquellos que sean de una categoría en concreto (la cual se pasa
	 * como parámetro en forma de cadena de caracteres). El método devolverá la
	 * colección de objetos de la entidad Colegiado que cumplan ese criterio.
	 * 
	 * @param col
	 */
	private static ArrayList<Colegiado> exportarDatosbytes(String Categoria) {
		ArrayList<Colegiado> colegiadosCat = null;
		return colegiadosCat;

	}

}
