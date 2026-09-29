

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es-pe"> <!--el pe significa que esa deperu-->
    <head><link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-with, initial-scale=1.0" > <!-- es otro meta que hace responsiva la pagina 
        por lo que entiendo por ahora significa que la pagina se ajuste al ancho del dipositivo,  scala inicial es de 1.0 osea una pagina completa o algo asi
        -->
        <title>Default</title>

    </head>
    <body class="d-flex flex-column min-vh-100">
        <header>
            <form action = "defaultcontroler" method="POST">  <!--Personalizacion con boostrap -->
                <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                    <div class="container-fluid"
                         <button class=" btn btn-success" type="submit" name = "opcion" value="1">Calculador View</button>
                        <button class=" btn btn-primary" type="submit" name = "opcion" value="2">Conversion Moneda</button>
                        <button class=" btn btn-danger" type="submit" name = "opcion" value="3">Figuras Geometricas</button>
                        <button class=" btn btn-secondary" type="sumbit" name = "opcion" value="4">Romanos</button>
                        <button class=" btn btn-warning" type="sumbit" name="opcion" value="5">String</button>
                         <button class=" btn btn-warning" type="sumbit" name="opcion" value="6">colecciones</button>
                      
                    </div>
                </nav>
            </form>
        </header>

        <main class="d-flex justify-content-center">
