package modelo;

import java.util.Scanner;

public class Atleta extends Participante {
	// Atributos
	private long idatleta;
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
	 * @param idatleta
	 * @param altura
	 * @param peso
	 * @param id
	 * @param dorsal
	 * @param calle
	 * @param atleta
	 */
	public Atleta(long idatleta, float altura, float peso, long id, int dorsal, char calle, DatosPersona atleta) {
		super(id, dorsal, calle);
		this.idatleta = idatleta;
		this.altura = altura;
		this.peso = peso;
		this.atleta = atleta;
	}

	/**
	 * Constructor con 4 parametros
	 * 
	 * @param idatleta
	 * @param altura
	 * @param peso
	 * @param atleta
	 */
	public Atleta(long idatleta, float altura, float peso, DatosPersona atleta) {
		super();
		this.idatleta = idatleta;
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
		this.idatleta = a.idatleta;
		this.altura = a.altura;
		this.peso = a.peso;
		this.atleta = a.atleta;
	}

	// Metodos publicos
	public long getIdatleta() {
		return idatleta;
	}

	public void setIdatleta(long idatleta) {
		this.idatleta = idatleta;
	}

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
		return "Atleta [idatleta=" + idatleta + ", altura=" + altura + ", peso=" + peso + ", atleta=" + atleta + "]";
	}

	/**
	 * <!-- Ejercicio 4 Apartado 2--> Preguntar al usuario por la salida estándar
	 * (FEDERARSE)
	 * 
	 * @return objeto Atleta
	 */
	public static Atleta nuevoAtleta() {
		Scanner teclado = new Scanner(System.in);
		Atleta a = null;
		DatosPersona p = null;
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
}
