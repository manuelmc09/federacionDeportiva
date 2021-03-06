package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Metal implements Comparable<Metal> {
	// Atributos
	protected LocalDate fechacompra;
	protected boolean asignada = false;
	protected float pureza;

	// Constructores
	/**
	 * Constructor por defecto
	 */
	public Metal() {

	}
	
	/**
	 * Constructor con dos parametros
	 * @param fechacompra
	 * @param pureza
	 */
	public Metal(LocalDate fechacompra, float pureza) {
		this.fechacompra = fechacompra;
		this.pureza = pureza;
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param fecha
	 * @param asignada
	 */
	public Metal(LocalDate fechacompra, boolean asignada, float pureza) {
		this.fechacompra = fechacompra;
		this.asignada = asignada;
		this.pureza = pureza;
	}

	// Métodos públicos

	public boolean isAsignada() {
		return asignada;
	}

	public void setAsignada(boolean asignada) {
		this.asignada = asignada;
	}

	public LocalDate getFechacompra() {
		return fechacompra;
	}

	public void setFechacompra(LocalDate fechacompra) {
		this.fechacompra = fechacompra;
	}

	public float getPureza() {
		return pureza;
	}

	public void setPureza(float pureza) {
		this.pureza = pureza;
	}

	// Metodos
	public abstract float[] cotasPurezaEfectiva();

	/**
	 * Metodo que compara un orden de las medallas en función del valor de su pureza
	 * y, si hay empate, según la fecha de compra de la medalla
	 * 
	 * @param m
	 * @return
	 */

	public int compareTo(Metal m) {
		int compara = 0;
		///compare para floats
		compara=Float.compare(getPureza(), m.getPureza());
		if (compara == 0) {
			compara = getFechacompra().compareTo(m.getFechacompra());
		}
		return compara;

		/*
		 * if (this.getPureza() > m.getPureza()) return 1; else if (this.getPureza() <
		 * m.getPureza()) return -1; else return 0;
		 */

	}

}
