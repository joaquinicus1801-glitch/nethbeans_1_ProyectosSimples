<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/Template/HeaderView.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Tabla ASCII</title>
    </head>
    <body>

        <h1 align="center">Tabla ASCII</h1>

        <form action="ResultadoASCIIController" method="post">

            <input type="text"
                   name="txtTexto"
                   size="80"
                   placeholder="Ingrese un texto no menor de 50 palabras que contenga letras, números y caracteres especiales"
                   required>

            <br><br>

            <input type="submit" value="Procesar">

        </form>

    </body>
    <%@include file="WEB-INF/Template/FooterView.jsp"%>


