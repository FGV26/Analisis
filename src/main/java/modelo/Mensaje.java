
package modelo;



import java.sql.Timestamp;

public class Mensaje {
    private int id;
    private int emisorId;
    private int receptorId;
    private String tipoEmisor;
    private String tipoReceptor;
    private String mensaje;
    private Timestamp fecha;

    public Mensaje() {
    }

    public Mensaje(int id, int emisorId, int receptorId, String tipoEmisor, String tipoReceptor, String mensaje, Timestamp fecha) {
        this.id = id;
        this.emisorId = emisorId;
        this.receptorId = receptorId;
        this.tipoEmisor = tipoEmisor;
        this.tipoReceptor = tipoReceptor;
        this.mensaje = mensaje;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmisorId() {
        return emisorId;
    }

    public void setEmisorId(int emisorId) {
        this.emisorId = emisorId;
    }

    public int getReceptorId() {
        return receptorId;
    }

    public void setReceptorId(int receptorId) {
        this.receptorId = receptorId;
    }

    public String getTipoEmisor() {
        return tipoEmisor;
    }

    public void setTipoEmisor(String tipoEmisor) {
        this.tipoEmisor = tipoEmisor;
    }

    public String getTipoReceptor() {
        return tipoReceptor;
    }

    public void setTipoReceptor(String tipoReceptor) {
        this.tipoReceptor = tipoReceptor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }
}
