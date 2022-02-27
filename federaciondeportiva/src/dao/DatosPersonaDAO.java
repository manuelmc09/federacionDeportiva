package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import modelo.DatosPersona;
import utils.ConexionBD;

public class DatosPersonaDAO {

	private static Connection conex = null;

	public DatosPersonaDAO() {
		super();
		conex = ConexionBD.establecerConexion();
		if (conex == null) {
			System.out.println("Error al conectar a la BD.");
		}
	}

	public Connection getConexion() {
		return conex;
	}

	public static void insertarDatosPersona(DatosPersona p) {
		String sql = "INSERT INTO  persona (id,nombre,telefono,fechaNac) VALUES (?,?,?,?)";
		PreparedStatement pstm;
		Statement stmt;
		ResultSet resultado;
		try {
			if (conex == null) {
				conex = ConexionBD.establecerConexion();
				pstm = conex.prepareStatement(sql);
				pstm.setLong(1, p.getId());
				pstm.setString(2, p.getNombre());
				pstm.setString(3, p.getTelefono());
				pstm.setDate(4, java.sql.Date.valueOf(p.getFechaNac()));
				pstm.executeUpdate();
				System.out.println("Inserción correcta");
			}
			conex.close();

		} catch (SQLException e) {
			System.out.println("Error al insertar en persona " + e.getMessage());
		}

	}

	public static void borrarDatosPersona(int id) {

	}

	public static void actualizarDatosPersona(int id) {

	}

	public static DatosPersona findById(long id) {
		return null;

	}

	public static ArrayList<DatosPersona> findByTelefono(String telefono_buscar) {
		ArrayList<DatosPersona> datos = new ArrayList<DatosPersona>();
		PreparedStatement pstm;
		Statement stmt;
		ResultSet resultado;
		try {
			String sql = "SELECT * FROM persona where telefono_buscar=?";
			// creamos la sentencia que va a realizar la consulta
			pstm = conex.prepareStatement(sql);
			pstm.setString(1, telefono_buscar);
			// ejecutamos la sentencia
			resultado = pstm.executeQuery();
			// recorremos el cursor
			while (resultado.next())
				datos.add(new DatosPersona(resultado.getLong("id"), resultado.getString(2), resultado.getString(3),
						resultado.getDate(4).toLocalDate()));
			// cerramos la sentencia
			pstm.close();

		} catch (SQLException e) {
			System.out.println("Error al buscar por telefono en tabla persona");
		}
		return datos;

	}

}
