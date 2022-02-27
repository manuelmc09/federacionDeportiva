package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Atleta;
import utils.ConexionBD;
import utils.Utilidades;

public class AtletaDAO {
	private static Connection conex = null;

	public AtletaDAO(Connection conex) {
		this.conex = conex;
	}

	public AtletaDAO() {
		super();
		conex = ConexionBD.establecerConexion();
		if (conex == null) {
			System.out.println("Error al conectar a la BD ");
		}
	}

	public static void insertarAtleta(Atleta a) {
		String sql = "INSERT INTO atleta (altura,peso,id) VALUES (?,?,?)";
		ResultSet resultado;
		Statement stmt = null;
		PreparedStatement pstm;
		try {
			if (conex == null) {
				conex = ConexionBD.establecerConexion();
				pstm = conex.prepareStatement(sql);
				pstm.setString(1, String.valueOf(a.getAltura()));
				pstm.setString(2, String.valueOf(a.getPeso()));
				pstm.setLong(3, a.getId());
				stmt.executeUpdate(sql);
			}
			conex.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo para exportar hacia un fichero binario una serie de objetos de la
	 * entidad Atleta, que cumplen unos criterios físicos (valor de peso y de altura
	 * dentro de unos rangos dados).de entre una colección de Atletas que se pasa
	 * como parametro. Se preguntará al usuario por el rango de valores para el peso
	 * y la altura y buascara aquello que cumplan las restricciones, exportando
	 * únicamente esos al fichero binario
	 * 
	 * @param atletasbuscados
	 * @return
	 */
	public static ArrayList<Atleta> exportarDatosAtletaToBinaryFile(ArrayList<Atleta> atletasbuscados) {
		Scanner teclado = new Scanner(System.in);
		float alturaMin, alturaMax, pesoMin, pesoMax = 0.0F;
		String path = "C:\\Users\\usuario\\eclipse-workspaceDAW2.1\\federaciondeportiva\\src\\resources\\listaatletas.dat";

		System.out.println("Introducir un valor minimo a buscar para la altura");
		alturaMin = Utilidades.leerFloat();
		System.out.println("Introducir un valor maximo a buscar para la altura");
		alturaMax = Utilidades.leerFloat();
		System.out.println("Introducir un valor minimo a buscar para el peso");
		pesoMin = Utilidades.leerFloat();
		System.out.println("Introducir un valor maximo a buscar para el peso");
		pesoMax = Utilidades.leerFloat();
		
		// Crearemos los objetos atleta dandoles una serie de valores a los atributos
		// para el peso y la altura teniendo en cuenta que alguno debera estar entre los
		// rangos antes especificados para poder tratar a la hora de exportar algún
		// objeto Atleta a un archivo de bytes
		
		Atleta a1 = Atleta.nuevoAtleta();
		Atleta a2 = Atleta.nuevoAtleta();
		Atleta a3 = Atleta.nuevoAtleta();
		atletasbuscados.add(a1);
		atletasbuscados.add(a2);
		atletasbuscados.add(a2);

		//Buscaremos el rango de valores para el peso y la altura dentro de la colección
		for (Atleta a : atletasbuscados) {

		}

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(path, true);
			oos = new ObjectOutputStream(fos);

			oos.close();
		} catch (FileNotFoundException e) {
			System.out.println("Se ha producido una FileNotFoundException" + e.getMessage());
		} catch (IOException e) {
			System.out.println("Se ha producido una IOException" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Se ha producido una Exception" + e.getMessage());
		}

		return null;

	}
}
