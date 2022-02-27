package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

import modelo.Metal;
import utils.ConexionBD;

public class MetalDAO {

	private static Connection conex = null;

	public MetalDAO(Connection conex) {
		this.conex = conex;
	}

	public MetalDAO() {
		super();
		conex = ConexionBD.establecerConexion();
		if (conex == null) {
			System.out.println("Error al conectar a la BD ");
		}
	}

	public static void insertarMetal(Metal m) {
		PreparedStatement pstm;
		ResultSet resultado;

	}

	public static ArrayList<Metal> seleccionarTodas() {
		ArrayList<Metal> todomedallas = new ArrayList<Metal>();
		PreparedStatement pstm;
		ResultSet resultado;
		String sql="SELECT * FROM metal";
		return todomedallas;
	}

	public static ArrayList<Metal> findByfechaCompra(LocalDate fechacompra) {
		ArrayList<Metal> todomedallas = new ArrayList<Metal>();
		return todomedallas;

	}
}
