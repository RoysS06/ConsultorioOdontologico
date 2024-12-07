package unidadLogica;

import java.util.List;
import unidadPersistencia.ControladoraPersistencia;


public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearUsu(Usuario usu) {
        controlPersis.crearUsu(usu);
    }

    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }
    
}
