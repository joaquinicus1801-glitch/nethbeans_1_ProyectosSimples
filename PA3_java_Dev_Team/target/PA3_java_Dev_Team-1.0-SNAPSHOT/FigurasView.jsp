<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Figuras Geométricas</title>
        <link rel="stylesheet" href="css/estilos.css">
    </head>
    <body>
        <div class="contenedor">
            
            <h1>Figuras Geométricas</h1>

            <%-- LISTA DE FIGURAS ORDENADA ALFABÉTICAMENTE INVERSA --%>
            <div class="tarjeta">
                <h2>Lista de Figuras (orden alfabético inverso):</h2>
                <ul>
                    <%
                        ArrayList<String> listaFiguras = (ArrayList<String>) request.getAttribute("listaFiguras");
                        for(String figura : listaFiguras) {
                    %>
                        <li><%= figura %></li>
                    <%
                        }
                    %>
                </ul>
            </div>

            <%-- COLECCIÓN CON DATOS DE LA FIGURA SELECCIONADA --%>
            <div class="tarjeta">
                <h2>Figura seleccionada:</h2>
                <ul>
                    <li>Número aleatorio: <%= request.getAttribute("numeroAleatorio") %></li>
                    <li>Figura: <%= request.getAttribute("figuraSeleccionada") %></li>
                    <li>Fórmula del Área: <%= request.getAttribute("area") %></li>
                    <li>Fórmula del Perímetro: <%= request.getAttribute("perimetro") %></li>
                </ul>
            </div>

            <a href="FigurasController" class="btn">Generar nueva figura</a>
            
        </div>
    </body>
</html>