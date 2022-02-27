package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Equipo;
import utils.ConexionBD;

public class EquipoDAO {

	private static Connection conex = null;

	public EquipoDAO(Connection conex) {
		this.conex = conex;
	}

	public EquipoDAO() {
		super();
		conex = ConexionBD.establecerConexion();
		if (conex == null) {
			System.out.println("Error al conectar a la BD ");
		}
	}

	public static void insertarEquipo(Equipo e) {
		String sql = "INSERT INTO equipo (nombre,anioinscripcion,manager_persona_id,id) VALUES (?,?,?,?,?)";
		PreparedStatement pstm;
		ResultSet resultado;
		try {
			if (conex == null) {
				conex = ConexionBD.establecerConexion();
				pstm = conex.prepareStatement(sql);
				pstm.setString(1, e.getNombre());
				pstm.setInt(2, e.getAnioinscripcion());
				pstm.setLong(3, e.getId());
				pstm.setLong(4, e.getIdequipo());
				pstm.executeUpdate();
			}
			conex.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public static ArrayList<Equipo> findByNombre(String nombre) {
		ArrayList<Equipo> totalequipos = new ArrayList<Equipo>();
		return totalequipos;
	}
}
