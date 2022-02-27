package dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import modelo.Colegiado;

public class ColegiadoDAO {

	/**
	 * Método para importar desde un fichero de bytes que contiene varios objetos
	 * Colegiado, aquellos que sean de una categoría en concreto (la cual se pasa
	 * como parámetro en forma de cadena de caracteres). El método devolverá la
	 * colección de objetos de la entidad Colegiado que cumplan ese criterio.
	 * 
	 * @param col
	 * @throws IOException
	 */
	private static ArrayList<Colegiado> exportarDatosColegiadoFicheroBytes(char Categoria) throws IOException {
		ArrayList<Colegiado> colegiadosCat = new ArrayList<Colegiado>();
		Colegiado colega = new Colegiado();
		String path = "C:\\Users\\usuario\\eclipse-workspaceDAW2.1\\federaciondeportiva\\src\\resources\\listacolegiados.dat";
		// Creamos las referencias del fichero
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		boolean lectura = true;
		try {
			fis = new FileInputStream(path); // conexión con el fichero
			ois = new ObjectInputStream(fis);
			while (true) {
				colega = (Colegiado) ois.readObject(); // lectura de los objetos del fichero
				colegiadosCat.add(colega);
			}
		} // fin del try
		catch (FileNotFoundException e) {
			System.out.println("Se ha producido una FileNotFoundException" + e.getMessage());
		} catch (EOFException e) {
			System.out.println("Final de fichero");
		} catch (IOException e) {
			System.out.println("Se ha producido una IOException: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("El fichero no se encuentra");
			lectura = false;
		} catch (Exception ex) {
			System.out.println("Se ha producido una Excepcion" + ex.getMessage());
		} finally {
			// Cerramos los flujos de datos. Empezando por el último abierto
			if (fis != null)
				fis.close();
			if (ois != null)
				ois.close();

		}
		// Procesamos los datos del arraylist en el caso de que se hayan podido leer los
		// objetos
		if (lectura) {
			for (int i = 0; i < colegiadosCat.size(); i++) {

			}
		}

		return colegiadosCat;

	}

	/**
	 * Metodo para buscar una colección de Colegiados dado su categoria
	 * 
	 * @param cat      de tipo char
	 * @param arbitros
	 */
	public static void findByCategoria(char cat, ArrayList<Colegiado> arbitros) {
		ArrayList<Colegiado> ret = new ArrayList<Colegiado>();
		for (Colegiado c : arbitros) {
			if (c.getCategoria().getCod() == cat) {
				ret.add(c);
			}
		}
	}

	public static void exportarDatosColegiadoToBinaryFile() {
		ArrayList<Colegiado> colegiadoCat = new ArrayList<Colegiado>();
		String path = "C:\\Users\\usuario\\eclipse-workspaceDAW2.1\\federaciondeportiva\\src\\resources\\listacolegiados.dat";

	}
}
