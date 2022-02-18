package modelo;

import java.time.LocalDate;
import java.util.Scanner;

public class Oro extends Metal {
	// Atributos
	private long id;
	// pureza ± x%
	private float pureza;

	// Contructores
	/**
	 * Constructor por defecto
	 */
	public Oro() {
		super();
	}

	/**
	 * Constructor con 2 parametros
	 * 
	 * @param id
	 * @param pureza
	 */
	public Oro(long id, float pureza) {
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
	public Oro(Long id, LocalDate fechacompra, boolean asignada, float pureza) {
		super(fechacompra, asignada, pureza);
		this.id = id;
		this.fechacompra = fechacompra;
		this.asignada = asignada;
		this.pureza = pureza;
	}

	// Metodos públicos

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
	 * Metodo que develve toda la información del Oro
	 * 
	 * @return info de Oro
	 */
	@Override
	public String toString() {
		return "Oro [id=" + id + ", pureza=" + pureza + "]";
	}

	/**
	 * Metodo que devuelve un array de 2 posiciones con los valores efectivos de
	 * pureza mínimo y máximo de una medalla de Oro
	 */
	@Override
	public float[] cotasPurezaEfectiva() {
		// pureza_efectiva = pureza ± x% siendo x=5% para los Oros
		float[] cotaspureza = new float[2];
		cotaspureza[1] = (float) (pureza - 0.50);
		cotaspureza[2] = (float) (pureza + 0.50);
		return cotaspureza;
	}

	/**
	 * Metodo para crear un nuevo objeto Oro introduciendo sus datos
	 * 
	 * @return oro
	 */
	public static Oro nuevoOro() {
		Scanner teclado=new Scanner(System.in);
		Oro oro = null;
		return oro;

	}

}
