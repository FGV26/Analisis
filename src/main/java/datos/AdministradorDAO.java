
package datos;

import java.sql.*;
import java.util.*;
import modelo.Administrador;

public class AdministradorDAO {

    private static final String SQL_INSERT = "INSERT INTO administradores (nombre, apellido_paterno, apellido_materno, contacto, id_usuario) VALUES (?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE administradores SET nombre = ?, apellido_paterno = ?, apellido_materno = ?, contacto = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM administradores WHERE id = ?";
    private static final String SQL_SELECT = "SELECT * FROM administradores WHERE id = ?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM administradores";

    public int insertar(Administrador administrador) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, administrador.getNombre());
            stmt.setString(2, administrador.getApellidoPaterno());
            stmt.setString(3, administrador.getApellidoMaterno());
            stmt.setString(4, administrador.getContacto());
            stmt.setInt(5, administrador.getIdUsuario());
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

    public int actualizar(Administrador administrador) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, administrador.getNombre());
            stmt.setString(2, administrador.getApellidoPaterno());
            stmt.setString(3, administrador.getApellidoMaterno());
            stmt.setString(4, administrador.getContacto());
            stmt.setInt(5, administrador.getId());
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

    public int eliminar(Administrador administrador) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, administrador.getId());
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

    public Administrador seleccionar(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Administrador administrador = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if (rs.next()) {
                administrador = new Administrador(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido_paterno"), rs.getString("apellido_materno"), rs.getString("contacto"), rs.getInt("id_usuario"));
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
        return administrador;
    }

    public List<Administrador> seleccionarTodos() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Administrador> administradores = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_ALL);
            rs = stmt.executeQuery();
            while (rs.next()) {
                administradores.add(new Administrador(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido_paterno"), rs.getString("apellido_materno"), rs.getString("contacto"), rs.getInt("id_usuario")));
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
        return administradores;
    }
}
