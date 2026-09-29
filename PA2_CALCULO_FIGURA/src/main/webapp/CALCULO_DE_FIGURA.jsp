<%-- 
    Document   : CALCULO_DE_FIGURA
    Created on : 22 may. 2026, 8:01:06 p. m.
    Author     : joaqu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CALCULO DE FIGURA</title>
        <link rel="stylesheet" href="CALCULO_DE_FIGURA/CALCULO_DE_FIGURA.css">
    </head>
    <body>
        <header>
            <h1>PA2-CALCULA LA FIGURA</h1>
        </header>
        <main>
            <section class="Descripcion">
                <h2><strong>CALCULADORA DE FIGURAS</strong></h2>
                <p><em>Calcula medidas de forma precisa</em></p>
            </section>
            <section class="Informacion">
                 <h2><strong>TRIANGULO RECTANGULO</strong></h2>
                 <hr>
                 <div>
                   <p>Un triángulo rectángulo es un triángulo que posee un ángulo de 90°. Es decir, es un polígono que consta de tres lados, tres vértices y tres ángulos, y uno de estos ángulos es recto.
                    Cada uno de los lados de esta figura geométrica recibe un nombre, a saber: catetos e hipotenusa.
                    Los catetos son los dos lados que forman el ángulo recto. La hipotenusa es el lado de mayor tamaño, y se encuentra opuesto al vértice del ángulo recto.</p>
                   <div> 
                      <form action="CALCULO_DE_FIGURA_CONTROLLER" method="POST">
                          <img class="deForm" id ="foto" src="CALCULO_DE_FIGURA/figura_calcular.png" alt="Figura_PA2_P1" /> 
                          <div id="ingreso-datos" class="deForm">
                            <label><span>Ingresa el cateto opuesto: </span> <br>
                                <input type="text" name="CatOpuesto" class="cajita">
                             </label>
                            <br>
                             <label><span>Ingresa el cateto Adyacente:</span> <br>
                              <input type="text" name="CatAdyacente" class="cajita">                                
                             </label> 
                            <br> <br> <br>
                            <button type="submit" name="calcular">Calcular</button> 
                          </div>
                          <div id="Resultado" class="deForm">
                              <h2>RESULTADOS</h2>
                              <p id="nota">${Rsultado}</p>
                              <p> Area: <input type="text" value="${RespArea}" readonly> Hipotenusa:<input type="text"  value="${RespHipotenusa}" readonly> 
                                  Angulos Internos: <span> A: <input type="text"  value="${RespAnguloA}" readonly> B: <input type="text"  value="${RespAnguloB}" readonly></span></p>
                              
                          </div>  
                      </form>
                   </div>
              
                 </div>
           </section>
                
        </main>
        <footer>
            <h2> PA2- ISIL - PROGRAMACION ORIENTADA A OBJETOS</h2>
        </footer>
    </body>
</html>
