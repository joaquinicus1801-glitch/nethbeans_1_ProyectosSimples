
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FIGURAS GEOMETRICAS</title>
        <style>
       
        </style>
    </head>
    <body>
        <!-- PA1 Programacion orientada a objetos_NRC 6982
             pregunta 4: Proyecto “Figura geométrica”
             alumno: Rodriguez Aquino Joaquin Antonio
             correo: 70456740@mail.isil.pe
          
        -->
        <h1>FIGURAS GEOMETRICAS!</h1>
        <form action="FigurasGeometricasControlador" method="POST">
            <label>Por favor seleccione su figura que desea Calcular su area y perimetro:</label>
            <select name="figura">
                <option value="1">CIRCULO</option>
                <option value="2">TRIANGULO</option>
                <option value="3">RECTANGULO</option>
                <option value="4">CUADRADO</option>
                <option value="5">PENTAGONO</option>
            </select> <br> <br>
            <label>Inserte Longitudes(cm) requeridas, abajo se indica cual corresponde a cada figura para obtener el Area y perimetro: </label><br><br>
            <label>CUADRADO -> Lado </label><br>
            <label>TRIANGULO ->  lado, base y altura</label> <br>
            <label>RECTANGULO -> base y altura</label> <br>
            <label>PENTAGONO -> lado y apotema</label> <br>
            <label>CIRCULO -> Radio</label><br><br>
            <label>Lado:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="L" ></label> <br>
            <label>Base:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="B" ></label> <br> 
            <label>Altura:&nbsp&nbsp&nbsp <input type="text" name="A"> </label> <br>
            <label>Apotema:<input type="text" name="AP" ></label> <br>
            <label>Radio:&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="R" ></label> <br>
            <button type="submit" name="calcular">Calcular</button><br> <br>   
            <label>Area: ${ ResArea!=0 ? ResArea : "ingresa datos necesarios" } </label><br>
            <label>Perimetro: ${ResPerimetro!=0 ? ResPerimetro : "ingresa datos necesarios"} </label>
            <br>
        </form>
    </body>
</html>
