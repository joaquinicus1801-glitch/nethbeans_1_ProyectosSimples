<%-- 
Document   : ColeccionesView
Created on : 9 jun. 2026, 6:21:45 a. m.
Author     : joaqu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>colecciones</title>
    <head><link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
        <meta name="viewport" content="width=device-with, initial-scale=1.0" >
    </head>
    <body>
        <div class="container-fluid">
            <div class="d-flex justify-content-center">
                <div class="row">
                    <form action="ColeccionesController" method="POST"> <!--estamos cambiando de get a post porque vamos a enviar parametros -->
                        <h5>Colecciones</h5>
                        <br/>
                        <input name="inTexto" class="from-controll"/>
                       <!-- <button class="btn btn-danger" type="submit">Enviar</button> -->
                        <button class="btn btn-danger" type="submit" name="btnOption" value="1">Mostrar</button>
                        <button class="btn btn-danger" type="submit" name="btnOption" value="2">Agregar</button>
                        <button class="btn btn-danger" type="submit" name="btnOption" value="3">Editar</button>
                        <button class="btn btn-danger" type="submit" name="btnOption" value="4">Eliminar</button>
                        <br/>
                        <label class="form-label">Lista ${sLista}</label> <br>
                        <label class="form-label">Lista2 ${sLista2}</label> <br>
                         <label class="form-label">Lista3 ${sLista3}</label> <br>
                        
                        
                        
                     <!-- <label class="form-label">Coleccion: ${sColeccion}</label> <br>
                      <label class="form-label">Lista ${sLista}</label> <br>
                      <label class="form-label">Set ${sSet}</label> <br>
                      <label class="form-label">Map ${sMap}</label> -->
                    </form>
                </div>
            </div>
        </div>
        <footer class="bg-black text-white text-center py-2 mt-auto"> <!--La clase dice color de fondo negor letras blancas texto centrado y padding de 2                                            en todos los elementos? margen auto-->
            <p class="mb-0">&copy; Aplicacion creada en java web - Autor isil</p>
        </footer>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
    </body>

</html>
