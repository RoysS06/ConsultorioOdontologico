<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="components/header.jsp" %>
<%@include file="components/bodyInicio.jsp" %>

<h1>Alta Odontólogos</h1>

<form class="user">

    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="dni" name="dni"
                   placeholder="Dni">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre" name="nombre"
                   placeholder="Nombre">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="apellido" name="apellido"
                   placeholder="Apellido">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="telefono" name="telefono"
                   placeholder="Telefono">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="dirección" name="dirección"
                   placeholder="Dirección">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="fechanac" name="fechanac"
                   placeholder="Fecha Nacimiento">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="Especialidad" name="Especialidad"
                   placeholder="Especialidad">
        </div>

    </div>

    <a href="login.html" class="btn btn-primary btn-user btn-block">
        Crear odontólogo
    </a>

</form>

<%@include file="components/bodyFinal.jsp"%>