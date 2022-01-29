package modelo;

import java.time.LocalDateTime;

public class Resultado {
	// Atributos
	private long id;
	private boolean definitivo = false;
	private LocalDateTime fechaHora;

	public Resultado() {

	}

	public Resultado(long id, boolean definitivo, LocalDateTime fechaHora) {
		super();
		this.id = id;
		this.definitivo = definitivo;
		this.fechaHora = fechaHora;
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
	

}
