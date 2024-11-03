package unidadLogica;

import java.util.Date;

public class Responsable extends Persona{
    
    private int id_responsable;
    private String tipoSangre;

    public Responsable() {
    }

    public Responsable(int id_responsable, String tipoSangre, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.id_responsable = id_responsable;
        this.tipoSangre = tipoSangre;
    }

    public int getId_responsable() {
        return id_responsable;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }


    
}
