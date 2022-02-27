package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import modelo.DatosPersona;

public class Prueba {
	// Atributos
	private long id;
	private String nombre;
	private LocalDate fecha;
	private boolean individual;
	private Lugar lugar;
	private Colegiado[] arbitros = new Colegiado[3];
	private Resultado resultado = null;
	// Podria ser un array puesto que sabemos de antemano el limite de participantes
	// en las pruebas: Entre 3 y 10.
	// private Participante[] participantes
	private ArrayList<Participante> participantes;

	// Constructores
	/**
	 * Constructor por defecto
	 */
	public Prueba() {

	}

	/**
	 * Constructor con 5 parametros
	 * 
	 * @param id
	 * @param nombre
	 * @param fecha
	 * @param lugar
	 * @param individual
	 */
	public Prueba(long id, String nombre, LocalDate fecha, Lugar lugar, boolean individual) {
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.lugar = lugar;
		this.individual = individual;
	}

	/**
	 * Constructor con 6 parametros
	 * 
	 * @param id
	 * @param nombre
	 * @param fecha
	 * @param lugar
	 * @param ind
	 * @param arbitros
	 */
	public Prueba(long id, String nombre, LocalDate fecha, Lugar lugar, boolean ind, Colegiado[] arbitros) {
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.lugar = lugar;
		this.individual = ind;
		this.arbitros = arbitros;
	}

	/**
	 * Constructor con 6 parametros
	 * 
	 * @param id
	 * @param nombre
	 * @param fecha
	 * @param individual
	 * @param lugar
	 * @param participantes
	 */
	public Prueba(long id, String nombre, LocalDate fecha, boolean individual, Lugar lugar,
			ArrayList<Participante> participantes) {
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.individual = individual;
		this.lugar = lugar;
		this.participantes = participantes;
	}

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

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public boolean isIndividual() {
		return individual;
	}

	public void setIndividual(boolean individual) {
		this.individual = individual;
	}

	public Lugar getLugar() {
		return lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	public ArrayList<Participante> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(ArrayList<Participante> participantes) {
		this.participantes = participantes;
	}

	/**
	 * Metodo que devuelve toda la información de la Prueba
	 * 
	 * @return información de la Prueba <!-- Ejercicio 3 --> Sobrescribir la función
	 *         toString de la clase Prueba de forma que se muestre, en este orden:
	 *         el identificador de la prueba, junto a su lugar y fecha de
	 *         celebración, el nombre de la prueba y el de la competición a la que
	 *         pertenece, si se trata de una prueba individual o no y, a través de
	 *         un iterador sobre el campo para los Participantes, los datos de cada
	 *         uno de éstos. Se indicará: “Por la calle <calle> con el dorsal
	 *         <dorsal> /t el equipo/atleta <idEquipo/idAtleta>.“ En el caso de
	 *         tratarse de una competición por equipos, habrá que indicar también la
	 *         composición (identificadores de los atletas) de ese equipo. Por
	 *         último, si la prueba está cerrada, es decir, tiene un Resultado,
	 *         indicar los datos de los colegiados de la prueba y el podio final de
	 *         la prueba.
	 */
	@Override
	public String toString() {
		String cadena = "";
		String cadena1 = "";

		cadena += "\n" + "idprueba: " + id + " --> " + nombre + " --> "
				+ fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " --> " + lugar.getNombre() + " --> "
				+ isIndividual() + "\n";
		
		Iterator<Participante> it_clasificacion = participantes.iterator();
		Atleta a = null;
		int podio = 1;
		while (it_clasificacion.hasNext()) {
			Participante p = it_clasificacion.next();
			Integer dorsal = p.getDorsal();
			char calle = p.getCalle();
			cadena1 += "Por la calle " + calle + " con el dorsal " + dorsal + " el atleta " + p.id;
			// sin terminar. falta equipo arbital comformado y el resultado con los podios
			// de los participantes
		}

		/*
		 * + ", arbitros=" + Arrays.toString(arbitros) + ", resultado=" + resultado +
		 * ", participantes=" + participantes + "]";
		 */
		if(this.arbitros.length==3) {
			cadena1+=this.nombresEquipoArbitral();
		}
		return cadena+cadena1;
	}

	/**
	 * Metodo para establecer el resultado final de la prueba. En caso de error
	 * avisa al usuario
	 * 
	 * @param ret
	 * @param ret
	 */
	public void cerrarPrueba(Resultado ret) {
		if (!ret.isDefinitivo()) {
			System.out.println("Error al cerrar la prueba. ");
		} else {
			this.resultado = ret;
			System.out.println(this.nombre + " se ha cerrado correctamente ");
		}

	}

	/**
	 * Método para indicar si la prueba está cerrada, con un resultado final
	 * 
	 * @return true o false
	 */
	public boolean cerrada() {
		if (this.resultado != null)
			return this.resultado.isDefinitivo();
		else
			return false;
	}

	/**
	 * Metodo para conformar el equipo arbitral de cada prueba
	 * 
	 * @param arbitros (3 Colegiados)
	 * @return true o false
	 */
	public boolean setEquipoArbitral(Colegiado[] arbitros) {
		boolean resultado = false;
		if (arbitros.length != 3)
			return false;
		for (Colegiado c : arbitros)
			if (c == null)
				return false;
		return resultado;

	}

	/**
	 * Metodo para establecer el equipo arbitral para cada prueba
	 * 
	 * @return true o false
	 */
	public String nombresEquipoArbitral() {
		String cadena = "";
		if (this.arbitros.length != 3) {
			cadena = "No hay equipo arbitral para esta prueba.";
		} else {
			cadena += "\nARTIBROS: [" + id + "\n";
			for (Colegiado c : this.arbitros) {
				cadena += c.getColegiado() + ", categoria: " + c.getCategoria() + "\n";
			}
			cadena += "]";
		}
		return cadena;
	}

	/**
	 * Metodo para establecer una nuevo objeto Prueba completo
	 * 
	 * @return p
	 */
	public static Prueba nuevaPrueba() {
		Scanner teclado = new Scanner(System.in);
		Prueba p = null;
		return p;

	}

}
