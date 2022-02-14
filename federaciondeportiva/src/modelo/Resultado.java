package modelo;

import java.time.LocalDateTime;

public class Resultado {
	// Atributos
	private long id;
	private boolean definitivo = false;
	private LocalDateTime fechaHora;
	private Oro oro;
	private Plata plata;
	private Bronce bronce;
	// El podio tiene 3 posiciones para los 3 primeros puestos
	private Participante[] podio = new Participante[3];

	// Constructores
	/**
	 * Constructor por defecto
	 */
	public Resultado() {

	}

	/**
	 * Constructor con 3 parametros
	 * 
	 * @param id
	 * @param definitivo
	 * @param fechaHora
	 */
	public Resultado(long id, boolean definitivo, LocalDateTime fechaHora) {
		super();
		this.id = id;
		this.definitivo = definitivo;
		this.fechaHora = fechaHora;
	}

	/**
	 * Constructor con 4 parametros
	 * 
	 * @param id
	 * @param oro
	 * @param plata
	 * @param bronce
	 */
	public Resultado(long id, Oro oro, Plata plata, Bronce bronce) {
		super();
		this.id = id;
		this.oro = oro;
		this.plata = plata;
		this.bronce = bronce;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isDefinitivo() {
		return definitivo;
	}

	public void setDefinitivo(boolean definitivo) {
		this.definitivo = definitivo;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Oro getOro() {
		return oro;
	}

	public void setOro(Oro oro) {
		this.oro = oro;
	}

	public Plata getPlata() {
		return plata;
	}

	public void setPlata(Plata plata) {
		this.plata = plata;
	}

	public Bronce getBronce() {
		return bronce;
	}

	public void setBronce(Bronce bronce) {
		this.bronce = bronce;
	}

	public Participante[] getPodio() {
		return podio;
	}

	public void setPodio(Participante[] podio) {
		this.podio = podio;
	}

	/**
	 * Metodo para obtener el resultado definitivo con el podio obtenido y la fecha actual
	 */
	public void cerrarResultado(Participante[] podio, Oro oro, Plata plata, Bronce bronce) {
		this.podio = podio;
		this.oro = oro;
		this.plata = plata;
		this.bronce = bronce;
		this.setDefinitivo(true);
		this.setFechaHora(LocalDateTime.now());

	}
}
