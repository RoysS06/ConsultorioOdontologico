package unidadLogica;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsable extends Persona{
    
    private String tipoSangre;

    
    public Responsable() {
    }

    public Responsable(String tipoSangre, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.tipoSangre = tipoSangre;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    
}
