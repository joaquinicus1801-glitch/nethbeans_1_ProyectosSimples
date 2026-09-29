<%-- 
    Document   : MenurRedireccionador
    Created on : 28 may. 2026, 7:50:06 a. m.
    Author     : joaqu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title> <!<!-- es un menu el cual al presionar un boton o el llnk no redireccion traele contenido a esta pagina, por eso el nav bar se queda-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
    </head>
    <body>


        <form action="MenurRedireccionador" method="POST">
            <div class="container">
                <div class="d-flex justify-content-center"> <!-- hace que el contenedor sea flex y modificca su posicion al centro -->
                    <div class ="row"> 
                         <div class="card shadow-4">
                            <div class="card-header">
                                <h1>Menu</h1>
                            </div>
                            <div class="card-boby">
                                <button class=" btn btn-success" type="submit" name = "opcion" value="1">Calculador View</button>
                                <button class=" btn btn-primary" type="submit" name = "opcion" value="2">Conversion Moneda</button>
                                <button class=" btn btn-danger" type="submit" name = "opcion" value="3">Figuras Geometricas</button>
                                <button class=" btn btn-secondary" type="sumbit" name = "opcion" value="4">Romanos</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>
