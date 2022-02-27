package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import utils.Utilidades;

public class Atleta extends Participante implements Comparable<Atleta>, Serializable {
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
	 * Constructor con 3 parametros
	 * 
	 * @param id
	 * @param dorsal
	 * @param calle
	 */
	public Atleta(long id, int dorsal, char calle) {
		super(id, dorsal, calle);
	}

	/**
	 * Constructor con dos parametros
	 * 
	 * @param altura
	 * @param peso
	 */
	public Atleta(float altura, float peso) {
		super();
		this.altura = altura;
		this.peso = peso;
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
	 * Constructor con 3 parametros
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
	public Atleta(Participante p) {
		super(p);
		if (Atleta.class.isInstance(p)) {
			this.altura = ((Atleta) p).getAltura();
			this.peso = ((Atleta) p).getPeso();
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
		System.out.println("Seguidamente los datos personales: ");
		datos.nuevaPersona();

		return a;
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
