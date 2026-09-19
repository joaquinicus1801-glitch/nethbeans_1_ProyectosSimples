<%@include file="Principal/MenuDePaginas.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<main>
    <form action="ClaseStringController" method="POST">
    <div class="card">
        <div class="card-header text-center bg-primary text-white">
            <h1>String</h1>
        </div>
        <div class="card-body text-center bg-ligth">
            <textarea class="form-control border-primary" name="TaContenido" rows="5" placeholder="Ingresa cntenido">
            </textarea>
            <!--Definicion previa: crea un espacio deonde puedes escribir, el row especifica el tamaño inicial del area, le placeholder es un mensaje interno-->
            </br>
            <input class="form-control border-primary" type="text" name="inText" placeholder="Ingresa texto">
        </div>
        <div class="card-footer text-center bg-primary text-white">
            <button class="btn btn-dark text-white" type="submit" name="btnOpcion" value="1">Longitud</button>
            <button class="btn btn-dark text-white" type="submit" name="btnOpcion" value="2">MAYUSCULA</button>
            <button class="btn btn-dark text-white" type="submit" name="btnOpcion" value="3">Existe la palabra?</button>
            <button class="btn btn-dark text-white" type="submit" name="btnOpcion" value="4">posicion</button>
            <button class="btn btn-dark text-white" type="submit" name="btnOpcion" value="5">compara</button>
        </div>
        <div class="card-footer text-center bg-ligth">
            <h5>${sResponse}</h5>
        </div>
        <a href="http://localhost:8080/PruebasDeCodigo1WebBack/">volver</a>

    </div>

</form>
</main>

<%@include file="Principal/Footer.jsp" %>