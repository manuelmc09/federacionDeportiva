package modelo;

import java.util.Scanner;

import utils.Utilidades;

public class Manager {
	// Atributos
	private long id;
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
	 * @param direccion
	 * @param manager
	 */
	public Manager(long id, String direccion, DatosPersona manager) {
		super();
		this.id = id;
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
		return "Manager [id=" + id + ", direccion=" + direccion + ", manager=" + manager + "]";
	}

	/**
	 * Metodo que crea un nuevo Manager completo
	 * 
	 * @return objeto Manager
	 */
	public static Manager nuevoManager() {
		Scanner teclado = new Scanner(System.in);
		Manager manager = new Manager();
		long id = -1;
		String direccion = "";
		DatosPersona datos = new DatosPersona();
		System.out.println("Introducir el id del manager ");
		id = teclado.nextLong();
		// Leemos la dirección y validamos
		boolean valido = false;
		do {
			 System.out.println("Introducir la dirección del manager ");
			 direccion = teclado.next();
			valido = Utilidades.validarDireccion(direccion);
			if (!valido)
				System.out.println("Direccion invalida.");

		} while (!valido);
		manager.setDireccion(direccion);

		System.out.println("Seguimos Introduciendo el resto de sus datos personales: ");
		datos = DatosPersona.nuevaPersona();
		manager = new Manager(id, direccion, datos);
		return manager;

	}
}
