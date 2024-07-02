
package datos;

import java.sql.*;
import java.util.*;
import modelo.Mensaje;

public class MensajeDAO {

    private static final String SQL_INSERT = "INSERT INTO mensajes (emisor_id, receptor_id, tipo_emisor, tipo_receptor, mensaje, fecha) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SQL_SELECT_BY_RECEPTOR = "SELECT * FROM mensajes WHERE receptor_id = ? AND tipo_receptor = ?";
    private static final String SQL_SELECT_BY_MARCA_MODELO_COLOR = "SELECT * FROM vehiculos WHERE marca = ? AND modelo = ? AND color = ?";

    public int insertar(Mensaje mensaje) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, mensaje.getEmisorId());
            stmt.setInt(2, mensaje.getReceptorId());
            stmt.setString(3, mensaje.getTipoEmisor());
            stmt.setString(4, mensaje.getTipoReceptor());
            stmt.setString(5, mensaje.getMensaje());
            stmt.setTimestamp(6, mensaje.getFecha());
            rows = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return rows;
    }

    public List<Mensaje> seleccionarPorReceptor(int receptorId, String tipoReceptor) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Mensaje> mensajes = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_RECEPTOR);
            stmt.setInt(1, receptorId);
            stmt.setString(2, tipoReceptor);
            rs = stmt.executeQuery();
            while (rs.next()) {
                mensajes.add(new Mensaje(rs.getInt("id"), rs.getInt("emisor_id"), rs.getInt("receptor_id"), rs.getString("tipo_emisor"), rs.getString("tipo_receptor"), rs.getString("mensaje"), rs.getTimestamp("fecha")));
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return mensajes;
    }
    
}
