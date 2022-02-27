package modelo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Colegiado implements Serializable {
	// Atributos
	private long id;
	private Categoria categoria;
	private DatosPersona colegiado;

	// Constructores
	/**
	 * Constructor por defecto
	 */
	public Colegiado() {
		super();
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
	 * Constructor con 2 parametros
	 * 
	 * @param id
	 * @param categoria
	 */
	public Colegiado(long id, Categoria categoria) {
		super();
		this.id = id;
		this.categoria = categoria;
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
		Categoria categoria = null;
		String nif = "";
		String telefono = "";
		DatosPersona datos = null;
		System.out.println("Introduzca el id del colegiado:");
		id = teclado.nextLong();
		System.out.println("Introducir la categoria del colegiado.(Elija 1 para 'N' y 2 para 'S'");
		Categoria.seleccionarCategoria();
		System.out.println("Introducir el resto de datos personales: ");
		datos = DatosPersona.nuevaPersona();
		col = new Colegiado(id, categoria, datos);
		return col;
	}

}
