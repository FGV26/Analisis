
package datos;

import java.sql.*;
import java.util.*;
import modelo.SolicitudVehiculo;

public class SolicitudVehiculoDAO {

    private static final String SQL_INSERT = "INSERT INTO solicitudes_vehiculos (administrador_id, proveedor_id, vehiculo_id, cantidad, fecha_entrega) VALUES (?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE solicitudes_vehiculos SET administrador_id = ?, proveedor_id = ?, vehiculo_id = ?, cantidad = ?, fecha_entrega = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM solicitudes_vehiculos WHERE id = ?";
    private static final String SQL_SELECT = "SELECT * FROM solicitudes_vehiculos WHERE id = ?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM solicitudes_vehiculos";

    public int insertar(SolicitudVehiculo solicitud) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, solicitud.getAdministradorId());
            stmt.setInt(2, solicitud.getProveedorId());
            stmt.setInt(3, solicitud.getVehiculoId());
            stmt.setInt(4, solicitud.getCantidad());
            stmt.setDate(5, new java.sql.Date(solicitud.getFechaEntrega().getTime()));
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

    public int actualizar(SolicitudVehiculo solicitud) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, solicitud.getAdministradorId());
            stmt.setInt(2, solicitud.getProveedorId());
            stmt.setInt(3, solicitud.getVehiculoId());
            stmt.setInt(4, solicitud.getCantidad());
            stmt.setDate(5, new java.sql.Date(solicitud.getFechaEntrega().getTime()));
            stmt.setInt(6, solicitud.getId());
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

    public int eliminar(SolicitudVehiculo solicitud) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, solicitud.getId());
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

    public SolicitudVehiculo seleccionar(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        SolicitudVehiculo solicitud = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if (rs.next()) {
                solicitud = new SolicitudVehiculo(rs.getInt("id"), rs.getInt("administrador_id"), rs.getInt("proveedor_id"), rs.getInt("vehiculo_id"), rs.getInt("cantidad"), rs.getTimestamp("fecha_solicitud"), rs.getDate("fecha_entrega"));
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
        return solicitud;
    }

    public List<SolicitudVehiculo> seleccionarTodos() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<SolicitudVehiculo> solicitudes = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_ALL);
            rs = stmt.executeQuery();
            while (rs.next()) {
                solicitudes.add(new SolicitudVehiculo(rs.getInt("id"), rs.getInt("administrador_id"), rs.getInt("proveedor_id"), rs.getInt("vehiculo_id"), rs.getInt("cantidad"), rs.getTimestamp("fecha_solicitud"), rs.getDate("fecha_entrega")));
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
        return solicitudes;
    }
}
