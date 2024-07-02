
package datos;

import java.sql.*;
import java.util.*;
import modelo.Usuario;
import modelo.Vendedor;

public class VendedorDAO {

    private static final String SQL_INSERT = "INSERT INTO vendedores (nombre, apellido_paterno, apellido_materno, contacto, id_usuario) VALUES (?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE vendedores SET nombre = ?, apellido_paterno = ?, apellido_materno = ?, contacto = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM vendedores WHERE id = ?";
    private static final String SQL_SELECT = "SELECT * FROM vendedores WHERE id = ?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM vendedores";

    public int insertar(Vendedor vendedor) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, vendedor.getNombre());
            stmt.setString(2, vendedor.getApellidoPaterno());
            stmt.setString(3, vendedor.getApellidoMaterno());
            stmt.setString(4, vendedor.getContacto());
            stmt.setInt(5, vendedor.getIdUsuario());
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

    public int actualizar(Vendedor vendedor) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, vendedor.getNombre());
            stmt.setString(2, vendedor.getApellidoPaterno());
            stmt.setString(3, vendedor.getApellidoMaterno());
            stmt.setString(4, vendedor.getContacto());
            stmt.setInt(5, vendedor.getId());
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

    public int eliminar(int vendedorId) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            // Primero, obtenemos el id_usuario asociado al vendedor
            Vendedor vendedor = seleccionar(vendedorId);
            int usuarioId = vendedor.getIdUsuario();

            // Luego, eliminamos el vendedor
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, vendedorId);
            rows = stmt.executeUpdate();
            Conexion.close(stmt);

            // Finalmente, eliminamos el usuario asociado
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.eliminar(usuarioId);

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

    public Vendedor seleccionar(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Vendedor vendedor = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if (rs.next()) {
                vendedor = new Vendedor(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido_paterno"), rs.getString("apellido_materno"), rs.getString("contacto"), rs.getInt("id_usuario"));
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
        return vendedor;
    }

    public List<Vendedor> seleccionarTodos() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Vendedor> vendedores = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_ALL);
            rs = stmt.executeQuery();
            while (rs.next()) {
                vendedores.add(new Vendedor(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido_paterno"), rs.getString("apellido_materno"), rs.getString("contacto"), rs.getInt("id_usuario")));
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
        return vendedores;
    }
}
