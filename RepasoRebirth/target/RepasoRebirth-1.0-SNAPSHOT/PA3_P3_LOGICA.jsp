

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PA3_P3 USO DE TABLA ASCII</title>
    </head>
    <body>
        <h1>COLECCIONESY  USO DE TABLA ASCII</h1>
        <form action="PA3_P3_LOGICACONTROLLER" method="GET">
            <label>Coleccion aleatoria:</label><br>
                ${sRespColecAleatorio}  <button type="submit" >Ver</button>
        </form> 
        <form action="PA3_P3_LOGICACONTROLLER" method="POST">
            <p>Ingresa tu rango de numeros, que cumpla con un rango minimo de 65 maximo de 90 :D</p>
            <label>Inicio:<input type="number" name="numInicio" min="65" max="90" required></label>
            <label>Fin:<input type="number" name="numFin" min="65" max="90" required></label> <br>
            <button type="submit">Registrar </button>
            <p>${Error}</p>
            <p>Tu coleccion nueva es ${sRespColecNueva}</p>
              <p>Tu coleccion nueva Asci es: ${sRespColecAsci}</p>
        </form>
    </body>
</html>
