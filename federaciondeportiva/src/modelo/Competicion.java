package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Competicion {
	private long id;
	private String nombre;
	private int anio;
	private ArrayList<Prueba> pruebas;

	// Constructores
	/**
	 * Constructor con 3 parametros
	 * 
	 * @param id
	 * @param nombre
	 * @param anio
	 */
	public Competicion(long id, String nombre, int anio) {
		this.id = id;
		this.nombre = nombre;
		this.anio = anio;
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param id
	 * @param nombre
	 * @param anio
	 * @param pruebas
	 */
	public Competicion(long id, String nombre, int anio, ArrayList<Prueba> pruebas) {
		this.id = id;
		this.nombre = nombre;
		this.anio = anio;
		this.pruebas = pruebas;
	}

	// Métodos públicos

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

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public ArrayList<Prueba> getPruebas() {
		return pruebas;
	}

	public void setPruebas(ArrayList<Prueba> pruebas) {
		this.pruebas = pruebas;
	}

	/**
	 * Metodo que devuelve toda la información de Competición
	 * @return toda la información de la competicón
	 */
	@Override
	public String toString() {
		return "Competicion [id=" + id + ", nombre=" + nombre + ", anio=" + anio + ", pruebas=" + pruebas + "]";
	}
	
	/**
	 * Metodo para establecer una nuevo objeto Competicion completo
	 * @return c
	 */
	public static Competicion nuevaCompeticion() {
		Scanner teclado = new Scanner(System.in);
		Competicion c=null;
		return c;
		
	}
	

}
