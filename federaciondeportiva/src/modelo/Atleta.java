package modelo;

import java.util.ArrayList;
import java.util.Scanner;

import utils.Utilidades;

public class Atleta extends Participante implements Comparable<Atleta> {
	// Atributos
	private float altura;
	private float peso;
	private DatosPersona atleta;

	// Constructores
	/**
	 * Constructor por defecto
	 */
	public Atleta() {
		super();
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param altura
	 * @param peso
	 * @param id
	 * @param dorsal
	 * @param calle
	 * @param atleta
	 */
	public Atleta(float altura, float peso, long id, int dorsal, char calle, DatosPersona atleta) {
		super(id, dorsal, calle);
		this.altura = altura;
		this.peso = peso;
		this.atleta = atleta;
	}

	/**
	 * Constructor con 4 parametros
	 * 
	 * 
	 * @param altura
	 * @param peso
	 * @param atleta
	 */
	public Atleta(float altura, float peso, DatosPersona atleta) {
		super();
		this.altura = altura;
		this.peso = peso;
		this.atleta = atleta;
	}

	/**
	 * Constructor copia
	 * 
	 * @param a
	 */
	public Atleta(Atleta a) {
		super(a);
		if (Atleta.class.isInstance(a)) {
			this.altura = ((Atleta) a).getAltura();
			this.peso = ((Atleta) a).getPeso();
		} else {
			this.atleta = new DatosPersona();
		}

	}

	// Metodos publicos

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public DatosPersona getAtleta() {
		return atleta;
	}

	public void setAtleta(DatosPersona atleta) {
		this.atleta = atleta;
	}

	/**
	 * Metodo que devuelve toda la información sobre los datos de los atletas
	 * 
	 * @return informacion de los atletas
	 */
	@Override
	public String toString() {
		String cadena;
		cadena = super.id + ". Atleta: dorsal--> " + super.dorsal + " calle--> " + super.calle;
		cadena += "Atleta [altura=" + altura + ", peso=" + peso + ", atleta=" + atleta + "]";
		return cadena;
	}

	/**
	 * <!-- Ejercicio 4 Apartado 2--> Preguntar al usuario por la salida estándar
	 * (FEDERARSE)
	 * 
	 * @return objeto Atleta
	 */
	public static Atleta nuevoAtleta() {
		Scanner teclado = new Scanner(System.in);
		DatosPersona datos = new DatosPersona();
		Participante p = new Participante();

		// Atleta a = (Atleta) Participante.nuevoParticipante();
		Atleta a = new Atleta();
		System.out.println("Introducir el peso del atleta(en Kgs:) ");
		a.peso = Utilidades.leerFloat();
		System.out.println("Introducir la altura del atleta(en cm:) ");
		a.altura = Utilidades.leerFloat();

		return a;
	}

	/**
	 * Metodo para exportar los datos de la entidad Atleta, que cumplen unos
	 * criterios físicos (valor de peso y de altura dentro de unos rangos dados) de
	 * entre una colección de Atletas que se pasa como parámetro.
	 * 
	 * @param atleta
	 */
	private static void exportarDatosbinario(Atleta[] atleta) {

	}

	/**
	 * Metodo para comparar los atletas por nombre
	 */
	@Override
	public int compareTo(Atleta a) {
		int compara = atleta.getNombre().compareToIgnoreCase(atleta.getNombre());

		return 0;
	}
}
