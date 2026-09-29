

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/TEMPLATE/HeaderView1.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
        <link rel="stylesheet" href="TablaAsciView.css">
        <title>TablaAsciView</title>
    </head>
    <body>
        <main>
            <section class="Prin">
                <div>
                <h1>TABLA ASCI ALFABETICO</h1>
                </div>
                <hr>
                <form action="TablaAsciController" method="GET" >
                    <label>Coleccion aleatoria:</label><br>
                    <input type="text" value=" ${sRespColecAleatorio}"/> <br>
                    <button type="submit" >Presiona</button>
                </form> 
                    <hr>
                <form action="TablaAsciController" method="POST" class="postform">
                    <p>Ingresa tu rango de numeros: <br> <br>
                        <label>Inicio: <br><input type="number" name="numInicio" min="65" max="90" required></label> <br>
                        <label>Termino: <br><input type="number" name="numFin" min="65" max="90" required></label> <br>
                    <button type="submit">Registrar </button>
                    <hr>
                      <p>${Error}</p>
                      <p>Tu coleccion nueva es: ${sRespColecNueva}</p>
                      <p>Ordenados en Asci: ${sRespColecAsci}</p>
            </section>
        </main>
        <footer class="bg-black text-white text-center py-2 mt-auto">
                <p class="mb-0">&copy; Aplicacion creada en java web - Autor isil</p>
        </footer>
        </body>
        </html>
