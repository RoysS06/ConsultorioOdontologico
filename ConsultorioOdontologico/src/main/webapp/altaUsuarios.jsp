<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="components/header.jsp" %>
<%@include file="components/bodyInicio.jsp" %>

<h1>Alta de Usuarios</h1>

<form class="user" action="SvUsuarios" method="POST">

    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombreusu" name="nombreusu"
                   placeholder="Nombre de Usuario">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                   placeholder="Contraseña">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol" name="rol"
                   placeholder="rol">
        </div>

    </div>

    <button class="btn btn-primary btn-user btn-block" type="submit">
        Crear un Usuario
    </button>

</form>

<%@include file="components/bodyFinal.jsp"%>
