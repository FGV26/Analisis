package datos;

import java.sql.*;
import java.util.*;
import modelo.Vehiculo;

public class VehiculoDAO {

    private static final String SQL_INSERT = "INSERT INTO vehiculos (marca, modelo, color, precio, stock) VALUES (?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE vehiculos SET marca = ?, modelo = ?, color = ?, precio = ?, stock = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM vehiculos WHERE id = ?";
    private static final String SQL_SELECT = "SELECT * FROM vehiculos WHERE id = ?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM vehiculos";
    private static final String SQL_SELECT_BY_MARCA_MODELO_COLOR = "SELECT * FROM vehiculos WHERE marca = ? AND modelo = ? AND color = ?";

    public int insertar(Vehiculo vehiculo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, vehiculo.getMarca());
            stmt.setString(2, vehiculo.getModelo());
            stmt.setString(3, vehiculo.getColor());
            stmt.setDouble(4, vehiculo.getPrecio());
            stmt.setInt(5, vehiculo.getStock());
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

    public int actualizar(Vehiculo vehiculo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, vehiculo.getMarca());
            stmt.setString(2, vehiculo.getModelo());
            stmt.setString(3, vehiculo.getColor());
            stmt.setDouble(4, vehiculo.getPrecio());
            stmt.setInt(5, vehiculo.getStock());
            stmt.setInt(6, vehiculo.getId());
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

    public int eliminar(Vehiculo vehiculo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, vehiculo.getId());
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

    public Vehiculo seleccionar(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Vehiculo vehiculo = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if (rs.next()) {
                vehiculo = new Vehiculo(rs.getInt("id"), rs.getString("marca"), rs.getString("modelo"), rs.getString("color"), rs.getDouble("precio"), rs.getInt("stock"));
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
        return vehiculo;
    }

    public List<Vehiculo> seleccionarTodos() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Vehiculo> vehiculos = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_ALL);
            rs = stmt.executeQuery();
            while (rs.next()) {
                vehiculos.add(new Vehiculo(rs.getInt("id"), rs.getString("marca"), rs.getString("modelo"), rs.getString("color"), rs.getDouble("precio"), rs.getInt("stock")));
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
        return vehiculos;
    }

    public Vehiculo obtenerPorMarcaModeloColor(String marca, String modelo, String color) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Vehiculo vehiculo = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_MARCA_MODELO_COLOR);
            stmt.setString(1, marca);
            stmt.setString(2, modelo);
            stmt.setString(3, color);
            rs = stmt.executeQuery();
            if (rs.next()) {
                vehiculo = new Vehiculo(rs.getInt("id"), rs.getString("marca"), rs.getString("modelo"), rs.getString("color"), rs.getDouble("precio"), rs.getInt("stock"));
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
        return vehiculo;
    }
}
