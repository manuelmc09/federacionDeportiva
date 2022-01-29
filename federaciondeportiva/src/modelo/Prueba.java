package modelo;

import java.time.LocalDate;
import java.util.Arrays;
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
	// private Participante[] participantes;

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

	public Colegiado[] getArbitros() {
		return arbitros;
	}

	public void setArbitros(Colegiado[] arbitros) {
		this.arbitros = arbitros;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "Prueba [id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", individual=" + individual
				+ ", lugar=" + lugar + ", arbitros=" + Arrays.toString(arbitros) + ", resultado=" + resultado + "]";
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
}
