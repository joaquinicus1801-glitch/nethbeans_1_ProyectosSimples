<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
ArrayList<String> abecedario =
(ArrayList<String>)session.getAttribute("sAbecedario");

ArrayList<Integer> posiciones =
(ArrayList<Integer>)session.getAttribute("sPosiciones");

ArrayList<Integer> posicionesDesc =
(ArrayList<Integer>)session.getAttribute("sPosicionesDesc");

String frase =
(String)session.getAttribute("sFrase");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultado Abecedario</title>

    <style>

        body{
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }

        .container{
            width: 80%;
            margin: 30px auto;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px gray;
        }

        h1{
            text-align: center;
            color: #007BFF;
        }

        h2{
            color: #333;
        }

        .seccion{
            background: #f8f9fa;
            padding: 15px;
            margin-bottom: 15px;
            border-radius: 5px;
        }

        .boton{
            display: inline-block;
            padding: 10px 15px;
            background: #007BFF;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }

        .boton:hover{
            background: #0056b3;
        }

    </style>

</head>
<body>

<div class="container">

    <h1>Resultado del Ejercicio</h1>

    <% if(frase != null){ %>

        <div class="seccion">

            <h2>Frase Ingresada</h2>

            <p>
                <strong><%= frase %></strong>
            </p>

        </div>

        <div class="seccion">

            <h2>Abecedario</h2>

            <p>

            <% for(String letra : abecedario){ %>

                <%= letra %>

            <% } %>

            </p>

        </div>

        <div class="seccion">

            <h2>Posiciones de los Caracteres</h2>

            <p>

            <% for(Integer posicion : posiciones){ %>

                <%= posicion %> -

            <% } %>

            </p>

        </div>

        <div class="seccion">

            <h2>Posiciones Ordenadas Descendentemente</h2>

            <p>

            <% for(Integer posicion : posicionesDesc){ %>

                <%= posicion %> -

            <% } %>

            </p>

        </div>

    <% } else { %>

        <p>No existen datos para mostrar.</p>

    <% } %>

    <br>

    <a href="AbecedarioView.jsp" class="boton">
        Nueva Consulta
    </a>

</div>

</body>
</html>