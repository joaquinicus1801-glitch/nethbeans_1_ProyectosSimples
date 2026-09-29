<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/Template/HeaderView.jsp"%>
<form action="CarreraController" method="POST">
    <h1>Carrera</h1>    

    <input class="form-control" type="text" name="inValor1" placeholder="Ingrese la distancia"/>

    <button class="btn btn-primary" type="submit">Mostrar respuesta</button>
    <br>
    <label>Velocidad Auto A: ${velocidadA} km/h </label>
    <br>

    <label>Velocidad Auto B: ${velocidadB} km/h </label>
    <br>

    <label>Diferencia de tiempo: ${diferencia}</label>
    <br>

    <label>Ganador: ${ganador}</label>

    <label>${sResponse}</label>
</form>
<%@include file="WEB-INF/Template/FooterView.jsp"%>