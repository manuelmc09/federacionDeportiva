package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Manager;
import utils.ConexionBD;

public class ManagerDAO {
	private static Connection conex = null;

	public ManagerDAO(Connection conex) {
		this.conex = conex;
	}

	public ManagerDAO() {
		super();
		conex = ConexionBD.establecerConexion();
		if (conex == null) {
			System.out.println("Error al conectar a la BD ");
		}
	}

	public static void insertarManager(Manager m) {
		String sql = "INSERT INTO  manager (direccion,persona_id) VALUES (?,?)";
		ResultSet resultado;
		Statement stmt;
		PreparedStatement pstm;
		try {
			if (conex == null) {
				conex = ConexionBD.establecerConexion();
				pstm = conex.prepareStatement(sql);
				pstm.setString(1, m.getDireccion());
				pstm.setLong(2, m.getId());
				pstm.executeUpdate();
				System.out.println("Inserción correcta");
			}
			conex.close();
		} catch (SQLException e) {
			System.out.println("Se ha producito un error al insertar " + e.getMessage());
		}
	}

	public static void borrar(long persona_id) {
		String sql = "DELETE FROM manager WHERE persona_id=?";
		Connection conex = null;
		PreparedStatement pstm;
		ResultSet resultado;

		try {
			// creo la sentencia que va a realizar el borrado
			pstm = conex.prepareStatement(sql);
			// asigno valor al parametro
			pstm.setLong(1, persona_id);
			// ejecuto la sentencia
			pstm.executeUpdate();
			// cierro la sentencia
			pstm.close();
		} catch (SQLException e) {
			System.out.println("Error al eliminar el Manager " + e.getMessage());
		}
	}
}
