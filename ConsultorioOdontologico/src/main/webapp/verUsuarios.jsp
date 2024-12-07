<%@page import="unidadLogica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="components/header.jsp" %>
<%@include file="components/bodyInicio.jsp" %>


<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Cuadro de Usuarios</h1>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Lista de Usuarios</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>Nombre de Usuario</th>
                            <th>Rol</th>
                        </tr>
                    </thead>
                    
                    <tfoot>
                        <tr>
                            <th>id</th>
                            <th>Nombre de Usuario</th>
                            <th>Rol</th>
                        </tr>
                    </tfoot>
                    
                    <% List<Usuario> listaUsuario = (List) request.getSession().getAttribute("listaUsu"); %>
                    
                    <tbody>
                        <% for(Usuario usu : listaUsuario){ %>
                        <tr>
                            <td><%= usu.getId_usuario() %></td>
                            <td><%= usu.getNombreUsuario() %></td>
                            <td><%= usu.getRol()%></td>
                        </tr>
                        
                        <%}%>
                    </tbody>
                    
                </table>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->




<%@include file="components/bodyFinal.jsp"%>
