
package modelo;

import java.util.Date;

public class SolicitudVehiculo {
    private int id;
    private int administradorId;
    private int proveedorId;
    private int vehiculoId;
    private int cantidad;
    private Date fechaSolicitud;
    private Date fechaEntrega;

    public SolicitudVehiculo() {}

    public SolicitudVehiculo(int administradorId, int proveedorId, int vehiculoId, int cantidad, Date fechaSolicitud, Date fechaEntrega) {
        this.administradorId = administradorId;
        this.proveedorId = proveedorId;
        this.vehiculoId = vehiculoId;
        this.cantidad = cantidad;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaEntrega = fechaEntrega;
    }

    public SolicitudVehiculo(int id, int administradorId, int proveedorId, int vehiculoId, int cantidad, Date fechaSolicitud, Date fechaEntrega) {
        this.id = id;
        this.administradorId = administradorId;
        this.proveedorId = proveedorId;
        this.vehiculoId = vehiculoId;
        this.cantidad = cantidad;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaEntrega = fechaEntrega;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdministradorId() {
        return administradorId;
    }

    public void setAdministradorId(int administradorId) {
        this.administradorId = administradorId;
    }

    public int getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(int proveedorId) {
        this.proveedorId = proveedorId;
    }

    public int getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(int vehiculoId) {
        this.vehiculoId = vehiculoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
