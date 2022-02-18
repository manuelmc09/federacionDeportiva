package modelo;

import java.time.LocalDate;
import java.util.Scanner;

public class Bronce extends Metal {
	// Atributos
	private long id;
	private float pureza;

	// Contructores
	/**
	 * Constructor por defecto
	 */
	public Bronce() {
		super();
	}

	/**
	 * Constructor con 2 parametros
	 * 
	 * @param id
	 * @param pureza
	 */
	public Bronce(long id, float pureza) {
		super();
		this.id = id;
		this.pureza = pureza;
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param id
	 * @param fechacompra
	 * @param asignada
	 * @param pureza
	 */
	public Bronce(Long id, LocalDate fechacompra, boolean asignada, float pureza) {
		super(fechacompra, asignada, pureza);
		this.id = id;
		this.fechacompra = fechacompra;
		this.asignada = asignada;
		this.pureza = pureza;
	}

	// Metodos publicos
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getPureza() {
		return pureza;
	}

	public void setPureza(float pureza) {
		this.pureza = pureza;
	}

	/**
	 * Metodo que devuelve un array de 2 posiciones con los valores efectivos de
	 * pureza mínimo y máximo de una medalla del Bronce
	 */
	@Override
	public float[] cotasPurezaEfectiva() {
		// pureza_efectiva = pureza ± x% siendo x=5% para los Bronces
		float[] cotaspureza = new float[2];
		cotaspureza[1] = (float) (pureza - 0.30);
		cotaspureza[2] = (float) (pureza + 0.30);
		return cotaspureza;
	}

	/**
	 * Metodo para crear un nuevo objeto Bronce introduciendo sus datos
	 * 
	 * @return bronce
	 */
	public static Bronce nuevoBronce() {
		Scanner teclado=new Scanner(System.in);
		Bronce bronce = null;
		return bronce;

	}

}
