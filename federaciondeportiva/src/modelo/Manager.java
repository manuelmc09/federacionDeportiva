package modelo;

import java.util.Scanner;

public class Manager {
	// Atributos
	private long id;
	private String telefono;
	private String direccion;
	private DatosPersona manager;

	// Constructores
	/**
	 * Constructor por defecto
	 */
	public Manager() {

	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param id
	 * @param telefono
	 * @param direccion
	 * @param manager
	 */
	public Manager(long id, String telefono, String direccion, DatosPersona manager) {
		super();
		this.id = id;
		this.telefono = telefono;
		this.direccion = direccion;
		this.manager = manager;
	}

	/**
	 * Constructor copia
	 * 
	 * @param m
	 */
	public Manager(Manager m) {
		this.id = m.id;
		this.telefono = m.telefono;
		this.direccion = m.direccion;
		this.manager = m.manager;
	}

	// Metodos publicos
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public DatosPersona getManager() {
		return manager;
	}

	public void setManager(DatosPersona manager) {
		this.manager = manager;
	}

	/**
	 * Metodo que devuelve toda la información sobre los datos de los manager
	 * 
	 * @return informacion de los manager
	 */
	@Override
	public String toString() {
		return "Manager [id=" + id + ", telefono=" + telefono + ", direccion=" + direccion + ", manager=" + manager
				+ "]";
	}

	/**
	 * Metodo que crea un nuevo Manager completo
	 * @return objeto Manager
	 */
	public static Manager nuevoManager() {
		Scanner teclado = new Scanner(System.in);
		Manager manager = null;
		DatosPersona datos = null;
		return manager;
	}
}
