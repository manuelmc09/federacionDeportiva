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
		DatosPersona persona = new DatosPersona();
		long id = -1;
		String nombre = "";
		String telefono = "";
		LocalDate fechaNac = null;
		boolean valido = false;
		// Leemos el id y validamos
		do {

			valido = Utilidades.validarId(id);
			if (!valido)
				System.out.println("Id invalido.");
		} while (!valido);
		persona.setId(id);

		// Leemos el telefono y validamos
		do {
			System.out.println("Introduzca el teléfono de la persona:");
			telefono = teclado.next();
			valido = Utilidades.validarTelefono(telefono);
			if (!valido)
				System.out.println("Telefono invalido.");
		} while (!valido);
		persona.setTelefono(telefono);
		// Leermos fecha y validamos
		do {
			try {
				System.out.println("Introduzca la fecha de nacimiento de la persona");
				fechaNac = Utilidades.leerFecha();
				valido = true;
			} catch (Exception e) {
				System.out.println("Ha ocurrido una excepcion al leer la fecha: " + e.getMessage());
				valido = false;
			}

		} while (!valido);
		persona.setFechaNac(fechaNac);

		return persona;
	}

}
