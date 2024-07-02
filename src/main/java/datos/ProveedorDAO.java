
package datos;

import java.sql.*;
import java.util.*;
import modelo.Proveedor;

public class ProveedorDAO {

    private static final String SQL_INSERT = "INSERT INTO proveedores (nombre, apellido_paterno, apellido_materno, contacto, id_usuario) VALUES (?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE proveedores SET nombre = ?, apellido_paterno = ?, apellido_materno = ?, contacto = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM proveedores WHERE id = ?";
    private static final String SQL_SELECT = "SELECT * FROM proveedores WHERE id = ?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM proveedores";

    public int insertar(Proveedor proveedor) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, proveedor.getNombre());
            stmt.setString(2, proveedor.getApellidoPaterno());
            stmt.setString(3, proveedor.getApellidoMaterno());
            stmt.setString(4, proveedor.getContacto());
            stmt.setInt(5, proveedor.getIdUsuario());
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

    public int actualizar(Proveedor proveedor) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, proveedor.getNombre());
            stmt.setString(2, proveedor.getApellidoPaterno());
            stmt.setString(3, proveedor.getApellidoMaterno());
            stmt.setString(4, proveedor.getContacto());
            stmt.setInt(5, proveedor.getId());
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

    public int eliminar(Proveedor proveedor) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, proveedor.getId());
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

    public Proveedor seleccionar(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Proveedor proveedor = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if (rs.next()) {
                proveedor = new Proveedor(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido_paterno"), rs.getString("apellido_materno"), rs.getString("contacto"), rs.getInt("id_usuario"));
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
        return proveedor;
    }

    public List<Proveedor> seleccionarTodos() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Proveedor> proveedores = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_ALL);
            rs = stmt.executeQuery();
            while (rs.next()) {
                proveedores.add(new Proveedor(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido_paterno"), rs.getString("apellido_materno"), rs.getString("contacto"), rs.getInt("id_usuario")));
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
        return proveedores;
    }
}
