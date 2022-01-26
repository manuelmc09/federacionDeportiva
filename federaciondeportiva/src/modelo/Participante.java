package modelo;

public class Participante {
	// Atributos
	protected long id;
	protected int dorsal;
	protected char calle;

	// Constructores
	/**
	 * Constructor por defecto
	 */
	public Participante() {

	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param id
	 * @param dorsal
	 * @param calle
	 */
	public Participante(long id, int dorsal, char calle) {
		super();
		this.id = id;
		this.dorsal = dorsal;
		this.calle = calle;
	}

	/**
	 * Constructor copia
	 * 
	 * @param p
	 */
	public Participante(Participante p) {
		this.id = p.id;
		this.dorsal = dorsal;
		this.calle = calle;
	}

	// Metodos publicos
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public char getCalle() {
		return calle;
	}

	public void setCalle(char calle) {
		this.calle = calle;
	}

	/**
	 * Metodo que devuelve toda la información sobre los datos de los participantes
	 * 
	 * @return informacion de los participantes
	 */
	@Override
	public String toString() {
		return "Participante [id=" + id + ", dorsal=" + dorsal + ", calle=" + calle + "]";
	}

}
