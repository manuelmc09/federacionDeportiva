package modelo;

public enum Categoria {
	NORTE("Norte", 'N'), SUR("Sur", 'S');

	// Atributos
	String nombre;
	char sigla;

	// Constructor
	Categoria(String nombre, char sigla) {
		this.nombre = nombre;
		this.sigla = sigla;
	}

	// Métodos públicos

	public char getSigla() {
		return sigla;
	}

	public String getNombre() {
		return nombre;
	}
	public static void mostrarCategoria() {
		int i=1;
		for(Categoria cat: Categoria.values()) {
			System.out.println(i+"--> "+cat.getNombre()+" se corresponde con la sigla "+cat.getSigla());
		}
	}

}
