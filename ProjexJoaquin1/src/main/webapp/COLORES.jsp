<%-- 
    Document   : COLORES
    Created on : 25 abr. 2026, 8:10:29 a. m.
    Author     : joaqu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mezcla de colores</h1>
        <form action="ColoresController" method="POST">
            <label>Colores primarios</label>
            <br>
            <label>Color 1: <select name="ColorP1"><option value="r1">Rojo</option><option value="z2">Azul</option> <option value="a3">Amarillo</option> </select> </label>
            <br>
             <label>Color 1: <select name="ColorP2"><option value="r1">Rojo</option><option value="z2">Azul</option> <option value="a3">Amarillo</option> </select> </label>
            <br>
            <button type="submit" name="combi">Combinar</button>
         <label>Color secundario : ${sResponse}</label>
        </form>
    </body>
</html>
