package modelo;

import java.time.LocalDate;
import java.util.Scanner;

import utils.Utilidades;

public class DatosPersona {
	// Atributos
	private long id;
	private String nombre;
	private String telefono;
	private LocalDate fechaNac;

	// Constructores
	/**
	 * Constructor por defecto
	 */
	public DatosPersona() {

	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param id
	 * @param nombre
	 * @param telefono
	 * @param fechaNac
	 */
	public DatosPersona(Long id, String nombre, String telefono, LocalDate fechaNac) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.fechaNac = fechaNac;
	}

	// Metodos publicos
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	/**
	 * Metodo que devuelve toda la información sobre los datos de las personas
	 * 
	 * @return informacion de las personas
	 */
	@Override
	public String toString() {
		return "DatosPersona [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", fechaNac=" + fechaNac
				+ "]";
	}

	/**
	 * Metodo para crear un objeto de DatosPersona completo
	 * 
	 * @return
	 */
	public static DatosPersona nuevaPersona() {
		Scanner teclado = new Scanner(System.in);
		DatosPersona persona = null;
		long id = -1;
		String nombre = "";
		String telefono = "";
		LocalDate fechaNac = null;
		System.out.println("Introduzca el id de la persona:");
		id = teclado.nextInt();
		System.out.println("Introduzca el teléfono de la persona:");
		telefono = teclado.next();
		System.out.println("Introduzca la fecha de nacimiento de la persona");
		fechaNac = Utilidades.leerFecha();
		persona = new DatosPersona(id, nombre, telefono, fechaNac);
		return persona;
	}

}
