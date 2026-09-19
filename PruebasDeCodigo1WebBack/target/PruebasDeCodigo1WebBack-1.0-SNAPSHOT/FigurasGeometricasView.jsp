
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <link rel="stylesheet" href="FigurasGeometricasPoyect/FigurasGeometricasCSS.css">
         
        <title>Figuras Geometricas</title>
    </head>
    <body>
        <header>
        <h1>Figuras Geometricas Calculo</h1>
        </header>
        <main>
            <form action="FigurasGeometricasController" method="POST"> <!-- el metodo indica una peticion o metodo http -->
                <div>
                    <h2>Area y perimetro</h2>
                    <p>Ingresa por favor los datos necesarios para calcular el area o perimetro de las figura que selecciones</p>
                </div>
                <div>
                    <label>Escoge tu figura</label>
                    <select name="Figuras">
                        <option value="0">-selecciona una figura-</option>
                        <option value="1">Trinagulo</option>
                        <option value="2">cuadrado</option>
                        <option value="3">rectangulo</option>
                        <option value="4">circulo</option>
                        <option value="5">pentagono</option>
                    </select>
                    <br>
            <label>Inserte Longitudes(cm) requeridas, abajo se indica cual corresponde a cada figura para obtener el Area y perimetro: </label><br><br>
            <label>CUADRADO -> Lado </label><br>
            <label>TRIANGULO ->  lados, base y altura </label> <br>
            <label>RECTANGULO -> base y altura</label> <br>
            <label>PENTAGONO -> lado y apotema</label> <br>
            <label>CIRCULO -> Radio</label><br><br>
            <label >Lado: <input type="text" name="L" min="0" ></label> <button  type="button" onclick="aviso()">aviso</button> <br>
            <label>Base:<input type="number" name="B" min="0" ></label> <br> 
            <label>Altura:<input type="number" name="A" min="0"> </label> <br>
            <label>Apotema:<input type="number" name="AP" min="0" placeholder="gugugaga"></label> <br> <!--Elplace holder introduce texto en el input como indicando lo que deseas que pongan-->
            <label>Radio:<input type="number" name="R" ></label> <br>
            <button type="submit">calcular</button>       
                </div>
                
                
            </form>
            <div>
                <p>${sAviso}</p>
                <input type="text" value="${Perimetro}" readonly>
                <input type="text" value="" readonly>
            </div>
        </main>
        <footer>
            
        </footer>
      </body>
      <script src="FigurasGeometricasPoyect/FigurasGeometricas.js"></script>
</html>
