

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
    String nombre = request.getParameter("nombre");
    if (nombre == null || nombre.trim().equals("")) {
        nombre = "invitado";
    }
%>
    <h2>Hola, <%= nombre %>! Bienvenido a tu primera app JSP.</h2>
    <a href="index.html">Volver</a>


    </body>
</html>
