package modelo;

import java.util.Scanner;

import utils.Utilidades;

public class Participante {
	// Atributos
	protected long id;
	protected int dorsal;// valores acotados entre 001 y 150-->Como consignarlos??
	protected char calle;

	// Constructores
	/**
	 * Constructor por defecto
	 */
	public Participante() {
		this.dorsal = 001;

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
		if ((dorsal < 001) && (dorsal > 150)) {
			throw new IllegalArgumentException();
		}
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

	/**
	 * Metodo para crear un objeto Participante nuevo completo
	 * 
	 * @return un participante completo
	 */
	public static Participante nuevoParticipante() {
		Scanner teclado = new Scanner(System.in);
		Participante p = new Participante();
		long id = -1;
		int dorsal = 001;
		char calle = '\u0000';
		boolean valido = false;
		do {
			valido = Utilidades.validarId(id);
			if (!valido)
				System.out.println("Id invalido.");
		} while (!valido);
		p.setId(id);

		System.out.println("Introduzca el dorsal del participante. Recuerde debe ser este formato (001-150)");
		dorsal = teclado.nextInt();
		System.out.println("Introduzca la calle por la que participara en la prueba. (Formato letra: p.ej: C o c) ");
		calle = teclado.next().charAt(0);
		return p;
	}

}
