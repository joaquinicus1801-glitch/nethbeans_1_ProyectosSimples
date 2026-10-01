

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-with, initial-scale=1.0" > <!-- es otro meta que hace responsiva la pagina 
        por lo que entiendo por ahora significa que la pagina se ajuste al ancho del dipositivo,  scala inicial es de 1.0 osea una pagina completa o algo asi
        -->
         <title>Menu Principal de proyectos</title>
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
         <link rel="stylesheet" href="/PruebasDeCodigo1WebBack/Principal/MenuPrincipal.css"/>
          <link rel="stylesheet" href="/PruebasDeCodigo1WebBack/Principal/Style.css"/>
    </head>
    <body>
        <header>
            <nav>
                <ul>
                    <form  class="menu"  action="PaginasController" method="GET">
                        <li><button type="submit" name="opcion" value="1">Calculadora</button></li>
                        <li><button type="submit" name="opcion" value="2">FigurasGeometricas</button></li>                        
                        <li><button type="submit" name="opcion" value="3">CalculoFigura</button></li>
                        <li><button type="submit" name="opcion" value="4">index</button></li>
                        <li><button type="submit" name="opcion" value="5">claseString</button></li>
                        <li><button type="submit" name="opcion" value="6">colecciones</button></li>
                         <li><button type="submit" name="opcion" value="7">lista ASCI</button></li>
                         <li><button type="submit" name="opcion" value="8">lista Objetos</button></li>
                         <li><button type="submit" name="opcion" value="9">DadosJuego</button></li>
                            <li><button type="submit" name="opcion" value="10">Abecedario</button></li>
                             <li><button type="submit" name="opcion" value="11">Sueldo</button></li>
                              <li><button type="submit" name="opcion" value="12">Notas</button></li>
                    </form>
                </ul>

            </nav>           
        </header>
        
