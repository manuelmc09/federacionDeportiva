package modelo;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Equipo extends Participante {
	// Atributos
	private long idequipo;
	private int anioinscripcion;
	private Manager manager;
	private Atleta[] componentes;

	// Constructores
	/**
	 * Constructor por defecto
	 */
	public Equipo() {
		super();
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param idequipo
	 * @param anioinscripcion
	 * @param manager
	 * @param componentes
	 */
	public Equipo(long idequipo, int anioinscripcion, Manager manager, Atleta[] componentes) {
		super();
		this.idequipo = idequipo;
		this.anioinscripcion = anioinscripcion;
		this.componentes = componentes;
	}

	/**
	 * Constructor con 4 parametros
	 * 
	 * @param idParticipante
	 * @param dorsal
	 * @param calle
	 * @param equipo
	 */
	public Equipo(long idParticipante, int dorsal, char calle, Equipo equipo) {
		super(idParticipante, dorsal, calle);
		this.idequipo = equipo.idequipo;
		this.anioinscripcion = equipo.anioinscripcion;
		this.manager = equipo.manager;
		this.componentes = equipo.componentes;
	}

	/**
	 * Constructor con un parametro de la propia clase Equipo.LLamado constructor
	 * copia
	 * 
	 * @param e
	 */
	public Equipo(Equipo e) {
		this.idequipo = e.idequipo;
		this.anioinscripcion = e.anioinscripcion;
		this.manager = e.manager;
		this.componentes = e.componentes;
	}

	// Metodos publicos
	public long getIdequipo() {
		return idequipo;
	}

	public void setIdequipo(long idequipo) {
		this.idequipo = idequipo;
	}

	public int getAnioinscripcion() {
		return anioinscripcion;
	}

	public void setAnioinscripcion(int anioinscripcion) {
		this.anioinscripcion = anioinscripcion;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Atleta[] getComponentes() {
		return componentes;
	}

	public void setComponentes(Atleta[] componentes) {
		this.componentes = componentes;
	}

	/**
	 * Metodo que devuelve la información del equipo y sus componentes
	 * 
	 * @return cadena
	 */
	@Override
	public String toString() {
		String cadena = "";
		cadena += "\nEquipo =>" + "\n" + idequipo + "\nanioinscripcion: " + anioinscripcion + "\nmanager: "
				+ manager.getManager().getNombre() + "\ncomponentes: " + componentes.length;
		for (Atleta a : componentes) {
			cadena += a.getIdatleta() + ": " + a.getAtleta().getNombre() + "\n "
					+ a.getAtleta().getFechaNac().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		}
		return cadena;
	}

}
