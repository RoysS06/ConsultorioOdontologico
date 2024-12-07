package unidadPersistencia;

import java.util.List;
import unidadLogica.Usuario;

public class ControladoraPersistencia {
    
    
    
    HorarioJpaController horaJpa = new HorarioJpaController();
    OdontologoJpaController ondotoJpa = new OdontologoJpaController();
    PacienteJpaController pacienJpa = new PacienteJpaController();
    PersonaJpaController persoJpa = new PersonaJpaController();
    ResponsableJpaController respoJpa = new ResponsableJpaController();
    SecretarioJpaController secreJpa = new SecretarioJpaController();
    TurnoJpaController turnJpa = new TurnoJpaController();
    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public void crearUsu(Usuario usu) {
        usuJpa.create(usu);
    }

    public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
    }
    
    
}
