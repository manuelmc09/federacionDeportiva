package modelo;

public class Colegiado {
	// Atributos
	private long id;
	private String categoria;
	private DatosPersona colegiado;

	// Constructores
	/**
	 * Constructor por defecto
	 */
	public Colegiado() {
	}

	/**
	 * Constructor con todos 3 atributos
	 * 
	 * @param id
	 * @param categoria
	 * @param colegiado
	 */
	public Colegiado(long id, String categoria, DatosPersona colegiado) {
		super();
		this.id = id;
		this.categoria = categoria;
		this.colegiado = colegiado;
	}

	/**
	 * Constructor copia
	 * 
	 * @param c
	 */
	public Colegiado(Colegiado c) {
		this.id = c.id;
		this.categoria = c.categoria;
		this.colegiado = c.colegiado;
	}

	// Métodos públicos
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public DatosPersona getColegiado() {
		return colegiado;
	}

	public void setColegiado(DatosPersona colegiado) {
		this.colegiado = colegiado;
	}

	/**
	 * Método que devuelve toda la información del Colegiado
	 * 
	 * @return información de Colegiado
	 */
	@Override
	public String toString() {
		return "Colegiado [id=" + id + ", categoria=" + categoria + "\ncolegiado: " + colegiado.getNombre() + "\nNif: "
				+ colegiado.getTelefono() + "\nfechaNac: " + colegiado.getFechaNac().getYear();
	}

}
