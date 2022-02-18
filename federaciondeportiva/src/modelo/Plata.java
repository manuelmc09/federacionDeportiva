package modelo;

import java.time.LocalDate;
import java.util.Scanner;

public class Plata extends Metal {
	// Atributos
	private long id;
	private float pureza;

	// Constructores
	/**
	 * Constructor por defecto
	 */
	public Plata() {
		super();
	}

	/**
	 * Constructor con dos parametros
	 * 
	 * @param id
	 * @param pureza
	 */
	public Plata(Long id, float pureza) {
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
	public Plata(Long id, LocalDate fechacompra, boolean asignada, float pureza) {
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
	 * Metodo que devuelve toda la información del objeto Plata
	 * 
	 * @return plata
	 */
	@Override
	public String toString() {
		return "Plata [id=" + id + ", pureza=" + pureza + "]";
	}

	/**
	 * Metodo que devuelve un array de 2 posiciones con los valores efectivos de
	 * pureza mínimo y máximo de una medalla de Plata
	 */
	@Override
	public float[] cotasPurezaEfectiva() {
		// pureza_efectiva = pureza ± x% siendo x=7% para la Plata
		float[] cotaspureza = new float[2];
		cotaspureza[1] = (float) (pureza - 0.70);
		cotaspureza[2] = (float) (pureza + 0.70);
		return cotaspureza;
	}

	/**
	 * Metodo para crear un nuevo objeto Plata introduciendo sus datos
	 * 
	 * @return plata
	 */
	public static Plata nuevaPlata() {
		Scanner teclado=new Scanner(System.in);
		Plata plata = null;
		return plata;

	}

}
