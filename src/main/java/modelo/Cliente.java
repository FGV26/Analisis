    
package modelo;

public class Cliente {
    private int id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String contacto;
    private String preferenciasCompra;

    public Cliente() {}

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, String contacto, String preferenciasCompra) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.contacto = contacto;
        this.preferenciasCompra = preferenciasCompra;
    }

    public Cliente(int id, String nombre, String apellidoPaterno, String apellidoMaterno, String contacto, String preferenciasCompra) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.contacto = contacto;
        this.preferenciasCompra = preferenciasCompra;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getPreferenciasCompra() {
        return preferenciasCompra;
    }

    public void setPreferenciasCompra(String preferenciasCompra) {
        this.preferenciasCompra = preferenciasCompra;
    }
}
