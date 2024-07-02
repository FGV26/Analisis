
package datos;

import java.sql.*;
import java.util.*;
import modelo.ComprobanteVenta;

public class ComprobanteVentaDAO {

    private static final String SQL_INSERT = "INSERT INTO comprobantes_venta (cliente_id, vendedor_id, fecha, monto) VALUES (?, ?, ?, ?)";
    private static final String SQL_SELECT_BY_VENDEDOR = "SELECT * FROM comprobantes_venta WHERE vendedor_id = ?";

    public int insertar(ComprobanteVenta comprobanteVenta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, comprobanteVenta.getClienteId());
            stmt.setInt(2, comprobanteVenta.getVendedorId());
            stmt.setTimestamp(3, comprobanteVenta.getFecha());
            stmt.setDouble(4, comprobanteVenta.getMonto());
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

    public List<ComprobanteVenta> seleccionarPorVendedor(int vendedorId) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<ComprobanteVenta> comprobantes = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_VENDEDOR);
            stmt.setInt(1, vendedorId);
            rs = stmt.executeQuery();
            while (rs.next()) {
                comprobantes.add(new ComprobanteVenta(rs.getInt("id"), rs.getInt("cliente_id"), rs.getInt("vendedor_id"), rs.getTimestamp("fecha"), rs.getDouble("monto")));
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
        return comprobantes;
    }
}
