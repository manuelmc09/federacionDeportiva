package dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Categoria;
import modelo.Colegiado;
import modelo.DatosPersona;

public class ColegiadoDAO {
	Connection conexion = null;
	Statement stmt = null;
	ResultSet resultado = null;

	public ColegiadoDAO() {
		super();
	}

	/**
	 * Método para importar desde un fichero de bytes que contiene varios objetos
	 * Colegiado, aquellos que sean de una categoría en concreto (la cual se pasa
	 * como parámetro en forma de cadena de caracteres). El método devolverá la
	 * colección de objetos de la entidad Colegiado que cumplan ese criterio.
	 * 
	 * @param col
	 * @throws IOException
	 */
	public static ArrayList<Colegiado> importarDatosColegiadoFicheroBytes(String Categoria) throws IOException {
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
				ColegiadoDAO.findByCategoria("NORTE", colegiadosCat);
			}
			System.out.println("La seleccion hecha por Categoria: ");

			// Referencias para la serialización
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			try {
				fos = new FileOutputStream(path);
				oos = new ObjectOutputStream(fos);
				System.out.println();
				System.out.println("Grabado como objeto");

			} catch (IOException e) {
				System.out.println(e);
			} finally {
				if (fos != null)
					fos.close();
				if (oos != null)
					oos.close();

			}
		} else
			System.out.println("No se ha podido realizar el proceso ");

		return colegiadosCat;

	}

	/**
	 * Metodo para buscar una colección de Colegiados dado su categoria
	 * 
	 * @param cat      de tipo char
	 * @param arbitros
	 */
	public static void findByCategoria(String cat, ArrayList<Colegiado> arbitros) {
		ArrayList<Colegiado> ret = new ArrayList<Colegiado>();
		for (Colegiado c : arbitros) {
			if (c.getCategoria().getNombre() == cat) {
				ret.add(c);
			}
		}
	}

	/**
	 * Metodo para exportar una colección de Colegiados a un fichero de datos
	 * binario
	 */
	public void exportarDatosColegiadoToBinaryFile() {
		ArrayList<Colegiado> colegiadoCat = new ArrayList<Colegiado>();
		Colegiado colega;
		String path = "C:\\Users\\usuario\\eclipse-workspaceDAW2.1\\federaciondeportiva\\src\\resources\\listacolegiados.dat";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		// Pedimos los datos por teclado o através de un arrayList de objetos Colegiado
		Colegiado c1 = new Colegiado(1, Categoria.NORTE);
		Colegiado c2 = new Colegiado(2, Categoria.SUR);
		Colegiado c3 = new Colegiado(3, Categoria.NORTE);
		Colegiado c4 = new Colegiado(4, Categoria.SUR);
		colegiadoCat.add(c1);
		colegiadoCat.add(c2);
		colegiadoCat.add(c3);
		colegiadoCat.add(c4);
		try {
			fos = new FileOutputStream(path, true);
			oos = new ObjectOutputStream(fos);
			oos.writeObject((Colegiado) c1);
			oos.flush();
			oos.writeObject((Colegiado) c2);
			oos.flush();
			oos.writeObject((Colegiado) c3);
			oos.flush();
			oos.writeObject((Colegiado) c4);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			System.out.println("Se ha producido una FileNotFoundException" + e.getMessage());
		} catch (IOException e) {
			System.out.println("Se ha producido una IOException" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Se ha producido una Exception" + e.getMessage());
		}

	}
}
