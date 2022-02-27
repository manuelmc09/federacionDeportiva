package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Atleta;
import utils.ConexionBD;

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
}
