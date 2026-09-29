<%-- 
    Document   : FIGURAS_GEOMETRICAS_BETA
    Created on : 28 abr. 2026, 6:55:05 p. m.
    Author     : joaqu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PA1 proyecto 4</title>
        <link rel="stylesheet" href="url"/>
    </head>
    <body>
        <h1>FIGURAS GEOMETRICAS!</h1>
        <form action="FigGeometriBetaCont" method="POST">
            <label>Por favor seleccione su figura:</label>
            <select name="figura">
                <option value="1">Circulo</option>
                <option value="2">Triangulo</option>
                <option value="3">Rectangulo</option>
                <option value="4">cuadrado</option>
                <option value="5">Pentagono</option>
             </select>
            <label>Inserte Longitudes(cm)</label><br>
            <label>Lado(s):<input type="text" name="L" >cm -> Cuadrado(A y P), triangulo(P) y pentagono(P)</label> <br>
            <label>base:<input type="text" name="B" >cm -> Rectangulo(A y P) y triangulo(A)</label> <br>
            <label>Altura: <input type="text" name="A">cm -> Rectangulo(A y P) y triangulo(A)</label> <br>
            <label>Apotema<input type="text" name="AP" >cm -> Pentagono(A)</label> <br>
            <label>Radio:<input type="text" name="R" >cm -> Circulo(A Y P)</label> <br>
            <button type="submit" name="calcular">Calcular</button><br>   
                <label>Area: </label>
                <label>Perimetro: </label>
            <br>
       
            
        </form>
    </body>
</html>
