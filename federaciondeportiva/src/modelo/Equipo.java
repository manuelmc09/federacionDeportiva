package modelo;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import utils.Utilidades;

public class Equipo extends Participante {
	// Atributos
	private long idequipo;
	private String nombre;
	private int anioinscripcion;
	private Manager manager;
	private TreeSet<Atleta> componentes = new TreeSet<Atleta>();

	// Constructores
	/**
	 * Constructor por defecto
	 */
	public Equipo() {
		super();
		this.componentes = new TreeSet<Atleta>();
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param idequipo
	 * @param nombre
	 * @param anioinscripcion
	 * @param manager
	 * @param componentes
	 */
	public Equipo(long idequipo,String nombre, int anioinscripcion, Manager manager, TreeSet<Atleta> componentes) {
		super();
		this.idequipo = idequipo;
		this.nombre=nombre;
		this.anioinscripcion = anioinscripcion;
		this.componentes = new TreeSet<Atleta>();
	}

	/**
	 * Constructor con 4 parametros
	 * 
	 * @param idParticipante
	 * @param dorsal
	 * @param calle
	 * @param equipo
	 */
	public Equipo(long idParticipante, int dorsal, char calle, Equipo equipo) {
		super(idParticipante, dorsal, calle);
		this.idequipo = equipo.idequipo;
		this.anioinscripcion = equipo.anioinscripcion;
		this.manager = equipo.manager;
	}

	/**
	 * Constructor con un parametro de la propia clase Equipo.LLamado constructor
	 * copia
	 * 
	 * @param e
	 */
	public Equipo(Equipo e) {
		this.idequipo = e.idequipo;
		this.nombre=e.nombre;
		this.anioinscripcion = e.anioinscripcion;
		this.manager = e.manager;
		this.componentes = e.componentes;
	}

	// Metodos publicos
	public long getIdequipo() {
		return idequipo;
	}

	public void setIdequipo(long idequipo) {
		this.idequipo = idequipo;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnioinscripcion() {
		return anioinscripcion;
	}

	public void setAnioinscripcion(int anioinscripcion) {
		this.anioinscripcion = anioinscripcion;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public TreeSet<Atleta> getComponentes() {
		return componentes;
	}

	public void setComponentes(TreeSet<Atleta> componentes) {
		this.componentes = componentes;
	}

	/**
	 * Metodo que devuelve la información del equipo y sus componentes
	 * 
	 * @return cadena
	 */
	@Override
	public String toString() {
		return "Equipo [idequipo=" + ", nombre=" + nombre + idequipo + ", anioinscripcion=" + anioinscripcion + ", manager=" + manager
				+ ", componentes=" + componentes + "]";
	}

	/**
	 * Metodo para crear un objeto equipo completo
	 * 
	 * @return equipo
	 */
	public Equipo nuevoEquipo() {
		Scanner teclado = new Scanner(System.in);
		Manager manager = new Manager();
		Atleta atleta = new Atleta();
		DatosPersona persona = new DatosPersona();
		Equipo equipo = new Equipo();
		System.out.println("Introducir el id del equipo: \n");
		equipo.setId(teclado.nextLong());
		System.out.println("Introducir el nombre del equipo: \n");
		equipo.setNombre(teclado.next());
		System.out.println("Introducir el año de inscripcion del equipo: \n");
		equipo.setAnioinscripcion(teclado.nextInt());
		System.out.println("Introducir el nombre del manager del equipo: \n");
		// equipo.setManager(persona.setNombre(teclado.next()));
		System.out.println("Introducir los componentes del equipo. Entre 3 y 5: \n");
		int numcomponentes = 5;
		for (int i = 3; i <= 5; i++) {
			componentes.add(atleta);
		}
		return equipo;
	}

}
