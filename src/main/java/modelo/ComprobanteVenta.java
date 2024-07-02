
package modelo;



import java.sql.Timestamp;

public class ComprobanteVenta {
    private int id;
    private int clienteId;
    private int vendedorId;
    private Timestamp fecha;
    private double monto;

    public ComprobanteVenta() {
    }

    public ComprobanteVenta(int id, int clienteId, int vendedorId, Timestamp fecha, double monto) {
        this.id = id;
        this.clienteId = clienteId;
        this.vendedorId = vendedorId;
        this.fecha = fecha;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getVendedorId() {
        return vendedorId;
    }

    public void setVendedorId(int vendedorId) {
        this.vendedorId = vendedorId;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
