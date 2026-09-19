
<%@include file="Principal/MenuDePaginas.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <main class="d-flex justify-content-center align-items-center">
    <section class="Asccilista p-3 ">
        <div>
            <h2 class="text-center">Tabla ASCI alfabetico</h2>
        </div>
        <hr>
        <form class="forms" action="TablaASCIIController" method="GET">
            <input type="text" readonly value="${ListaGenerada}" class="mb-2"> <br> 
            <button type="submit" class="btn btn-primary">Generar Lista</button>
        </form>
        <hr>
        <form class="forms" action="TablaASCIIController" method="POST">
            <p>Ingresa los numeros</p>
            <label>Inicio</label> <br> <input type="number" min="60" max="90" required class="mb-2" name="num1"> <br> 
            <label>Termino</label> <br> <input type="number" min="60" max="90" required class="mb-2" name="num2"> <br> 
              <button type="submit" class="btn btn-success">Generar Lista</button>
        </form>
        <hr>
        <div class="forms">
        <p>${Error}</p>
        <label>Lista nueva ordenada</label><br> <!-- el expresion language osea el $-{} trabaja con el objeto que 
        realmente esta almacenado, a diferencia del getAttribute que hace que el dato sea tipo Object super generico
        -->
        <input  type="text" readonly value="${ sRespColecNueva.get(0) != 100 ? sRespColecNueva : "ningun numero registrado" }" class="mb-2"> <br>
         <label>Lista con valor ASCI</label><br>
        <input type="text" readonly value="${sRespColecAsci.get(0) != '1' ? sRespColecAsci : "conversion no posible" }" class="mb-2">
        </div>
    </section> 
</main>
<%@include file="Principal/Footer.jsp" %>
<!-- Diferencia entre Expresion Languaje $-{}(EL) y Scriptlets <-%%->(S) en java 
la diferencia principal radica en su proposito, buenas practicas de desarrollo y la sintaxis

los S insertan codigo java arbitrario en el jsp, se usa principalmente para ejecutar logica de programacion
o instanciar objetos en la vista
ejemplo:
  <-% 
    String usuario = "Carlos";
    out.println("Bienvenido, " + usuario); 
%>
out.println : es un objeto para que escribir directamente en el html

EL: Acceder a variables y objetos almacenados en los diferentes ambitos de jsp request, session, application, etc.)
de manera sencilla y segura, sin necesidad de escribir código Java. ejemplo

<!-- Si 'usuario' fue guardado previamente en el request
Bienvenido, $-{usuario}
Es la forma recomendada y moderna de mostrar datos en las vistas JSP,
idealmente combinada con etiquetas JSTL (<c:out>, <c:forEach>, etc.).

-->