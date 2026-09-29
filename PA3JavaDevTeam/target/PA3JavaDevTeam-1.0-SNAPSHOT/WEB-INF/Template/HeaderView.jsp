<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es-pe">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-with, initial-scale=1.0">
        <title>Default</title>
        <link href="CSS-INF/Style.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    </head>
    <body class="d-flex flex-column min-vh-100">
        <header>
            <form action="HomeController" method="POST">
                <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                    <div class="container">
                    <button class="btn btn-success" type="submit" name="btnOpcion" value="00">Home</button>                        
                    <button class="btn btn-danger" type="submit" name="btnOpcion" value="01">Dados</button>
                    <button class="btn btn-danger" type="submit" name="btnOpcion" value="02">Abecedario</button>
                    <button class="btn btn-danger" type="submit" name="btnOpcion" value="03">TablaAsci</button>
                    <button class="btn btn-danger" type="submit" name="btnOpcion" value="04">Figuras</button>
                    <button class="btn btn-danger" type="submit" name="btnOpcion" value="05">TablaAsci2</button>
                    </div>
                </nav>
            </form>
        </header>
        <main class="d-flex justify-content-center my-2 flex-grow-1">


