package modelo;

import java.time.LocalDate;

public abstract class Metal {
	// Atributos
	public LocalDate fecha;
	public boolean asignada = false;

	// Constructores
	/**
	 * Constructor por defecto
	 */
	public Metal() {

	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param fecha
	 * @param asignada
	 */
	public Metal(LocalDate fecha, boolean asignada) {
		this.fecha = fecha;
		this.asignada = asignada;
	}

	// Métodos públicos
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public boolean isAsignada() {
		return asignada;
	}

	public void setAsignada(boolean asignada) {
		this.asignada = asignada;
	}

	// Metodos
	public abstract float[] cotasPurezaEfectiva();

}
