package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import unidadLogica.ControladoraLogica;
import unidadLogica.Usuario;


@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

    ControladoraLogica controlLog = new ControladoraLogica();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios = controlLog.traerUsuarios();
        
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaUsu", listaUsuarios);
        
        response.sendRedirect("verUsuarios.jsp");
        
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreUsuario = request.getParameter("nombreusu");
        String contraseña = request.getParameter("contrasenia");
        String rol = request.getParameter("rol");
        
        Usuario usu = new Usuario();
        usu.setNombreUsuario(nombreUsuario);
        usu.setContrasenia(contraseña);
        usu.setRol(rol);
        
        controlLog.crearUsu(usu);
        
        response.sendRedirect("index.jsp");
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
